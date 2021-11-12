package Contracts;

import Person.Person;

/**
 *  Class which describes the entity Internet contract
 *  @author Lisovsky Anton
 *  @see Person
 */
public class InternetContract extends Contract {

    protected int internetSpeed;

    /** Default constructor */
    public InternetContract() {
        super();
        this.internetSpeed = 0;
    }

    /** Constructor with parameters */
    public InternetContract(int ID, String FirstDate, String SecondDate, int contractNumber, Person contractOwner, int internetSpeed) {
        super(ID, FirstDate, SecondDate, contractNumber, contractOwner);
        this.internetSpeed = internetSpeed;
    }

    public void setInternetSpeed(int interSpeed) {
        this.internetSpeed = interSpeed;
    }

    public int getInternetSpeed() {
        return internetSpeed;
    }

    @Override
    public String toString() {
        return "Контракт № " + this.getContractNumber() + "\nID " + this.getID() +
                "\nНачало контракта: " + this.getFirstDate() + "\nКонец контракта: " + this.getSecondDate() +
                "\nВладелец контракта: " + this.getContractOwner().toString() +
                "\nСкорость интернета: " + this.getInternetSpeed() + "\n";
    }

}
