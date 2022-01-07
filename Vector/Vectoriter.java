package Data_structure_in_java.Vector;
import java.util.Vector;
public class Vectoriter {
    public static void main(String[] args) {
        Vector<Character> v = new Vector<>();
        v.add('a');
        v.add('b');
        v.add('c');
        v.add('d');
        
        for(int i = 0 ; i < v.size() ; i++){
            System.out.println(v.get(i) + " ");
        }
        System.out.println();
        for(Character t : v){
            System.out.println(t + " ");
        }
        System.out.println();
    }
}
