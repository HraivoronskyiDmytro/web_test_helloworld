import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class DocumentExplorerPage {
    private SelenideElement add = $(byXpath("//*[@class=iconPlus]/../"));
    private SelenideElement name = $(byAttribute("placeholder", "Name"));
    private SelenideElement create = $(byText("Create"));
    private SelenideElement cancel = $(byText("Cancel"));
    private SelenideElement upload = $(byText("Upload"));
    private SelenideElement search = $(byAttribute("placeholder", "Search..."));


    public void clickAddNewCollection() {
        add.click();
    }
    public void setName() {
        name.val("test_xpath_gathering");
    }
    public void clickCreate() {
        create.click();
    }
    public void clickCancel() {
        create.click();
    }
    public void clickUpload() {
        upload.uploadFromClasspath("./i.pdf");
        upload.click();
    }
    public void setSearch() {
        search.val("test_xpath_gathering");
    }

}

