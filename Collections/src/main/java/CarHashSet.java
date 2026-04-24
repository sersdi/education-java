import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CarHashSet<T> implements CarSet<T> {

    private Map<T, Object> map = new HashMap<>();
    private Object object = new Object();

    @Override
    public boolean add(T object) {
        if (map.containsKey(object)){
            return false;
        }
        map.put(object, this.object);
        return true;
    }

    @Override
    public boolean remove(T object) {
       Object removed = map.remove(object);
       return removed != null;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void clear() {
        map.clear();

    }

    @Override
    public boolean contains(T object) {
        return map.containsKey(object);
    }

    @Override
    public Iterator<T> iterator() {
       return map.keySet().iterator();
    }


}
