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
            System.out.println("current sumOfDigits" + sumOfDigits);
            x = x / 10;
            if (x < 1) {
                break;
            }
        }
        System.out.println("Sum of Digits " +sumOfDigits);
            }
        }
//
//            switch (name.toLowerCase()) {
//                case "full name" -> System.out.println("Olamilekan Olumide");
//                case "editor" -> System.out.println("I also edit stuffs");
//                case "analyst" -> System.out.println("I am a Data Analyst");
//                default -> System.out.println("Not Found");
//
//            }
//        }
//        while(i<2);
//        Car car = new Car();
//        car.setDoors(4);
//        System.out.println(car.getDoors());


