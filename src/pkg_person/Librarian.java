package pkg_person;

public class Librarian extends Person {
  private int Librarian_id;
    private String DOJ;
    //getter and setter method
    public int getLibrarian_id() {
        return Librarian_id;
    }
    public void setLibrarian_id(int librarian_id) {
        Librarian_id = librarian_id;
    }
    public String getDOJ() {
        return DOJ;
    }
    public void setDOJ(String dOJ) {
        DOJ = dOJ;
    }
    //toString method
    @Override
    public String toString() {
        return "Librarian [Librarian_id=" + Librarian_id + ", Name=" + Name + ", Email_id=" + Email_id + ", DOJ=" + DOJ
                + ", Ph_No=" + Ph_No + ", Address=" + Address + ", Dob=" + Dob + "]";
    }
    //constructor
    public Librarian(String name, String email_id, String ph_No, String address, String dob, int librarian_id,
            String dOJ) {
        super(name, email_id, ph_No, address, dob);
        Librarian_id = librarian_id;
        DOJ = dOJ;
    }
    public Librarian(int librarian_id, String dOJ) {
        Librarian_id = librarian_id;
        DOJ = dOJ;
    }
    public Librarian(String name, String email_id, String ph_No, String address, String dob) {
        super(name, email_id, ph_No, address, dob);
    }
    public Librarian() {
    }
 
}