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

    /*
    Inserting data after using the index Value
     */

    public void insertAfter(Object indexVal , Object num)
    {
        LinkedListNode newNode = new LinkedListNode(num);
        LinkedListNode temp = head;
        LinkedListNode temp1 = head;
        Object index = indexVal;
        Object value = 0 ;
        for(int i = 0 ; i <= (int)index ; i++)
        {
            value = temp.getNodeData();
            temp = temp.getNodeNext();
        }
        while (temp1 != null) {
            if (temp1.getNodeData().equals(value)) {
                newNode.setNodeNext(temp1.getNodeNext());
                temp1.setNodeNext(newNode);
                break;
            }
            temp1 = temp1.getNodeNext();
        }
    }

    /*
    Function to remove a data from the Linked List
     */
    public void removeData(Object data) {
        LinkedListNode temp = head;
        if (head.getNodeData().equals(data)) {
            head = head.getNodeNext();
        }
        else {
            while (temp.getNodeData() != data) {
                if ((temp.getNodeNext().getNodeData()).equals(data)) {
                    if (temp.getNodeNext().equals(tail)) {
                        temp.setNodeNext(null);
                        tail = temp;
                        break;
                    }
                    temp.setNodeNext(temp.getNodeNext().getNodeNext());
                    break;
                }
                temp = temp.getNodeNext();
            }
        }
    }

    /*
    Function to Sort the List
     */

    public LinkedListNode sortList(LinkedListNode head)
    {
        if(head == null || head.getNodeNext() == null)
        {
            return head;
        }

        LinkedListNode temp = head;
        LinkedListNode firstHalf = head;
        LinkedListNode secondHalf = head;

        while (secondHalf != null && secondHalf.getNodeNext() != null)
        {
            temp = firstHalf;
            firstHalf = firstHalf.getNodeNext();
            secondHalf = secondHalf.getNodeNext().getNodeNext();
        }
        temp = null;
        LinkedListNode left_side = sortList(firstHalf);
        LinkedListNode right_side = sortList(secondHalf);
        return mergeSort(left_side,right_side);
    }

    public LinkedListNode mergeSort(LinkedListNode list1 , LinkedListNode list2)
    {
        LinkedListNode sorted_temp = new LinkedListNode(0);
        LinkedListNode current_node = sorted_temp;

        while (list1 != null && list2 != null)
        {
            if((int)list1.getNodeData() < (int)list2.getNodeData())
            {
                current_node.setNodeNext(list1);
                list1 = list1.getNodeNext();
            }
            else
            {
                current_node.setNodeNext(list2);
                list2 = list2.getNodeNext();
            }
            current_node = current_node.getNodeNext();
        }
        if(list1 != null)
        {
            current_node.setNodeNext(list1);
            list1 = list1.getNodeNext();
        }
        if(list2 != null)
        {
            current_node.setNodeNext(list2);
            list2 = list2.getNodeNext();
        }
        return sorted_temp.getNodeNext();
    }
}


