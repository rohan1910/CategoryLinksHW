package WebTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class MyStepdefs extends Utils {
    HomePage homePage = new HomePage();

    @Given("^User is on homepage$")
    public void user_is_on_homepage() {

    }
    @When("^User clicks on the computer link$")
    public void user_clicks_on_the_computer_link() {
        homePage.click_on_computer_link();

    }
    @Then("^User should be directed to computer page$")
    public void user_should_be_directed_to_computer_page() {
        String expected_message = "Computers";
        String actual_message = get_text_from_Web_element(By.xpath("//div[@class=\"page category-page\"]/div[1]/h1"));
        assert_equals(expected_message,actual_message,"Test case failed");
        print_current_url();
    }



    @When("^User clicks on the electronics link$")
    public void userClicksOnTheElectronicsLink() {
        homePage.click_on_electronics_link();
    }
    @Then("^User should be directed to the electronics page$")
    public void userShouldBeDirectedToTheElectronicsPage(){
        String expected_message = "Electronics";
        String actual_message = get_text_from_Web_element(By.xpath("//div[@class=\"page category-page\"]/div[@class=\"page-title\"]"));
        assert_equals(expected_message,actual_message,"Test case failed");
        print_current_url();
    }


    @When("^User clicks on apparel link$")
    public void userClicksOnApparelLink() {
        homePage.click_on_apparel_link();
    }
    @Then("^User should be directed to apparel page$")
    public void userShouldBeDirectedToApparelPage() {
        String expected_message = "Apparel";
        String actual_message = get_text_from_Web_element(By.xpath("//div[@class=\"page-title\"]"));
        assert_equals(expected_message,actual_message,"Test case failed");
       print_current_url();
    }


    @When("^User clicks on the digital downloads link$")
    public void userClicksOnTheDigitalDownloadsLink() {
        homePage.click_on_digital_downloads_link();

    }
    @Then("^User should be directed to digital downloads page$")
    public void userShouldBeDirectedToDigitalDownloadsPage(){
        String expected_message = "Digital downloads";
        String actual_message = get_text_from_Web_element(By.xpath("//div[@class=\"page-title\"]"));
        assert_equals(expected_message,actual_message,"Test case failed");
        print_current_url();
    }

    @When("^User clicks on books link$")
    public void userClicksOnBooksLink() {
        homePage.click_on_books_link();
    }

    @Then("^User should be directed to the books page$")
    public void userShouldBeDirectedToTheBooksPage() {
        String expected_message = "Books";
        String actual_message = get_text_from_Web_element(By.xpath("//div[@class=\"page-title\"]"));
        assert_equals(expected_message,actual_message,"Test case failed");
        print_current_url();
    }

    @When("^User clicks on jewelry link$")
    public void userClicksOnJewelryLink() {
        homePage.click_on_jewelery_link_();
    }
    @Then("^User should be directed to the jewelry page$")
    public void userShouldBeDirectedToTheJewelryPage() {
        String expected_message = "Jewelry";
        String actual_message = get_text_from_Web_element(By.xpath("//div[@class=\"page-title\"]"));
        assert_equals(expected_message,actual_message,"Test case failed");
        print_current_url(); }

    @When("^User clicks on the gift cards link$")
    public void userClicksOnTheGiftCardsLink() {
        homePage.click_on_gift_cards_link();
    }
    @Then("^User should be directed to the gift cards page$")
    public void userShouldBeDirectedToTheGiftCardsPage() {
        String expected_message = "Gift Cards";
        String actual_message = get_text_from_Web_element(By.xpath("//div[@class=\"page-title\"]"));
        print_current_url();
    }
}
