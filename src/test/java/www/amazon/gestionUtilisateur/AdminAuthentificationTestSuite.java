package www.amazon.gestionUtilisateur;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminAuthentificationTestSuite {
	
	//classe d'éxécusion des scénarios de teste ralatif a l"authentification
	//
	
	//le nom de la class est le nom de la suite de test
	
	
	
	// le nom de chaque methode est e nom de chaque scénario de test
	@Test
	public void AuthentificationDashbordAdminCorrect() {
		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\extrainfo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		String url="https://www.amazon.fr/" ;
		
		
		WebDriver  driver = new ChromeDriver();    //Polymorphisme
		
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
 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sport" + Keys.ENTER );
//Thread.sleep(3000);
driver.close();
		
		
		
		
	}
	
	@Test
	public void TestLoginFieled()
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\extrainfo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		String url="https://www.amazon.fr/" ;
		
		
		WebDriver  driver = new ChromeDriver();    //Polymorphisme
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("sp-cc-accept")).click();

 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
// driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Identifiez-vous']")).click();
 driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("proservicetestauto@gmail.com");
 driver.findElement(By.xpath("//input[@id='continue']")).click();
 driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("AdminProSer");
 driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	    
	   String pass = driver.findElement(By.xpath("//span[@class='a-list-item']")).getText();
	   
	    assertEquals(pass,"The password is incorrect");
		
		
	}
	
	
	

}
