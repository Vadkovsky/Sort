public class sort {
    public static int[] sort(int[] unsort) {
        for (int i = 0; i < unsort.length; i++) {
            int min = i;
            boolean evil = false;
            for (int j=i+1; j < unsort.length; j++) {
                if (unsort[min] > unsort[j]) {
                    min = j;
                    evil = true;
                }
            }
            if (evil == true) {
                int temp = unsort[min];
                unsort[min] = unsort[i];
                unsort[i] = temp;
            }
        }
        return unsort;
    }
    public static void main(String[] args) {
        int array[] = {6, 9, 1, 4, 5};
        for (int i = 0;  i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        array = sort(array);
        for (int i = 0;  i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
