import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();

        hs.add("Tetsting ");
        hs.add("Try");
        hs.add("Hello World");
        hs.add("223122333");


        Iterator it = hs.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " | ");
        }
    }
}
