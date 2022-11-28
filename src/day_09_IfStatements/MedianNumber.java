package day_09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a=10,
                b=20,
                c=30;

        boolean aIsMedian= ((a>b && a<c) || (a>c && a<b));
        boolean bIsMedian= ((b>a && b<c) || (b<a && b>c));
        boolean cIsMedian = !aIsMedian && !bIsMedian; //((c>a && c<b) || (c<a && c>b));

        if (aIsMedian)
            System.out.println(a+" is the median number.");
        if (bIsMedian)
            System.out.println(b+" is the median number.");
        if (cIsMedian)
            System.out.println(c+" is the median number.");




    }
}
