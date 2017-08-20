package java.com.ailin.service;

import com.ailin.dao.OrderListDao;
import com.ailin.model.info.OrderList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class OrderListDaoServiceTest {
    @Resource
    private OrderListDao orderListDao;
    @Test
    public void testselectAllOrder(){
        List<OrderList> orderLists=orderListDao.selectAllOrder(1002);
        Iterator<OrderList> it=orderLists.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
