package Java.Arrays;

public class ElementSumPair {

    static String getPair(int a, int b) {
        return "(" + a + "," + b + ")";
    }

    static int findMaxElement(int[] sourceArray) {
        int MaxValue = Integer.MIN_VALUE;
        for (int currentElement : sourceArray) {
            if (currentElement > MaxValue) {
                MaxValue = currentElement;
            }
        }
        return MaxValue;
    }

    static String getSumPairs(int[] sourceArray, int targetValue) {
        String pairs = "";
        int hashTable[] = new int[findMaxElement(sourceArray)];
        for (int i : sourceArray) {
            int temp = targetValue - i;
            if (temp < 0)
                continue;
            if (hashTable[temp] == 1) {
                pairs = pairs + getPair(i, temp) + "; ";
            } else {
                hashTable[i] = 1;
            }
        }
        return pairs == "" ? "No Pairs Found" : pairs;
    }

    public static void main(String[] args) {

        int targetValue = 34;
        int srcArray[] = { 17, 17, 18, 16, 33, 1, 2, 32, 20, 14, 67, 15 };
        System.out.println(getSumPairs(srcArray, targetValue));

    }
}