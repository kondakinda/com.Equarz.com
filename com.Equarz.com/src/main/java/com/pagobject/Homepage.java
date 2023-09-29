package com.pagobject;

public class Homepage {
	package com.pageobjects;

	import java.awt.Window; 

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver; 
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.base.signbase;

	public class signfunctionality extends signbase{
		
		
		
		@FindBy(id="si-email")
		WebElement signin;
		@FindBy(id="si-password")
		WebElement pass;
		@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
		WebElement   signbttn;
		@FindBy(xpath ="//button[@class='close __close']")
		WebElement closebtn;
	public signfunctionality(WebDriver driver) {
		PageFactory.initElements(driver,this );

		}
		public Hompage validatesignin() throws Exception {
			signin.sendKeys(props.getProperty("Email"));
			pass.sendKeys(props.getProperty("Password"));
		
			Thread.sleep(10000);
			
			signbttn.click();
			closebtn.click();
			
}
