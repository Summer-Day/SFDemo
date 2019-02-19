package sz;

public class SzOne {
    public static void main(String[] arg) {
        int list[] = {1, 3, 4, 6, 23};
        int result = -1;
        addition(list, result);
    }

    public static void addition(int list[], int sum) {
        int index = 0;
        int last = list.length-1;
        while (index != last) {
            int s = list[index] + list[last];
            if (s > sum) {
                last--;
            } else if (s < sum) {
                index++;
            } else if (s == sum) {
                System.out.print(list[index] + " + " + list[last] + " = " + (list[index] + list[last]));
                return;
            }
        }
        System.out.print("数组内找不到两个数相加等于" + sum + "的两个数");
    }

}
