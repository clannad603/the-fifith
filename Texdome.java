//import java.util.Iterator;
import java.util.Scanner;

public class Texdome {
    public static void main(String[] args) {
        MyList<Person> list=new MyList<>();
        Scanner x=new Scanner(System.in);
        System.out.println("for the first person");
        Person zhangs=new Person(x.nextInt(), x.nextInt(), x.nextLine());
        System.out.println("for the second person");
        Person lisi=new Person(x.nextInt(), x.nextInt(), x.nextLine());
        System.out.println("for the 3 person");
        Person ww=new Person(x.nextInt(), x.nextInt(), x.nextLine());
        System.out.println("for the 4 person");
        Person zw=new Person(x.nextInt(), x.nextInt(), x.nextLine());
        list.add(zhangs);
        list.add(ww);
        list.add(zw);

      list.add(lisi);
        list.search(lisi);
       list.remove(lisi);
        list.search(lisi);
        list.replace(zhangs,lisi);
        list.search(lisi);
        System.out.println(list.get(1).getAge());
        for (Person y:list
             ) {
            y.tel();
        }

    }

}

