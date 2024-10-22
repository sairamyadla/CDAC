public class Quadrant {
   public static void main(String[] args) {
        int x=3,y=-2;
        if(x>0 && y>0){
            System.out.println("Quadrant 1");
        }else if(x<0 && y>0){
            System.out.println("Quadrant 2");
        }else if(x<0 && y<0){
            System.out.println("Quadrant 3");
        }else if(x>0 && y<0){
            System.out.println("Quadrant 4");
        }else if(x==0 && y==0){
            System.out.println("Origin");
        }else if(x!=0 && y==0){
            System.out.println("X-axis");
        }else if(x==0 && y!=0){
            System.out.println("Y-axis");
        }
   } 
}
