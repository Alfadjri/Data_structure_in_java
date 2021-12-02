import java.util.HashSet;
import java.util.ArrayList;
public class HSCollObjStr {
    public static void main(String[] args) {
        HashSet<ArrayList> Hr = new HashSet<>();


        ArrayList<String> ar = new ArrayList<>();
        ar.add("Data 2");
        ar.add("data 10");
        ar.add("Data A");

        System.out.println("Isi HashSet : " + Hr);
        Hr.add(ar);
        System.out.println("ArrayList : " + ar);
        System.out.println("Isi HashSet : " + Hr);

    }
}
