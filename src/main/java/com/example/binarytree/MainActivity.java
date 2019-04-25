package com.example.binarytree;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    public static int count;

    private Button treesButton;
    public static List<Integer> payloadList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        treesButton = (Button)  findViewById(R.id.treeButton);
        treesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newActivity();


            }

        });


        BinaryTrees2 bt = new BinaryTrees2(5);
        bt.add(3);
        bt.add(3);
        bt.add(8);
        bt.add(6);
        bt.visitInOrder();
        System.out.println("****"+payloadList);
        bt.browseTree();
        bt.browseTree();
        bt.browseTree();
        bt.browseTree();
    }

    public void newActivity(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);

    }
}

