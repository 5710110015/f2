public class GamePlay{
    public static void main(String args[]){
        GameSnake g = new GameSnake(30);

        while(!g.isEnded()){
            g.play();
        }
    }
}