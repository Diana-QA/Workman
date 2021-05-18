public class Cook extends Workman implements ToCook {

    public Cook(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("Готовлю");
    }
}
