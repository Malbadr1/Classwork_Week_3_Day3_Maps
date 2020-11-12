import java.util.HashMap;
import java.util.Map;

public class HashMap_object {


    public static void main(String[] args) {

        HashMap <String,String>map=new HashMap();
        map.put("ios","iphone");
        map.put("android","galaxy");
        map.put("windows","nokia");

        System.out.println(map.get("ios"));
        System.out.println(map.containsKey("balck berry"));
        System.out.println(map.size());
      //map.clear();
        System.out.println("Print Keys with out Value");
        for(String i : map.keySet()) {
            System.out.println(i);
        }
        System.out.println("Print Value with out keys");
        for (String i:map.values()){
            System.out.println(i);
        }

        System.out.println("Iterating Hashmap...");
        for(Map.Entry i: map.entrySet()){
            System.out.println(i.getKey()+"\t"+i.getValue());
        }

        System.out.println(map.remove("windows","nokia"));

        for (Map.Entry i:map.entrySet()) {
            System.out.println(i.getKey()+"\t"+i.getValue());
        }
        System.out.println(" HashMap after replace");
        System.out.println(map.replace("android","galaxy","Huawei"));

        for (Map.Entry i:map.entrySet()) {

            System.out.println(i.getKey()+"\t"+i.getValue());

        }
        if (map.containsKey("l")) {
            System.out.println( map.replace("ios","iphone","Ipad"));
        } else {

            System.out.println( map.put("ios", map.get("ios")));
        }

        System.out.println("After Replace");
        for (Map.Entry i:map.entrySet()) {
            System.out.println(i.getKey()+"\t"+i.getValue());

        }

    }
}
