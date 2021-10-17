import java.util.ArrayList;

public class Settings {
    public static final int EXTRA_FOOD_FOR_HUNTER = 2;
    public static final int FOOD_FOR_ANIMAL = 1;
    public static final Property[] PROPERTIES = {
            new Mimicry(),
            new Carnivorous(),
            new Burrowing(),
            new Camouflage(), // я ебу как хранить классы шобы потом колоду создавать
    };
}
