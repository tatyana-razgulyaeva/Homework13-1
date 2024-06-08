public class Gryffindor extends Hogwarts {

    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int nobility, int honor, int bravery, int powerOfMagic,
                      int transgressionDistance) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void innerCompareTo(Gryffindor other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println("Cильнее студент " + other.getName());
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println("Сильнее студент " + this.getName());
        } else {
            System.out.println(String.format("Студенты %s и %s равны по силе%n ", this.getName(), other.getName()));
        }
    }

    private int scoreSum() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return super.toString() + ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
}
