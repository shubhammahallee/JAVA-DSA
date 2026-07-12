public static void printAscending(int current, int n) {
    if (current > n)
        return;
    System.out.print(current + " ");
    printAscending(current + 1, n);
}
