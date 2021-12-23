
import java.util.ArrayList;

public class ALRemReng extends ArrayList<Integer> {
    public static void main(String[] args) {
        ALRemReng ls = new ALRemReng();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        System.out.println("Data \t : " + ls);
        try {
            // menghapus dari index ke 1 berhenti di index ke 3
            // removeRange(dimulai,berakhir);
            ls.removeRange(1,3);
        } catch (Exception e) {
            System.out.println("Gagal Menghapus : " + e);
        }
        System.out.println("Edit \t : " + ls);

        // untuk menggunakan remove Range ArrayListnya harus dalama bentuk integer 
        // dan untu methode ini harus menggunakan extends
        // hasil
        // Data     : [1, 2, 3, 4]
        // Edit     : [1, 4]
        
    }
}
