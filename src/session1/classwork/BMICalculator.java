package session1.classwork;
public class BMICalculator {
    static String getBmiStatus(double bmi){
        if(bmi < 18.5)
            return "Underweight";
        else if(bmi>=18.5&&bmi<=24.9)
            return "Normal";
        else if(bmi>=30)
            return "Obese";
        else
            return "Overweight";
    }
    static void printWellnessReport(double[] heights,double[] weights){
        double bmi;
        for(int i=0;i<heights.length;i++){
            bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("BMI: %.2f | Status: %s\n",bmi,getBmiStatus(bmi));
        }
    }
    public static void main(String[] args){
        double[] weight={52.4, 67.8, 74.3, 61.6, 83.7, 58.2, 71.9, 90.5, 64.7, 77.1};
        double[] height={1.58, 1.73, 1.66, 1.81, 1.70, 1.77, 1.60, 1.86, 1.73, 1.67};
        printWellnessReport(height, weight);
    }
}