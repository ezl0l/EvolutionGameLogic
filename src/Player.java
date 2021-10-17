import java.util.ArrayList;
import java.util.Collection;

public class Player {
    private String name;
    private int food;
    private ArrayList<Card> cards = new ArrayList<Card>();
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

    public ArrayList<Card> getCards() {
        return cards;
    }

    public boolean addCards(Collection<Card> cards){
        return this.cards.addAll(cards);
    }

    public boolean isMyAnimalCanEatThisAnimal(Player playerWithFood, Animal food, Animal hunter){
        if(hunter.isLive() && hunter.isHunter() && food.isLive()){
            Object[] foodProperties = food.getProperties().toArray();
            Property foodProperty;
            for(int i = 0; i < foodProperties.length; i++){
                foodProperty = ((Card) foodProperties[i]).getCurrentProperty();
                if(foodProperty.getType() == Property.Types.CANT_EAT){
                    switch(foodProperty.getId()){
                        case Mimicry.id:{
                            if(playerWithFood.getAnimalCount() > 1) //need user decide
                                return false;
                        }
                        case Camouflage.id:{
                            if(!hunter.isHaveProperty(SharpVision.id))
                                return false;
                        }
                        case Burrowing.id:{
                            if(food.isFed())
                                return false;
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

    public static boolean isThisAnimalCanEatThisAnimal(Player playerWithFood, Animal food, Player playerWithHunter, Animal hunter){
        return playerWithHunter.isMyAnimalCanEatThisAnimal(playerWithFood, food, hunter);
    }

    public boolean myAnimalEatAnimal(Player playerWithFood, Animal food, Animal hunter){
        if(isMyAnimalCanEatThisAnimal(playerWithFood, food, hunter)){
            food.death();
            hunter.addToFood(Settings.EXTRA_FOOD_FOR_HUNTER);
            return true;
        }
        return false;
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
