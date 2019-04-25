package com.example.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTrees2
{
    private int payload;
    private BinaryTrees2 left;
    private BinaryTrees2 right;


    public BinaryTrees2(int payload)
    {
        this.payload = payload;
        this.left = null;
        this.right = null;
    }

    public void browseTree(){

        System.out.println("**** "+ MainActivity.payloadList.get(MainActivity.count));
        MainActivity.count++;
    }

    public void visitInOrder()
    {
        if(this.left != null)
        {
            this.left.visitInOrder(); //blocks
        }
        MainActivity.payloadList.add(payload);
        System.out.println("**** " + this.payload);
        if(this.right != null)
        {
            this.right.visitInOrder();
        }
    }

    public void add(int payloadToAdd)
    {
        if(payloadToAdd <= this.payload)
        {
            //add to the left
            if(this.left == null)
            {
                this.left = new BinaryTrees2(payloadToAdd);
            }
            else
            {
                this.left.add(payloadToAdd);
            }
        }
        else
        {
            //add to the right
            if(this.right == null)
            {
                this.right = new BinaryTrees2(payloadToAdd);
            }
            else
            {
                this.right.add(payloadToAdd);
            }
        }
    }
}