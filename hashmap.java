import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

 public class hashmap {
 
    public static void main (String[] args){
        Map<Integer, String> students = new HashMap<>();
     students.put(1, "oussama");
     students.put(1, "sami");
     students.put(1, "elgoum");


     for (Map.Entry<Integer, String> entree : students.entrySet()) {
        System.out.println("ID : " + entree.getKey() + ", Nom : " + entree.getValue());
    }
    }
 }
