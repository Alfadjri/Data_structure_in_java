import java.util.Hashtable;
import java.util.Map;
public class HTPutIfAbsent {
    public static void main(String[] args) {
        // membuat object dari Map Yang isinya Menggunakan HashTable;
        Map<String,Integer> table = new Hashtable<String,Integer>();
        table.put("Buku" , 2000);
        table.put("Tahu bulat" , 5000);
        table.put("Lapu - Lapu ", 300);
        table.put("Tahu bulat",2000);

        // print map
        // print bisa juga di lakukan dengan .getString untuk merubah tipe data yang ada
        System.out.println("Map table : " + table);
        // cek jika key salah apa yang akan terjadi 
        String masuk = String.valueOf(table.putIfAbsent("Buku-Buku", 2000));
        // print masuk 
        System.out.println("String buku akan berubah atau tidak : " + masuk);
        // cek benutk table
        System.out.println("Cek bentu Table saat ini : " + table.toString());
        // jika data ada apa yang akan terjadi
        masuk = String.valueOf(table.putIfAbsent("Tahu bulat", 10000));
        // print masuk
        System.out.println("String Tahu bulat akan berubah atau tidak : " + masuk);
        // cek Bentuk table 
        System.out.println("Cek bentu Table saat ini : " + table.toString());

        // putifAbsent(key,value)
        // Kesimpulan jika key yang di masukan salah akan menambah datanya
        // jika key yang di berikan sama maka akan mempertahankan nilai yang ada



    }
}
