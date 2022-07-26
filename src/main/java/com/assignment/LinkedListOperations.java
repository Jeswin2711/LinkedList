package com.assignment;

class LinkedListOperations
{
    /*
    Class Variable head and tail because a LinkedList consist of Head and Tail
     */
    LinkedListNode head;
    LinkedListNode tail;

    /*
    function to Add Data to a LinkedList;
     */
    void addData(Object data)
    {
        LinkedListNode newNode = new LinkedListNode(data);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
            System.out.println("\nData Added Successfully");
        }
        else {
            newNode.setNodeNext(head);
            head = newNode;
            System.out.println("Data Added Successfully");
        }
    }

    /*
    Show Data funtion to show the linked list Node Values one by one
     */
    public void showValues() {
        LinkedListNode temp = head;
        if (head == null) {
            System.out.println("List is empty \n ");
        }else {
            while (temp != null) {
                System.out.print(temp.getNodeData() + " ");
                temp = temp.getNodeNext();
            }
        }
    }
    /*
    Function to insert data after a particular position
     */
    public void insertData(Object preData, Object newData) {
        LinkedListNode newNode = new LinkedListNode(newData);
        LinkedListNode temp = head;
        while (temp != null) {
            if (temp.getNodeData().equals(preData)) {
                newNode.setNodeNext(temp.getNodeNext());
                temp.setNodeNext(newNode);
                break;
            }
            temp = temp.getNodeNext();
        }
    }

    /*
    Pop method to pop the first Element of a Linked List
     */
    public Object pop() {
        Object value = head.getNodeData();
        head = head.getNodeNext();
        return value;
    }

    /*
_Pop Method to Pop the last element of a Linked List_
*/
    public Object popLast() {
        Object value = null;
        LinkedListNode temp = head;
        while (head.getNodeNext() != null)
        {
            if(temp.getNodeNext() == null)
            {
                value =  temp.getNodeData();
                break;
            }
            temp = temp.getNodeNext();
        }
        return value;
    }

    /*
    Search Function to return the Index of the Element LinkedList
     */
    public Object search(Object num)
    {
        Object value = 0;
        int index = 0;
        LinkedListNode temp = head;
        while (true)
        {
            if (temp.getNodeData() == num)
            {
                 value = index;
                 break;
            }
            else
            {
                temp = temp.getNodeNext();
                index++;
            }
        }
        return value;
    }

}


