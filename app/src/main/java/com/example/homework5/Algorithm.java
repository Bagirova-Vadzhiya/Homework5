package com.example.homework5;

public class Algorithm {
     final double ACCELERATION_OF_GRAVITY = 3.721;
     final double ACCELERATION_OF_GRAVITY_ON_EARTH = 9.80665;
     private double calculation() {
         double fuelOnMars = (100 * ACCELERATION_OF_GRAVITY) / ACCELERATION_OF_GRAVITY_ON_EARTH;
         return fuelOnMars;
     }

     //Создание пустого конструктора
    public Algorithm() {
    }

    //Метод вычисляющий массу необходимого топлива по массе груза
    public long massCalculation(String input) {
        //Проверка корректности вводимого згачения
        if (input.contains(",")) {
            String inputMod = input.replace(",", ".");
            double inputFloat = Float.parseFloat(inputMod);
            return (long) (inputFloat * calculation());
        } else {
           double inputFloat = Float.parseFloat(input);
            return (long) (inputFloat * calculation());
        }
    }
   }

