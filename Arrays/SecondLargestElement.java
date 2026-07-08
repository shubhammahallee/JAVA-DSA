public static void secondMaxOfArray(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must have at least 2 elements");
            return;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second Max: " + secondMax);
    }
