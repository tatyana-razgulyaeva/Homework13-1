public class Hufflepuff extends Hogwarts {

    private final int hardWork;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int hardWork, int loyalty, int honesty, int powerOfMagic,
                      int transgressionDistance) {
        super(name, powerOfMagic, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void innerCompareTo(Hufflepuff other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println("Cильнее студент " + other.getName());
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println("Сильнее студент " + this.getName());
        } else {
            System.out.println(String.format("Студенты %s и %s равны по силе%n ", this.getName(), other.getName()));
        }
    }

    private int scoreSum() {
        return hardWork + loyalty + honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }
}
