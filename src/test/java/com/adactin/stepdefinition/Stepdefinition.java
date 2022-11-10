package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	public static WebDriver driver = RunnerClass.driver;

	@Given("^user Launch The Web Application$")
	public void user_Launch_The_Web_Application() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Desktop\\New folder\\AdactinCucumber\\driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The UserName In UserName Field$")
	public void user_Enter_The_UserName_In_UserName_Field() throws Throwable {
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("shanthig");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

		password.sendKeys("shan@123");
	}

	@Then("^user Click The Login Button And Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_Navigates_To_Search_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
	}

	@When("^user Select Location in  Dropdown$")
	public void user_Select_Location_in_Dropdown() throws Throwable {
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(location);
		s.selectByIndex(4);

	}

	@When("^user Select Hotel in Dropdown$")
	public void user_Select_Hotel_in_Dropdown() throws Throwable {
		WebElement selecthotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(selecthotel);
		s1.selectByIndex(2);

	}

	@When("^user Select RoomType in Dropdown$")
	public void user_Select_RoomType_in_Dropdown() throws Throwable {
		WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2 = new Select(roomtype);
		s2.selectByIndex(2);
	}

	@When("^user Select Number Of Rooms$")
	public void user_Select_Number_Of_Rooms() throws Throwable {
		WebElement roomnos = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s2 = new Select(roomnos);
		s2.selectByIndex(2);
	}

	@When("^user Check In Date$")
	public void user_Check_In_Date() throws Throwable {
		WebElement indate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		indate.clear();
		indate.sendKeys("05/11/2022");

	}

	@When("^user Check In Out Date$")
	public void user_Check_In_Out_Date() throws Throwable {
		WebElement outdate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		outdate.clear();
		outdate.sendKeys("09/11/2022");
	}

	@When("^user Select Adults per Room In  How Many Days$")
	public void user_Select_Adults_per_Room_In_How_Many_Days() throws Throwable {
		WebElement adults = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s4 = new Select(adults);
		s4.selectByIndex(2);
	}

	@When("^user  Select Children Per Room In How Many Days$")
	public void user_Select_Children_Per_Room_In_How_Many_Days() throws Throwable {
		WebElement children = driver.findElement(By.xpath("//select[@id='child_room']"));

		Select s5 = new Select(children);
		s5.selectByIndex(2);
	}

	@Then("^user Click the Search Button$")
	public void user_Click_the_Search_Button() throws Throwable {
		WebElement searchbutton = driver.findElement(By.xpath("//input[@id='Submit']"));
		searchbutton.click();
	}

	@When("^user Click Box in  Hotel Below the Botton$")
	public void user_Click_Box_in_Hotel_Below_the_Botton() throws Throwable {
		WebElement button = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		button.click();
	}

	@Then("^user Click The Continue Button$")
	public void user_Click_The_Continue_Button() throws Throwable {
		WebElement contineubutton = driver.findElement(By.xpath("//input[@id='continue']"));
		contineubutton.click();
	}

	@When("^user Text in  First Name$")
	public void user_Text_in_First_Name() throws Throwable {
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("shanthig");
	}

	@When("^user Text in Last Name$")
	public void user_Text_in_Last_Name() throws Throwable {
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("shan");
	}

	@When("^user  Text in Billing Address$")
	public void user_Text_in_Billing_Address() throws Throwable {
		WebElement billingadd = driver.findElement(By.xpath("//textarea[@id='address']"));
		billingadd.sendKeys("chennai600032");

	}

	@When("^user Text In Credit Card Number$")
	public void user_Text_In_Credit_Card_Number() throws Throwable {
		WebElement ccn = driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccn.sendKeys("1234567812345678");
	}

	@When("^user Select Credit Card Type In Dropdown$")
	public void user_Select_Credit_Card_Type_In_Dropdown() throws Throwable {
		WebElement cct = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select c = new Select(cct);
		c.selectByIndex(2);

	}
	@When("^user Select Expiry Month In Dropdown$")
	public void user_Select_Expiry_Month_In_Dropdown() throws Throwable {
		WebElement Em = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select e = new Select(Em);
		e.selectByIndex(2);
	}

	@When("^user Select Expiry Year In Dropdown$")
	public void user_Select_Expiry_Year_In_Dropdown() throws Throwable {
		WebElement Ey = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select y = new Select(Ey);
		y.selectByValue("2022");
	}
	

	

	@When("^user Text in Cvv Number$")
	public void user_Text_in_Cvv_Number() throws Throwable {
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("1234");
	}

	@Then("^user Click in Book Now Botton$")
	public void user_Click_in_Book_Now_Botton() throws Throwable {
		WebElement booknow = driver.findElement(By.xpath("//input[@id='book_now']"));
		booknow.click();
		Thread.sleep(5000);
		
	}
	

	@Then("^user Click In Logout Botton In Logout Field$")
	public void user_Click_In_Logout_Botton_In_Logout_Field() throws Throwable {
		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();

	}

}
