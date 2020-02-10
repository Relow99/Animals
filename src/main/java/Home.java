import java.util.*;
public class Home {
    ArrayList<Animals> Pets = new ArrayList<>();
    public void adoptPet(Animals Pet){
            if(Pets.contains(Pet)){
                System.out.println("Pet already adopted");;
            }else {
                Pets.add(Pet);
            }
    }
    public void makeAllSounds(){
//        for(int start=0; start<Pets.size();start++){
//            Object currentPet = Pets.get(start);
//        }
        for(Animals pet: Pets){
            pet.sounds();
        }
    }
}
