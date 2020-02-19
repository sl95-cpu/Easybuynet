
import com.sl.pojo.EasybuyNews;
import com.sl.pojo.EasybuyProductCategory;
import com.sl.service.EasybuyNewService;
import com.sl.service.EasybuyProductCategoryService;
import com.sl.service.EasybuyUserService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Tests {

    @Test
    public void test(){
      ApplicationContext con = new ClassPathXmlApplicationContext("apploctioncontext.xml");
        EasybuyUserService mapper = (EasybuyUserService) con.getBean("EasybuyServiceImpl");
        EasybuyNewService newService = (EasybuyNewService) con.getBean("EasybuyNewServiceImpl");
        EasybuyProductCategoryService service = (EasybuyProductCategoryService) con.getBean("EasybuyProductCategoryServiceImpl");
        for (EasybuyProductCategory productCategory : service.queryAllBuyType(1)) {
            System.out.println(productCategory);
        }
      /*  for (EasybuyNews queryAllEasybuyNew : newService.queryAllEasybuyNews()) {
            System.out.println(queryAllEasybuyNew);
        }*/
    }
}
