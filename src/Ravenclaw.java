public class Ravenclaw extends Hogwarts {

    private final int cleverness;
    private final int wisdom;
    private final int wit;
    private final int creatively;

    public Ravenclaw(String name, int cleverness, int wisdom, int wit, int creatively, int powerOfMagic,
                     int transgressionDistance) {
        super(name, powerOfMagic, transgressionDistance);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creatively = creatively;
    }

    public int getCleverness() {
        return cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreatively() {
        return creatively;
    }

    public void innerCompareTo(Ravenclaw other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println("Cильнее студент " + other.getName());
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println("Сильнее студент " + this.getName());
        } else {
            System.out.println(String.format("Студенты %s и %s равны по силе%n ", this.getName(), other.getName()));
        }
    }

    private int scoreSum() {
        return cleverness + wisdom + wit + creatively;
    }

    @Override
    public String toString() {
        return super.toString() + ", cleverness=" + cleverness +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creatively=" + creatively;
    }
}
