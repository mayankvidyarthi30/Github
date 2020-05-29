package com.scripts.MavenActiTIME;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.MavenActiTIME.BaseTest_Actitime;
import com.pages.MavenActiTIME.ACTITIME_LOGIN;

public class TESTActitime_Login extends BaseTest_Actitime{
	@Test
	public void mayank() throws IOException, InterruptedException {
		ACTITIME_LOGIN al=new ACTITIME_LOGIN(driver);
		al.loginMethod();
		
	}
}
