
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ALRemDuplicatie2 {
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

        List<String> la = ls.stream().distinct().collect(Collectors.toList());
        System.out.println("Edit \t : " + la);

        // hasil
        // Data     : [Data 1, Data 2, Data 3, Data 3, Data 3, Data 4, Data 1, Data 2, Data 2]
        // Edit     : [Data 1, Data 2, Data 3, Data 4]
    }
}
