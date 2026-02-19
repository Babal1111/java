     public void addBook throws LibraryException(Book book){
        if(book.availableCopies>0){
            System.out.println("Book borrowed successfully.");
            updateCopies(book,book.availableCopies-1);

        }else{
            throw new BookNotAvailable("Book not available for borrowing");
        }
    }  Error at line 21: '(' expected
public void addBook throws LibraryException(Book book){
Error at line 21: invalid method declaration; return type required

----------------------
You placed throws LibraryException before the parameter list, which is invalid.
public void addBook(Book book) throws LibraryException 


----------------------

Your LibraryException:

class LibraryException extends Exception{
    public LibraryException(String message){
        System.out.println("Error: "+message);
    }
}


🚫 This is incorrect.

You should pass the message to super(message) instead of printing inside constructor.

✅ Correct Version:
class LibraryException extends Exception{
    public LibraryException(String message){
        super(message);
    }
}