public class MyClock{
    private int m;
    private int h;
    private int state;

    public MyClock(int hours, int mins){
        m = mins;
        h = hours;
        state = 0; //stest = 0 --> not set, state = 1 --> set hours, state = 2 --> set mins
    }

    public void holdCenter(){
        if(state == 0){
            state++;
        }
        else{
            state = 0;
            printTime();
        }
    }

    public void pressCenter(){
        if(state == 1){
            state = 2;
        } 
        else if(state == 2){
            state = 1;
        }
    }

    public void pressUp(){
        if(state == 1){
            h++;
        } 
        else if(state == 2){
            m++;
        }  
    }

    public void pressDown(){
        if(state == 1){
            h--;
        } 
        else if(state == 2){
            m--;
        }
    }

    public void printTime(){
        System.out.println(h + ":" +m);
    }
}