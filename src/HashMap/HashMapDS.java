package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDS {

    //Fastest data structure i.e O(1)
    // key , value pair bcs of this we retrieve value in one operation

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2134 , "ram");
        map.put(123,"tim");
        map.put(23,"tom");
        map.put(6464,"sam");

        //System.out.println(map.get(2134));
        //map.get(23);

        //Print all the value of HashMap
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        for ( Map.Entry<Integer,String> entry : entrySet){
            //System.out.println(entry.getKey() + entry.getValue());
        }

        //HashMap can have duplicate value , but not key
        HashMap<Integer,String> map1 = new HashMap<Integer,String>();
        map1.putAll(map);
        map1.put(232,"ram");

        Set<Map.Entry<Integer,String>> entrySet1 = map1.entrySet();
        for ( Map.Entry<Integer,String> entry : entrySet1){
            System.out.println(entry.getKey() + entry.getValue());
        }

        //Print only key
        Set<Integer> keySet = map1.keySet();
        for( Integer key : keySet){
            System.out.println(key);
        }

        //contains key or value
        System.out.println(map1.containsKey(232));
        System.out.println(map1.containsValue("ram"));

        //size of map
        System.out.println(map1.size());
        //clear the map
        map1.clear();
        map1.remove(9990);















    }
}
