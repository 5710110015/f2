public class GamePlay{
    public static void main(String args[]){
        GameSnake g = new GameSnake(30);
        g.walk(10);
        g.walk(3);
        g.walk(8);
        g.walk(3);
        g.walk(12); //player 1 win
    }
}