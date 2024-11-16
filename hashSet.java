import java.util.HashSet;


public class hashSet {
    public static void main(String[] args){
        HashSet<String> friends = new HashSet<>();
        friends.add("oussama");
        friends.add("sami");
        friends.add("elgoum");
        friends.add("elgoum"); //not added

        System.out.println("my hashSet: "+friends);
        System.out.println("--------------------------------");
        friends.remove("elgoum");
        System.out.println("my hashSet: "+friends);
        System.out.println("Contient oussama ? " + friends.contains("oussama"));

        for (String friend : friends){
            System.out.println(friend);

        }
    }
    
}
