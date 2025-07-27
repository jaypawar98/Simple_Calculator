public class Calculator {
    public Calculator() {
       
       }
    public double add(double a, double b) {
    return a + b;
    }
    public double subtract(double a , double b){
        return a - b;
    }
    public double multiply(double a , double b){
     return a * b; 
    }
    public double divide(double a, double b){
        if (b==0){
      System.out.println("Cannot divide by zero");
      return 0;
    }
    return a/b;
    }
    public double modulo(double a, double b){
        if (b==0){
        System.out.println("cannot perform modulo by Zero");
        return 0;
        }
        return a % b;
    }        

}

