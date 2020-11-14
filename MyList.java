
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList <T>implements Iterable<T>{
    Object[] date=new Object[0];
    private int size=0;
    @SuppressWarnings("unchecked")
    private T date(int index){
        return (T) date[index];
    }
    public void add (T t){
        if(size==date.length){
            date= Arrays.copyOf(date,date.length+1);
        date[size]=t;
        size++;}
    }
public void search (Object o){
    for (int i = 0; i <size; i++) {
        if(o.equals(date[i])){
            System.out.println("第"+i+"元素is"+"true");
            break;
        }else{
            System.out.println("第"+i+"元素is"+"false");
        }
    }
    System.out.println("process was ended");
}
public void remove (Object o){
    for (int i = 0; i <size; i++) {
        if(o.equals(date[i])){
            for(int j = 0;j<size-1;j++) {
                if(j<i) {
                    date[j] = date[j];
                } else{
                    date[j] = date[j+1];
                }
            }
        }
    }size--;
}
public void replace(Object o,Object p){
    for (int i = 0; i <size; i++) {
        if (o.equals(date[i])) {
            date[i] = p;
        }
    }
}
public T get(int index){
        if(index<=size&&index>=0){
            return date(index);
        }else{
            return null;
        }

}
     class Itr implements Iterator<T> {
         private int i= 0;

         @Override
         public boolean hasNext() {

             return i<size;
         }
         @Override
         public T next() {
    if(!hasNext())
        throw new NoSuchElementException();
    return  date(i++);

}
         }

     public Iterator <T> iterator(){

        return new Itr();
     }


}
