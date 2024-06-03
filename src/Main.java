import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String author = "Olumide";
        System.out.println("Welcome back, " + author);
        int x = 1234;
        int sumOfDigits = 0;
        while (true) {
            sumOfDigits = sumOfDigits + (x %10);

            x = x / 10;
            if (x < 1) {
                break;
            }
        }
        System.out.println("Sum of Digits " +sumOfDigits);
        System.out.println("******************************");

        //Using Methods
        loop(1, 10);
        System.out.println("******************************");
        loop(20, 40);


            }
    public static void loop(int start, int stop)  {
        for(; start <= stop; start++){
            System.out.println(start);
        }

    }
}