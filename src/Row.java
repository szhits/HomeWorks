import java.util.Arrays;

public class Row {
    private String studentName;
    private Grade[] grades;

    public String getStudentName() {
        return studentName;
    }

    public Row(String studentName, int numberOfLessons) {
        this.studentName = studentName;
        grades = new Grade[numberOfLessons];
    }

    public void giveGrade(int lessonNumber, Grade grade) {
        grades[lessonNumber - 1] = grade;
    }

    public String printable() {
        String s = "[ ";
        for (int i = 0; i < grades.length; i ++) {
            if (grades[i] == null) {
                s += " |";
            } else {
                s = s + grades[i].printable() + "|";
            }
        }
        s += " ]";
        return "| " + studentName + s;
    }

    public Integer getFinalGrade() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            Grade grade = grades[i];
            if (grade != null && grade.getValue() != null) {
                sum += grade.getValue();
                count++;
            }
        }
        if (count > 0) {
            return (int)Math.round(sum * 1.0 / count);
        } else {
            return null;
        }
    }
}
