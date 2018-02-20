package testngbatch;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f1() {
	  System.out.println("This is from batch");
	  
  }
  
  @Test
  public void f2() {
	  System.out.println("This is from batch , this will be skipped");
	  
  }
  
  @Test
  public void f3() {
	  System.out.println("This is from batch , this will not  be skipped");
	  
  }
  
  //Comments
  
  
}
