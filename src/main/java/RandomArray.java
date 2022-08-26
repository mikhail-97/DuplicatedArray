public class RandomArray {
    public static void main(String[] args) {
        double[] array = new double[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
            if(min > array[i]) {
                min = array[i];
            }
            avg += array[i]/array.length;
        }

        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
        System.out.println("Average value = " + avg);
    }
}
