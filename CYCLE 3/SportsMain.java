class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

class Sports {
    private int sportsScore;

    public Sports(int sportsScore) {
        this.sportsScore = sportsScore;
    }

    public int getSportsScore() {
        return sportsScore;
    }
}

class Result extends Student {
    private Sports sports;
    private int academicScore;

    public Result(int studentId, String studentName, int academicScore, int sportsScore) {
        super(studentId, studentName);
        this.academicScore = academicScore;
        this.sports = new Sports(sportsScore);
    }

    public int getAcademicScore() {
        return academicScore;
    }

    public int getSportsScore() {
        return sports.getSportsScore();
    }

    public void displayScores() {
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + getSportsScore());
        System.out.println("-------------------------");
    }
}

public class SportsMain {

    public static void main(String[] args) {
    System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:09/06/2023\n\n");
        Result result = new Result(101, "John Doe", 85, 75);
        result.displayScores();
    }
}

