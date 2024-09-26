import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            System.out.println(calc(input));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static String calc(String input){
        String[] array = input.split(" ");
        if(array.length != 3){
            throw new IllegalArgumentException("Выражение введено неверно");
        }

        int firstNumber, secondNumber;
        try{
            firstNumber = Integer.parseInt(array[0]);
            secondNumber = Integer.parseInt(array[2]);

        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Числа не подходят по условию ");
        }
        if (firstNumber < 1 || firstNumber > 10 || secondNumber < 1 || secondNumber > 10){
            throw new IllegalArgumentException("Числа не подходят по условию");
        }
        String sign = array[1];

        switch (sign){
            case "+":
                return String.valueOf(firstNumber + secondNumber);
            case "-":
                return String.valueOf(firstNumber - secondNumber);
            case "*":
                return String.valueOf(firstNumber * secondNumber);
            case "/":
                 return String.valueOf(firstNumber / secondNumber);
            default:
                 throw new IllegalArgumentException("Неверный оператор");
        }
    }
}
