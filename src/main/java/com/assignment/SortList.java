package com.assignment;

class SortLinkedList
{
    /*
    Function mergeSort takes one argument head and recursively calling it to split the List into halves
     */

    static LinkedListNode mergeSort(LinkedListNode head)
    {
        if (head.getNodeNext() == null)
            return head;

        LinkedListNode mid = findMidIndex(head);
        LinkedListNode head2 = mid.getNodeNext();
        mid.setNodeNext(null);
        LinkedListNode leftHalf = mergeSort(head);
        LinkedListNode rightHalf = mergeSort(head2);
        LinkedListNode finalList = merge(leftHalf, rightHalf);

        return finalList;
    }


    // Function to Find the mid Index Value
    static LinkedListNode findMidIndex(LinkedListNode head)
    {
        LinkedListNode fIndex = head, sIndex = head.getNodeNext();
        while (sIndex != null && sIndex.getNodeNext() != null) {
            fIndex = fIndex.getNodeNext();
            sIndex = sIndex.getNodeNext().getNodeNext();
        }
        return fIndex;
    }

    //Merge function to merge the splitted Nodes
    static LinkedListNode merge(LinkedListNode leftHalf, LinkedListNode rightHalf)
    {
        LinkedListNode merged = new LinkedListNode(-1);
        LinkedListNode temp = merged;

        while (leftHalf != null && rightHalf != null) {
            if ((int)leftHalf.getNodeData() < (int)rightHalf.getNodeData()) {
                temp.setNodeNext(leftHalf);
                leftHalf = leftHalf.getNodeNext();
            }
            else {
                temp.setNodeNext(rightHalf);
                rightHalf = rightHalf.getNodeNext();
            }
            temp = temp.getNodeNext();
        }

        //Need to check whether any Element is Missing
        while (leftHalf != null) {
            temp.setNodeNext(leftHalf);
            leftHalf = leftHalf.getNodeNext();
            temp = temp.getNodeNext();
        }

        //Need to check whether any Element is Missing
        while (rightHalf != null) {
            temp.setNodeNext(rightHalf);
            rightHalf = rightHalf.getNodeNext();
            temp = temp.getNodeNext();
        }
        return merged.getNodeNext();
    }



    // Function to print the Sorted List
    static void printLinkedList(LinkedListNode head)
    {
        while (head != null) {
            System.out.print(head.getNodeData() + " ");
            head = head.getNodeNext();
        }
    }

}
