# Counting-Problem
CodeChef Difficulty 1065 Problem

Counting Problem
You are given an array A = [A₁, A₂, ..., Aₙ].

Determine if it's possible to partition A into two non-empty subsequences S₁ and S₂ such that:

scss
Copy
Edit
sum(S₁) × sum(S₂) is odd
Where:

sum(S₁) is the sum of the elements in S₁

sum(S₂) is the sum of the elements in S₂

Constraints
S₁ and S₂ must be non-empty

Each element of A must appear in exactly one of S₁ or S₂

S₁ and S₂ must be disjoint in terms of indices

Input Format
The first line contains a single integer T — the number of test cases.

For each test case:

The first line contains a single integer N — the number of elements in the array.

The second line contains N space-separated integers A₁, A₂, ..., Aₙ.

Output Format
For each test case, print a single line:

YES if such a partition exists

NO otherwise

Output is case-insensitive. For example, YES, yes, and Yes are all acceptable.
