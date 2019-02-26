public class GameSnake{
    private int p1;
    private int p2;
    private int maxSlot;
    private int turn;
    private Dice dices;

    public GameSnake(int totalSlot){
        p1 = 0;
        p2 = 0;
        maxSlot = totalSlot;
        turn = 1;
        dices = new Dice();
    }

    public boolean isEnded(){
        return p1 >= maxSlot || p2 >= maxSlot;
    }

    public void play(){
        dices.roll();
        walk(dices.getVal());
    }

    public void walk(int slot){
        if(turn == 1){
            p1 += slot;
            turn = 2;
        }
        else{
            p2 += slot;
        }

        if(p1 >= maxSlot)
            System.out.println("Player 1 win !!");
        else if(p2 >= maxSlot)
            System.out.println("Player 2 win !!");
    }
}