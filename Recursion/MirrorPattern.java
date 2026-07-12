public static void printMirrorPattern(int n) {
    if (n == 1) {
        System.out.print("1 ");
        return;
    }
    System.out.print(n + " ");
    printMirrorPattern(n - 1);
    System.out.print(n + " ");
}
