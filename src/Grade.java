public class Grade {
    private Integer value;

    public Grade(int grade) {
        if (grade < 1 || grade > 5) {
            System.out.println("Grade must be between 1 and 5");
            this.value = null;
        } else {
            this.value = grade;
        }
    }

    public String printable() {
        if (value == null) {
            return " ";
        } else {
            return value.toString();
        }
    }

    public Integer getValue() {
        return value;
    }
}
