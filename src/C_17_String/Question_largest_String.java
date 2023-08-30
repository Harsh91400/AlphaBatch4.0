package C_17_String;

public class Question_largest_String {
    public static void main(String[] args) {
        String fruits[]={"apple","banana","mango","orange"};

        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest=fruits[i];
                largest=fruits[i];
              }
        }
        System.out.println(largest);
    }
}
