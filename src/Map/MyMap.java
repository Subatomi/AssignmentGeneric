package Map;

import java.util.ArrayList;

public class MyMap <A,B>{
    private ArrayList<A> keys;
    private ArrayList<B> values;

    public void put(A key, B value){
        if(keys.contains(key)){
            int n = keys.indexOf(key);
            values.set(n, value);
        }else{
            keys.addLast(key);
            values.addLast(value);
        }
    }

    public B get(A key){
        if(!keys.contains(key)){
            return null;
        }
        int n = keys.indexOf(key);
        return values.get(n);
    }

    public B remove(A key){
        if(!keys.contains(key)){
            return null;
        }
        int n = keys.indexOf(key);
        keys.remove(n);
        return values.remove(n);
    }
}
