package C_17_String;

public class Question_Find_Sortest_Path {
    public static float findSortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dic = path.charAt(i);
            if(dic=='E'){
                x++;
            }
            else if(dic=='W'){
                x--;
            }
            else if(dic=='N'){
                y++;
            }
            else{
                y--;
            }
        }
//        System.out.println("Current status is : ("+x+","+y+")");
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(findSortestPath(path));
    }
}
