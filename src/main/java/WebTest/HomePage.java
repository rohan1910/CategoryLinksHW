package WebTest;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    By _computerLink = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/a[1]");
    By _electronicsLink = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[2]/a");
    By _apparelLink = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[3]/a");
    By _digitalDownloads = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[4]");
    By _booksLink = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[5]");
    By _jewelryLink = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[6]");
    By _giftcardsLink = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[7]");

    public void click_on_computer_link(){
        click_on_element(_computerLink);
    }
    public void click_on_electronics_link(){
        click_on_element(_electronicsLink);
    }
    public void click_on_apparel_link(){
        click_on_element(_apparelLink);
    }
    public void click_on_digital_downloads_link(){
        click_on_element(_digitalDownloads);
    }
    public void click_on_books_link(){
        click_on_element(_booksLink);
    }
    public void click_on_jewelery_link_(){
        click_on_element(_jewelryLink);
    }
    public void click_on_gift_cards_link(){
        click_on_element(_giftcardsLink);
    }

}
