package DP;

//You are climbing a stair case. It takes n steps to reach to the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


//假设梯子有n层，那么如何爬到第n层呢，因为每次只能怕1或2步，那么爬到第n层的方法要么是从第n-1层一步上来的，要不就是从n-2层2步上来的，所以递推公式非常容易的就得出了：
//
//dp[n] = dp[n-1] + dp[n-2]
//1 1 2 3 5

public class ClimbStairs {
	
	public static void main(String[] args){
		System.out.println(climbStairs(5));
	}
	
	public static int climbStairs(int n){
		int total = 0;
		if(n == 1) total = 1;
		if(n == 2) total = 2;
		int cur = 2;
		int prev = 1;
		int i = 3;
		while(i <= n){
			total = cur + prev;
			prev = cur;
			cur = total;
			i++;
		}
		return total;
		
	}

}
