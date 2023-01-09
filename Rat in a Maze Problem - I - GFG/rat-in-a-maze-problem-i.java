//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix

class Solution {

    public static ArrayList<String> findPath(int[][] m, int n) {

        // Your code here

        ArrayList<String> al = new ArrayList<>();

        if(m[0][0]==0 || m[n-1][n-1]==0){

            al.add("-1");

            return al;

        }    

        solve(m, 0, 0, n,"", al);

        

        return al;

    }

    

    static void solve(int[][] m, int i, int j, int n, String str, ArrayList<String> al){

        if(i==n-1 && j==n-1){

            al.add(str);

            return;

        }

        if(i==n || j==n || i==-1 || j==-1 || m[i][j]==0)

            return;

        

        //it is sure that cureent m[i][j]=1

        m[i][j] = 0;       //to indicate it is visited and should not visited again

        

        solve(m, i+1, j, n, str+"D", al);   //Down

        solve(m, i-1, j, n, str+"U", al);   //Up

        solve(m, i, j-1, n, str+"L", al);   //Left

        solve(m, i, j+1, n, str+"R", al);   //Right

        

        m[i][j] = 1;         //reinstantiate to its original state

    }

}


// package Lec28;

// import java.util.Scanner;

// public class Rat_Chases{
//     static boolean f=false;
// 	public static void main(String[] args) {
// 		// TODO Auto-generated method stub
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		int m = sc.nextInt();
// 		char[][] maze = new char[n][m];
// 		for (int i = 0; i < maze.length; i++) {
// 			String s = sc.next();
// 			for (int j = 0; j < s.length(); j++) {
// 				maze[i][j] = s.charAt(j);

// 			}

// 		}

// 		int[][] ans = new int[n][m];
// 		PrintPath(maze, 0, 0, ans);
//         if(f==false){
//             System.out.println("NO PATH FOUND");
//         }

// 	}

// 	public static void PrintPath(char[][] maze, int cr, int cc, int[][] ans) {
// 		// TODO Auto-generated method stub
// 		if (cc == maze[0].length - 1 && cr == maze.length - 1) {
// 			if (maze[cr][cc] == 'O') {
//                 f=true;
// 				ans[cr][cc] = 1;
// 				display(ans);
// 				ans[cr][cc] = 0;
// 			}
// 			return;
// 		}

// 		if (cc < 0 || cc >= maze[0].length || cr < 0 || cr >= maze.length || maze[cr][cc] == 'X') {
// 			return;
// 		}

// 		int r[] = { 0, -1, 0, 1 };
// 		int c[] = { 1, 0, -1, 0 };

// //		PrintPath(maze, cr, cc + 1, ans);// right
// //		PrintPath(maze, cr - 1, cc, ans);// up
// //		PrintPath(maze, cr, cc - 1, ans);// left
// //		PrintPath(maze, cr + 1, cc, ans);// down
// 		 maze[cr][cc] = 'X';
// 		ans[cr][cc] = 1;
// 		for (int i = 0; i < c.length; i++) {
// 			PrintPath(maze, cr + r[i], cc + c[i], ans);

// 		}
// 		 maze[cr][cc] = 'O';
// 		ans[cr][cc] = 0;

// 	}

// 	public static void display(int[][] ans) {
// 		// TODO Auto-generated method stub
// 		for (int i = 0; i < ans.length; i++) {
// 			for (int j = 0; j < ans[0].length; j++) {
// 				System.out.print(ans[i][j] + " ");
// 			}
// 			System.out.println();

// 		}

// 	}

// }
