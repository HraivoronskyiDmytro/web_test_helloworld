import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement loginfield = $(byName("username"));
    private SelenideElement password = $(byName("password"));

    public void login(String login, String pass) {
        loginfield.val(login);
        password.val(pass).pressEnter();


    }
}
