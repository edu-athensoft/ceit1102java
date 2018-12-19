package com.athensoft.concurrent.demo.s9;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SimpleCache {
    private final Map<String,Object> cache = new HashMap<>();

    public Object load(String objectName) {
        // load the object somehow

        return DataMap.data.get(objectName);
    }

    public void clearCache() {
        synchronized (cache) {
            cache.clear();
        }
    }

    public Object getObject(String objectName) {
        Object o;
        synchronized (cache) {
            o = cache.get(objectName);

            if (o == null) {
                o = load(objectName);
                cache.put(objectName, o);
                System.out.print("from source\t");
            }else{
                System.out.print("from cache\t");
            }
        }

        return o;
    }

    public void showData(){
        System.out.println("=== Cache Data ===");
        for(Map.Entry kv : cache.entrySet()){
            System.out.println(kv.getKey()+" : "+kv.getValue());
        }
        System.out.println("=== Cache Data ===");
    }
}
