package CP;

public class characterCode {
    public static void main(String[] args) {
        char ch[]={'Q','A','Q','A','Q','A'};
        int n=ch.length;
        int count=0;
//        int q=0;
        for(int i=0;i<n;i++){
            if(ch[i]=='Q') count++;
            else{
                count=Math.max(0,count-1);
            }
        }
        if(count==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
