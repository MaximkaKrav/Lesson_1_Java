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

    public ArrayList<Integer> saveStepTracker(String month, int day, int steps){
        if (month != null){
            if (day >=1 && day <= 30){
                if (!(steps < 0)){
                    monthSteps.get(month).add(day-1,steps);
                }else System.out.println("Шаги не могут быть отрицательны");
            } else System.out.println("Дней только 30");
        }else System.out.println("Введите месяц");
//        System.out.println(monthSteps);
        return null;
    }
    private ArrayList<Integer> initializeArrayList(){//Нужна для создания для каждого месяца своих 30 дней
        daysForSteps = new ArrayList<>();
        for (int i = 1; i < 30; i++) {
            daysForSteps.add(0);
        }
        return daysForSteps;
    }

}
