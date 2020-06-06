public class SumOddRange {
        private static boolean isOdd(int number) {
            return (number > 0) && (number % 2 != 0);
        }
        public static int sumOdd(int start, int end) {
            if (end < start || start < 0) {
                return -1;
            }
            int sum = 0;
            for (int i=start; i<=end;i++) {
                sum += (isOdd(i)) ? i : 0;
            }
            return sum;
        }
}
