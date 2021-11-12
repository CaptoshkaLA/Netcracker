package Contracts;

import Person.Person;


/** To work with dates */
import java.time.*;

/**
 * An abstract class that describes the entity contract
 * @author Lisovsky Anton
 * @see Person
 */

public abstract class Contract {

    protected int ID;
    protected int contractNumber;
    protected Person contractOwner;
    protected LocalDate firstDate;
    protected LocalDate secondDate;

    /** Сonstructor with parameters */
    public Contract(int ID, String firstDate, String secondDate, int contractNumber, Person contractOwner) {
        this.ID = ID;
        this.contractNumber = contractNumber;
        this.contractOwner = contractOwner;
        this.firstDate = LocalDate.parse(firstDate);
        this.secondDate = LocalDate.parse(secondDate);
    }

    /** Default contructor*/
    public Contract() {
        this.ID = 0;
        this.contractNumber = 0;
        this.contractOwner = null;
        this.firstDate = null;
        this.secondDate = null;
    }

    //* Set`s and get`s */

    public int getID() {
        return ID;
    }

    public LocalDate getFirstDate() { return firstDate; }

    public LocalDate getSecondDate() {
        return secondDate;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public Person getContractOwner() {
        return contractOwner;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = LocalDate.parse(firstDate);
    }

    public void setSecondDate(String secondDate) {
        this.secondDate = LocalDate.parse(secondDate);
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public void setContractOwner(Person contractOwner) {
        this.contractOwner = contractOwner;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}