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

public class Rituxan_PatientTest {
	public static WebDriver driver;

	@Given("^I open rituxan patinet site$")
	public void i_open_rituxan_patinet_site() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://racopay.com/rituxan");

	}

	@Given("^click on apply now$")
	public void click_on_apply_now() throws Throwable {
		
		driver.findElement(By.xpath("//a[@class='button enroll'][text()='Apply Now']")).click();

	}

	@When("^I select LAP$")
	public void i_select_LAP() throws Throwable {
		
		driver.findElement(By.xpath(".//input[@class='other'][@name='enroll']")).click();
		driver.findElement(By.id("agree")).click();

	}

	@When("^fillup the eligibility qn$")
	public void fillup_the_eligibility_qn() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[1]/td[2]/p[2]/input")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[2]/td[2]/p[2]/input")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td[2]/p[2]/input")).click();
		driver.findElement(By.xpath(".//input[@class='question-4 hide-question-7b'][@name='Q4']")).click();
		
		WebElement list_by_state = driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[5]/td[2]/p[2]/select"));
		Select List_by_State = new Select(list_by_state);
		
		List_by_State.selectByValue("NJ");
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[6]/td[2]/p[3]/input")).click();
		driver.findElement(By.name("Q7")).click();
		
		driver.findElement(By.name("Q8")).click();
		
		driver.findElement(By.name("apply-step-one-submit")).click();


		

	}

	@When("^enter the LAP info$")
	public void enter_the_LAP_info() throws Throwable {
		
		driver.findElement(By.id("need")).click();
		
		
		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("first_name_enroller")).clear();
		driver.findElement(By.id("first_name_enroller")).sendKeys("Justin" + currentTime);
		
		driver.findElement(By.id("last_name_enroller")).clear();
		driver.findElement(By.id("last_name_enroller")).sendKeys("Tims" + currentTime);
		
		driver.findElement(By.id("address_enroller")).clear();
		driver.findElement(By.id("address_enroller")).sendKeys("111 Arthor Ave" + currentTime);
		
		driver.findElement(By.id("city_enroller")).clear();
		driver.findElement(By.id("city_enroller")).sendKeys("Ridge Field" + currentTime);
		
		driver.findElement(By.id("zipCode_enroller")).clear();
		driver.findElement(By.id("zipCode_enroller")).sendKeys("07453" + currentTime);
		
		driver.findElement(By.id("homePhone_enroller")).clear();
		driver.findElement(By.id("homePhone_enroller")).sendKeys("9723431212" + currentTime);
		
		
		
		
		


	}

	@When("^enter Patient info$")
	public void enter_Patient_info() throws Throwable {
		
		
		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("firstName-patient")).clear();
		driver.findElement(By.id("firstName-patient")).sendKeys("Maria" + currentTime);
		
		driver.findElement(By.id("lastName-patient")).clear();
		driver.findElement(By.id("lastName-patient")).sendKeys("Adndeson" + currentTime);
		
		
		WebElement list_by_gender = driver.findElement(By.xpath("html/body/div[5]/p[11]/span/select"));
		Select List_by_Gender = new Select(list_by_gender);
		
		List_by_Gender.selectByValue("F");
		
		
		WebElement list_by_month = driver.findElement(By.xpath(".//*[@id='dob-month']"));
		Select List_by_Month = new Select(list_by_month);
		
		List_by_Month.selectByValue("10");
		
		
		WebElement list_by_day = driver.findElement(By.xpath(".//*[@id='dob-day']"));
		Select List_by_Day = new Select(list_by_day);
		
		List_by_Day.selectByValue("23");
		
		
		WebElement list_by_year = driver.findElement(By.xpath(".//*[@id='dob-year']"));
		Select List_by_Year = new Select(list_by_year);
		
		List_by_Year.selectByValue("1996");
		
		
		
		
		
		
		
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("12 Pateron Ave" + currentTime);
		
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("Bloomfield" + currentTime);
		
		driver.findElement(By.id("zipCode")).clear();
		driver.findElement(By.id("zipCode")).sendKeys("07109" + currentTime);
		
		driver.findElement(By.id("homePhone")).clear();
		driver.findElement(By.id("homePhone")).sendKeys("8761234356" + currentTime);
		
		driver.findElement(By.id("SocialSecurityNumber")).clear();
		driver.findElement(By.id("SocialSecurityNumber")).sendKeys("734231987" + currentTime);
		
		
		
		
		
		

	}

	@When("^insurnce info$")
	public void insurnce_info() throws Throwable {
		
		
		WebElement list_by_name = driver.findElement(By.xpath(".//*[@id='select-company']"));
		Select List_by_Name = new Select(list_by_name);
		
		List_by_Name.selectByValue("First Choice");
		
		
		WebElement list_by_plan = driver.findElement(By.xpath(".//*[@id='select-plan']"));
		Select List_by_Plan = new Select(list_by_plan);
		
		List_by_Plan.selectByValue("HSA");
		
		
		driver.findElement(By.id("insuranceGroupNumber")).clear();
		driver.findElement(By.id("insuranceGroupNumber")).sendKeys("734231987");
		
		driver.findElement(By.id("insuranceMemberNumber")).clear();
		driver.findElement(By.id("insuranceMemberNumber")).sendKeys("133231987");
		
		driver.findElement(By.id("insuranceBINNumber")).clear();
		driver.findElement(By.id("insuranceBINNumber")).sendKeys("13456");
		
		driver.findElement(By.id("insurancePCNNumber")).clear();
		driver.findElement(By.id("insurancePCNNumber")).sendKeys("654321");
		
		
		driver.findElement(By.xpath("html/body/div[5]/p[37]/button")).click();
		
		
		

	}

	@When("^doctor info$")
	public void doctor_info() throws Throwable {
		
		
		driver.findElement(By.id("drfirstName")).clear();
		driver.findElement(By.id("drfirstName")).sendKeys("Alen");

		
		driver.findElement(By.id("drlastName")).clear();
		driver.findElement(By.id("drlastName")).sendKeys("Maggaie");
		
		driver.findElement(By.id("practiceName")).clear();
		driver.findElement(By.id("practiceName")).sendKeys("Stepheni Elan");
		
		driver.findElement(By.id("drStreet")).clear();
		driver.findElement(By.id("drStreet")).sendKeys("12 Main St");
		
		driver.findElement(By.id("drCity")).clear();
		driver.findElement(By.id("drCity")).sendKeys("Elmwood Park");
		
		driver.findElement(By.id("drZip")).clear();
		driver.findElement(By.id("drZip")).sendKeys("07432");
		
		driver.findElement(By.id("drPhone")).clear();
		driver.findElement(By.id("drPhone")).sendKeys("7863432121");
		
		driver.findElement(By.name("apply-step-three-submit")).click();
		
		

	}

	@Then("^I verify the info$")
	public void i_verify_the_info() throws Throwable {
		
		
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='container']/form[1]/p[2]/label"));

		System.out.println(element.getText());
		
		
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='container']/h2"));

		System.out.println(element1.getText());




	}

	@Then("^select the check box$")
	public void select_the_check_box() throws Throwable {
		
		
		driver.findElement(By.id("allcorrect")).click();

	}

	@Then("^submit for enrollment$")
	public void submit_for_enrollment() throws Throwable {
		
		driver.findElement(By.id("submit")).click();

	}

}
