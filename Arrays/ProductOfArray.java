 public static void productOfArray(int[] arr) {
        long product = 1; // Changed to long to prevent overflow
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        System.out.println("Product of Array: " + product);
    }

