// Java program to find celebrity

import java.util.Stack;

class StackImplement {

   
    static int celebrityStack(int[][] mat) {
        int n = mat.length;
        Stack<Integer> st = new Stack<>();

       
        for (int i = 0; i < n; i++)
            st.push(i);

       
        while (st.size() > 1) {

            int a = st.peek();
            st.pop();

            int b = st.peek();
            st.pop();

       
            if (mat[a][b] != 0) {
                st.push(b);
            }
            else {
                st.push(a);
            }
        }

      
        int c = st.peek();
        st.pop();

       
        for (int i = 0; i < n; i++) {
            if(i == c) continue;

         
            if (mat[c][i] != 0 || mat[i][c] == 0)
                return -1;
        }

        return c;
    }

    public static void main(String[] args) {
        int[][] mat = { { 0, 1, 0 },
                        { 0, 0, 0 },
                        { 0, 1, 0 } };
        System.out.println(celebrityStack(mat));
    }
}