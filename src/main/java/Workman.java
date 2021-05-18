public abstract class Workman {

    private String name;

    public Workman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println(name);
    }
}

