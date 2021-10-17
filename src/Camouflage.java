public class Camouflage extends Property {
    public static final int food = 0;
    public static final int id = 2;
    public static final String name = "Camouflage";
    public static boolean isOnlyAdditionalProperty = false;
    public static final int type = 0; // Ограничивающие съедение
    public static final String description = "An animal can only be attacked by a Carnivorous animal with the property of SHARP VISION.";
    public Camouflage() {
        super(id, name, description, type, food);
    }
}
