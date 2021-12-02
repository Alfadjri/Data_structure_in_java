import java.util.HashSet;

public class HSTest {
    public static void main(String[] args) {
        // Memanggil HashSet;
        HashSet hs = new HashSet<>();
        // menambahkan data
        boolean b1 = hs.add("Aku");
        boolean b2 = hs.add("Dia");
        boolean b3 = hs.add("Aku");


        
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        System.out.println(hs);

        // data yang akan di masukkan di cek terlebih dahulu 
        // jika data sudah ada dalam list maka tidak akan di masukkan 
        

    }
}
