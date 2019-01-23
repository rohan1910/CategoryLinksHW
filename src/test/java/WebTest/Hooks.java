package WebTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void open_browser(){
        browserSelector.browserselector();
    }
    @After
    public void close_browser(){
        close_Browser();
    }
}
