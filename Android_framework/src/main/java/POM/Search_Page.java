package POM;

import org.openqa.selenium.support.PageFactory;

import GENERAL.Base_class;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Search_Page extends Base_class {
	AndroidDriver driver;

	public Search_Page(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	// Search page icon
	@AndroidFindBy(xpath = "(//android.widget.ImageView)[2]")
	private WebElement Search_Icon;

	public WebElement Search_page_Icon() {
		return Search_Icon;

	}

	// Search Field
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement Search_Field;
	
	public WebElement Search_Field()
	{
		return Search_Field;
		
	}
	
	// Search cancel
		@AndroidFindBy(xpath = "(//android.widget.Button)[1]")
		private WebElement cancel_Search;

		public WebElement Search_cancel() {
			return cancel_Search;

		}

		
		//Search result
		@AndroidFindBy(xpath = "//")
		private List<WebElement> Stickers;
		
		public List<WebElement> Search_Result()
		{
			return Stickers;
		}
		
		
		//Search result count
		public int Search_count()
		{
			int count =0;
			for (@SuppressWarnings("unused") WebElement sti: Stickers)
			{
				count++;
			}
			return count;
		}
		
		
	//Trending button
		@AndroidFindBy(xpath="")
		private WebElement Trending;
		
		public WebElement Trending()
		{
			return Trending;
		}
		
		
		//Newly Added
		@AndroidFindBy(xpath="")
		private WebElement Newly_Added;
		
		public WebElement Newly_Added()
		{
			return Newly_Added;
		}
		
		
		//Popular
		
		@AndroidFindBy(xpath="")
		private WebElement Popular;
		
		public WebElement Popular()
		{
			return Popular;
		}
		
		
		
		
		
}
