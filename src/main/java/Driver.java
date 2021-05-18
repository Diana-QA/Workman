public class Driver extends Workman implements OfDriving {

    public Driver(String name) {
        super(name);
    }

    @Override
    public void toDrive() {
        System.out.println("Вожу");
    }
}
