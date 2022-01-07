package Data_structure_in_java.Vector;
import java.util.Vector;
public class VectorCap {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Data 12345");
        v.add("Data 123456789");
        v.add("Data 12");
        // tampilakan data
        System.out.println("Vector : " + v);

        // mendapatkan nilai terpanjang dalam Vecktop
        // capacity();
        System.out.println("Data terpanjang data yang di tampung dalam Vector : " + v.capacity());

    }
}
