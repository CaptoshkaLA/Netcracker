package Contracts;

import Person.Person;

/**
 * Class which describes the entity Mobile contract
 * @author Lisovsky Anton
 * @see Person
 */
public class MobileContract extends Contract {

    private int countMinutes;
    private int countSms;
    private int traffic;

    /** Default constructor */
    public MobileContract() {
        //super(0, "", "", 0, null);
        super();
        this.countMinutes = 0;
        this.countSms = 0;
        this.traffic = 0;
    }

    /** Constructor with parameters */
    public MobileContract(int ID, String FirstDate, String SecondDate, int contractNumber, Person contractOwner, int countMinutes, int countSms, int traffic) {
        super(ID, FirstDate, SecondDate, contractNumber, contractOwner);
        this.countMinutes = countMinutes;
        this.countSms = countSms;
        this.traffic = traffic;
    }

    public int getСountMinutes() {
        return countMinutes;
    }

    public int getСountSms() {
        return countSms;
    }

    public int getTraffic() {
        return traffic;
    }

    public void setTraffic(int traffic) {
        this.traffic = traffic;
    }

    public void setСountMinutes(int countMinutes) {
        this.countMinutes = countMinutes;
    }

    public void setСountSms(int countSms) {
        this.countSms = countSms;
    }

    @Override
    public String toString() {
        return "Контракт № " + this.getContractNumber() + "\nID: " + this.getID() +
                "\nДата начала контракта: " + this.getFirstDate() + "\nДата окончания контракта: " + this.getSecondDate() +
                "\nМинуты " + this.countMinutes + "\nСмс " + this.countSms +
                "\nВладелец контракта: " + this.getContractOwner().toString() + "\n" +
                "\nТраффик " + this.traffic + " гб\n";
    }

}