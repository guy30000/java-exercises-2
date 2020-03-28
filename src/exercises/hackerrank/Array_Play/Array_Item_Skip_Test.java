package exercises.hackerrank.Array_Play;

public class Array_Item_Skip_Test {

    public static void main(String[] args)    {
        int test[] = new int[10];

    test[0]=4;
    test[1]=3;
    test[2]=3;
    test[3]=4;
    test[4]=5;
    test[5]=6;
    test[6]=7;
    test[7]=8;
    test[8]=3;
    test[9]=4;

        for (int i = 0;i<test.length;i++){
            System.out.println(i+ "-i  :Pre cut: test value-" + test[i] );
            if (test[i] == 3){
               //Doesnt look like there is a way to remove an item from the array through normal a simplye utility
                // Example give uses array utilities which doesnt seem to pre present/ or rebuilding array moving each
                //remainng element up one. In case I need it may be good to move the last element to the position
                //then shorten the iteration loop (i++;)

            }
        }



}
}
