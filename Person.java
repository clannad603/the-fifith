public class Person {
    private  String name;
    private int money;
    private  int age;
    public  Person(int age,int money,String name) {
        this.setAge(age);
        this.setMoney(money);
        this.setName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void tel(){
        System.out.println(this.getName()+"  have  "+this.getMoney()+" yuan "+"now is "+this.getAge());
    }
}
