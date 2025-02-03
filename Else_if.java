public class Else_if{
    public static void main(String [] args){
        int time = 22;
        if(time < 10){
            System.out.println("Good morning");
        }else if(time > 10 && time < 22){
            System.out.println("Good day");
        }else{
            System.out.println("Good evening");
            System.out.println("Have a great night");
        }
    }
}