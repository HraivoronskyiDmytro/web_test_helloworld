

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestClass {



        @Test

        public void firsEnd2End() {
            open("https://omniustest.omnius.com/trainer/ui/");
            new LoginPage().login("testuser","testuser");
            new ConsolePage().clickAnnotate();
            DocumentExplorerPage documentexplorer = new DocumentExplorerPage();
            documentexplorer.clickAddNewCollection();
            documentexplorer.setName();
            documentexplorer.clickCreate();
            documentexplorer.clickCancel();
            documentexplorer.setSearch();
            documentexplorer.clickAddNewCollection();



        }
    }

