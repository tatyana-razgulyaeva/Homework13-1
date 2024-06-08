public class Main {
    public static void main(String[] args) {

        Gryffindor garry = new Gryffindor("Гарри Поттер", 30, 35, 32, 26, 24);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 41, 39, 38, 45, 48);
        Gryffindor ron = new Gryffindor("Рон Уизли", 26, 26, 29, 25, 21);

        Hufflepuff zaharia = new Hufflepuff("Захария Смит", 25, 34, 21, 26, 23);
        Hufflepuff sedric = new Hufflepuff("Седрик Диггори", 36, 35, 38, 39, 38);
        Hufflepuff jastin = new Hufflepuff("Джастин Финч-Флетчли", 26, 21, 26, 27, 22);

        Ravenclaw chjou = new Ravenclaw("Чжоу Чанг", 23, 35, 20, 27, 26, 35);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 20, 31, 25, 26, 23, 32);
        Ravenclaw markus = new Ravenclaw("Маркус Белби", 31, 26, 24, 23, 25, 26);

        Slytherin draco = new Slytherin("Драко Малфой", 25, 31, 26, 27, 28, 27, 29);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 21, 26, 23, 31, 28, 23, 30);
        Slytherin gragory = new Slytherin("Грегори Гойл", 27, 24, 21, 29, 21, 20, 25);

        Hogwarts[] students = {garry, germiona, ron, zaharia, sedric, jastin, chjou, padma, markus, draco, graham, gragory};
        for (Hogwarts student : students) {
            student.print();
        }

        for (int i = 0; i < students.length; i++) {
            Hogwarts first = students[i];
            for (int j = i; j < students.length; j++) {
                Hogwarts second = students[j];
                first.compareTo(second);
            }
        }
    }
}
