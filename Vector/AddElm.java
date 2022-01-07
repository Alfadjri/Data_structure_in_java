package Data_structure_in_java.Vector;

import java.util.Vector;

class AddElm {
    public static void main(String[] args) {
        // membuat vactor
        Vector v1 = new Vector();
        // mengisi vector
        v1.add('a');
        v1.add(1);
        v1.add("String 1");

        // menampilkan Vector
        System.out.println("Vector 1 : " + v1);
        Vector v2 = new Vector();

        v2.add('b');
        v2.add(1);
        v2.add('c');
        v2.add("String 2");

        System.out.println("Vector 2 : " + v2);

    }
}