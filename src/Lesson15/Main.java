package Lesson15;

public class Main {
    public static void main(String[] args) {
        People people = new People();
        try {
            people.setAge(-200);
            System.out.println("Все хорошо");
        } catch (UncurrentAgeException e) {
            e.printStackTrace();
            System.out.println("Не тот возраст");
        }
        System.out.println("С трай-кетч программа не прерывается");
    }

    // для проверки интерфейса
    // StringUtilsImpl utils = new StringUtilsImpl();
    // utils.div(null, "3");
    // utils.div("wer", "dfr");
    // utils.div("6", "0");
    // utils.div("4", "8");


    //svn tortoise (subversion)
}
