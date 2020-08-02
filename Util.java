package Library;

import java.util.Arrays;

public class Util {

    //STRING METHODS

    // A method removes duplicates from string
    public static String removeDup(String str) {
        String nonDup = "";
        for (String each : str.split("")) {//hakki
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        return nonDup;
    }

    //A method revers the given strings
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    //a method that can find the frequency of characters a string
    /* public static String frequencyOfChars(String str) {
        String nonDup = ""; //str = "AABBCC"
        String result = "";
        for (int i = 0; i <= str.length() - 1; i++) {//removing duplicates from str
            String ch = "" + str.charAt(i);
            if (!nonDup.contains(ch)) {
                nonDup += ch; //"ABC"
            }
        }
        for (int j = 0; j <= nonDup.length() - 1; j++) {//iterates the string nonDup
            char ch = nonDup.charAt(j);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {//returns the frequency of each ch from string str
                if (str.charAt(i) == ch) {
                    count += 1;
                }
            }
            result += "" + ch + count + " ";
        }
        return result;
    }*/ //long version of frequency of character.
    public static String frequencyOfChars(String str){//hakki
        String expectedResult="";//h1a1k2i1
        String nonDup = Util.removeDup(str);//haki
        for (char each:nonDup.toCharArray()){
            int count = Util.frequency(str,each);//1 1 2 1
            expectedResult += ""+each+count;
        }
        return expectedResult;
    }

    //a method that can find the unique characters from a string
    public static String uniques(String str){
        String uniques = "";  // lets find the unique with using frequency method
        for (char each:str.toCharArray()){
            char ch = each;
            int count =frequency(str,ch);
            if (count==1){
                uniques+=ch;
            }
        }
        return uniques;}

    //formats full name
    public static String formatFullName(String first, String last){

        first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        //Convert first char to upper case         //convert rest of the chars to lowers
        last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String fullName=first+" "+last;
        return fullName;
    }

    //a method that can find the frequency of a certain char
    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }



    //ARRAY METHODS

    //7 Methods Sorts Descending Orders
    public static int[] sortDesc(int[] arr){
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];
        int k = arr.length-1;
        for (int i =0; i <=arr2.length-1;i++){
            arr2[i]=arr[k];
            k--;
        }
        return arr2;
    }
    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);
        double[] arr2 = new double[arr.length];
        int k = arr.length-1;
        for (int i =0; i <=arr2.length-1;i++){
            arr2[i]=arr[k];
            k--;
        }
        return arr2;
    }
    public static char[] sortDesc(char[] arr){
        Arrays.sort(arr);
        char[] arr2 = new char[arr.length];
        int k = arr.length-1;
        for (int i =0; i <=arr2.length-1;i++){
            arr2[i]=arr[k];
            k--;
        }
        return arr2;
    }
    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);
        String[] arr2 = new String[arr.length];
        int k = arr.length-1;
        for (int i =0; i <=arr2.length-1;i++){
            arr2[i]=arr[k];
            k--;
        }
        return arr2;
    }
    public static Integer[] sortDesc(Integer[] arr){
        Arrays.sort(arr);
        Integer[] arr2 = new Integer[arr.length];
        int k = arr.length-1;
        for (int i =0; i <=arr2.length-1;i++){
            arr2[i]=arr[k];
            k--;
        }
        return arr2;
    }
    public static Double[] sortDesc(Double[] arr){
        Arrays.sort(arr);
        Double[] arr2 = new Double[arr.length];
        int k = arr.length-1;
        for (int i =0; i <=arr2.length-1;i++){
            arr2[i]=arr[k];
            k--;
        }
        return arr2;
    }
    public static Character[] sortDesc(Character[] arr){
        Arrays.sort(arr);
        Character[] arr2 = new Character[arr.length];
        int k = arr.length-1;
        for (int i =0; i <=arr2.length-1;i++){
            arr2[i]=arr[k];
            k--;
        }
        return arr2;
    }

    //a method adds element to String
    public static int[] addElement(int[] arr,int num){
        int[] arr2= new int[arr.length+1];
        arr2[arr2.length-1]=num;
        int i = 0;
        for (int each:arr) {
            arr2[i]=each;
            i++;
        }

        return arr2;}

    //7 methods that can combine two  Arrays
    public static int[] combination2Arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {              //int[] arr1={1,2,3,4,5};
            arr3[i] = each;
            i++;
        }
        for (int each : arr2) {                //int[] arr2={6,7,8,9};
            arr3[i] = each;
            i++;
        }
        return arr3;


    }
    public static double[] combination2Arrays(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        int i = 0;
        for (double each : arr1) {              //int[] arr1={1,2,3,4,5};
            arr3[i] = each;
            i++;
        }
        for (double each : arr2) {                //int[] arr2={6,7,8,9};
            arr3[i] = each;
            i++;
        }
        return arr3;


    }
    public static char[] combination2Arrays(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];
        int i = 0;
        for (char each : arr1) {              //int[] arr1={1,2,3,4,5};
            arr3[i] = each;
            i++;
        }
        for (char each : arr2) {                //int[] arr2={6,7,8,9};
            arr3[i] = each;
            i++;
        }
        return arr3;


    }
    public static Integer[] combination2Arrays(Integer[] arr1, Integer[] arr2) {
        Integer[] arr3 = new Integer[arr1.length + arr2.length];
        int i = 0;
        for (Integer each : arr1) {              //int[] arr1={1,2,3,4,5};
            arr3[i] = each;
            i++;
        }
        for (Integer each : arr2) {                //int[] arr2={6,7,8,9};
            arr3[i] = each;
            i++;
        }
        return arr3;


    }
    public static Double[] combination2Arrays(Double[] arr1, Double[] arr2) {
        Double[] arr3 = new Double[arr1.length + arr2.length];
        int i = 0;
        for (Double each : arr1) {              //int[] arr1={1,2,3,4,5};
            arr3[i] = each;
            i++;
        }
        for (Double each : arr2) {                //int[] arr2={6,7,8,9};
            arr3[i] = each;
            i++;
        }
        return arr3;


    }
    public static Character[] combination2Arrays(Character[] arr1, Character[] arr2) {
        Character[] arr3 = new Character[arr1.length + arr2.length];
        int i = 0;
        for (Character each : arr1) {              //int[] arr1={1,2,3,4,5};
            arr3[i] = each;
            i++;
        }
        for (Character each : arr2) {                //int[] arr2={6,7,8,9};
            arr3[i] = each;
            i++;
        }
        return arr3;


    }
    public static String[] combination2Arrays(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        int i = 0;
        for (String each : arr1) {              //int[] arr1={1,2,3,4,5};
            arr3[i] = each;
            i++;
        }
        for (String each : arr2) {                //int[] arr2={6,7,8,9};
            arr3[i] = each;
            i++;
        }
        return arr3;


    }

    //A method to find the max num in an Array
    public static int maxNum(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (max < each) {
                max = each;
            }
        }
        return max;
    }
    public static Integer maxNum(Integer[] arr) {
        Integer max = arr[0];
        for (Integer each : arr) {
            if (max < each) {
                max = each;
            }
        }
        return max;
    }
    public static double maxNum(double[] arr) {
        double max = arr[0];
        for (double each : arr) {
            if (max < each) {
                max = each;
            }
        }
        return max;
    }
    public static Double maxNum(Double[] arr) {
        Double max = arr[0];
        for (Double each : arr) {
            if (max < each) {
                max = each;
            }
        }
        return max;
    }

    //A method to find Min number in an Array
    public static int minNum(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (min > each) {
                min = each;
            }
        }
        return min;
    }
    public static Integer minNum(Integer[] arr) {
        Integer min = arr[0];
        for (Integer each : arr) {
            if (min > each) {
                min = each;
            }
        }
        return min;
    }
    public static double minNum(double[] arr) {
        double min = arr[0];
        for (double each : arr) {
            if (min > each) {
                min = each;
            }
        }
        return min;
    }
    public static Double minNum(Double[] arr) {
        Double min = arr[0];
        for (Double each : arr) {
            if (min > each) {
                min = each;
            }
        }
        return min;
    }


}
