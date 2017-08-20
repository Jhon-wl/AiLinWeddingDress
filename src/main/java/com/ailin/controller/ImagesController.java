package com.ailin.controller;

import com.ailin.model.GoodsImage;
import com.ailin.service.GoodsImageService;
import com.ailin.service.GoodsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 达达 on 2017/8/16.
 * 图片上传功能
 */
@RequestMapping("file")
@Controller
public class ImagesController {
    @Autowired
    private GoodsImageService goodsImageService;
    @Autowired
    private GoodsService goodsService;
    @RequestMapping(value="/upload",method= RequestMethod.POST)
    @ResponseBody
    public String upload(GoodsImage goodsImage, @RequestParam(value="file",required=false) MultipartFile[] file, HttpServletRequest request)throws IOException{
        String path = "C:/Users/wo/Desktop/AiLinWeddingDress/src/main/webapp/WEB-INF/goods_images";
        List<String> listImagePath = new ArrayList<String>();
        for ( MultipartFile mf : file){
            String fileName =mf.getOriginalFilename();
            File dir = new File(path,fileName);
            goodsImage.setUrl(fileName);
            goodsImage.setCreateTime(new Date());
            goodsImage.setLastUpdate(new Date());
            goodsImage.setPosition(1);
            goodsImage.setGoodsId(4);
            goodsImage.setVisibility((byte)0);
            goodsImageService.ImageUpload(goodsImage);
            if(dir.exists()){
                dir.mkdirs();
            }
            //MultipartFile自带的解析方法
            mf.transferTo(dir);
            listImagePath.add(path);
        }

        return "goodCreate";
    }

    /**
     * 文件下载功能
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/down")
    public void down(HttpServletRequest request,HttpServletResponse response) throws Exception{
        //模拟文件，myfile.txt为需要下载的文件
        String fileName = request.getSession().getServletContext().getRealPath("upload")+"/myfile.txt";
        //获取输入流
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));
        //假如以中文名下载的话
        String filename = "下载文件.txt";
        //转码，免得文件名中文乱码
        filename = URLEncoder.encode(filename,"UTF-8");
        //设置文件下载头
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);
        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
        response.setContentType("multipart/form-data");
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
        int len = 0;
        while((len = bis.read()) != -1){
            out.write(len);
            out.flush();
        }
        out.close();
    }
}
