package Mario;

/**
 * Issue
 * Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.
 * <p>
 * The pipes connecting your level's stages together need to be fixed before you receive any more complaints.
 * Each pipe should be connecting, since the levels ascend, you can assume every number in the sequence after the first
 * index will be greater than the previous and that there will be no duplicates.
 * <p>
 * Task
 * Given the a list of numbers, return the list so that the values increment by 1 for each index up to the maximum value.
 * <p>
 * Example
 * Input: 1,3,5,6,7,8
 * <p>
 * Output: 1,2,3,4,5,6,7,8
 */
public class Main {
    public static void main(String[] args) {
        int[] arrOne = {1, 2, 3, 12};
        int[] arrTwo = {-1, 4};
        pipeFix(arrTwo);
    }

    public static int[] pipeFix(int[] numbers) {
        int counter = 0;
        for (int i = numbers[0]; i <= numbers[numbers.length - 1]; i++) {
            counter++;
        }
        int[] finished = new int[counter];
        {

        for(int i = 0; i < counter; i++) {
            finished[i] = numbers[0]++;
        }


        }
        return finished;
    }
}
