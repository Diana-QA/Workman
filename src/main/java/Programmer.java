public class Programmer extends Workman implements ToProgram {

    public Programmer(String name) {
        super(name);
    }

    @Override
    public void writeCode() {
        System.out.println("Пишу код");
    }
}
