import java.util.List;
import java.util.ArrayList;

public class ALRemDuplicatie {
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

        ArrayList<String> ls2 = RemDuplicate(ls);

        System.out.println("Edit \t : " + ls2);

    }

    public static <String>ArrayList<String>  RemDuplicate(List<String> ls){
        ArrayList<String> dup = new ArrayList<String>();
        for(String t : ls ){
                if(!dup.contains(t)){
                    dup.add(t);
                }
        }
        return dup;
    }

    // hasil
    // Data     : [Data 1, Data 2, Data 3, Data 3, Data 3, Data 4, Data 1, Data 2, Data 2]
    // Edit     : [Data 1, Data 2, Data 3, Data 4]

    // alur 
    // step1
    // [Data 1, Data 2, Data 3, Data 3, Data 3, Data 4, Data 1, Data 2, Data 2]
    // [Data 1]
    //  index 1 banding index 2
    // [Data 1, Data 2, Data 3, Data 3, Data 3, Data 4, Data 1, Data 2, Data 2]
    // [Data 1, Data 2, ]
    // index 1 dan 2 di badingkan dengan index 3
    // [Data 1, Data 2, Data 3, Data 3, Data 3, Data 4, Data 1, Data 2, Data 2]
    // [Data 1, Data 2, Data 3]
    // index 3 dengan index 4
    // [Data 1, Data 2, Data 3, Data 3, Data 3, Data 4, Data 1, Data 2, Data 2]
    // [Data 1, Data 2, Data 3]

    // terus di bandigkan satu" sampai data tidak ditemuka di duplikatnya
}