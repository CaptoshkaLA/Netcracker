package Contracts;

import Person.Person;

/**
 * Class which describes the entity Mobile contract
 * @author Lisovsky Anton
 * @see Person
 */
public class TelevisionContract extends Contract {

    private String channelsList;

    /** Default constructor */
    public TelevisionContract() {
        super();
        this.channelsList = "";
    }

    /** Constructor with parameters */
    public TelevisionContract(int ID, String FirstDate, String SecondDate, int contractNumber, Person contractOwner, String channelsList) {
        super(ID, FirstDate, SecondDate, contractNumber, contractOwner);
        this.channelsList = channelsList;
    }

    /** Set`s and get`s */

    public void setChannelsList(String channelsList) {
        this.channelsList = channelsList;
    }

    public String getChannelsList() {
        return channelsList;
    }

    @Override
    public String toString() {
        return "Контракт № " + this.getContractNumber() + "\nID: " + this.getID() +
                "\nНачало " + this.getFirstDate() + "\nКонец " + this.getSecondDate() +
                "\nВладелец " + this.getContractOwner().toString() +
                "\nПакет каналов: " + this.getChannelsList() + "\n";
    }

}