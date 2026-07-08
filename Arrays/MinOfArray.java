 public static void minOfArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum of Array: " + min);
    }
