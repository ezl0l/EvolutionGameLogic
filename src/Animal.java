import java.util.ArrayList;

public class Animal {
    private int id;
    private int food;
    private boolean isDeath = false;

    private ArrayList<Card> properties = new ArrayList<Card>();

    public Animal(int id) {
        this.id = id;
    }

    public Animal() {}

    public int getId() {
        return id;
    }

    public void death() {
        if(isLive())
            isDeath = true;
    }

    @Deprecated
    public void revive(){
        isDeath = false;
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
                if(currentCard.getCurrentProperty().getId() == Carnivorous.id){
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

    public int getNeededFood(){
        int neededFood = Settings.FOOD_FOR_ANIMAL;
        Object[] arr = properties.toArray();
        if(arr.length > 0) {
            Property currentProperty;
            for (int i = 0; i < arr.length; i++) {
                currentProperty = ((Card) arr[i]).getCurrentProperty();
                neededFood += currentProperty.getFood();
            }
        }
        return neededFood;
    }

    public int getFood() {
        return food;
    }

    public void clearFood(){
        food = 0;
    }

    public void addToFood(int food){
        if(food > 0)
            this.food += food;
    }

    public boolean isHaveProperty(int propertyID){
        Object[] arr = properties.toArray();
        if(arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if((((Card) arr[i]).getCurrentProperty()).getId() == propertyID)
                    return true;
            }
        }
        return false;
    }

    public boolean isFed(){
        return getFood() == getNeededFood();
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
