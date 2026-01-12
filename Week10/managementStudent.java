package Week10;


/**
 * Write a description of class Management here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class managementStudent extends Student {

    managementStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() {
        return super.calculateResult();
    }

    public String calculateResult(int graceMarks) {
        int total = getMarks() + graceMarks;
        return total >= 50 ? "Pass" : "Fail";
    }
}