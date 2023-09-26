package exam05;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> items =new ArrayList<>();
/*
    public void add(T item){
        item.add(item);
    }
  */
    public List<T> getItems(){
        return items;
    }
}
