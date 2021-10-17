public class Carnivorous extends Property {
    public static final int food = 1;
    public static final int id = 1;
    public static final int type = -1;
    public static boolean isOnlyAdditionalProperty = true;
    public static final String name = "Carnivorous";
    public static final String description = "You can eat other animals.";

    public Carnivorous(){
        super(id, name, description, type, food);
    }
}
