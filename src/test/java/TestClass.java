import org.junit.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.open;

public class TestClass {


    @Test

    public void createExistingCollection() {
        open("https://omniustest.omnius.com/trainer/ui/");
        new LoginPage().login("testuser", "testuser");
        new ConsolePage().clickAnnotate();
        DocumentExplorerPage documentexplorer = new DocumentExplorerPage();
        documentexplorer.clickAddNewCollection();
        documentexplorer.setName("test_xpath_gathering");
        documentexplorer.clickCreate();
        documentexplorer.checkErrorMessage();
    }

    @Test
    public void createNewCollection() {
        open("https://omniustest.omnius.com/trainer/ui/");
        new LoginPage().login("testuser", "testuser");
        new ConsolePage().clickAnnotate();
        DocumentExplorerPage documentexplorer = new DocumentExplorerPage();
        documentexplorer.clickAddNewCollection();
        documentexplorer.setName("kkk" + Math.random() * 49 + 1);
        documentexplorer.clickCreate();
        documentexplorer.errorMessageIsAbsent();
    }

    @Test
    public void searchExistingCollection() {
        open("https://omniustest.omnius.com/trainer/ui/");
        new LoginPage().login("testuser", "testuser");
        new ConsolePage().clickAnnotate();
        DocumentExplorerPage documentexplorer = new DocumentExplorerPage();
        documentexplorer.setSearchCollection();
        documentexplorer.checkFirstCollectionName("test_xpath_gathering");
    }

    @Test
    public void sortCollection() {
        open("https://omniustest.omnius.com/trainer/ui/");
        new LoginPage().login("testuser", "testuser");
        new ConsolePage().clickAnnotate();
        DocumentExplorerPage documentexplorer = new DocumentExplorerPage();
        documentexplorer.clickSortCollection();
        documentexplorer.checkFirstCollectionName("AAA");
        documentexplorer.clickSortCollection();
        documentexplorer.checkFirstCollectionName("ZZZ");


    }

    @Test
    public void sortDocuments() {
        open("https://omniustest.omnius.com/trainer/ui/");
        new LoginPage().login("testuser", "testuser");
        new ConsolePage().clickAnnotate();
        DocumentExplorerPage documentexplorer = new DocumentExplorerPage();
        documentexplorer.setSearchCollection();
        documentexplorer.clickFirstCollection();
        documentexplorer.clickSortDocuments();
        documentexplorer.checkFirstDocumentName("AAA.pdf");
        documentexplorer.clickSortDocuments();
        documentexplorer.checkFirstCollectionName("ZZZ.pdf");


    }

    @Test
    public void searchDocuments() {
        open("https://omniustest.omnius.com/trainer/ui/");
        new LoginPage().login("testuser", "testuser");
        new ConsolePage().clickAnnotate();
        DocumentExplorerPage documentexplorer = new DocumentExplorerPage();
        documentexplorer.setSearchCollection();
        documentexplorer.clickFirstCollection();
        documentexplorer.setSearchDocument();
        documentexplorer.checkFirstDocumentName("ZZZ.pdf");


    }

    @Test
    public void uploadJPG() {
        open("https://omniustest.omnius.com/trainer/ui/");
        new LoginPage().login("testuser", "testuser");
        new ConsolePage().clickAnnotate();
        DocumentExplorerPage documentexplorer = new DocumentExplorerPage();
        documentexplorer.setSearchCollection();
        documentexplorer.clickFirstCollection();
        File file = new File("src/test/resources/sample.jpg");
        documentexplorer.clickUpload(file);
        documentexplorer.uploadIsSuccess();

    }

    @Test
    public void uploadTIFF() {
        open("https://omniustest.omnius.com/trainer/ui/");
        new LoginPage().login("testuser", "testuser");
        new ConsolePage().clickAnnotate();
        DocumentExplorerPage documentexplorer = new DocumentExplorerPage();
        documentexplorer.setSearchCollection();
        documentexplorer.clickFirstCollection();
        File file = new File("src/test/resources/sample.tif");
        documentexplorer.clickUpload(file);
        documentexplorer.uploadIsSuccess();

    }

    @Test
    public void uploadPDF() {
        open("https://omniustest.omnius.com/trainer/ui/");
        new LoginPage().login("testuser", "testuser");
        new ConsolePage().clickAnnotate();
        DocumentExplorerPage documentexplorer = new DocumentExplorerPage();
        documentexplorer.setSearchCollection();
        documentexplorer.clickFirstCollection();
        File file = new File("src/test/resources/sample.pdf");
        documentexplorer.clickUpload(file);
        documentexplorer.uploadIsSuccess();


    }

    @Test
    public void uploadPNG() {
        open("https://omniustest.omnius.com/trainer/ui/");
        new LoginPage().login("testuser", "testuser");
        new ConsolePage().clickAnnotate();
        DocumentExplorerPage documentexplorer = new DocumentExplorerPage();
        documentexplorer.setSearchCollection();
        documentexplorer.clickFirstCollection();
        File file = new File("src/test/resources/sample.png");
        documentexplorer.clickUpload(file);
        documentexplorer.uploadIsSuccess();


    }

    @Test
    public void uploadMP3file() {
        open("https://omniustest.omnius.com/trainer/ui/");
        new LoginPage().login("testuser", "testuser");
        new ConsolePage().clickAnnotate();
        DocumentExplorerPage documentexplorer = new DocumentExplorerPage();
        documentexplorer.setSearchCollection();
        documentexplorer.clickFirstCollection();
        File file = new File("src/test/resources/sample.mp3");
        documentexplorer.clickUpload(file);
        documentexplorer.uploadIsFailed();


    }

    @Test
    public void uploadFakePDFfile() {
        open("https://omniustest.omnius.com/trainer/ui/");
        new LoginPage().login("testuser", "testuser");
        new ConsolePage().clickAnnotate();
        DocumentExplorerPage documentexplorer = new DocumentExplorerPage();
        documentexplorer.setSearchCollection();
        documentexplorer.clickFirstCollection();
        File file = new File("src/test/resources/fake.pdf");
        documentexplorer.clickUpload(file);
        documentexplorer.uploadIsFailed();


    }

}


