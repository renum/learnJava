package training.learnjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue=2_147_483647;
        int minIntValue=(Integer.MIN_VALUE)-1;
        int maxIntValue = (Integer.MAX_VALUE)+1;
        System.out.println("minIntValue"+minIntValue);
        System.out.println("maxIntValue"+maxIntValue);
        short minShortValue=(Short.MIN_VALUE);
        short maxShortValue = (Short.MAX_VALUE);
        System.out.println("minShortValue"+minShortValue);
        System.out.println("maxShortValue"+maxShortValue);
        float myFloatValue=(float)5.25;
        double myDoubleValue=5.25F;
        int weightPound=20;
        double weightKg=0.45359237D*weightPound;
        System.out.println(weightKg);
    }
}
