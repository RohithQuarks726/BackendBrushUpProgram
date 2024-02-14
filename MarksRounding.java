public class MarksRounding {
    public int[] roundMarks(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int nextI = ((arr[i] + 4) / 5) * 5;
            if (arr[i] > 35 && (nextI - arr[i]) < 3) {
                newArr[i] = nextI;
            } else {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = { 47, 58, 32, 60, 79 };
        MarksRounding obj = new MarksRounding();
        int[] newMarks = obj.roundMarks(arr);
        for (int i : newMarks) {
            System.out.println(i);
        }
    }
}
