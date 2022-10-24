package ss12_java_collection_framework.practice.hashmap_linkedhashmap_treemap;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class UseHashMapAndLinkedHashMapAndTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "Nghĩa");
        hashMap.put(-4, "Định");
        hashMap.put(9, "Tài");
        hashMap.put(3, "Phúc");
        System.out.println("Danh sách sinh viên " + "\n" + hashMap);
        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put(2, "Nghĩa");
        linkedHashMap.put(4, "Định");
        linkedHashMap.put(9, "Tài");
        linkedHashMap.put(3, "Phúc");
        System.out.println("\nName of key " + 4 + "is" + linkedHashMap.get(4));
    }

}

