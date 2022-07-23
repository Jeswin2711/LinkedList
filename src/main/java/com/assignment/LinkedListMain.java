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

    }
}

