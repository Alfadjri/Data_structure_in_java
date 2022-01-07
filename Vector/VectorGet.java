package Data_structure_in_java.Vector;
import java.util.Vector;
public class VectorGet {
    public static void main(String[] args) {
        Vector<Character> v = new Vector<>();
        v.add('a');
        v.add('a');
        v.add('b');
        v.add('c');
        v.add('d');
        System.out.println("Vector : " + v);

        // mendapatkan nilai tertentu
        // get(index);
        System.out.println("The element is : " + v.get(4));
    }
}
