package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(){
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("4");
        $(".react-datepicker__year-select").selectOptionByValue("1993");
        $(".react-datepicker__day").click();
    }
}
