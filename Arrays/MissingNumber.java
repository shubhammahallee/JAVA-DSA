    public static void missingNumber(int[] arr) {
        int n = arr.length;
        int sum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }
        System.out.println("Missing Number: " + (sum - arrSum));
    }
