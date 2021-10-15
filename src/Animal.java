import java.util.ArrayList;

public class Animal {
    private int id;
    private boolean isDeath = false;

    private ArrayList<Card> properties = new ArrayList<Card>();

    public Animal(int id) {
        this.id = id;
    }

    public Animal() {}

    public int getId() {
        return id;
    }

    public void death(){
        isDeath = true;
    }

    public boolean isLive(){
        return !isDeath;
    }

    public boolean isHunter() {
        Object[] arr = properties.toArray();
        if(arr.length > 0) {
            Card currentCard;
            for (int i = 0; i < arr.length; i++) {
                currentCard = (Card) arr[i];
                if(currentCard.getCurrentProperty().getId() == Hunter.getStaticId()){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addProperty(Card card, boolean isUseAdditionalProperty){
        Object[] arr = properties.toArray();
        if(arr.length > 0) {
            Card currentCard;
            for (int i = 0; i < arr.length; i++) {
                currentCard = (Card) arr[i];
                if (isUseAdditionalProperty) {
                    if(currentCard.getAdditionalProperty().getId() == card.getAdditionalProperty().getId())
                        return false;
                } else {
                    if (currentCard.getMainProperty().getId() == card.getMainProperty().getId()) {
                        return false;
                    }
                }
            }
        }
        card.setUseAdditionalProperty(isUseAdditionalProperty);
        properties.add(card);
        return true;
    }

    public ArrayList<Card> getProperties() {
        return properties;
    }

    public boolean canEatThis(Animal animal){
        Object[] arr = animal.getProperties().toArray();
        if(arr.length > 0) {
            Card currentCard;
            for (int i = 0; i < arr.length; i++) {
                currentCard = (Card) arr[i];
                if (currentCard.getCurrentProperty().getType() == 0) {
                    System.out.println("f");
                    return false;
                }
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
        }else{
            System.out.println("No properties.");
        }
    }
}
