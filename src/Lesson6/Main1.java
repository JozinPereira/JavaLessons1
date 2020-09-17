package Lesson6;

public class Main1 {
    public static void main(String[] args) {
        char [] firstArray = {'q', 'w', 'e', 'r'};
        char [] secondArray = {'a', 's', 'd', 'f'};

        char [] finalArray = new char [firstArray.length + secondArray.length];

        for (int i = 0; i < finalArray.length; i++) {
            if (i < firstArray.length) {
                finalArray[i] = firstArray[i];
            } else finalArray [i] = secondArray[i - firstArray.length];
            System.out.println(finalArray);
        }
    }
}
