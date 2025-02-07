
# Explanation

The occurrences function is responsible for calculating how many times a specific number appears in a sorted array. To do this, it calls the binarySearch method twice: once to find the first occurrence of the number and once to find the last occurrence. In this way, it calculates the difference between both indices to determine how many times the number is repeated.

The binarySearch method performs a binary search in the array. It uses an additional parameter called findFirst, which indicates whether the first or last occurrence of the number is searched. If findFirst is true, the search focuses on the left half of the array after finding the target, ensuring that the first occurrence is found. If findFirst is false, the search continues on the right half to find the last occurrence. The time complexity of this approach is O(log n), which makes this solution very efficient even for large arrays.