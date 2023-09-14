package C_36_Hashing;

import java.util.HashMap;
public class Implimetation {
    public static void main(String[] args) {
        //creation
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert
        hm.put("Awnish",19);
        hm.put("Harshit",18);

        hm.put("Ravish",19);
        System.out.println(hm);

        //get
        System.out.println(hm.get("Harshit"));
        System.out.println(hm.get("Hariom"));

        //Contaions Key
        System.out.println(hm.containsKey("Harshit"));
        System.out.println(hm.containsKey("Rahul"));

        //Remove Value
        System.out.println(hm.remove("Ravish"));
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //Is Empty
        System.out.println(hm.isEmpty());

        //Clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
