package lab11;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StoredObject o1 = new StoredObject("o1");
        StoredObject o2 = new StoredObject("o2");
        StoredObject o3 = new StoredObject("o3");
        StoredObject o4 = new StoredObject("o4");
        StoredObject o5 = new StoredObject("o5");

        MyCache cache = new MyCache();
        cache.put(1, o1);
        cache.put(2, o2);
        cache.put(3, o3);
        cache.put(4, o4);
        cache.put(5, o5);

        cache.start();

        for (int i = 6; i < 106; i++) {
            StoredObject o = new StoredObject("o" + i);
            cache.put(i, o);
            sleep(100);
        }
    }
}
