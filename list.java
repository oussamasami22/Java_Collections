import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

 public class list {
    public static void main(String[] args){
        List<String> noms = new ArrayList<>();
        noms.add("oussama");
        noms.add("sami");
        noms.add("elgoum");
        

        // Sorting
        Collections.sort(noms);
        System.out.println(noms);
    }
 }
