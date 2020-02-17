
import com.sl.pojo.EasybuyNews;
import com.sl.pojo.EasybuyUser;
import com.sl.service.EasybuyNewService;
import com.sl.service.EasybuyService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Tests {

    @Test
    public void test(){
      ApplicationContext con = new ClassPathXmlApplicationContext("apploctioncontext.xml");
        EasybuyService mapper = (EasybuyService) con.getBean("EasybuyServiceImpl");
        EasybuyNewService newService = (EasybuyNewService) con.getBean("EasybuyNewServiceImpl");
        for (EasybuyNews news : newService.queryAllEasybuyNews()) {
            System.out.println(news);
        }

    }
}
