public class Student {

    private String enrollment;
    private String studentName;
    private double test1, test2;
    private double classWork;
    private double subtotal;

    public Student(String studentName, String enrollment) {
        this.studentName = studentName;
        this.enrollment = enrollment;
    }

    public void setTest1(double test1) {
        this.test1 = test1;
    }
    public double getTest1() {
        return test1;
    }

    public void setTest2(double test2) {
        this.test2 = test2;
    }

    public double getTest2() {
        return test2;
    }

    public void setClassWork(double classWork) {
        this.classWork = classWork;
    }
    public double getClassWork() {
        return classWork;
    }

    public double media() {
        return (test1 * 2.5 + test2 * 2.5 + classWork * 2) / (2 * 2.5 + 2);
    }

    public double finalTest() {
        double finalGrade = media();

        if (finalGrade < 7 ) {
           return 11 - media();
        } else {
            return 0;
        }
    }
}
