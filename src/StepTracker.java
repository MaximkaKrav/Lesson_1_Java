import java.util.ArrayList;
import java.util.HashMap;

public class StepTracker {

    HashMap<String, ArrayList<Integer>> monthSteps = new HashMap<>();//Месяцы для хранения дней с шагами
    ArrayList<Integer> daysForSteps;//Дни для хранения шагов
    StepTracker(){//Создаем все месяца и инициализируем для них дни с шагами
        monthSteps.put("Yanvar",initializeArrayList());
        monthSteps.put("Fevral",initializeArrayList());
        monthSteps.put("Mart",initializeArrayList());
        monthSteps.put("Aprel",initializeArrayList());
        monthSteps.put("Mai",initializeArrayList());
        monthSteps.put("Iyun",initializeArrayList());
        monthSteps.put("Iyul",initializeArrayList());
        monthSteps.put("Avgust",initializeArrayList());
        monthSteps.put("Sentyabr",initializeArrayList());
        monthSteps.put("Oktyabr",initializeArrayList());
        monthSteps.put("Noyabr",initializeArrayList());
        monthSteps.put("Dekabr",initializeArrayList());
    }

    public void saveStepTracker(String month, int day, int steps) throws Exception {


            if (day < 1 && day >30){
                System.out.println("Не может быть столько дней");
            }
            if (steps < 0){
                System.out.println("Не может быть меньше 0 шагов");
                return;
            }

            if (monthSteps.containsKey(month)){//проверяем есть ли такой месяц
                monthSteps.get(month).add(day-1,steps);//добавляем в такой месяц индекс(день) и шагов сколько было
            }else {
                System.out.println("Такого месяца нет");
                throw new Exception("Неверный месяц");
            }

    }
    private ArrayList<Integer> initializeArrayList(){//Нужна для создания для каждого месяца своих 30 дней
        daysForSteps = new ArrayList<>();
        for (int i = 1; i < 30; i++) {
            daysForSteps.add(0);
        }
        return daysForSteps;
    }



    public void printStatisticSteps(String month){
        int sum = 0;
        int max = 0;
        if (monthSteps.containsKey(month)){

//            int stepsToDay = ;
            for (int i = 0; i < daysForSteps.size(); i++) {
                sum += monthSteps.get(month).get(i);
                System.out.print((i+1) + " день:" + monthSteps.get(month).get(i) + " ");
            }
            System.out.println("\nОбщее число шагов в месяц " + month + " :" + sum);
        }
        System.out.println("Среднее пройденное за месяц " + sum/ monthSteps.get(month).size());

        for (int i = 0; i < daysForSteps.size(); i++) {

            if (max < monthSteps.get(month).get(i)) max = monthSteps.get(month).get(i);
        }
        System.out.println("Max = " + max);


    }

}
