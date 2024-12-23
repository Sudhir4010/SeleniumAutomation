package books;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import genricUtility.BaseClass;
import genricUtility.ListenerUtility;
import objectrepository.LoginPage;
// this is listener class
@Listeners(ListenerUtility.class)
public class TC_DWS_005_Test  extends BaseClass{
	@Test
	public void clickOnBooks() throws EncryptedDocumentException, IOException {
	//this should be given from the local class
		lp=new LoginPage(driver);
		lp.getBooksLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books" ,"Books is not dispalyed");
		test.log(Status.PASS, "Books page is displayed");
		
	}

}
