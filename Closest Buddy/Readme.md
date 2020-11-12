You are given an integer array A of size N. For each index i (1 <= i <= N), you need to find an index j, such that gcd(A[i], A[j]) = 1, and abs(i-j) is the minimum possible. If there are two values of j satisfying the condition, report the minimum one. If there is no possible value of j, report -1.

Note: gcd(x, y) represents the the greatest common divisor of integers x and y, while abs(i- j) represents the absolute value of (i-j). Eg: gcd(6, 15) = 3 ; abs(6-15) = 9.

See sample for better understanding.
Input
The first line of the input contains a single integer N.
The next line of the input contains N space separated integers, the elements of the array A.

Constraints
1 <= N <= 200000
1 <= A[i] <= 50
Output
Output N space separated integers, the value of j corresponding to each index. If there is no possible value of j, report -1 instead.
