package practico_7.practico_7_2;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Comparator_frecuencia implements Comparator<Map.Entry<String, Integer>> {

    @Override
    public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }

}
