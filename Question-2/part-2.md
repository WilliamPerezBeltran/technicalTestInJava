## Explanation to solve the problem without using the Fibonacci sequence

To solve this problem without using the Fibonacci sequence explicitly, we can use an iterative approach that builds on previous solutions.

When climbing a staircase with 10 steps, where we can take either 1 or 2 steps, the key observation is that to reach step n, there are only two possibilities: from the previous step (1 step) or from two steps back (2 steps). Therefore, the number of ways to reach step n is the sum of ways to reach steps n-1 and n-2.

We start with base values: `formas(1) = 1` (1 way to reach the first step) and `formas(2) = 2` (2 ways to reach the second step). From there, we iteratively calculate the number of ways to reach each subsequent step, using the formula `formas(n) = formas(n-1) + formas(n-2)`.

## Complete Process

1. Initialize `formas(1) = 1` and `formas(2) = 2`.
2. For each step from 3 to 10, calculate `formas(n) = formas(n-1) + formas(n-2)`.
3. The final value of `formas(10)` gives the total number of unique ways to reach the top.

Step-by-step results:

- n = 1: 1 way
- n = 2: 2 ways
- n = 3: 3 ways
- n = 4: 5 ways
- n = 5: 8 ways
- n = 6: 13 ways
- n = 7: 21 ways
- n = 8: 34 ways
- n = 9: 55 ways
- n = 10: 89 ways

This shows how the number of ways to climb the staircase increases as the number of steps increases.
