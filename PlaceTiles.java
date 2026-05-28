public class PlaceTiles {
    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        int vertPlacement = placeTiles(n - m, m);
        int horiPlacement = placeTiles(n - 1, m);
        return vertPlacement + horiPlacement;
    }
    public static void main(String args[]){
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
    }
}
