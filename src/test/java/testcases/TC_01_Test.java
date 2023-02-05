package testcases;

import org.testng.annotations.Test;
import TestCaseFunctions.Functions;


import junit.framework.Assert;

public class TC_01_Test {
	@Test
	public void TC_01_Verify_No_of_players() {
		try {
			
		int ActualValue=Functions.returnForeignPlayersCount();
		Assert.assertEquals(ActualValue, 4);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
