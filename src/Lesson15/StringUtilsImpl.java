package Lesson15;

public class StringUtilsImpl implements StringUtils{

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Один из аргументов пустой");
        }
        double num1 = 0;
        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Первое значение не число");
        }
        double num2 = 0;
        try {
            num2 = Integer.parseInt(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Второе значение не число");
        }
        if (num2 == 0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        return  num1 / num2;
    }
}
