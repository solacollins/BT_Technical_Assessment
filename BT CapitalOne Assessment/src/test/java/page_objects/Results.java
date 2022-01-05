package page_objects;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class Results extends PageObject {

    public void selectTitle() {
        String Actual = getDriver().getTitle();
        Assert.assertEquals("Your Results - Capital One", Actual);
    }
}
