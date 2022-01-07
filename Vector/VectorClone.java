package Data_structure_in_java.Vector;
import java.util.Vector;

class VectorClone {
    public static void main(String[] args) {
        Vector<Character> v = new Vector<>();
        v.add('a');
        v.add('b');
        v.add('c');
        v.add('d');
        System.out.println("Vector real : " + v);

        Vector<Character> v2 = (Vector) v.clone();
        System.out.println("Vector Clone : " + v2);
        // perbadingan
        System.out.println("Apakah vektornya sama  ? : " + v.equals(v2));

    }
}