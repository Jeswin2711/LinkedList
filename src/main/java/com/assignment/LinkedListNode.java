package com.assignment;

class LinkedListNode
{
    private Object nodeData;
    private LinkedListNode nodeNext;

    public LinkedListNode()
    {}
    /*
    Parameterized Constructor
     */
    public LinkedListNode(Object data)
    {
        this.nodeData = data;
        this.nodeNext = null;
    }

    /*
    Getter and Setter for Data and Nexts
     */
    public Object getNodeData() {
        return nodeData;
    }

    public void setNodeData(Object nodeData) {
        this.nodeData = nodeData;
    }

    public LinkedListNode getNodeNext() {
        return nodeNext;
    }

    public void setNodeNext(LinkedListNode nodeNext) {
        this.nodeNext = nodeNext;
    }

    /*
    toString() to print the object in String type
     */
    @Override
    public String toString() {
        return "LinkedListNode{" +
                "nodeData=" + nodeData +
                ", nodeNext=" + nodeNext +
                '}';
    }
}
