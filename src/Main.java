import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StepTracker stepTracker = new StepTracker();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в \"Счетчик калорий\".");
//        stepTracker.saveStepTracker("Yanvar",4,1488);
        printMenu();
        int inputValue = scanner.nextInt();
        switch (inputValue){
            case 1:{
                System.out.println("Введите месяц");
                String inputMonth = scanner.next();
                System.out.println("Введите день");
                int inputDay = scanner.nextInt();
                System.out.println("Введите кол-во шагов");
                int inputSteps = scanner.nextInt();
                System.out.println("Данные сохранены");
                stepTracker.saveStepTracker(inputMonth,inputDay,inputSteps);
                break;
            }
            case 2:{
                break;
            }
            case 3:{
                break;
            }
            case 4:{
                break;
            }
        }

        System.out.println(stepTracker.monthSteps);


}


    public static void printMenu(){
        System.out.println("Выбрать действие");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");

    }
}