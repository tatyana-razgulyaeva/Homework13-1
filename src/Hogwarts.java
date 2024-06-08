public class Hogwarts {

    private final String name;
    private final int powerOfMagic;
    private final int transgressionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void print() {
        System.out.println(this);
    }

    public void compareTo(Hogwarts other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println(String.format("Студент %s сильнее студента %s", this.getName(), other.getName()));
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println(String.format("Студент %s сильнее студента %s", this.getName(), other.getName()));
        } else {
            System.out.println(String.format("Студенты %s и %s равны по силе%n ", this.getName(), other.getName()));
        }
    }

    private int scoreSum() {
        return powerOfMagic + transgressionDistance;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance;
    }
}
