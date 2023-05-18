public class OperationCalculator {
    public static double arti(double num1, double num2){
        return num1 + num2;
    }
    public static double eksi(double num1, double num2){
        return num1 - num2;
    }
    public static double carpi(double num1, double num2){
        return num1 * num2;
    }
    public static double bolu(double num1, double num2){
        return num1 / num2;
    }
    public static double mod(double num1, double num2){
        return (num2*100)/num1;
    }
    public static double kare(double num1){


        return num1*num1;
    }
    public static double sin(double num1){
        num1 = Math.toRadians(num1);
        return Math.sin(num1);


    }
    public static double cos(double num1){

        num1 = Math.toRadians(num1);
        return Math.cos(num1);
    }
    public static double tan(double num1){
        num1 = Math.toRadians(num1);
        return Math.tan(num1);
    }
    public static double cotan(double num1){

        return (Math.toRadians(Math.cos(num1))/Math.toRadians(Math.sin(num1)));
    }
    public static double log(double num1){

        return Math.log(num1);
    }
    public static double ln(double num1){

        return (-Math.log(1-num1))/num1;
    }
    public static double pi(double num1){

        return Math.PI;
    }
    public static double e(double num1){

        return Math.exp(num1);
    }

    public static double kokal(double num1){

        return Math.sqrt(num1);
    }

    public static double usAl(double taban, double kuvvet){

        return Math.pow(taban, kuvvet);
    }

}
