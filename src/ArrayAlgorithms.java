public class ArrayAlgorithms
{
    /** Prints each String in wordList, on its own line, followed by “!”.
     *  Does NOT mutate (modify) wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings; does not get modified
     */
    public static void printExclamation(String[] wordList) {
        for(int i = 0; i < wordList.length; i++) {
            System.out.println(wordList[i] + "!");
        }
    }

    /** Adds a “!” to the end of each String in wordList (does not print).
     *  DOES mutate (modify) original wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, modified by method
     */
    public static void addExclamation(String[] wordList) {
        for(int i = 0; i < wordList.length; i++) {
            wordList[i] = wordList[i] + "!";
        }
    }

    /** Returns the sum of all values in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find sum
     *  @return  the sum of all numbers in the list
     */
    public static int sum(int[] numList) {
        int sum = 0;
        for(int i = 0; i < numList.length; i++) {
            sum += numList[i];
        }
        return sum;
    }

    /** Returns the average of all values in numList, as a double.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find average
     *  @return  the average of all numbers in the list
     *
     *  Use your sum method for this! (don’t rewrite that logic!)
     */
    public static double average(int[] numList) {
        return (double) sum(numList) / numList.length;
    }

    /** Returns the value in numList that represents the minimum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find minimum
     *  @return  the minimum value in the array
     */
    public static int minimum(int[] numList) {
        int lowest = numList[0];

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] < lowest) {
                lowest = numList[i];
            }
        }
        return lowest;
    }

    /** Returns the value in numList that represents the maximum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find maximum
     *  @return  the maximum value in the array
     */
    public static int maximum(int[] numList) {
        int greatest = numList[0];

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] > greatest) {
                greatest = numList[i];
            }
        }
        return greatest;
    }

    /** Multiplies each number in numList by multiplier.
     *  DOES mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers, modified by method
     *  @param multiplier  number to multiply each element in numList
     */
    public static void multiplyBy(int[] numList, int multiplier) {
        for (int i = 0; i < numList.length; i++) {
            numList[i] *= multiplier;
        }
    }

    /** Returns a NEW array containing the squares of the elements in the original
     *  numList array, in the same position.
     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers to be squared
     *  @return  new array containing squares of the values in numList
     */
    public static int[] squares(int[] numList) {
        int[] newNumL = new int[numList.length];

        for(int i = 0; i < newNumL.length; i++) {
            newNumL[i] = (int) Math.pow(numList[i] , 2);
        }
        return newNumL;
    }

    /** Switches each boolean value in boolList to its opposite value; true values
     *  becomes false, and false values become true.
     *  DOES mutate (modify) original boolList.
     *  PRECONDITION: boolList.length > 0
     *
     *  @param boolList  original array of booleans, modified by method
     */
    public static void flipBool(boolean[] boolList) {
        for (int i = 0; i < boolList.length; i++) {
            boolList[i] = !boolList[i];
        }
    }

    /** Returns a String representing the array of ints as a printable String,
     *  including open and closing brackets, with values separated by commas.
     *  This method should function identically to Arrays.toString()!

     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of ints to be represented in String form
     */
    public static String customToString(int[] numList) {
        String array = "[";

        for (int i = 0; i < numList.length - 1; i++) {
            array += numList[i] + ", ";
        }
        array += numList[numList.length - 1] + "]";

        return array;
    }

    /** Returns the length of the longest String(s) in an array of Strings.
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @return  length of the longest String in the array
     */
    public static int longestString(String[] stringList) {
        int longest = stringList[0].length();
        for (String str : stringList) {
            if (str.length() > longest) {
                longest = str.length();
            }
        }
        return longest;
    }

    /** Changes all words in an array of words to uppercase.
     *  DOES mutate (modify) original wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, modified by method
     */
    public static void makeUppercase(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            wordList[i] = wordList[i].toUpperCase();
        }
    }

}
