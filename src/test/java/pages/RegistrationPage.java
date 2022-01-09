package pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    SelenideElement firstNameInput = $("firstName"),
                    lastNameInput = $("lastName");

//    $("[id=firstName]").setValue("Vitoriia");
//    $("[id=lastName]").setValue("Sun");
//    $("#userEmail").setValue("IronLady@gmail.com");
//    $("[for=gender-radio-1]").click();
//    $("[id=userNumber]").setValue("9302764785");
//    $("#dateOfBirthInput").click();
//    $(".react-datepicker__month-select").selectOptionByValue("4");
//    $(".react-datepicker__year-select").selectOptionByValue("1993");
//    $(".react-datepicker__day").click();
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

    public void  typeFirstName(){
        firstNameInput.setValue("Vitoriia");
    }

    public void  typeFirstName(){
        lastNameInput.setValue("Sun");
    }
}
