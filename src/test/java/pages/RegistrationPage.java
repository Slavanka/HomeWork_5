package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationPage {
    //locators & elements
    SelenideElement
            firstNameInput = $("firstName"),
            lastNameInput = $("lastName"),
            UserEmailInput = $("UserEmail"),
            UserNumberInput = $("UserNumber"),
            CheckboxGenderInput = $(byText("Other")),
            CheckboxHobbiesInput = $(byText("Sports"));

    public CalendarComponent calendarComponent = new CalendarComponent();


//    $("[for=gender-radio-1]").click();

//    <byText> $(byText("Sports")).scrollTo();
//    $("#subjectsInput").click();
//    $("#subjectsInput").setValue("d");
//    <byText> $(byText("Hindi")).click();
//    $("[for=hobbies-checkbox-1]").click();
//    $("#uploadPicture").uploadFile(new File("src/test/resources/cv.png"));
//    $("[id=currentAddress]").setValue("Moscow Kremlin"); //пишем адрес
//    $("#state").click();
//    <byText> $(byText("NCR")).click();   //выбираем значение из списка Штат
//    $("#city").click();
//    $(byText("Noida")).click();   //выбираем значение из списка город
//    $("[id=submit]").click();   //кликаем на кнопку Submit


    // actions

    public void openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
    }

    public RegistrationPage typeFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }


    public RegistrationPage typeUserEmail(String value) {
        UserEmailInput.setValue(value);
        return this;
    }


    public RegistrationPage typeUserNumber(String number) {
        UserNumberInput.setValue(number);
        return this;
    }

    public RegistrationPage typeCheckboxGender(String value) {
        CheckboxGenderInput.find(byText(value)).click();
        return this;
    }

    public void typeCheckboxHobbies(String value) {
        CheckboxHobbiesInput.find(byText(value)).click();
    }

}
