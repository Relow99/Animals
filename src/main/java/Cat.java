public class Cat extends Animals {
    String name;
    Cat(String name){
        this.name=name;
    }
    @Override
    public void sounds() {
        System.out.println("The cat says meow");

    }

    @Override
    public void eats() {
        System.out.println(name+" eats");
    }
}
