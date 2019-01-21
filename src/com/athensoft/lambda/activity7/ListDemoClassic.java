package com.athensoft.lambda.activity7;

import java.util.ArrayList;
import java.util.List;

public class ListDemoClassic {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("EB");

        for(String item : items){
            System.out.println(item);
        }
    }
}
