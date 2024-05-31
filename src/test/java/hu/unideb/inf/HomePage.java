package hu.unideb.inf;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class HomePage {

    private static final String PAGE_URL = "https://automationexercise.com/";

    private final WebDriver driver;

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10)")
    private WebElement loggedInUserText;

    @FindBy(css = "#form > div > div > div:nth-child(3) > div > form > p")
    private WebElement signupErrorMessage;

    @FindBy(css = "#contact-page > div.row > div.col-sm-8 > div > div.status.alert.alert-success")
    private WebElement successContanctMessage;

    @FindBy(css = "#form > div > div > div > h2 > b")
    private WebElement successSignupMessage;

    @FindBy(css = "#form > div > div > div > h2 > b")
    private WebElement successDeletionMessage;

    @FindBy(css = "#form > div > div > div > h2 > b")
    private WebElement successOrderMessage;

    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > h2")
    private WebElement searchedProductsTitle;

    @FindBy(css = "body > section > div > div.breadcrumbs > ol > li.active")
    private WebElement categorySubcategoryPath;



    private static final Map<String, By> textFields = Map.ofEntries(
            Map.entry("Login email", By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=email]:nth-child(2)")),
            Map.entry("Login password", By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=password]:nth-child(3)")),
            Map.entry("Contact us name", By.cssSelector("#contact-us-form > div:nth-child(2) > input")),
            Map.entry("Contact us email", By.cssSelector("#contact-us-form > div:nth-child(3) > input")),
            Map.entry("Contact us subject", By.cssSelector("#contact-us-form > div:nth-child(4) > input")),
            Map.entry("Contact us message", By.cssSelector("#message")),
            Map.entry("Signup name", By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)")),
            Map.entry("Signup email", By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)")),
            Map.entry("Signup password", By.cssSelector("#password")),
            Map.entry("Signup first name", By.cssSelector("#first_name")),
            Map.entry("Signup last name", By.cssSelector("#last_name")),
            Map.entry("Signup address", By.cssSelector("#address1")),
            Map.entry("Signup state", By.cssSelector("#state")),
            Map.entry("Signup city", By.cssSelector("#city")),
            Map.entry("Signup zipcode", By.cssSelector("#zipcode")),
            Map.entry("Signup mobile number", By.cssSelector("#mobile_number")),
            Map.entry("Search", By.cssSelector("#search_product")),
            Map.entry("Quantity", By.cssSelector("#quantity")),
            Map.entry("Name on card", By.cssSelector("#payment-form > div:nth-child(2) > div > input")),
            Map.entry("Card number", By.cssSelector("#payment-form > div:nth-child(3) > div > input")),
            Map.entry("CVC", By.cssSelector("#payment-form > div:nth-child(4) > div.col-sm-4.form-group.cvc > input")),
            Map.entry("Expiration month", By.cssSelector("#payment-form > div:nth-child(4) > div:nth-child(2) > input")),
            Map.entry("Expiration year", By.cssSelector("#payment-form > div:nth-child(4) > div:nth-child(3) > input"))
    );

    private static final Map<String, By> navigationButtons = Map.ofEntries(
            Map.entry("Login", By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button")),
            Map.entry("Signup", By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button")),
            Map.entry("Submit", By.cssSelector("#contact-us-form > div:nth-child(7) > input")),
            Map.entry("Create Account", By.cssSelector("#form > div > div > div > div > form > button")),
            Map.entry("Continue", By.cssSelector("#form > div > div > div > div > a")),
            Map.entry("Search", By.cssSelector("#submit_search")),
            Map.entry("Add to cart (Search)", new By.ByXPath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a")),
            Map.entry("Continue shopping", By.cssSelector("#cartModal > div > div > div.modal-footer > button")),
            Map.entry("Add to cart (Product details)", By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > span > button")),
            Map.entry("Remove (Grunt Blue Slim Fit Jeans)", By.cssSelector("#product-37 > td.cart_delete > a > i")),
            Map.entry("Proceed To Checkout", By.cssSelector("#do_action > div.container > div > div > a")),
            Map.entry("Place Order", By.cssSelector("#cart_items > div > div:nth-child(7) > a")),
            Map.entry("Pay and Confirm Order", By.cssSelector("#submit"))
    );

    private static final Map<String, By> navigationLinks = Map.of(
            "Home", By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(1) > a"),
            "Signup / Login", By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a"),
            "Logout", By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a"),
            "Contact us", By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(8) > a"),
            "Delete account", By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a"),
            "Products", By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a"),
            "Cart", By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(3) > a"),
            "View product", new By.ByXPath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")
    );

    private static final Map<String, By> categories = Map.of(
            "Women", By.cssSelector("#accordian > div:nth-child(1) > div.panel-heading > h4 > a"),
            "Men", By.cssSelector("#accordian > div:nth-child(2) > div.panel-heading > h4 > a")
    );

    private static final Map<String, By> subcategories = Map.of(
            "Dress", By.cssSelector("#Women > div > ul > li:nth-child(1) > a"),
            "Tops", By.cssSelector("#Women > div > ul > li:nth-child(2) > a"),
            "Saree", By.cssSelector("#Women > div > ul > li:nth-child(3) > a"),
            "Tshirts", By.cssSelector("#Men > div > ul > li:nth-child(1) > a"),
            "Jeans", By.cssSelector("#Men > div > ul > li:nth-child(2) > a")
    );

    private static final Map<String, By> selextBoxes = Map.of(
            "Signup country", By.cssSelector("#country")
    );

    private static final Map<String, By> options = Map.of(
            "India", By.cssSelector("#country > option:nth-child(1)"),
            "United States", By.cssSelector("#country > option:nth-child(2)"),
            "Canada", By.cssSelector("#country > option:nth-child(3)"),
            "Australia", By.cssSelector("#country > option:nth-child(4)"),
            "Israel", By.cssSelector("#country > option:nth-child(5)"),
            "New Zealand", By.cssSelector("#country > option:nth-child(6)"),
            "Singapore", By.cssSelector("#country > option:nth-child(7)")
    );

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void closePage() {
        driver.quit();
    }

    public void fillOutField(String field, String text) {
        driver.findElement(textFields.get(field)).clear();
        driver.findElement(textFields.get(field)).sendKeys(text);
    }

    public void clickButton(String button) {
        driver.findElement(navigationButtons.get(button)).click();
    }

    public void clickLink(String link) {
        driver.findElement(navigationLinks.get(link)).click();
    }

    public void clickCategory(String category) {
        driver.findElement(categories.get(category)).click();
    }

    public void clickSubcategory(String subcategory) {
        driver.findElement(subcategories.get(subcategory)).click();
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }

    public String getLoggedInUserText() {
        return loggedInUserText.getText();
    }

    public String getSignupErrorMessage() {
        return signupErrorMessage.getText();
    }

    public String getSignupPopupErrorMessage() {
        String errorMessage = "";

        errorMessage += driver.findElement(textFields.get("Signup name")).getAttribute("validationMessage");

        if (errorMessage.equals("")) {
            errorMessage += driver.findElement(textFields.get("Signup email")).getAttribute("validationMessage");
        }

        return errorMessage;
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
    }

    public String getSuccessContactMessage() {
        return successContanctMessage.getText();
    }

    public String getSuccessSignupMessage() {
        return successSignupMessage.getText();
    }

    public String getSuccessDeletionMessage() {
        return successDeletionMessage.getText();
    }

    public String getSuccessOrderMessage() {
        return successOrderMessage.getText();
    }

    public boolean isTheProductListCorrect(String productType) {
        boolean isInRightPlace = true;

        productType = productType.toLowerCase();

        WebElement productsBlock = driver.findElement(By.className("features_items"));
        List<WebElement> products = productsBlock.findElements(By.className("col-sm-4"));

        for (WebElement product : products) {
            String productName = product.findElement(By.tagName("p")).getText().toLowerCase();

            if (!productName.contains(productType)) {
                isInRightPlace = false;
            }
        }

        return isInRightPlace;
    }

    public boolean isTheProductinTheCart(String productName) {
        boolean isInTheCart = false;

        List<WebElement> products = driver.findElements(By.className("cart_description"));

        for (WebElement product : products) {
            String productNameInCart = product.findElement(By.tagName("a")).getText();

            if (productNameInCart.equals(productName)) {
                isInTheCart = true;
            }
        }

        return isInTheCart;
    }

    public void acceptCookies() {

        try {
        driver.findElement(By.cssSelector("body > div > div.fc-dialog-container > " +
                "div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > " +
                "div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button > p")).click();
        }
        catch (NoSuchElementException e) {}
    }

    public void selectOption(String selectBox, String option) {
        driver.findElement(selextBoxes.get(selectBox)).click();
        driver.findElement(options.get(option)).click();
    }

    public int getQuantityInTheCart() {
        return Integer.parseInt(driver.findElement(By.cssSelector("#product-35 > td.cart_quantity > button"))
                .getText());
    }

    public String getCategorySubcategoryPath() {
        return categorySubcategoryPath.getText();
    }

    public String getSearchedProductsTitle() {
        return searchedProductsTitle.getText();
    }
}
