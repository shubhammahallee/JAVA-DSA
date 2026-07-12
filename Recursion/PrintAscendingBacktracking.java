public static void printAscendingBacktracking(int n) {
    if (n == 0)
        return;
    printAscendingBacktracking(n - 1);
    System.out.print(n + " ");
}
