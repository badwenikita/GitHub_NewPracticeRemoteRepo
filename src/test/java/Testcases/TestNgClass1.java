package Testcases;

import org.testng.annotations.Test;

public class TestNgClass1 {
  @Test
  public void method1() 
  {
	  System.out.println("method1 added from Eclipse tool");
  }
	
  @Test
  public void method2() 
  {
	  System.out.println("method2 added only in ChildBranch from github site");
  }
  
  @Test
  public void method3() 
  {
	  System.out.println("method3 added only in ChildBranch from Eclipse tool");
  }
	
}
