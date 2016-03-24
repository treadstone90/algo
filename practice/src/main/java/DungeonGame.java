/**
 * Created by karthik on 3/5/16.
 */
public class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        int cache[][] = new int[dungeon.length][dungeon[0].length];
        int[][] successor = new int[][]{{0, 1}, {1, 0}};

        for(int i=dungeon.length;i>=0;i--) {
            for(int j=dungeon[0].length;j>=0;j--) {
                int max_neighbor = 1;
                for(int k=0;k<successor.length;k++) {
                    int x_delta = j + successor[k][1];
                    int y_delta = i + successor[k][0];

                    if(x_delta >=0 && x_delta < dungeon[0].length && y_delta >=0 && y_delta < dungeon.length) {
                        max_neighbor = Math.min(cache[y_delta][x_delta], max_neighbor);
                    }
                }

                if(dungeon[i][j] >= 0) {
                    cache[i][j] = 1;
                } else {
                    cache[i][j] = max_neighbor + -(dungeon[i][j]);
                }
            }
        }
        return cache[0][0];
    }
}
