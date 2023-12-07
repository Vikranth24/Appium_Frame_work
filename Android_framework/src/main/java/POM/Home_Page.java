package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import GENERAL.Base_class;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Page extends Base_class {
	AndroidDriver driver;

	public Home_Page(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	// Home page icon
	@AndroidFindBy(xpath = "(//android.widget.ImageView)[3]")
	private WebElement Home_icon;

	public WebElement Reach_Home_Page() {
		return Home_icon;
	}

	// Search Text Fields
	@AndroidFindBy(xpath = "//android.widget.EditText\r\n")
	private WebElement Search;

	public WebElement Search_text_field() {
		
		return Search;
	}

	// Search cancel
	@AndroidFindBy(xpath = "(//android.widget.Button)[1]")
	private WebElement cancel_Search;

	public WebElement Search_cancel() {
		return cancel_Search;

	}

	// Collection
	@AndroidFindBy(xpath = "//")
	private List<WebElement> Collection;

	public WebElement Collection(String name) {
		for (WebElement col : Collection) {
			if (col.findElement(By.xpath("")).getText().contains(name)) {
				return col;
			}
		}
		return null;

	}

	// To get collection count
	public int Collection_size() {
		return Collection.size();
	}

	// to print name of the collection
	public void Print_collection_name() {
		for (WebElement col : Collection) {
			System.out.println(col.findElement(By.xpath("//")));
		}
	}

	// To get the name of the collection based on the index
	public void print_collection_name_based_on_index(int x) {
		System.out.println(Collection.get(x).findElement(By.xpath("//")).getText());
	}

	// Get the Add button element based on the name
	public WebElement Add_Button(String name) {
		for (WebElement col : Collection) {
			if (col.findElement(By.xpath("")).getText().contains(name)) {
				return col.findElement(By.xpath("//"));
			}
		}
		return null;
	}

	// Get the Add button element based on the Index
	public WebElement Add_Button_Based_on_index(int x) {
		return Collection.get(x).findElement(By.xpath("//"));
	}

	// Get the sticker count in collection displayed based on name

	public int Sticker_count_in_collection(String name) {
		for (WebElement col : Collection) {
			if (col.findElement(By.xpath("")).getText().contains(name)) {
				String s = col.findElement(By.xpath("//")).getText();
				String count = s.split(" ")[0];
				int number = Integer.parseInt(count);
				return number;
			}

		}
		return 0;

	}

	// Get the sticker count in collection displayed based on name

	public int Sticker_count_in_collection(int x) {
		String count = Collection.get(x).findElement(By.xpath("//")).getText().split(" ")[1];
		int number = Integer.parseInt(count);
		return number;

	}

	// Get Sticker list inside Colletion
	@AndroidFindBy(xpath = "//")
	private List<WebElement> Stickers;

	public List<WebElement> Sticker_collection() {
		return Stickers;
	}

	// Get stickers based on the index 
	public WebElement Sticker_collection(int x) {
		return Stickers.get(x);
	}

	// Get sticker like button based on the index
	public WebElement Sticker_like_button(int x) {
		return Stickers.get(x).findElement(By.xpath("//"));
	}

	// Sticker liked count based on the collection
	public void Sticker_liked_count() {
		int count = 0;
		for (WebElement sti : Stickers) {

		}
	}

	// Back button
	@AndroidFindBy(accessibility = "Back")
	private WebElement Back;

	public WebElement back_to_Collection_Page() {
		return Back;

	}

	// Add button ( after clicking on add button , we can use this add button to add
	// the collection to the whatsapp)
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\'com.whatsapp:id/add_button\']")
	private WebElement Add;

	public WebElement Add() {
		return Add;

	}

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\'com.whatsapp:id/cancel_button\']")
	private WebElement Cancel_Adding_Sticker;

	public WebElement Cancel_Adding_Sticker() {
		return Cancel_Adding_Sticker;

	}

	// Add to whatsapp button in stickers
	private WebElement Add_to_whatsapp;

	public WebElement Add_to_whatsapp() {
		return Add_to_whatsapp;

	}

}
