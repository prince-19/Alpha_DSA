/*  Q. Given a route containing 4 directions (E, W, N, S), find the 
 shortest path to reach destination for "W N E E N E S E N N N" */



public class ShortestPath {
    public static float getShortestPath(String path){
        int x = 0, y = 0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //North
            if(dir == 'N'){
                y++;
            }
            //South
            else if(dir == 'S'){
                y--;
            }
            //East
            else if(dir == 'E'){
                x++;
            }
            //West
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);

    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
