package loop;


public class DistanceTravelled {

    static double testcase11 = 8;

    static double testcase12 = 8;

    static double testcase13 = 10;

    public static void main(String args[]){
        DistanceTravelled testInstance= new DistanceTravelled();
        double result = testInstance.distance(testcase11,testcase12,testcase13);
        System.out.println(result);
    }

    public double distance(double u, double a, double t){
        double d1 = d1 = u*t + 1/2*a*t*2 ;
        return d1;
    }
}


