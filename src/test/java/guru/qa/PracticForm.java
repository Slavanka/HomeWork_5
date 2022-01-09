package guru.qa;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticForm {

    RegistrationPage registrationPage  = new RegistrationPage();

    @Test
    void practicForm() {
        open("https://demoqa.com/automation-practice-form");

        registrationPage.typeFirstName("Vitoriia");
        registrationPage.typeLastName("Sun");





        // заполняем эл.почту
        $("#userEmail").setValue("IronLady@gmail.com");

        //выбираем пол
        $("[for=gender-radio-1]").click();

        //заполняем тел
        $("[id=userNumber]").setValue("9302764785");

        //открываем календарь
        $("#dateOfBirthInput").click();
        //выбираем месяц
        $(".react-datepicker__month-select").selectOptionByValue("4");
        //выбираем год
        $(".react-datepicker__year-select").selectOptionByValue("1993");
        //выбираем рандомную дату
        $(".react-datepicker__day").click();

        //скролл страницы вниз
        $(byText("Sports")).scrollTo();

        //кликаем на поле с выпадающим списком
        $("#subjectsInput").click();
        //вбиваем букву ,чтобы появился выпадающий список
        $("#subjectsInput").setValue("d");
        //выбираем значение из списка
        $(byText("Hindi")).click();

        //заполняем увлечения
        $("[for=hobbies-checkbox-1]").click();

        //загрузка файла
        $("#uploadPicture").uploadFile(new File("src/test/resources/cv.png"));

        $("[id=currentAddress]").setValue("Moscow Kremlin"); //пишем адрес
        $("#state").click();
        $(byText("NCR")).click();   //выбираем значение из списка Штат
        $("#city").click();
        $(byText("Noida")).click();   //выбираем значение из списка город
        $("[id=submit]").click();   //кликаем на кнопку Submit


    }


}

