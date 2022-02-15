package com.daryl;

import java.util.Scanner;

class BMI {
    private double height;
    private double weight;
    private double BMInumber;

    public BMI(double height, double weight){
        this.height=height;
        this.weight=weight;
    }

    public double getBMI(){
        this.BMInumber=this.weight*703/(this.height*this.height);
        return this.BMInumber;
    }

    public String getInterpretation(){
        if (this.BMInumber<18.5){
            return "Underweight";
        }
        else if (this.BMInumber<25){
            return "Normal";
        }
        else if (this.BMInumber<30){
            return "Overweight";
        }
        else {
            return "Obese";
        }

    }

}

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double height,weight;
        System.out.println("Enter weight in pounds:");
        weight=input.nextDouble();
        System.out.println("Enter height in inches:");
        height=input.nextDouble();
        BMI findBMI= new BMI(height,weight);
        System.out.println("BMI is " + findBMI.getBMI());
        System.out.println(findBMI.getInterpretation());
    }
}
