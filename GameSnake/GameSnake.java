public class GameSnake{
    private int player1;
    private int player2;
    private int count;
    private int t;

    public GameSnake(int total){
        player1 = 0;
        player2 = 0;
        count = 0;
        t = total;
    }

    public void walk(int num){
        count++;
        if((count%2) == 0){
            player2 += num;
            if(player2 >= t){
                System.out.println("player2--win !");
            }
        }
        else if((count%2) != 0){
            player1 += num;
            if(player1 >= t){
                System.out.println("player1--win !");
            }
        }
    }
}