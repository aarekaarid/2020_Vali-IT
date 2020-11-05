package ee.bcs.valiit.tasks;

import java.lang.reflect.Array;
import java.util.*;

public class Lesson3 {

    public static void main(String[] args) {
//        System.out.println(uusSumma(3, 3));
//        System.out.println(sum(new int[] {2,6,98,64674}));  // declaring array!!!
//        System.out.println(factorial(5));
//        System.out.println(sort(new int[]{1, 4, -1, 256}));
//        System.out.println(reverseString("kuulilennuteetunneliluuk"));
        System.out.println(isPrime(1));

    }


//    public static void main(String[] args) {
//        List<Integer> testList = new ArrayList<>();
//        testList.add(4);
//        testList.add(5);
//        testList.add(6);
//        Arrays.toString(new int[0]);
//        for (Integer i : testList) {
//            System.out.println(i);
//        }
//
//        System.out.print(testList);
//
//        System.out.println(reverseString("Test1 Test2"));
//        Map<String, String> testMap = new HashMap<>();
//        test(testMap);
//        Object a;
//    }

    private static void test(Map<String, String> testMap) {
        testMap.put("test", "test");
    }

    public static int uusSumma(int x, int y) {
        // TODO tagasta x ja y summa vaartus
        return x+y;
    }

    public static int sum(int[] x){
        // Todo liida kokku kõik numbrid massivis x

        int asum = x[0];
        for (int i = 1; i < x.length; i++) {
            asum = asum + x[i];
        }
        return asum;
    }

    public static int factorial(int x) {
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 4*3*2*1 = 24
        int fac = 1;
        for (int i = 2; i < x; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi
        // Näiteks {2, 6, 8, 1}
        // Väljund {1, 2, 6, 8}
        System.out.println(Arrays.toString(a));
        // Outer loop changes the number of comparable cells
        for (int i = 0; i < a.length; i++){
              int min = a[i];
              int index = i;
              // Inner loop goes through the current array (array is 1 shorter every outer loop)
            for (int j = i; j < a.length; j++){
                if(a[j] < min) {
                    min = a[j];
                    index = j;
//                    System.out.println(min);
//                    System.out.println(j);
                }
            }
            // Replacing the min and current first value with each other after every outer loop,
            int tmp = a[i];
            a[i] = min;
            a[index] = tmp;
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        // Näiteks:
        // a = "Test";
        // return tseT";
        System.out.println(a);
        // Use StringBuilder when manipulating Strings
        StringBuilder word = new StringBuilder();
//        for (int i = ((a.length())-1); i == 0; i--) {
         for (int i = a.length()-1; i >= 0; i--) {
//            System.out.print(a.charAt(i));
//            String b = (a.substring(i-1, i));    //hea meetod mida teada Stringidega manipuleerimiseks!!!
//            word.append(a.charAt(i));
            word.append(a.substring(i, i+1));      //uskumatu aga substring() lubab v]tta viimase t'he out of bounds tingimustes
        }
         String reverse = word.toString();      //casting type StringBuilder to String
//        System.out.println(word);
//        System.out.println(reverse);
//        System.out.println(a.substring(1));

        return reverse;     //NB! main method prints the result
    }

    public static boolean isPrime(int x){
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        for (int i = 2; i < x; i++){    //loop goes until the test number itself
            if (x % i == 0) {           //condition is that if there is no remaining
                return false;
            }
        }
        return true;
    }

}
