import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String[] names = {"Meisam", "Sarah", "Tom", "Brad", "Brian"};
        int[] numbers = {123432443, 44542344, 55344563, 56453325, 3524669};
        for (int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Please Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i=0; i<names.length; i++) {
            if (name.equals(names[i])){
                System.out.println(numbers[i]);
            }
        }
    }
}