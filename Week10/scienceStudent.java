package Week10;


public class scienceStudent extends Student {

    scienceStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() {
        return super.calculateResult();
    }

    public String calculateResult(int graceMarks) {
        int total = getMarks() + graceMarks;
        return total >= 45 ? "Pass" : "Fail";
    }
}