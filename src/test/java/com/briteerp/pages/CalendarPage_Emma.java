package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage_Emma {
    public CalendarPage_Emma() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/web#menu_id=120&action=136']")
    public WebElement calendarLink;

    @FindBy (xpath = "//td[@class='fc-widget-content']//td[2]")
    public WebElement timeBox;

    @FindBy (xpath = "//input[@class='o_input']")
    public WebElement summaryField;

    @FindBy (xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement createButton;;

    @FindBy (xpath = "//a[@class='fc-day-grid-event fc-h-event fc-event fc-start fc-end fc-draggable fc-resizable o_calendar_color_6\\\']")
    public WebElement meetingLink;

    @FindBy (xpath = "//div[@class='modal-body o_act_window']")
    public WebElement meetingDetailsWindow;

}
