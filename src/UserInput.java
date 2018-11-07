import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int number = getInputNoRecursion(sc, 1, 5);
        System.out.println(number);

    int number2 = getInputWithRecursion(sc, 1, 5);
        System.out.println(number2);
    }

    public static int getInputNoRecursion(Scanner scanner, int min, int max){   //с помощью бесконечного цикла
        int result;
        while (true) {
            System.out.println("Введите число от " + min + "до " + max);
            try {
                String stringNumber = scanner.next();
                result = Integer.valueOf(stringNumber);
            } catch (NumberFormatException e) {             // если строку можно преобразовать к числу то ок,  если
                System.out.println("Вы ввели не число");    // нет то выводится исключение
                continue;
            }

            if (result < min || result > max) {
                System.out.println("Число не от " + min + "до " + max);
                continue;
            }
            break;
        }
        return result;
    }

    public static int getInputWithRecursion(Scanner scanner, int min, int max){     //с помощью рекурсии
        int result;
        System.out.println("Введите число от " + min + "до " + max);
        try{
            String stringNumber = scanner.next();
            result = Integer.valueOf(stringNumber);
        }catch (NumberFormatException e){
            System.out.println("Вы ввели не число");
            return getInputWithRecursion(scanner, min, max); //почему такие значения?
        }
        if (result<min || result>max){
            System.out.println("Число не от " + min + "до " + max);
            return getInputWithRecursion(scanner,min,max);
        }
        return  result;
    }

}

