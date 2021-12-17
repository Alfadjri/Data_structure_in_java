package Data_structure_in_java.Array_LIst_2;
import java.util.ArrayList;
import java.util.Spliterator;

public class ALSpliter {
    public static void main(String[] args) {
        ArrayList<Node> ls = new ArrayList<Node>();
        ls.add(new Node("Data",1));
        ls.add(new Node("Data",2));
        ls.add(new Node("Data",3));
        ls.add(new Node("Data",4));

        // Spliterator berguna untuk membuka data dalam Array
        Spliterator<Node> sp = ls.spliterator();

        sp.forEachRemaining((n) -> print(n));
    }
    
    public static void print(Node u){
        System.out.print("User Data :  " +u.Data + " " + u.index + "\n" );
    }
}
class Node{
    String Data;
    int index;

    Node(String data , int index){
        this.Data = data ;
        this.index = index;
    }
}
// hasil
// User Data :  Data 1
// User Data :  Data 2
// User Data :  Data 3
// User Data :  Data 4
