Problem Statement

Find the lexicographically smallest permutation P of integers from 1 to N such that:
1. It should not be strictly increasing i. e. there must be an i such that P[i] < P[i-1] for 2 <= i <= N
2. Sum of every three consecutive elements should be divisible by 3.



Sample Input:
4

Sample Output:
1 3 2 4

Explanation:
Some permutations of 4 integers are:
1. [1, 2, 3, 4] - not valid since it is strictly increasing
2. [1, 3, 4, 2] - not valid since sum of [1, 3, 4] is not divisible by 3
3. [4, 3, 2, 1] - not valid because its not lexicographically smallest
