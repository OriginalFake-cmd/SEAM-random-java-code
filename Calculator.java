public class Calculator {
    static double add(double x, double y){
        double i = x+y;
        System.out.println(x + "+" + y + "=" + i);
        return i;
    }
    static double subtract(double x, double y){
        double z = x-y;
        System.out.println(x + "-" + y + "=" + z);
        return z;
    }
    static double multiply(double x, double y){
        double p = x*y;
        System.out.println(x + "*" + y + "=" + p);
        return p;
    }
    static double divide(double x, double y){
        double w = x/y;
        System.out.println(x + "/" + y + "=" + w);
        return w;
    }
}
