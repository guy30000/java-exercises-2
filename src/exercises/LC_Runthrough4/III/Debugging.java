package exercises.LC_Runthrough4.III;

public class Debugging {
    public static void main (String[] args){
        int[] avgTest = new int[3];

        avgTest[0]=3;
        avgTest[1]=2;
        avgTest[2]=5;

        double finalAverage=0;
        int numTotal=0;
        for (int i = 0; i<avgTest.length;i++){
            numTotal+=avgTest[i];

        }
        finalAverage=numTotal/avgTest.length;
        System.out.println(finalAverage);

        System.out.println("test1");
        System.out.println("test2");
        System.out.println("test3");
        System.out.println("test4");
        System.out.println("test5");


    }
}
