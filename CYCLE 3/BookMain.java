import java.util.Scanner; 
class Publisher{ 
int publisher_id; 
String publisher_name; 
Publisher(int publisher_id, String publisher_name){ 
this.publisher_id= publisher_id; 
this.publisher_name= publisher_name; 
} 
} 
class Book extends Publisher{ 
int book_id; 
String book_name; 
Book(int publisher_id, String publisher_name, int book_id, String book_name) { super(publisher_id, publisher_name); 
this.book_id= book_id; 
this.book_name= book_name; 
} 
} 
class Literature extends Book{ 
int literature_id; 
String literature_theme; 
Literature(int publisher_id, String publisher_name, int book_id, String book_name, int literature_id, String literature_theme) { 
super(publisher_id, publisher_name, book_id, book_name); 
this.literature_id= literature_id; 
this.literature_theme= literature_theme; 
} 
void displayDetails() { 
System.out.println("The publisher ID of the book is: " + this.publisher_id); System.out.println("The publisher name of the book is: " + this.publisher_name); System.out.println("The Book ID of the book is: " + this.book_id); System.out.println("The Book name of the book is: " + this.book_name); System.out.println("The Literature ID of the book is: " + this.literature_id); System.out.println("The Literature theme of the book is: " + this.literature_theme); } 
} 
class Fiction extends Book{ 
int fiction_id;
String fiction_theme; 
Fiction(int publisher_id, String publisher_name, int book_id, String book_name, int fiction_id, String fiction_theme) { 
super(publisher_id, publisher_name, book_id, book_name); 
this.fiction_id= fiction_id; 
this.fiction_theme= fiction_theme; 
} 
void displayDetails() { 
System.out.println("The publisher ID of the book is: " + this.publisher_id); System.out.println("The publisher name of the book is: " + this.publisher_name); System.out.println("The Book ID of the book is: " + this.book_id); System.out.println("The Book name of the book is: " + this.book_name); System.out.println("The Fiction ID of the book is: " + this.fiction_id); System.out.println("The Fiction theme of the book is: " + this.fiction_theme); 
} 
} 
public class BookMain { 
public static void main(String[] args) { 
System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:07/06/2023\n\n");
Literature literature= new Literature(10,"Jk Rowling",200,"Harry Potter",2001,"Drama"); 
Fiction fiction= new Fiction(101, "War and Peace", 301, "Leo Tolstoy", 301, "Fantasy-Fiction"); 
literature.displayDetails(); 
System.out.println("\n"); 
fiction.displayDetails(); 
} 
}

