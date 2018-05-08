package Util;

import Base.TestBase;

public class TestUtilities extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public void SwitchToFrame(){
		driver.switchTo().frame("mainpanel");
	}
}

