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
        LinkedListOperations operations = new LinkedListOperations();
        operations.addData(70);
        operations.addData(30);
        operations.addData(56);
        operations.showValues();

    }
}

