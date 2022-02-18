package www.amazon.gestionUtilisateur;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mifmif.common.regex.Generex;

public class CreateGuestUserAmazonTestSuite {
	
	
WebDriver driver ;
	
	@Before
public void Unit () {
	
	
 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\extrainfo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=	new ChromeDriver();
	String url="https://www.amazon.fr/ap/register?showRememberMe=true&openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.fr%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&prevRID=10F6DTXFW9XKYQ6H27PV&openid.assoc_handle=frflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&pageId=frflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0" ;
	
	driver.get(url);
	
	}
	@Test
	public void createGestUserEmailGenaratorOk() {
		
		String guestUser="guestUser";
		
		driver.findElement(By.id("ap_customer_name")).sendKeys(guestUser);
		
		
		//regex  l'amil max 10 
		String regex = "\\w{10}\\@gmail\\.com";
		
		Generex g =new Generex(regex);
					
		driver.findElement(By.id("ap_email")).sendKeys(g.random()); 
		
	
	}
	
	
	
	
	
	
	

}
