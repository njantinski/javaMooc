
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object otherObject){
        if(this == otherObject){
            return true;
        }
        
        if(!(otherObject instanceof Book)){
            return false;
        }
        
        Book otherBook= (Book) otherObject;
        return this.name.equals(otherBook.name) && this.publicationYear == otherBook.publicationYear;
    }

}
