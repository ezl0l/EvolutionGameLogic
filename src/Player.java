import java.util.ArrayList;

public class Player {
    private String name;
    private int food;
    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Animal createAnimal(){
        Animal newAnimal = new Animal(animals.size());
        animals.add(newAnimal);
        return newAnimal;
    }

    public boolean isMyAnimalCanEatThisAnimal(Player playerWithFood, Animal food, Animal hunter){
        if(hunter.isLive() && hunter.isHunter() && food.isLive()){
            Property[] foodProperties = food.getProperties().toArray(Property[]::new);
            for(int i = 0; i < foodProperties.length; i++){
                if(foodProperties[i].getType() == Property.Types.CANT_EAT){
                    switch(foodProperties[i].getId()){
                        case Mimicry.id:{
                            // AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean isMyAnimalCanEatThisAnimal(Player playerWithFood, Animal food, int hunterID){
        return isMyAnimalCanEatThisAnimal(playerWithFood, food, animals.get(hunterID));
    }

    public Animal getAnimal(int animalID){
        return animals.get(animalID);
    }

    public int getAnimalCount(){
        return animals.size();
    }

    public int getFood() {
        return food;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
