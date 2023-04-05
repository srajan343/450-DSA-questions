import java.util.HashMap;
import java.util.Map.Entry;

public class duplicates_letters {

    static void duplicate(String str){
        
        if(str == null){
            System.out.println("null string ");
            return;

        }

        if(str.isEmpty()){
            System.out.println("The string is empty");
            return;
        }

        if(str.length() == 1){
            System.out.println("single character string ");
            return;
        }

        char ch[] = str.toCharArray();
        HashMap<Character,Integer> map  = new HashMap<>();
        for(Character a : ch){ //java
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else{
                map.put(a, 1);
            }
        }

        //for printing the value of map 
        for(Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue()>1){
            System.out.println(e.getKey() + ":" + e.getValue());
            }
        }
    }
    public static void main(String[] args) {
        duplicate(null);
        duplicate("java");
    }
}
