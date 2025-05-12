package hashing;
import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);

        //search - done using the function "contains"
        if(set.contains(2)){
            System.out.println("set contains 2");
        }

    }
}
