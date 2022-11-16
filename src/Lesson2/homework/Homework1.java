package Lesson2.homework;

import com.sun.source.util.SourcePositions;

public class Homework1 {
    public static void main(String[] args) {
        //Продвинутая
        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"

        String s = "234";
        int i = Integer.parseInt(s);
        String word = "some_text";
        int y = word.length();
        System.out.println(i + y);
        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3;
        int b = 5;
        System.out.println(Math.pow((a + b), 2));
        // Задание №3:
        // Дано:
        boolean hasFuel = false;  // тут рассматривал, если hasFuel == true , топливо есть
        boolean hasElectricsProblem = true;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = false;
        int fuelCost = 1000;
        int motorCost = 10000;
        int electricsCost = 5000;
        int transmissionCost = 4000;
        int wheelCost = 2000;


        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.

        if (!hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
            System.out.println(fuelCost);
        } else if (hasMotorProblem && !hasElectricsProblem && !hasTransmissionProblem && !hasWheelsProblem) {
            System.out.println(motorCost);
        } else if (hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
            System.out.println(electricsCost);
        } else if (hasTransmissionProblem && !hasMotorProblem && !hasElectricsProblem && !hasWheelsProblem) {
            System.out.println(transmissionCost);
        } else if (hasWheelsProblem && !hasMotorProblem && !hasElectricsProblem && !hasTransmissionProblem) {
            System.out.println(wheelCost);
        } else if (hasElectricsProblem && hasMotorProblem) {
            System.out.println((electricsCost + motorCost) - ((electricsCost + motorCost) / 100 * 10));
        } else if (hasElectricsProblem && hasWheelsProblem) {
            System.out.println((electricsCost + wheelCost) - ((electricsCost + wheelCost) / 100 * 10));
        } else if (hasMotorProblem && hasWheelsProblem) {
            System.out.println((motorCost + wheelCost) - ((motorCost + wheelCost) / 100 * 10));
        } else if (hasTransmissionProblem && hasWheelsProblem) {
            System.out.println((transmissionCost + wheelCost) - ((transmissionCost + wheelCost) / 100 * 10));
        } else if (hasTransmissionProblem && hasElectricsProblem) {

            System.out.println((transmissionCost + electricsCost) - (transmissionCost + electricsCost) / 100 * 30);
        } else {
            System.out.println((transmissionCost + motorCost) - (transmissionCost + motorCost) / 100 * 30);
        }

    }
}
;



