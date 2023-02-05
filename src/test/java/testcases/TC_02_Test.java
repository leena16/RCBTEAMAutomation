package testcases;

import org.testng.annotations.Test;

import TestCaseFunctions.Functions;
import junit.framework.Assert;

public class TC_02_Test {
	
	@Test
	public void ValidateWicketKeeperCount() {
		try {
			
		int ActualValue=Functions.returnWicketKeeperCount();
		Assert.assertEquals(ActualValue, 1);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
