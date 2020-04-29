public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;

    public void getDelta() {
        this.delta = getDiscriminant();
    }

    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return this.b*this.b -4*this.a*this.c;
    }
    public double getRoot1(){
        this.getDelta();
        double r1 = (-this.b+Math.pow(this.delta,0.5))/(2*this.a);
        return r1;
    }
    public double getRoot2(){
        this.getDelta();
        double r2 = (-this.b-Math.pow(this.delta,0.5))/(2*this.a);
        return r2;
    }
    public double getRootDouble(){
        return -this.b/(2*this.a);
    }
}
