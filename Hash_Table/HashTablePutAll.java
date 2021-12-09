import java.util.Hashtable;

public class HashTablePutAll {
    public static void main(String[] args) {
        Hashtable<Integer,String>  table1 = new Hashtable<Integer,String>();
        Hashtable<Integer,String>  table2 = new Hashtable<Integer,String>();
        table1.put(1 ,"String");
        table1.put(2 ,"Data");
        table1.put(10,"System");
        table1.put(5 ,"Kucing");
        table1.put(11,"Kambing");
        table1.put(3,"Data");
        table1.put(2,"Musang");
        // cara clone dari table 1
        table2.putAll(table1);

        System.out.println("Hash Table 2 : " + table2);


    }
}
