package internet.herokuapp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSConfirmTestSuite {
	
	WebDriver driver ;
	
	
	@Before
public void Unit () {
	
	
 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\extrainfo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=	new ChromeDriver();
	String url="https://the-internet.herokuapp.com/javascript_alerts" ;
	
	driver.get(url);
	
	}
	
	@Test      
	public void resultatPositiveApresClickOk() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		
		Thread.sleep(2000);
		
	//arrange
		
		
		driver.switchTo().alert().accept();
		
		
     //   String User="Test";
		
	//	driver.findElement(By.id("ap_customer_name")).sendKeys(User);
		

		String element = driver.findElement(By.id("result")).getText();   

		String   Resultattendu = "You successfully clicked an alert" ;
		Assert.assertEquals(element,Resultattendu);
		
		//Assert
		
	}
	
	
	@Test
	public void resultatOkApresClickOk() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		
		Thread.sleep(2000);
		
	//arrange

		driver.switchTo().alert().accept();

		String element = driver.findElement(By.id("result")).getText();   

		String   Resultattendu = "You clicked: Ok" ;
		Assert.assertEquals(element,Resultattendu);
		
		//Assert
		
	}
	
	
	
	@Test
	public void resultatAnnulerApresClickNon() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		
		Thread.sleep(2000);
		
	//arrange

		driver.switchTo().alert().dismiss();

		String element = driver.findElement(By.id("result")).getText();   

		String   Resultattendu = "You clicked: Cancel" ;
		Assert.assertEquals(element,Resultattendu);
		
		//Assert
		
	}
	
	
	//bouton annuler saisir texte
	@Test 
	public void EntrerAnnulerClickNon() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		
		Thread.sleep(2000);
		
	//arrange

		driver.switchTo().alert().dismiss();

		String element = driver.findElement(By.id("result")).getText();   

		String   Resultattendu = "You entered: null" ;
		Assert.assertEquals(element,Resultattendu);
		
		//Assert
		
	}
	
	//bouton 3 ajouter text
	@Test
	public void AjouterTextApresClickOk() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		
	
		
	//arrange

		
		
		
		driver.switchTo().alert().sendKeys("Testvalider");
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		String element = driver.findElement(By.id("result")).getText();  
		
	
		String   Resultattendu = "You entered: Testvalider" ;
		Assert.assertEquals(Resultattendu,element);
		
		//Assert
		
	}
	
	

	@After
public void exit () throws InterruptedException {
	
	//	WebDriver  driver = new ChromeDriver();
		Thread.sleep(3000);
	driver.close();
	driver.quit();
	
	}

}
