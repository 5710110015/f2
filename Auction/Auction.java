public class Auction{
    private ArrayList<Lot> lots; // list of lots in the auction

    public Auction(){ 
        lots = new ArrayList<Lot>();  
    }

    public void enterLot(int lotNum, String description){ 
        lots.add( new Lot(lotNum, description) );  
    }               // should check uniqueness of lotNum

    public void showLots(){ 
        for (Lot lot : lots)
        System.out.println(lot.toString());
    }
    public Lot getLot(int lotNum){
    /* Return the lot with the given number. Return null
        if a lot with this number does not exist.  */
        for (Lot lot : lots)
            if (lot.getIdNum() == lotNum)
                return lot;

    // lot with that number not found
        System.out.println("Lot number: " + lotNum + " does not exist.");
            return null;
    }  // end of getLot()
}  // end of Auction class
