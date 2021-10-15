public class Hunter extends Property {
    private static final int food = 1;
    private static final int id = 1;
    private static final int type = -1;
    private static final String name = "Hunter";
    private static final String description = "You can eat other animals.";

    public Hunter(){
        super(id, name, description, type, food);
    }

    public static int getFood() {
        return food;
    }

    public static int getStaticId() {
        return id;
    }
}
