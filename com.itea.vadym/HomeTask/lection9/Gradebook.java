package HomeTask.lection9;//Task 4

import java.util.ArrayList;
import java.util.Date;

public class Gradebook {
    ArrayList<SessionInformation> exams = new ArrayList<>();
    void addExamInformation (int grade, String examName, Date date) {
        SessionInformation newExam = new SessionInformation(grade, examName, date);
        exams.add(newExam);
    }
    static class SessionInformation {
        int grade;
        String examName;
        Date date;
        public SessionInformation (int grade, String examName, Date date) {
            this.grade = grade;
            this.examName = examName;
            this.date = date;
        }
    }
}