package sTEPDefInation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Actemra_PatientTest {

	public static WebDriver driver;

	@Given("^I open Actemra site$")
	public void i_open_Actemra_site() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.racopay.com/actemra");

	}

	@Given("^Click on apply now button$")
	public void click_on_apply_now_button() throws Throwable {

		driver.findElement(By.xpath("//a[@class='button enroll'][text()='Apply Now']")).click();

	}

	@Given("^Apply as Patient$")
	public void apply_as_Patient() throws Throwable {

		driver.findElement(By.name("enroll")).click();
		driver.findElement(By.id("agree")).click();

	}

	@Given("^Apply the eligibility QN$")
	public void apply_the_eligibility_QN() throws Throwable {

		driver.findElement(By.name("Q1")).click();

		driver.findElement(By.name("Q2")).click();

		driver.findElement(By.name("Q3")).click();

		driver.findElement(By.xpath("//input[@name='Q4'][@value='no']")).click();

		WebElement list_by_state = driver.findElement(By.name("state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");

		driver.findElement(By.xpath("//input[@name='Q6'][@value='no']")).click();

		driver.findElement(By.name("Q7")).click();

		driver.findElement(By.name("Q8")).click();

		driver.findElement(By.name("apply-step-one-submit")).click();

	}

	@When("^I complete the patient info$")
	public void i_complete_the_patient_info() throws Throwable {

		driver.findElement(By.id("need")).click();

		long currentTime = System.currentTimeMillis();

		driver.findElement(By.id("firstName-patient")).clear();
		driver.findElement(By.id("firstName-patient")).sendKeys("Maecos" + currentTime);

		driver.findElement(By.id("lastName-patient")).clear();
		driver.findElement(By.id("lastName-patient")).sendKeys("Resus" + currentTime);

		WebElement list_by_gender = driver.findElement(By.name("gender"));
		Select List_by_Gender = new Select(list_by_gender);

		List_by_Gender.selectByValue("M");

		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/p[6]/span[1]/select/option[6]")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/p[6]/span[2]/div/span/a/span[1]")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/p[6]/span[2]/select/option[16]")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/p[6]/span[3]/div/span/a/span[1]")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/p[6]/span[3]/select/option[22]")).click();

		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("18 Clearman Pl" + currentTime);

		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("Ridgefield" + currentTime);

		WebElement list_by_state = driver.findElement(By.id("state-patient"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");

		driver.findElement(By.id("zipCode")).clear();
		driver.findElement(By.id("zipCode")).sendKeys("07506");

		driver.findElement(By.id("homePhone")).clear();
		driver.findElement(By.id("homePhone")).sendKeys("9734561211");

		driver.findElement(By.id("SocialSecurityNumber")).clear();
		driver.findElement(By.id("SocialSecurityNumber")).sendKeys("1234");

	}

	@When("^Insurance Info$")
	public void insurance_Info() throws Throwable {

		WebElement list_by_company = driver.findElement(By.id("select-company"));
		Select List_by_Company = new Select(list_by_company);

		List_by_Company.selectByValue("Harvard Pilgrim");

		WebElement list_by_plan = driver.findElement(By.id("select-plan"));
		Select List_by_Plan = new Select(list_by_plan);

		List_by_Plan.selectByValue("HSA");

		driver.findElement(By.id("insuranceGroupNumber")).clear();
		driver.findElement(By.id("insuranceGroupNumber")).sendKeys("123456789");

		driver.findElement(By.id("insuranceMemberNumber")).clear();
		driver.findElement(By.id("insuranceMemberNumber")).sendKeys("987654321");

		driver.findElement(By.id("insuranceBINNumber")).clear();
		driver.findElement(By.id("insuranceBINNumber")).sendKeys("123456");

		driver.findElement(By.id("insurancePCNNumber")).clear();
		driver.findElement(By.id("insurancePCNNumber")).sendKeys("654321");

		driver.findElement(By.name("doctor_prescribed")).click();

		driver.findElement(By.id("enroll-yes")).click();

		driver.findElement(By.name("relationship")).click();

		driver.findElement(By.name("enroll_email")).clear();
		driver.findElement(By.name("enroll_email")).sendKeys("gdfgd123@yahoo.com");

		driver.findElement(By.name("apply-step-two-submit")).click();

	}

	@When("^Doctor information$")
	public void doctor_information() throws Throwable {

		driver.findElement(By.id("drfirstName")).clear();
		driver.findElement(By.id("drfirstName")).sendKeys("JAMES");

		driver.findElement(By.id("drlastName")).clear();
		driver.findElement(By.id("drlastName")).sendKeys("AHERN");

		driver.findElement(By.id("practiceName")).clear();
		driver.findElement(By.id("practiceName")).sendKeys("Family Medicine");

		driver.findElement(By.id("drStreet")).clear();
		driver.findElement(By.id("drStreet")).sendKeys("77 DANBURY RD");

		driver.findElement(By.id("drCity")).clear();
		driver.findElement(By.id("drCity")).sendKeys("Wayne");

		WebElement list_by_state = driver.findElement(By.name("drState"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");

		driver.findElement(By.id("drZip")).clear();
		driver.findElement(By.id("drZip")).sendKeys("07470");

		driver.findElement(By.id("drPhone")).clear();
		driver.findElement(By.id("drPhone")).sendKeys("9874565454");

		driver.findElement(By.xpath(".//*[@id='container']/form[2]/button")).click();

	}

	@Then("^I verified the info$")
	public void i_verified_the_info() throws Throwable {

		WebElement element = driver.findElement(By.xpath(".//*[@id='container']/form[1]/h2[2]"));

		System.out.println(element.getText());

		WebElement element1 = driver.findElement(By.xpath(".//*[@id='container']/form[1]/h2[4]"));

		System.out.println(element1.getText());

	}

	@Then("^click on confirm button$")
	public void click_on_confirm_button() throws Throwable {

		driver.findElement(By.id("allcorrect")).click();
		
		driver.findElement(By.id("submit")).click();

	}

}
