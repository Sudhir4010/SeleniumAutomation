package electronics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import genricUtility.BaseClass;
import genricUtility.ListenerUtility;
import objectrepository.LoginPage;
@Listeners(ListenerUtility.class)
public class TC_DWS_007_Test extends BaseClass {
	@Test
	public void clickOnElectronic() throws EncryptedDocumentException, IOException {
		lp=new LoginPage(driver);
		lp.getElectronicsLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Electronics", "Electronics is not displayed");
		test.log(Status.PASS, "Electronics page is displayed");
	}

}
