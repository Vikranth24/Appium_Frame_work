package POM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Profile {
	AndroidDriver driver;

	public Profile(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	// Profile page icon
	@AndroidFindBy(xpath = "(//android.widget.ImageView)[4]")
	private WebElement Profile;

	public WebElement Reach_Profile_Page() {
		return Profile;
	}

	// My collection button
	@AndroidFindBy(xpath = "(//")
	private WebElement My_Collection;

	public WebElement My_collection() {
		return My_Collection;

	}

	// Collection list
	@AndroidFindBy(xpath = "(//")
	private List<WebElement> MY_Collection_List;

	public List<WebElement> My_collection_list() {
		return MY_Collection_List;

	}

	// Likes
	@AndroidFindBy(xpath = "(//")
	private WebElement Likes_button;

	public WebElement Likes_button() {
		return Likes_button;

	}

	// Likes list
	@AndroidFindBy(xpath = "(//")
	private List<WebElement> Like_List;

	public List<WebElement> Like_list() {
		return Like_List;

	}

	// Edit Icon
	@AndroidFindBy(xpath = "(//")
	private WebElement Edit_Icon;

	public WebElement Edit_Icon() {
		return Edit_Icon;

	}

	// Name text field
	@AndroidFindBy(xpath = "(//")
	private WebElement Name_Field;

	public WebElement Name_Field() {
		return Name_Field;

	}

	// User Name text field
	@AndroidFindBy(xpath = "(//")
	private WebElement UserName_Field;

	public WebElement UserName_Field() {
		return UserName_Field;

	}

	// Phone_Number text field
	@AndroidFindBy(xpath = "(//")
	private WebElement Phone_Number;

	public WebElement Phone_Number() {
		return Phone_Number;

	}

	// Country text field
	@AndroidFindBy(xpath = "(//")
	private WebElement Country;

	public WebElement Country() {
		return Country;

	}
	
	//Save button
	@AndroidFindBy(xpath = "(//")
	private WebElement Save;

	public WebElement Save() {
		return Save;

	}
	
	//Profile Back button
	@AndroidFindBy(xpath = "(//")
	private WebElement Back_Button;

	public WebElement Back_Button() {
		return Back_Button;

	}

	
	
	//Three dot to logout and other actions
	@AndroidFindBy(xpath = "(//")
	private WebElement Three_dot;

	public WebElement Three_dot() {
		return Three_dot;

	}
	
	
	//Share app
	@AndroidFindBy(xpath = "(//")
	private WebElement Share_App;

	public WebElement Share_App() {
		return Share_App;

	}
	
	//Private policy
	@AndroidFindBy(xpath = "(//")
	private WebElement Private_policy;

	public WebElement Private_policy() {
		return Private_policy;

	}
	

	//Term of use
	@AndroidFindBy(xpath = "(//")
	private WebElement Term_of_use;

	public WebElement Term_of_use() {
		return Term_of_use;

	}
	
	//Delete Account
	@AndroidFindBy(xpath = "(//")
	private WebElement Delete_Account;

	public WebElement Delete_Account() {
		return Delete_Account;

	}
	
	//Logout
	@AndroidFindBy(xpath = "(//")
	private WebElement Logout;

	public WebElement Logout() {
		return Logout;

	}
	
}
