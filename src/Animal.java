import java.util.ArrayList;

public class Animal {
    private boolean isHunter = false;
    private boolean isDeath = false;

    private ArrayList<Card> properties = new ArrayList<Card>();

    public Animal() {}

    public void death(){
        isDeath = true;
    }

    public boolean isLive(){
        return !isDeath;
    }

    public boolean isHunter() {
        return isHunter;
    }

    public boolean addProperty(Card card){
        Object[] arr = properties.toArray();
        if(card.getId() == 1){
            isHunter = true;
        }

        if(arr.length == 0){
            properties.add(card);
            return true;
        }
        Card currentCard;
        for (int i = 0; i < arr.length; i++){
            currentCard = (Card) arr[i];
            if(currentCard.getId() == card.getId()){
                return false;
            }
        }
        properties.add(card);
        return true;
    }

    public ArrayList<Card> getProperties() {
        return properties;
    }

    public boolean canEatThis(Animal animal){
        Object[] arr = animal.getProperties().toArray();
        animal.showProperties();
        if(arr.length == 0){
            return true;
        }

        AdditionalProperty currentCard;
        for (int i = 0; i < arr.length; i++){
            currentCard = (AdditionalProperty) arr[i];
            System.out.println(currentCard.getId() + " " + currentCard.getType());
            if(currentCard.getType() == 0){
                System.out.println("f");
                return false;
            }
        }
        return true;
    }

    public boolean eatAnimal(Animal animal){
        return eatAnimal(this, animal);
    }

    public static boolean eatAnimal(Animal hunter, Animal animal){
        if(animal.isLive() && hunter.isLive() && hunter.isHunter() && hunter.canEatThis(animal)){
            animal.death();
            return true;
        }
        return false;
    }

    public void showProperties(){
        Object[] arr = properties.toArray();
        if(arr.length > 0) {
            System.out.println("Animal properties:");
            Card currentCard;
            for (int i = 0; i < arr.length; i++) {
                currentCard = (Card) arr[i];
                currentCard.info();
            }
        }
    }
}
