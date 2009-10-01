package helloworld;

/**
 * @author laufer
 */
public class HelloOuter implements HasMessage {
  
  private static final String DEFAULT_MESSAGE = "Hello World";
  
  private HasMessage helper;
  
  public void setHelper(HasMessage helper) {
    System.out.println("kuckuck");
    this.helper = helper;
  }

  public String getMessage() {
    return helper.getMessage();
  }
}
