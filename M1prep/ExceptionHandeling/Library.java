package ExceptionHandeling;


public class Library{
    public static void main(String args[]){
        Book b1 = new Book(101," Effective Java","Joshua Bloch",1);
        LibraryService l1 = new LibraryService();
        // l1.borrowBook(b1);
        
        try{l1.addBook(b1);}
        catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
        try{
        l1.borrowBook(b1);

        }
        catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }

        try{
        l1.borrowBook(b1);

        }
        catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }

        try{ l1.updateCopies(b1,-5);}
        catch(Exception e){
            System.out.println("Error : "+e.getMessage());

        }
    }
}
class Book{
    int bookId,availableCopies;
    String title,author;

    public Book(int bookId,String title,String author,int availableCopies){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
class LibraryService{
    public void addBook(Book book) throws LibraryException{
      if(book.availableCopies>0){
        System.out.println("Book added successfully.");
      }else{
        throw new BookOperattionException("0 copies");
      }
    }
    public void borrowBook(Book book) throws LibraryException{
  if(book.availableCopies>0){
            System.out.println("Book borrowed successfully.");
            updateCopies(book,book.availableCopies-1);

        }else{
            throw new BookNotAvailable("Book not available for borrowing.");
        }
    }
   
    public void updateCopies(Book book,int newCount) throws LibraryException{
        if(newCount>=0){
            book.availableCopies = newCount;
        }else{
            throw new BookOperattionException("Copies count cannot be negative.");
        }

    }
    public void removeBook(Book book) throws LibraryException{

    }
}

class LibraryException extends Exception{
    public LibraryException(String message){
        // System.out.println("Error: "+message);
        super(message);
    }
}
class InvalidBookException extends LibraryException{
    public InvalidBookException(String message){
        super(message);
    }
}
class BookNotAvailable extends LibraryException{
    public BookNotAvailable(String message){
        super(message);
    }
    
}
class BookOperattionException extends LibraryException{
    public BookOperattionException(String message){
        super(message);
    }
}