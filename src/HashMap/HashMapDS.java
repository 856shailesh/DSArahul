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

        System.out.println(map.get(2134));
        //map.get(23);

        //Print all the value of HashMap
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();

        for ( Map.Entry<Integer,String> entry : entrySet){
            System.out.println(entry.getKey() + entry.getValue());
        }






    }
}
