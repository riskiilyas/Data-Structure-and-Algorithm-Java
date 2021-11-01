package sort;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;

public class Das {
    public static void main(String[] args) {
        DecimalFormat nf = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(nf.format(sc.nextDouble()));

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + us.format(n));

        StringBuilder sin = new StringBuilder(us.format(n));
        sin.delete(0,0);
        sin.insert(0, "India: Rs.");
        System.out.println(sin);

        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + ch.format(n));

        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + fr.format(n));
//        int n = 5;
//        int[] a = new int[n];
//        BigInteger sss = new BigInteger(n);
//        BigInteger sss = sc.nextBigInteger();
//        List<Integer> ar = new ArrayList<>();
//        ar.add(2);
//        ar.add(3);
//        ar.add(1);
//        ar.add(4);
//        ar.add(4);
//        minMax(ar);
    }

    public static void minMax(List<Integer> ar){
        ar.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        int min = 0;
        for (int i = 0; i < 4; i ++){
            min += ar.get(i);
        }
        int max = 0;
        for (int i = 1; i < 5; i++){
            max += ar.get(i);
        }

        System.out.println(min + " " + max);
    }
}
