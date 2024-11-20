package computers;

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
public class TC_DWS_006_Test extends BaseClass {
	@Test
	public void clickOnComputer() throws EncryptedDocumentException, IOException {
		lp=new LoginPage(driver);
		lp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers", "Computer is not dispalyed");
		test.log(Status.PASS, "Computer page is displayed");
	}

}
