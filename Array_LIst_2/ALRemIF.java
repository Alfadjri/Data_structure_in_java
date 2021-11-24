import java.util.List;
import java.util.ArrayList;
public class ALRemIF {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Data 1");
        ls.add("Data 2");
        ls.add("Data 3");
        ls.add("Data 3");
        ls.add("Data 3");
        ls.add("Data 4");
        ls.add("Data 1");
        ls.add("Data 2");
        ls.add("Data 2");
        System.out.println("Data \t : " + ls);
        // format n -> kondisi
        ls.removeIf(n -> (n == "Data 3"));

        System.out.println("Edti \t : " + ls);

        //hasil
        // Data 	 : [Data 1, Data 2, Data 3, Data 3, Data 3, Data 4, Data 1, Data 2, Data 2]
        // Edti 	 : [Data 1, Data 2, Data 4, Data 1, Data 2, Data 2]

    }
}
