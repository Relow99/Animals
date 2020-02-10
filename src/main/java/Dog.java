public class Dog extends Animals {
        String name;
        Dog(String name){
            this.name=name;
        }
        public void sounds() {
            System.out.println("The dog barks");
        }
        public void eats() {
            System.out.println(name+" eats");
        }
}
