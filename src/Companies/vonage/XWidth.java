package Companies.vonage;

import java.util.PriorityQueue;

public class XWidth {
    public static void main(String[] args) {

    }

    public int solution(int[] X, int[] Y) {
        if (X.length != Y.length) return -1;
        PriorityQueue<Integer> treeXCoordinateQueue = new PriorityQueue();

        for (int num : X) {
            treeXCoordinateQueue.add(num);
        }

        int widestPossibleVerticalPath = 1;

        int prev = treeXCoordinateQueue.poll();
        while (!treeXCoordinateQueue.isEmpty()) {
            int curr = treeXCoordinateQueue.poll();
            widestPossibleVerticalPath = Math.max(widestPossibleVerticalPath, curr - prev);
            prev = curr;
        }

        return widestPossibleVerticalPath;
    }
}
