package com.assignment;


public class LinkedListMain
{
    /* Main Function to Perform All the LinkedList Operations*/
    public static void main(String[] args)
    {
        System.out.println("Welcome to LinkedList Program \n");

        /*
        creating an object for LinkedListOperations
         */

        /*
        Starting with Empty Linked List
         */
        LinkedListOperations operations = new LinkedListOperations();
        operations.showValues();// return List is Empty At First

        operations.addData(56);
        operations.addData(30);
        operations.addData(70);
        operations.showValues();

        /*
        create Linked List by adding 30 and 56 to 70
         */
        LinkedListOperations operations1 = new LinkedListOperations();
        operations1.addData(70);
        operations1.addData(30);
        operations1.addData(56);
        operations1.showValues();

        /*
        create Linked List by appending 30 and 70 to 56
         */
        LinkedListOperations operations2 = new LinkedListOperations();
        operations2.addData(56);
        operations2.addData(30);
        operations2.addData(70);
        operations2.showValues();

        /*
        Insert a Element After a Value
         */
        LinkedListOperations insertingData = new LinkedListOperations();
        insertingData.addData(70);
        insertingData.addData(56);
        System.out.println("Before Insertion");
        insertingData.showValues();
        System.out.println("\nAfter Insertion");
        insertingData.insertData(56,30);
        insertingData.showValues();

        /*
        Popping First Element of a Linked List
         */
        LinkedListOperations popFirstData = new LinkedListOperations();
        popFirstData.addData(70);
        popFirstData.addData(30);
        popFirstData.addData(56);
        System.out.println("Before Popping");
        popFirstData.showValues();
        System.out.println("\nAfter Popping");
        popFirstData.pop();
        popFirstData.showValues();

        /*_  A new List for Popping Last Element_ */
        LinkedListOperations popLastData = new LinkedListOperations();
        popLastData.addData(70);
        popLastData.addData(30);
        popLastData.addData(56);
        System.out.println("\nBefore Popping Last ");
        popLastData.showValues();
        System.out.println("\nPopped Element " + popLastData.popLast());

        /*
        Linked List searchData object to find index of the Node with given value
         */
        LinkedListOperations searchData = new LinkedListOperations();
        searchData.addData(70);
        searchData.addData(30);
        searchData.addData(56);
        searchData.showValues();
        System.out.println("\nThe Index of The Given Value is " + searchData.search(30));

        /*
        Inserting Data 40 after 30 to the Linked List
         */
        LinkedListOperations insertData = new LinkedListOperations();
        insertData.addData(70);
        insertData.addData(30);
        insertData.addData(56);
        Object index = insertData.search(70);
        insertData.insertAfter(index,40);
        insertData.showValues();


        /*
        LinkedList to Delete a Particular Value from a Linked List
         */

        LinkedListOperations deleteData = new LinkedListOperations();
        deleteData.addData(70);
        deleteData.addData(40);
        deleteData.addData(30);
        deleteData.addData(56);
        deleteData.addData(40);
        System.out.println("\npBefore Deleting");
        insertData.showValues();
        insertData.removeData(40);
        System.out.println("\nAfter Deleting");
        insertData.showValues();
    }
}

