package Person;

import Contracts.Contract;

//* To work with dates */
import java.time.*;

/**
 * Class that describes the entity Person which is
 * necessary to describe the owner of the contract
 * @author Lisovsky Anton
 * @see Contract
 */
public class Person {

    protected int ID;
    protected String name;
    protected LocalDate birthdayDate;
    protected String gender;
    protected String passportNumber;
    protected int age;

    /** Default constructor */
    public Person() {
        this.ID = 0;
        this.name = "";
        this.birthdayDate = null;
        this.gender = "";
        this.passportNumber = "";
        this.age = 0;
    }

    /** Constructor with parameters  */
    public Person(int ID, String name, String birthdayDate, String gender, String passportNumber) {
        this.ID = ID;
        this.name = name;
        this.birthdayDate = LocalDate.parse(birthdayDate);
        this.gender = gender;
        this.passportNumber = passportNumber;
        this.age = calcAge();
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public String getGender() {
        return gender;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = LocalDate.parse(birthdayDate);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    /** Function for getting the age */
    public int calcAge() {
        LocalDate today = LocalDate.now();
        int age = 0;
        if(this.birthdayDate.isBefore(today) && this.birthdayDate != null) {
            Period period = Period.between(birthdayDate, today);
            age = period.getYears();
        }
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\nID " + this.getID() + "\nПаспорт " + this.getPassportNumber() +
                "\nДата рождения: " + this.getBirthdayDate() + "\nПол: " + this.getGender() + "\nВозраст: " + this.getAge() + "\n";
    }

}
