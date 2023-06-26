public class Converter {
    double lengthSteps = 0.00075;
    int kalOnStep = 50;
    int kkalOnKal = 1000;

    double getLength(int steps){
        return steps*lengthSteps;
    }
    double getPlantedCallories(int steps){
        return steps/kalOnStep*kkalOnKal;
    }

    }

