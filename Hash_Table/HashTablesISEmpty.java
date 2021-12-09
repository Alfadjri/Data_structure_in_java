import java.util.Hashtable;

class HashTablesIsEmpty{
    public static void main(String[] args) {
        Hashtable<String,Integer> t = new Hashtable<String,Integer>();
        t.put("Makanan" , 2000);
        t.put("Ciki",500);
        t.put("Mainan",5000);

        System.out.println("Cek table apakah kosong atau tidak : " + t.isEmpty());

        // menhapus isi table
        t.clear();
        System.out.println("Cek table setelah di clear apa masih ada isinya : ");
    }
}