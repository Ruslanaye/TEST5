package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage {
        By BUTTON = By.xpath("(//span[normalize-space()='Jobs'])[1]");
    }

    public interface SearchResultPage {
        By HEADER_TEXT = By.xpath("(//span[normalize-space()='.solutions Jobs'])[1]");
    }

}