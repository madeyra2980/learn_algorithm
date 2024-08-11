public class getHappyDigit {
    
    public static void main(String[]args){ 

        int numbers = 123321;

        int a = numbers/1000;
        int b = numbers%1000;

        if(a == b){ 
            System.out.println("Жаксы билеттер");
        }else{
            System.out.println("Жаман билеттер");
        }
    }

}
