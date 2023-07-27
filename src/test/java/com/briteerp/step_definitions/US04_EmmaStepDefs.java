package com.briteerp.step_definitions;

import com.briteerp.pages.CalendarPage_Emma;
import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US04_EmmaStepDefs {
    LoginPage loginPage = new LoginPage();
    CalendarPage_Emma calendarPageEmma;

    @Given("user is enters username and password and hits enter")
    public void user_is_logged_in_and_on_the_calendar_page_of_the_application() {
        loginPage.login("posmanager36@info.com", "posmanager" + Keys.ENTER);
        calendarPageEmma = new CalendarPage_Emma();
    }

    @Then("user clicks on calendar link to access calendar module")
    public void userClicksOnCalendarLinkToAccessCalendarModule() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(calendarPageEmma.calendarLink)).click();
    }


    @When("user clicks on timebox for All day on sun")
    public void userClicksOnTimeboxForOn() {
        calendarPageEmma.timeBox.click();

    }

    @When("user enters information in summary section of pop-up window")
    public void user_enters_information_in_section_of_pop_up_window() {
        calendarPageEmma.summaryField.sendKeys("meeting");
    }


    @When("user clicks Create")
    public void user_clicks() {
        calendarPageEmma.createButton.click();
    }


    @Then("user should see event created in that time box")
    public void user_should_see_event_created_in_that_time_box() {
        Assert.assertTrue(calendarPageEmma.meetingLink.isDisplayed());

    }


    @When("user clicks on event in timebox")
    public void user_clicks_on_event_in_timebox() {
        calendarPageEmma.meetingLink.click();
    }


    @Then("user should see pop-up window with event details")
    public void user_should_see_pop_up_window_with_event_details() {
        Assert.assertTrue(calendarPageEmma.meetingDetailsWindow.isDisplayed());
    }
}
