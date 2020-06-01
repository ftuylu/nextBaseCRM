package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BitrixEventPage extends BitrixActStrPage{

//Event Start Date
    @FindBy (name="DATE_FROM")
    public WebElement dateFrom;

    @FindBy (className="bx-calendar-top-month")
    public WebElement topMonth;

    @FindBy (className="bx-calendar-month")
    public WebElement Month;

    public Select Month() {
        return new Select(Month);
    }

    @FindBy (className="bx-calendar-top-year")
    public WebElement topYear;

    @FindBy (xpath = "(//span[@class ='bx-calendar-year-number'])[4]")
    public WebElement Year;

    @FindBy (xpath = " (//a[@class='bx-calendar-cell'])[4]")
    public WebElement startDay;

//Event Start Time

    @FindBy(name="TIME_FROM_")
    public WebElement timeFrom;

    @FindBy(css ="input[title='Hours']")
    public WebElement hours;

    @FindBy(css ="input[title='Minutes']")
    public WebElement minutes;

    @FindBy(css = "input[value='Set Time']")
    public WebElement setTime;
//Event End Date
    @FindBy (name="DATE_TO")
    public WebElement dateTo;


//Event End Time
    @FindBy (name="TIME_TO_")
    public WebElement timeTo;

//Event TimeZone
    @FindBy(className = "feed-ev-tz-open")
    public WebElement timeZone;

//Event Reminder
    @FindBy(name="EVENT_REMIND")
    public WebElement eventRemind;

    @FindBy(name="EVENT_REMIND_COUNT")
    public WebElement eventReminderCount;

    @FindBy(name="EVENT_REMIND_TYPE")
    public WebElement eventReminderType;

    public Select EventReminderType() {
        return new Select(eventReminderType);
    }
//Event Location
    @FindBy(name="EVENT_LOCATION")
    public WebElement eventLocation;

    @FindBy(id = "event-location-newcal_3Jcl")
    public WebElement locationName;

//Event Add Employee or Department
    @FindBy(id = "feed-event-dest-add-link")
    public WebElement addPeople;
    @FindBy(linkText = "Employees and departments")
    public WebElement addMore;

    @FindBy(linkText ="Add persons, groups or department")
    public WebElement addPersonGroupDepartment;

    @FindBy(xpath = "//a[@class='bx-finder-company-department-employee  bx-finder-element'][3]")
    public WebElement pickEmail;
    @FindBy(xpath = "//*[@id='bx-lm-category-relation-129']/a[3]/div[1]/div[1]")
    public WebElement getEmailName;


    @FindBy(className = "feed-event-destination-text")
    public WebElement inputEmail;

    //a[text()='Employees and departments']
    @FindBy(css = "input[title='Hours']")
    public WebElement Hours;

    @FindBy(css = "input[title='Minutes']")
    public WebElement Minutes;

    @FindBy(css = "img[title='Close']")
    public WebElement Close;


//Event More Button
    @FindBy(className = "feed-event-more-link-text")
    public WebElement More;

    @FindBy(id = "feed-cal-additional-inner")
    public WebElement eventDetails;



}
