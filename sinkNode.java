public class sinkNode {
    public static void main(String[] args) {
        int arr[][] = {{0,1,1,0,1},{0,0,0,1,0},{0,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0}};
        int count = 0;
        for(int i=0;i<5;i++){
            boolean is = true;
            for(int j=0;j<5;j++){
                if(arr[i][j]!=0){is = false;break;} 
            }
            if(is==true){
                count++;
                System.out.println((char)(65+i));//Explicit type casting from integer to char "(char)(65+i)"
            } 
        }
        System.out.print(count);
        
    }
}
