
class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

     public double subtract(double a, double b) {
        return a - b;
     }

    public double multiply(double a, double b) {
        return a * b;
    }    
    
    public double divide(double a, double b) {
        int denom = (int)b;
        if (denom == 0) {
            System.out.println("Cannot divide by 0");
            return 0;
        } else {
            return a / b; //only 0 not 0.0 will throw an Arithmetic Exception
        }
    }
}    






