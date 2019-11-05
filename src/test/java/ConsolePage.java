import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class ConsolePage {
    private SelenideElement annotate = $(byAttribute("href", "/trainer/ui/document-explorer"));

    public void clickAnnotate() {
        annotate.shouldBe(visible).click();
    }


}
