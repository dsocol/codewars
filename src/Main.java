import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.floor;

public class Main {

    public static void main(String[] args) {
        findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5});
        findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5});
        findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5});
        findIt(new int[]{10});
        findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1});
        findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10});
        findIt(new int[]{8,8,5,1,3,-2,1,3,5,-2,4,4,5});
        findIt(new int[]{4,5,-2,1,3,1,3,5,-2,4,5});

    }

    public static int howOld(final String herOld) {

        //your code here, return correct age as int ; )
        int res = Integer.valueOf(herOld.substring(0));
        return res;
    }
    public static int findIt(int[] a) {
        int odd = 0;
        int dim = a.length;

        for (int i = 0; i < dim; i++){
//            System.out.println("Odd este: " + odd);
//            System.out.println("Element: " + e);
//            System.out.println("XOR intre odd si e: " + (odd ^ e));
            odd = odd ^ a[i];

        }
        System.out.println("Odd dupa XOR: " + odd);
        return odd;
//        int dim = a.length;
//        int count;
//        int oddNum = 0;
//            for (int i = 0; i < dim; i++) {
//                count = 0;
//                int x = a[i];
//                for (int j = 0; j < dim; j++) {
//                    if (x == a[j]){++count;}
//                }
//                if (count % 2 == 1){ oddNum = a[i]; };
//            }
//            return oddNum;
    }

    public static void innerOuter(){
        for (int i = 0; i <= 5; i++) {
            System.out.println("Linia: " + i);
            for (int j = 0; j < 4; j++) {
                System.out.println("   Coloana: " + j);
                System.out.println("Elementul a" + i+j);
            }
        }
    }


    public static int cockroachSpeed(double x){
        // Good Luck!
        //return  (int) floor(x*27.7778);
        int secondsInHour = 3600;
        int cmInKm = 100000;
        return (int) (x * cmInKm / secondsInHour);
    }

    private static int stringSize(int x) {
        int d = 1;
        if (x >= 0) {
            d = 0;
            x = -x;
        }
        int p = -10;
        for (int i = 1; i < 10; i++) {
            if (x > p)
                return i + d;
            p = 10 * p;
        }
        return 10 + d;
    }

    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    public static boolean isSquare(int n) {
        int radical = (int) Math.sqrt(n);
        return n == radical * radical; // fix me!
    }

    public static void streamExample(){
        List<String> myList = Arrays.asList("apple", "banana", "cherry");
        String result = myList.stream()                       // Create a stream
                .filter(s -> s.startsWith("a")) // Intermediate operation
                .collect(Collectors.joining()); // Terminal operation
        System.out.println(result);
    }
    public static int sortDesc(final int num) {
//        String[] array = String.valueOf(num).split("");
//        Arrays.sort(array, Collections.reverseOrder().reversed());
//        Arrays.stream(array).forEach(System.out::println);
//        return Integer.valueOf(String.join("", array));
        int numToReturn=0; int x;
        for(int i=9; i>=0; i--)
        {
            x=1;
            while((num/x) != 0)
            {
                if((num/x) % 10 == i)
                    numToReturn = numToReturn*10+i;
                x=x*10;
            }
        }
        return numToReturn;
    }
    static int[] addElement(int[] a, int e) {
        a = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int[] n = addElement(classPoints, yourPoints);
        int avg = Arrays.stream(n).sum()/n.length;

        return (yourPoints > avg);
    }

    public static int squareSum(int[] n)
    {
        return Arrays.stream(n).map(e -> e*e).sum();
    }
    public static String smash(String... words) {
//        StringBuilder sb = new StringBuilder();
//        for (String w : words) {
//            sb.append(w + " ");
//        }
//        return sb.toString().stripLeading().stripTrailing();
        return String.join(" ", words);
    }
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!
        return distanceToPump/mpg <= fuelLeft;
    }
    public static String getMiddle(String word) {
        //Code goes here!
        int dim = word.length();
        return dim%2 == 0 ? word.substring((dim/2)-1, (dim/2)+1) : word.substring(dim/2, (dim/2)+1);
    }
    public static boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && c + b > a;

//        int max = a;
//        int sum = 0;
//        for (int i = 0; i < 3; i++) {
//            if (a > b && a > c){
//                sum = b+c;
//                if(sum > a) {
//                    return true;
//                }
//            } else if (b > a && b > c) {
//                max = b;
//                sum = a + c;
//                if (sum > b){
//                    return true;
//                }
//            }else {
//                max = c;
//                sum = a + b;
//                if (sum > c){
//                    return true;
//                }
//            }
//        }
//        return false;
    }

    public static long findNextSquare(long sq) {
        long root = (long) Math.sqrt(sq);
        //return root * root == sq ? (root + 1) * (root + 1) : -1;
        double radical = Math.sqrt(sq);
        double urm = 0;
        long patrat = 0;
        System.out.println("Radical: " + radical);
        if (radical%1 == 0){
            urm = radical + 1;
        }else {
            return -1;
        }
        System.out.println("Urmator: " + urm);
        patrat = (long) ((long) urm*urm);
        return  patrat;
    }
    static Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };

    public static String areYouPlayingBanjo(String name) {
        // Program me!
        if (name.substring(0, 1).equalsIgnoreCase("R")) {
            return name + " plays banjo.";
        }
        return name + " does not plays banjo.";
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int missing = 0;
        int present = 0;
        for (int o = 0; o <= arrayOfSheeps.length-1; o++){
            if((arrayOfSheeps[o] != null) && arrayOfSheeps[o]){
                ++present;
            } else if (Boolean.FALSE.equals(arrayOfSheeps[o])) {
                ++missing;
            }
        }
        return present;
    }
    public int countSheeps1(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        if(arrayOfSheeps != null && arrayOfSheeps.length > 0){
            int count = 0;
            for(Boolean b : arrayOfSheeps){
                if(b != null){
                    count += b ? 1 : 0;
                }
            }
            return count;
        }
        return 0;
    }


}
