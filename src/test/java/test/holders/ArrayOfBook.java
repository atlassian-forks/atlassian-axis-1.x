package test.holders;

public class ArrayOfBook implements java.io.Serializable {
    private Book[] arrayOfBook;

    public ArrayOfBook() {
    }

    public ArrayOfBook(
            Book[] arrayOfBook) {
        this.arrayOfBook = arrayOfBook;
    }

    public Book[] getArrayOfBook() {
        return arrayOfBook;
    }

    public void setArrayOfBook(Book[] arrayOfBook) {
        this.arrayOfBook = arrayOfBook;
    }

//    public Book getArrayOfBook(int i) {
//        return this.arrayOfBook[i];
//    }
//
//    public void setArrayOfBook(int i, Book _value) {
//        this.arrayOfBook[i] = _value;
//    }
}
