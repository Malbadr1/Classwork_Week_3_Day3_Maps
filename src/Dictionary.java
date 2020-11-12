import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {



    Map<String,HashMap<String,String>> map = new HashMap<>();
    HashMap<String,String> word=new HashMap<>();

        word.put("mean", "an institution for educating children.");

        word.put("description", "institution");
        map.put("School",word);
    HashMap<String,String>word1=new HashMap<>();
        word1.put("mean", "he work at hospitle.");

        word1.put("description", "job");

        map.put("doctor",word1  );

        for (Map.Entry i:map.entrySet()) {
            System.out.println(i.getKey()+"\t"+i.getValue());

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
            System.out.println(i.getKey() + "\t" + i.getValue());

        }

}
}
