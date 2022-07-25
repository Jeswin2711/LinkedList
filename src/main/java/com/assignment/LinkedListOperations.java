package com.assignment;

class LinkedListOperations
{
    /*
    Class Variable head and tail because a LinkedList consist of Head and Tail
     */
    LinkedListNode head,tail;

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
}


