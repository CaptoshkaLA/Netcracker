package Container;

import Contracts.Contract;
/**
 * Class to create a container based on a resize array
 * @author Anton Lisovsky
 */
public class Container{

    // Array making the list
    Contract[] items;

    // Number of items in the list
    private int size;

    // Start size of the entire array
    private int ARRAY_SIZE = 16;

    /**
     * Default constructor
     * sets size = 0 and creates the array
     */
    public Container() {
        size = 0;
        items = new Contract[ARRAY_SIZE];
    }

    /** Get for ARRAY_SIZE*/
    int getMaxSize() {
        return ARRAY_SIZE;
    }

    /**
     * Method to see if list is empty
     * @return boolean
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Method to return a size of array
     * @return int
     */
    public int size() {
        return size;
    }

    /**
     * Method to clear and empty the list
     */
    public void clear() {
        ARRAY_SIZE = 16;
        items = new Contract[ARRAY_SIZE];
        size = 0;
    }

    /**
     * Method to add an element to the end of the list
     * @param /item  which you wish to add to the list
     * @return true if the add is successful
     */
    public boolean add(Contract item) {
        if(size >= ARRAY_SIZE)
            grow();
        items[size++] = item;
        return true;
    }

    /**
     * Method to add an element to the index
     * @param /index and /item
     */
    public void add(int index, Contract item) throws IndexOutOfBoundsException {
        if(index > 0)
        {
            if(size >= ARRAY_SIZE)
                grow();

            if(index > size)
                index = ((index % size) - 1);

            Contract[] tempItems = new Contract[ARRAY_SIZE];

            for(int i=0; i < size; i++)
                tempItems[i] = items[i];

            items[index] = item;

            for(int i=index; i < size; i++)
                items[i + 1] = tempItems[i];

            tempItems = null;

            size++;

        }else
            throw new IndexOutOfBoundsException();
    }

    /**
     * Method to remove an element from the Container
     * @param /index
     */
    public void remove(int index) throws IndexOutOfBoundsException {
        int counter = 0;
        Object ret = items[index];

        for(int i=0; i < size - 1; i++)
        {
            if(i >= index)
            {
                items[index + counter] = items[index + counter + 1];
                counter++;
            }
        }
        size--;
    }

    /**
     * Method to get an item by index
     * @param /index
     * @return the Contract of which you want to get
     */
    //@SuppressWarnings("unchecked")
    public Contract get(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        else
        {
            return (Contract) items[index];
        }
    }

    /**
     * Method to grow the size by  * (3/2)
     */
    public void grow(){
        ARRAY_SIZE = (ARRAY_SIZE * 3/2);

        Contract[] newItem = new Contract[ARRAY_SIZE];

        for(int i=0; i < size; i++)
            newItem[i] = items[i];

        items = newItem;

        newItem = null;
    }

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < size; i++) {
            str += "Contract Number: " + items[i].getContractNumber() + "\n";
        }
        return str;
    }

}
