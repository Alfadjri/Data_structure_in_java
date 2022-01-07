package Data_structure_in_java.Vector;
import java.util.Vector;
public class VectorElmAt {
    public static void main(String[] args) {
        Vector<Character> v = new Vector<>();
        v.add('a');
        v.add('b');
        v.add('c');
        v.add('d');
        System.out.println("Vector :" + v);
        
        // mengambil nilai tertentu
        // .elementAt(index )
        System.out.println("Data dari index ke 3 adalah" + v.elementAt(3));
    }
}
