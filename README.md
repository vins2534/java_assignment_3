# Java_Assignment_3

Book class:

private int bkid: Private field representing the book ID.
private String bkName: Private field representing the book name.
private double bkPrice: Private field representing the book price.

public Book(int bkID, String bkName, double bkPrice): Constructor that initializes the book object with the provided book ID, name, and price.
public int getBkid(): Getter method for retrieving the book ID.
public void setBkid(int bkID): Setter method for setting the book ID.
public String getBkName(): Getter method for retrieving the book name.
public void setBkName(String bkName): Setter method for setting the book name.
public double getBkPrice(): Getter method for retrieving the book price.
public void setBkPrice(double bkPrice): Setter method for setting the book price.
@Override public String toString(): Overrides the `toString` method to provide a string representation of the book, including its ID, name, and price.

BookFunctions class:

ArrayList<Book> bookshelf: An ArrayList to store `Book` objects.
Scanner sc: Scanner object for user input.

public void addBook(): Adds books to the `bookshelf` ArrayList by taking user input for the number of books and their details (ID, name, price).
public void printBooksDetails(): Prints the details of all books in the `bookshelf` ArrayList.
private void printBook(int i): Helper method to print the details of a specific book at index `i`.
public void printBookToString(): Prints the details of all books in the `bookshelf` ArrayList using the `toString` method of the ArrayList.
public void deleteBook(): Deletes a book from the `bookshelf` ArrayList based on user input for the book ID. It also provides a message if the book is not available.
`MainBook class:

public static void main(String[] args): The main method of the program. It creates an instance of `BookFunctions`, adds books to the bookshelf using the `addBook` method, and then prints the details of all books using the `printBookToString` method. The commented-out lines show that there are additional functionalities (e.g., printing book details and deleting a book) that can be uncommented and executed.

Student class:

private int prn: Private field representing the PRN (Permanent Registration Number) of the student.
private String name: Private field representing the name of the student.
private String dob: Private field representing the date of birth of the student.
private double marks: Private field representing the marks obtained by the student.
public Student(int prn, String name, String dob, double marks): Constructor that initializes the `Student` object with the provided PRN, name, date of birth, and marks.
public int getPrn(): Getter method for retrieving the PRN.
public void setPrn(int prn): Setter method for setting the PRN.
public String getName(): Getter method for retrieving the name.
public void setName(String name): Setter method for setting the name.
public String getDob(): Getter method for retrieving the date of birth.
public void setDob(String dob): Setter method for setting the date of birth.
public double getMarks(): Getter method for retrieving the marks.
public void setMarks(double marks): Setter method for setting the marks.
@Override public String toString(): Overrides the `toString` method to provide a string representation of the student, including their PRN, name, date of birth, and marks.

StudentFunctions class:

ArrayList<Student> student: An ArrayList to store `Student` objects.
Scanner sc: Scanner object for user input.
public void addStudent(): Adds students to the `student` ArrayList by taking user input for the number of students and their details (PRN, name, date of birth, marks).
public void printStudentToString(): Prints the details of all students in the `student` ArrayList using the `toString` method of the ArrayList.
public void printStudentsDetails(): Prints the details of all students in the `student` ArrayList, including PRN, name, date of birth, and marks.
private void printStudent(int i): Helper method to print the details of a specific student at index `i`.
public void deleteStudent(): Deletes a student from the `student` ArrayList based on user input for the PRN. It also provides a message if the student is not available.
public void updateStudentPrn(): Updates the information (name, date of birth, marks) of a student based on user input for the PRN. It also provides a message if the student is not available.
