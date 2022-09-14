package practice;

import java.util.HashMap;
import java.util.Map;

//Find the first non repeating character in the string
public class nonRepeatingCharacter {

    public static void program(String c) {

        for (int i = 0; i < c.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < c.length(); j++) {
                if (i != j && c.charAt(i) == c.charAt(j)) {
                    unique = false;
                }
            }
            if (unique) {
                System.out.println(c.charAt(i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        String str = "AABCDBE";
        //program(str); // without using collections
        hashmap(str); // using hashmap
    }

    private static void hashmap(String str) {
        //char[] c = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch , map.get(ch)+ 1);
            }else {
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entrySet : map.entrySet()){
            if(entrySet.getValue() == 1){
                System.out.println(entrySet.getKey());
                break;
            }
        }

    }
}
