import java.util.*;

public class Phonebook {


    public static void main(String[] args) {


        HashMap<String, String> map = new HashMap<>();
        map.put("loe", "68680909");
        map.put("sali", "67654321");
        map.put("maxi", "6909321");

        for (Map.Entry i : map.entrySet()) {
            System.out.println(i.getKey() + "\t" + i.getValue());

        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name search");
        String name = scanner.next();

        if (map.containsKey(name)) {
            System.out.println(map.get(name));

        } else {
            System.out.println("i don't find number for this name");
        }

        System.out.println("enter name for remove");
        String name1=scanner.next();
        if (map.containsKey(name1)){
            System.out.println(map.remove(name1));
        }else {
            System.out.println("i don't find number for this name");
        }


        System.out.println("printing of all key-value pairs");
        for (Map.Entry i:map.entrySet()) {
            System.out.println(i.getKey()+"\t"+i.getValue());

        }

    }


}




