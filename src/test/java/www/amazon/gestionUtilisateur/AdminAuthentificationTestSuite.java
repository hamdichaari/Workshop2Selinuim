package www.amazon.gestionUtilisateur;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;

//import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminAuthentificationTestSuite {
	
	//classe d'éxécusion des scénarios de teste ralatif a l"authentification

	
	//le nom de la class est le nom de la suite de test
	
	
	
	// le nom de chaque methode est e nom de chaque scénario de test
	WebDriver driver ;
	
	@Before
public void Unit () {
	
	
 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\extrainfo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=	new ChromeDriver();
	
	}
	
	
	
	
	public void AuthentificationDashbordAdminCorrect() {
		
		
		
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\extrainfo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		String url="https://www.amazon.fr/" ;
		
		
//	WebDriver  driver = new ChromeDriver();    //Polymorphisme
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("sp-cc-accept")).click();

 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
// driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Identifiez-vous']")).click();
 driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("proservicetestauto@gmail.com");
 driver.findElement(By.xpath("//input[@id='continue']")).click();
 driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("AdminProService");
 driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
 
 
 
 

 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
 //Thread.sleep(3000);
 //implicite wait 
 
 


 
//  String pass = driver.findElement(By.xpath("//span[@class='a-list-item']")).getText();

//  assertEquals(pass,"The password is incorrect");
 
 String element = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
 assertEquals(element,"Bonjour admin");
 
 

// String   Resultatattendu = "Bonjour admin" ;
 
 
 /*
 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sport" + Keys.ENTER );
//Thread.sleep(3000);
 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
driver.close();
		
		*/
		
		
	}
	

	public void TestLoginFieled()
	{
		
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\extrainfo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		String url="https://www.amazon.fr/" ;
		
		
	//	WebDriver  driver = new ChromeDriver();    //Polymorphisme
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("sp-cc-accept")).click();

 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
// driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Identifiez-vous']")).click();
 driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("proservicetestauto@gmail.com");
 driver.findElement(By.xpath("//input[@id='continue']")).click();
 driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("AdminProService");
 driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
 
 

     
	    
	 //  String pass = driver.findElement(By.xpath("//span[@class='a-list-item']")).getText();
	   
	  //  assertEquals(pass,"The password is incorrect");
 
 
 
 String element = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();   
 
 String   Resultaunattendu = "Bonjour User" ;
 Assert.assertNotEquals(Resultaunattendu, element);

	//   assertEquals(element,"Bonjour admin");
	   
		
		
	}
	


@Test
public void TestAlert() throws InterruptedException
{
	

	String url="https://the-internet.herokuapp.com/javascript_alerts" ;
		    
	driver.get(url);
	driver.manage().window().maximize();
	

driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();


Thread.sleep(2000);

driver.switchTo().alert().accept();

String element = driver.findElement(By.id("result")).getText();   

String   Resultattendu = "You successfully clicked an alert" ;
Assert.assertEquals(element,Resultattendu);

 
	
	
}




	@After
public void exit () throws InterruptedException {
	
	//	WebDriver  driver = new ChromeDriver();
		Thread.sleep(3000);
	driver.close();
	driver.quit();
}

}
