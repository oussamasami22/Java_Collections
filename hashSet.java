import java.util.HashSet;


public class hashSet {
    public static void main(String[] args){
        HashSet<String> friends = new HashSet<>();
        friends.add("oussama");
        friends.add("sami");
        friends.add("elgoum");
        friends.add("elgoum"); //not added

        System.out.println("my hashSet: "+friends);
    }
    
}
