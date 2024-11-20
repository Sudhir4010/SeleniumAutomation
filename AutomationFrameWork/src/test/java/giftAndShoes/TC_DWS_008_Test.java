package giftAndShoes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genricUtility.BaseClass;
import genricUtility.ListenerUtility;
import objectrepository.HomePage;
import objectrepository.LoginPage;
@Listeners(ListenerUtility.class)
public class TC_DWS_008_Test extends BaseClass {
	@Test
	public void clickOnApparelAndShoes() throws EncryptedDocumentException, IOException {
	lp=new LoginPage(driver);
	lp.getShoesLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Apparel & Shoes", "apparel and shoes is not displayed");
		test.log(Status.PASS, "apparel and shoes is displayed");
		
	}

}
