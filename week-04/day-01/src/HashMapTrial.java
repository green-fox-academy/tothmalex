import java.util.HashMap;
import java.util.Map;

public class HashMapTrial {

    public static void main(String[] args) {

        HashMap<Integer, String> typemap = new HashMap<Integer, String>();
        typemap.put(1 , "alfa");
        typemap.put(2 , "dominant");
        typemap.put(3 , "karika");
        typemap.put(4 , "zsombor");
        typemap.put(5 , "soma");

        HashMap<Integer, Integer> agemap = new HashMap<Integer, Integer>();
        agemap.put(1 , 13);
        agemap.put(2 , 16);
        agemap.put(3 , 17);
        agemap.put(4 , 19);
        agemap.put(5 , 20);

        System.out.println("Tree type:");
        for (Map.Entry me : typemap.entrySet()) {
            System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
        }
        System.out.println("Tree age:");
        for (Map.Entry me : agemap.entrySet()) {
            System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
        }

        if (typemap.containsKey("Jack")) System.out.println(1);
        if (typemap.containsValue("3")) System.out.println(2);

        for (Integer s : typemap.keySet()) {
            System.out.println(3);
        }
        for (String b : typemap.values()) {
            System.out.println(3);
        }
    }
}

/* Create 5 trees
Store the data of them in variables in your program
for every tree the program should store its'
type
leaf color
age
sex
you can use just variables, or lists and/or map */