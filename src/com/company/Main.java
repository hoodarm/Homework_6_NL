package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] a = {4, 4, 6, 11, -2, 3};
        int[] b = {5, 11, 11, -3, 3, 5};
        System.out.println("sym diff: " + symDiff(a, b));
    }

    static String findingVal(int[] a, int[] b)
    {
        String result = "";
        for (int element : a)
        {
            boolean found = false;
            for (int el : b)
            {
                if (el == element)
                {
                    found = true;
                    break;
                }
            }
            if (!found)
                result = result + element + " ";
        }
        result=result.trim();
        return result;
    }

    static String symDiff(int[] a, int[] b)
    {
        String x = findingVal(a, b);
        String y = findingVal(b, a);
        return x + " " + y;
    }
}
