package TestSort;

import SortMe.Sort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest extends Sort {
   private static int array[] = {6, 9, 1, 4, 5};
    private static int sortArray[] = {1, 4, 5, 6, 9};

    @Test
    public void execute(){
        assertArrayEquals(sortArray, sort(array));
    }

    @Test
    public void execute2(){
        int [] javaSort = array;
        Arrays.sort(javaSort);
        assertArrayEquals(javaSort, sort(array));
    }
}
