import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class DocumentExplorerPage {
    private SelenideElement add = $(byXpath("//*[@class='iconPlus']"));
    private SelenideElement name = $(byAttribute("placeholder", "Name"));
    private SelenideElement create = $(byText("Create"));
    private SelenideElement cancel = $(byText("Cancel"));
    private SelenideElement upload = $(byXpath("//*[@type='file']"));
    private SelenideElement searchCollection = $(byAttribute("placeholder", "Search..."));
    private SelenideElement error = $(byXpath("//*[@class='picnicMessenger picnicMessengerGapInnerNormal picnicMessengerColorWarning']"));
    private SelenideElement firstCollection = $(byXpath("//tr[1]//td[1][@class='picnicTableCellAlignLeft']/*"));
    private SelenideElement firstDocument = $(byXpath("//tr[1]//td[2][@class='picnicTableCellAlignLeft']/*[platform-documents-name-table-cell-component]"));
    private SelenideElement sortCollection = $(byXpath("//*[@class='echoTableHeightFull picnicHeightLimiter echoTableSearchable echoTableSelectable']//*[@class='iconSort tableHeaderIconAction']"));
    private SelenideElement sortFiles = $(byXpath("//*[@class='echoTableHeightFull picnicHeightLimiter echoTableSearchable']//*[@class='iconSort tableHeaderIconAction']"));
    private SelenideElement searchFiles = $(byXpath("//*[@class='echoTableHeightFull picnicHeightLimiter echoTableSearchable']//*[input]/input"));
    private SelenideElement failedUpload = $(byXpath("//*[@class='picnicFloatingExpandableMainGapsNo']//*[@class='failed']"));
    private SelenideElement successUpload = $(byXpath("//*[@class='picnicFloatingExpandableMainGapsNo']//*[@class='succeeded']"));


    public void clickAddNewCollection() {
        add.click();
    }

    public void setName(String newName) {
        name.val(newName);

    }

    public void clickCreate() {
        create.click();
    }

    public void clickUpload(File file) {
        upload.uploadFile(file);


    }

    public void setSearchCollection() {
        searchCollection.val("test_xpath_gathering");
        firstCollection.shouldBe(Condition.text("test_xpath_gathering"));

    }

    public void setSearchDocument() {
        searchFiles.val("ZZZ");

    }

    public void checkErrorMessage() {
        error.shouldHave(Condition.text("Something went unexpectedly wrong. Try again. If the problem persists contact your administrator."));
    }

    public void errorMessageIsAbsent() {
        error.shouldNot(Condition.visible);
    }

    public void checkFirstCollectionName(String value) {
        firstCollection.shouldHave(Condition.text(value));
    }

    public void checkFirstDocumentName(String value) {
        firstDocument.shouldHave(Condition.text(value));
    }

    public void clickSortCollection() {
        sortCollection.click();
    }

    public void clickSortDocuments() {
        sortFiles.click();
    }

    public void clickFirstCollection() {
        firstCollection.click();
        firstDocument.shouldBe(Condition.visible);
    }

    public void uploadIsSuccess() {
        successUpload.shouldBe(Condition.exist);
    }

    public void uploadIsFailed() {
        failedUpload.shouldBe(Condition.exist);
    }

}

