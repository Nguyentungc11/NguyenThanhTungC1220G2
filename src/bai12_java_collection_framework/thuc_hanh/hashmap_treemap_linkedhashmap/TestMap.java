package bai12_java_collection_framework.thuc_hanh.hashmap_treemap_linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String ,Integer> hashMap = new HashMap<>();
        hashMap.put("Dức",20);
        hashMap.put("Sang",27);
        hashMap.put("Hậu",18);
        hashMap.put("Công",23);
        hashMap.put("Huy",40);
        System.out.println(hashMap);
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("__________________________");
        System.out.println(treeMap);
        Map<String ,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Dức", 20);
        linkedHashMap.put("Sang", 27);
        linkedHashMap.put("Hậu", 18);
        linkedHashMap.put("Công", 23);
        linkedHashMap.put("Huy", 40);
        System.out.println("\n Tuổi của Sang là " + linkedHashMap.get("Sang"));
    }
}
