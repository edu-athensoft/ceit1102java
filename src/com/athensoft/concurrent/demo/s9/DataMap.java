package com.athensoft.concurrent.demo.s9;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DataMap {
    public static final Map<String,Integer> data = new HashMap<String,Integer>();

    static{
        for(int i=0; i<10; i++){
            data.put("obj"+i, new Random().nextInt(10));
        }
    }

    public static void showData(){
        System.out.println("=== Data ===");
        for(Map.Entry kv : data.entrySet()){
            System.out.println(kv.getKey()+" : "+kv.getValue());
        }
        System.out.println("=== Data ===");
    }
}
