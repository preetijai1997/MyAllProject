package BankitAgentWebPortal.pageobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BankitAgentWebPortal.AbstratctComponent.AbstractComponent;

public class productCataloguge extends AbstractComponent {

	WebDriver driver;

	public productCataloguge(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class, 'mb-3')]")
	List<WebElement> products;

	By ProductsBy = By.xpath("//div[contains(@class, 'mb-3')]");

//	By AddToCart = By.xpath("//div[contains(@class,'col-lg-4')][5]/div/div[@class='card-body']/button[2]");
	By toastMessage = By.id("toast-container");

	public List<WebElement> getProductsList() {
		waitForElementToAppear(ProductsBy);

		return products;

	}

	List<Integer> prodId = new ArrayList<>();

	public List<WebElement> getProductName(List<String> ProductName) {
		List<WebElement> allProduct = new ArrayList<>();
		// System.out.println("drive x
		// path"+driver.findElements(By.xpath("//div[contains(@class, 'mb-3')]")));
		driver.findElements(By.xpath("//div[@class='card-body']/h5/b")).stream().forEach(prod -> allProduct.add(prod));
		// List<WebElement> prods=getProductsList();
		List<WebElement> matchProduct = new ArrayList<>();
		for (int j = 0; j < ProductName.size(); j++) {

			for (int i = 0; i < allProduct.size(); i++) {
				if (allProduct.get(i).getText().equals(ProductName.get(j))) {
					matchProduct.add(allProduct.get(i));
					prodId.add(i + 1);
					break;
				}

			}
		}

		// Stream<WebElement> ans=prods.stream();
//				for(int i=0;i<ans.size();i++) {
//					System.out.println("prod "+prods.get(i));
//				}
		// ans.forEach(s -> System.out.println(s));
		// ans.forEach(s ->
		// s.findElement(By.xpath("//div[@class='card-body']/h5/b")).getText().equals(ProductName));
		// WebElement prod=getProductsList().stream().filter(product ->
		// product.findElement(By.xpath("//div[@class='card-body']/h5/b")).getText().equals(ProductName)).findFirst().orElseGet(null);

		return matchProduct;
	}

	public void getId(int id) {

	}

	public void addTocart(List<String> ProductName) throws InterruptedException {
		List<WebElement> prod = getProductName(ProductName);
		// int id=getId();
		// System.out.println(prod);
		// System.out.println("final product "+prod.getText());
		for (int i = 0; i < prod.size(); i++) {
			String s = String.format("//div[contains(@class,'col-lg-4')][%d]/div/div[@class='card-body']/button[2]",
					prodId.get(i));
			System.out.println("Add to cart path " + s);

			prod.get(0).findElements(By.xpath(s)).get(0).click();
			waitForElementToAppear(toastMessage);
			Thread.sleep(3000);

		}

	}

}
