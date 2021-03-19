
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment a){
        if(this.squares > a.getSquares()){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        return Math.abs(this.getPrice() - compared.getPrice());
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(this.getPrice() > compared.getPrice()){
            return true;
        }
        return false;
    }
    
    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }
    
    public int getPrice(){
        return squares * princePerSquare;
    }
    
}
