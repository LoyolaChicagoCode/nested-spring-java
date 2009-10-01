package helloworld;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author laufer
 *
 */
public class Main {

  public static void main(String[] args) {
    ClassPathResource res = new ClassPathResource("beans.xml"); 
    XmlBeanFactory factory = new XmlBeanFactory(res);
    HasMessage bean = (HasMessage) factory.getBean("helloOuter");
    System.out.println(bean.getMessage());
  }
}
