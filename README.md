# Binary Search Implementation in Java

## Overview
This Java program demonstrates a binary search algorithm to find a specific PIN code within a sorted array of data pins.

## Code Explanation

### Main Components
1. **Main Class**: Contains the `main` method which serves as the program entry point
2. **pinSearch Method**: Implements the binary search algorithm

### Key Features
- **Data Initialization**: An array of 10 PIN codes is initialized
- **Sorting**: The array is sorted using `Arrays.sort()` to prepare for binary search
- **Search Execution**: The program searches for the PIN `9077` using binary search
- **Result Display**: Prints the sorted array and the position of the found item (or a "not found" message)

### Binary Search Algorithm
The `pinSearch` method implements binary search with the following steps:
1. Initialize pointers for the first and last indices
2. Calculate the middle index
3. Compare the middle element with the search item
4. Adjust search range based on the comparison
5. Repeat until the item is found or the search range is exhausted

### Important Note
The code adds 1 to the returned index (`return midIndex + 1`) to convert from zero-based indexing (used by Java arrays) to one-based positioning (more intuitive for users).

## Potential Issue
One of the PINs is written as `0123`, which Java will interpret as an octal (base-8) literal because it starts with 0. This will be converted to decimal value 83 (0*8³ + 1*8² + 2*8¹ + 3*8⁰ = 0 + 64 + 16 + 3 = 83). If this is unintended, remove the leading zero.

## Usage
To use this code with different search values:
1. Modify the `searchItem` variable with the desired PIN
2. Ensure the `dataPins` array contains the PINs you want to search through

## Output
The program will output:
- The sorted array of PINs
- The position of the search item in the sorted array (if found)
- A "not found" message if the item doesn't exist in the array

This implementation efficiently searches through sorted data with O(log n) time complexity.
