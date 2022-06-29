package javaAssign6MethodContructor;

public class InterestClass{
	
	    public void cal(int p, int t, double r, int n) 
	    {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
       }
}












