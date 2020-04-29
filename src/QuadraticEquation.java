public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getDelta() {
        return this.b*this.b -4*this.a*this.c;
    }

    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getRoot1(){
        double r1 = (-this.b+Math.pow(this.getDelta(),0.5))/(2*this.a);
        return r1;
    }
    public double getRoot2(){
        double r2 = (-this.b-Math.pow(this.getDelta(),0.5))/(2*this.a);
        return r2;
    }
    public double getRootDouble(){
        return -this.b/(2*this.a);
    }
}
