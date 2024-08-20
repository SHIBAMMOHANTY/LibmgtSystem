package pkg_person;

abstract public class Person {
      protected String Name;
        protected String Email_id;
        protected String Ph_No;
        protected String Address;
        public String getName() {
            return Name;
        }
        public void setName(String name) {
            Name = name;
        }
        public String getEmail_id() {
            return Email_id;
        }
        public void setEmail_id(String email_id) {
            Email_id = email_id;
        }
        public String getPh_No() {
            return Ph_No;
        }
        public void setPh_No(String ph_No) {
            Ph_No = ph_No;
        }
        public String getAddress() {
            return Address;
        }
        public void setAddress(String address) {
            Address = address;
        }
        public String getDob() {
            return Dob;
        }
        public void setDob(String dob) {
            Dob = dob;
        }
        protected String Dob;
        public Person(String name, String email_id, String ph_No, String address, String dob) {
            Name = name;
            Email_id = email_id;
            Ph_No = ph_No;
            Address = address;
            Dob = dob;
        }
        public Person() {
        }
}
