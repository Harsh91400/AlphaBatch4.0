package LeetCode;

import java.util.Stack;

public class Valid_parantheses {
    static boolean isValid(String s){
        Stack<Character> st= new Stack();
        for(char  c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.add(c);
            }
            else{
                if(st.isEmpty()) return false;
                if(c==']' && st.peek()!='[') return false;
                if(c=='}' && st.peek()!='{') return false;
                if(c==')' && st.peek()!='(') return false;

                st.pop();
            }

        }
        return st.isEmpty();

    }
    public static void main(String[] args) {
        String s="[{()}]";
        System.out.println(isValid(s));

    }
}
