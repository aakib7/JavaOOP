public class ConditionAndLoop {
    public static void main(String[] args){
        int number =10;
        //conditional statements
        if(number %2 == 0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is odd");
        }
        
        // Loops
        
        for(int i = 0; i < number; i++){
            System.out.println(i);
        }

        int i = 1;
        while(i <= number){
            System.out.println(i);
            i++;
        }

        int x = 1;
        do{
            System.out.println(x);
            x++;
        }while(x <= number);

        if(isEven(number)){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        int[] numbers = { 3, 9, 5, -5 };

        // for each loop
        for (int n : numbers) {
            System.out.println(n);
        }
    }

    public static Boolean isEven(int number){
        if(number%2==0)
            return true;
        else
            return false;     
    }
    
}
