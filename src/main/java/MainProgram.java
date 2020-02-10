public class MainProgram {
    public static void main(String[]args) {
        Dog dog = new Dog("rex");
          dog.sounds();
          dog.eats();

        Cat cat1 = new Cat("Stormy");
          cat1.sounds();
          cat1.eats();
          Home home = new Home();
          home.adoptPet(dog);
          home.adoptPet(cat1);
          home.makeAllSounds();
    }
}
