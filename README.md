# knorex
Solutions for 4 questions given as coding test by the company Knorex

Question 1:
Given a signed 32-bit integer x, return x with its digits
reversed.
§ Cannot convert x to a string and reverse the string.
§ -231 <= x <= 231 – 1
§ Examples:
o x=123, return 321
o x=-123, return -321
o x=120, return 21
Sample Java method:
public int reverseNumber(int x){
//write your code here
}
Question 2 :
Use integer a, b, n to create the following series:
(a + 20.b), (a + 20.b + 21.b), ………, (a + 20.b + 21.b + 2n-1.b)
• You are given a, b, n, print the series corresponding to the
given a, b, n values as a single line of n space-separated
integers.
• 0 <= a,b <= 50
• 1 <= n <= 15
• Examples:
o When a=0, b=2, n=10, should print: 2 6 14 30 62 126 254
510 1022 2046. Numbers in detail:
§ S0 = 0 + 1.2 = 2
§ S1 = 0 + 1.2 + 2.2 = 6
§ S2 = 0 + 1.2 + 2.2 + 4.2 = 14
§ … and so on
o When a=5, b=3, n=5, should print: 8 14 26 50 98. Numbers
in detail:
§ S0 = 5 + 1.3 = 8
§ S1 = 5 + 1.3 + 2.3 = 14
§ S2 = 5 + 1.3 + 2.3 + 4.3 = 26
§ S3 = 5 + 1.3 + 2.3 + 4.3 + 8.3 = 50
§ S4 = 5 + 1.3 + 2.3 + 4.3 + 8.3 + 16.3 = 98
Sample Java method:
public void printTheSequence(int a, int b, int n){
//write your code here
}
Question 3 :
Given an array of integers arr[], and a number t, check whether
there exist two elements in arr[] whose sum is exactly t.
§ -1000 <= t, elements of arr[] <= 1000
§ -10000 <= arr.length <= 10000
§ Examples:
o arr={0, -1, 2, -3, 1}, t=-2, return true. Explanation:
There are 2 elements 1 and -3 which sum is -2.
o arr={1, -2, 1, 0, 5}, t=0, return false. Explanation:
There is no 2 elements of arr which sum is 0.
Sample Java method:
public boolean isThereASum(int[] arr, int t){
//write your code here
}
Question 4 :
A jail has several prisoners and several treats to pass out to
them. Their jailer decides the fairest way to divide the treats is
to seat the prisoners around a circular table in sequentially
numbered chairs. A chair number will be drawn from a hat.
Beginning with the prisoner in that chair, one candy will be
handed to each prisoner sequentially around the table until all
have been distributed.
The jailer is playing a little joke, though. The last piece of
candy looks like all the others, but it tastes awful. Determine
the chair number occupied by the prisoner who will receive that
candy.
For example, there are 4 prisoners, 6 pieces of candy. The
prisoners arrange themselves in seats numbered 1 to 4. Let’s
suppose 2 is drawn from the hat. Prisoners receive candy at
positions 2,3,4,1,2,3. The prisoner to be warned sits in chair
number 3.
Let’s n is the number of prisoners, m is the number of sweets, s
is the chair number to begin passing out sweets from, printout the
chair number of the prisoner to warn.
§ 1 <= n <= 109
§ 1 <= m <= 109
§ 1 <= s <= n
Examples:
§ n=5, m=2, s=1, should print: 2. Explanation: Start at seat
number 1. The prisoners in seats numbered 1 and 2 get sweets.
Warn prisoner 2.
§ n=5, m=2, s=2, should print: 3. Explanation: Start at seat 2
so prisoners in seats 2 and 3 get sweets. Warn prisoner 3.
Sample Java method:
public void printPrisonerToWarn(int n, int m, int s){
//write your code here
}
