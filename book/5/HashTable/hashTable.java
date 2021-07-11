
import java.util.*;
// 雜湊表
public class hashTable {
    public static void main(String args[]) {
        Hashtable<String, Integer> table = new Hashtable<String, Integer>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        table.put(store.a.item, store.a.money);
        table.put(store.b.item, store.b.money);
        table.put(store.c.item, store.c.money);
        table.put(store.d.item, store.d.money);
        table.put(store.e.item, store.e.money);
        
        map.put(store.a.item, store.a.money);
        map.put(store.b.item, store.b.money);
        map.put(store.c.item, store.c.money);
        map.put(store.d.item, store.d.money);
        map.put(store.e.item, store.e.money);

        System.out.println(table.get("apple"));

        System.out.println(map.get("ant"));

        System.out.println(table.size());

        System.out.println(map.size());
    }

    public enum store {
        a("apple", 10),
        b("ant", 15),
        c("banana", 12),
        d("cat", 17),
        e("computer", 11);

        public String item;
        public int money;

        store(String item, int money) {
            this.item = item;
            this.money = money;
        }

    }
}
