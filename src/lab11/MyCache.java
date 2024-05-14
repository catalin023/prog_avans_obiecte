package lab11;

import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyCache extends  Thread{
    private Map<Integer, StoredObject> cache = new ConcurrentHashMap<>();

    public MyCache(Map<Integer, StoredObject> cache) {
        this.cache = cache;
    }

    public MyCache(){}

    public void put(Integer key, StoredObject value){
        cache.put(key, value);
    }

    public Object get(Integer key){
        return cache.get(key);
    }

    public void run() {
        while (true) {
            boolean empty = true;
            long currentTime = System.currentTimeMillis();
            for (Map.Entry<Integer, StoredObject> entry : cache.entrySet()) {
                StoredObject storedObject = entry.getValue();
                if (storedObject.getExpirationTime().getTime() < currentTime){
                    storedObject.setExpired(true);
                }
                else {
                    empty = false;
                }
            }
            System.out.println(cache);
            if (empty) {
                break;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public String toString() {
        return "MyCache{" +
                "cache=" + cache +
                '}';
    }
}
