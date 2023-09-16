public class Main {
    public static void main(String[] args) {
        SubjectRegister biology7a = new SubjectRegister(
                new String[] {
                        "Иванов",
                        "Петров",
                        "Сидоров"
                },
                20
        );

        biology7a.unlock();

        //Иванову поставить 5
        biology7a.giveGrade("Иванов", 1, new Grade(5));
        biology7a.giveGrade("Сидоров", 5, new Grade(2));
        biology7a.giveGrade("Петров", 10, new Grade(17));
        biology7a.giveGrade("Иванов", 3, new Grade(4));
        biology7a.giveGrade("Сидоров", 7, new Grade(18));
        biology7a.giveGrade("Петров", 11, new Grade(-4));

        biology7a.print();

        System.out.println(biology7a.getFinalGrade("Иванов"));
        System.out.println(biology7a.getFinalGrade("Петров"));
        System.out.println(biology7a.getFinalGrade("Сидоров"));
    }
}