package pkg_book;

public class Book {
private int ISBN;
private String Title;
private String Author;
private String Publisher;
private int edition;
private int subject;
private int available_quantity;

//Getters And Setter Method
public int getISBN() {
    return ISBN;
}
public void setISBN(int iSBN) {
    ISBN = iSBN;
}
public String getTitle() {
    return Title;
}
public void setTitle(String title) {
    Title = title;
}
public String getAuthor() {
    return Author;
}
public void setAuthor(String author) {
    Author = author;
}
public String getPublisher() {
    return Publisher;
}
public void setPublisher(String publisher) {
    Publisher = publisher;
}
public int getEdition() {
    return edition;
}
public void setEdition(int edition) {
    this.edition = edition;
}
public int getSubject() {
    return subject;
}
public void setSubject(int subject) {
    this.subject = subject;
}
public int getAvailable_quantity() {
    return available_quantity;
}
public void setAvailable_quantity(int available_quantity) {
    this.available_quantity = available_quantity;
}
public Book(int iSBN, String title, String author, String publisher, int edition, int subject, int available_quantity) {
    ISBN = iSBN;
    Title = title;
    Author = author;
    Publisher = publisher;
    this.edition = edition;
    this.subject = subject;
    this.available_quantity = available_quantity;
}
public Book() {
}
@Override
public String toString() {
    return "Book [ISBN=" + ISBN + ", Title=" + Title + ", Author=" + Author + ", Publisher=" + Publisher + ", edition="
            + edition + ", subject=" + subject + ", available_quantity=" + available_quantity + "]";
}

}
