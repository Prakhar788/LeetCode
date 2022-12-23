// class Solution {
//     public boolean isValid(String s) {
// 	Stack<Character> stack = new Stack<Character>();
// 	for (char c : s.toCharArray()) {
// 		if (c == '(')
// 			stack.push(')');
// 		else if (c == '{')
// 			stack.push('}');
// 		else if (c == '[')
// 			stack.push(']');
// 		else if (stack.isEmpty() || stack.pop() != c)
// 			return false;
// 	}
// 	return stack.isEmpty();
// }
// }
class Solution {
    public boolean isValid(String s) {
     Stack<Character> st =new Stack<>();
     for(char ch:s.toCharArray()){
        if(ch=='('||ch=='['||ch=='{'){
            st.push(ch);
        }
        else if(ch==')'||ch==']'||ch=='}'){
            if(st.isEmpty()){
                return false;
            }
            char c=st.pop();
            if((ch==')'&& c!='(')||
            (ch==']'&& c!='[')||
            (ch=='}'&& c!='{')){
                return false;
            }


        }
     }
     return st.isEmpty();
    }
}
