package file;


import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) {
        int a, p;
        double m1, m2, G;


        a = Integer.parseInt(args[0]);
        p = Integer.parseInt(args[1]);
        m1 = parseDouble(args[2]);
        m2 = parseDouble(args[3]);

        System.out.println((4*Math.pow(Math.PI,2)*(Math.pow(a ,3)/(Math.pow(p,2)*(m1+m2)))));

    }
    public static double getG(Integer a,Integer p, Double m1, Double m2){
            Double G;
        G= (4*Math.pow(Math.PI,2)*(Math.pow(a ,3)/(Math.pow(p,2)*(m1+m2))));
        return  G;

    }
}



