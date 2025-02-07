
# Explanation

We go through the entire array linearly, checking each element to determine if it matches the number we are searching for. If there is a match, we increment a counter. This will return the number of matches found in the array for the number being compared.

This approach is the least optimal since it has a time complexity of O(n), as we are checking each element individually, which is not efficient for large arrays.
