import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class iterator {
    public static void main(String[] args){
        List<String> strings = new ArrayList<>();
        strings.add("O");
        strings.add("u");
        strings.add("s");
        strings.add("s");
        strings.add("a");
        strings.add("m");
        strings.add("a");

        Iterator<String> iterator = strings.iterator();

        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(""+s);
        }
        

    }
    
}
