package com.ailin.service;

import com.ailin.dao.MessageMapper;
import com.ailin.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HanHan on 2017/8/7.
 */
@Service("MessageServiceImpl")
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;
    public Message getMessage(Integer id) {
        System.out.println(id);
        Message message = messageMapper.selectByToid(id);
//        System.out.println(" aaaa"+message1);
        return message;
    }
}
