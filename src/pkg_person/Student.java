package pkg_person;

public class Student extends Person {
    private int roll_no;
    private String Branch;
    private String Sem;
    //getter and setter method
    public int getRoll_no() {
        return roll_no;
    }
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    public String getBranch() {
        return Branch;
    }
    public void setBranch(String branch) {
        Branch = branch;
    }
    public String getSem() {
        return Sem;
    }
    public void setSem(String sem) {
        Sem = sem;
    }
    //constructor
    public Student(String name, String email_id, String ph_No, String address, String dob, int roll_no, String branch,
            String sem) {
        super(name, email_id, ph_No, address, dob);
        this.roll_no = roll_no;
        Branch = branch;
        Sem = sem;
    }
    public Student(int roll_no, String branch, String sem) {
        this.roll_no = roll_no;
        Branch = branch;
        Sem = sem;
    }
    public Student(String name, String email_id, String ph_No, String address, String dob) {
        super(name, email_id, ph_No, address, dob);
    }
    public Student() {
    }
    @Override
    public String toString() {
        return "Student [roll_no=" + roll_no + ", Name=" + Name + ", Branch=" + Branch + ", Email_id=" + Email_id
                + ", Sem=" + Sem + ", Ph_No=" + Ph_No + ", Address=" + Address + ", Dob=" + Dob + "]";
    }

    

}
