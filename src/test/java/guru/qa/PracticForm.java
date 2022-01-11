package guru.qa;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;

public class PracticForm {

     RegistrationPage registrationPage  = new RegistrationPage();

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        registrationPage.openPage();
        registrationPage.typeFirstName("Vitoriia")
                .typeLastName("Sun")
                .typeUserEmail("IronLady@gmail.com")
                .typeUserNumber("9302764785")
                .typeCheckboxGender(String.valueOf(byText("Other")))
                .typeCheckboxHobbies(String.valueOf(byText("Sports")));

        registrationPage.calendarComponent.setDate();



//        $("[for=gender-radio-1]").click();

//        $(byText("Sports")).scrollTo();
//        $("#subjectsInput").click();
//        $("#subjectsInput").setValue("d");
//        $(byText("Hindi")).click();
//        $("[for=hobbies-checkbox-1]").click();
//        $("#uploadPicture").uploadFile(new File("src/test/resources/cv.png"));
//        $("[id=currentAddress]").setValue("Moscow Kremlin"); //пишем адрес
//        $("#state").click();
//        $(byText("NCR")).click();
//        $("#city").click();
//        $(byText("Noida")).click();
//        $("[id=submit]").click();


    }


}

