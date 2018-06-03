

public static void qSort(int[] arr, int head, int tail) {

        //base case,判断头pointer和尾pointer之间是否相遇或过界
        if (head >= tail || arr == null || arr.length <= 1) {
            return;
        }

        //因为每次都从上一次的头和尾开始移动
        int i = head, j = tail, pivot = arr[(head + tail) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                ++i;
            }
            while (arr[j] > pivot) {
                --j;
            }
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                ++i;
                --j;
            } else if (i == j) {
                ++i;
            }
        }
        qSort(arr, head, j);
        qSort(arr, i, tail);
    }