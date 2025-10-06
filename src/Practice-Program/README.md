# 🚀 Java Programming Practice - Basic to Advanced

A comprehensive collection of Java programming questions organized by topic and difficulty level. Perfect for interview preparation and mastering Java concepts.

## 📚 Table of Contents
- [String Programming Questions](#-string-programming-questions)
- [OOP Programming Questions](#-oop-programming-questions)
- [Collections Framework Questions](#-collections-framework-questions)
- [Exception Handling Questions](#-exception-handling-questions)
- [Control Structures & Arrays Questions](#-control-structures--arrays-questions)
- [Project-Level Integration Questions](#-project-level-integration-questions)
- [Algorithm & Data Structure Questions](#-algorithm--data-structure-questions)
- [Testing & Debugging Questions](#-testing--debugging-questions)
- [Practice Plan](#-practice-plan)
- [Problem Solving Framework](#-problem-solving-framework)

## 🎯 String Programming Questions

### Basic Level
1. **Reverse a String** - Write a program to reverse a string without using StringBuilder
2. **Check Palindrome** - Check if a string is palindrome (reads same forwards and backwards)
3. **Count Vowels and Consonants** - Count number of vowels and consonants in a string
4. **Find Duplicate Characters** - Find all duplicate characters in a string

### Intermediate Level
5. **First Non-Repeated Character** - Find first non-repeated character in string
6. **Check Anagram** - Check if two strings are anagrams of each other
7. **String Compression** - Compress string: "aabcccccaaa" → "a2b1c5a3"
8. **Longest Substring Without Repeating Characters** - Find length of longest substring without repeating characters

### Advanced Level
9. **String Permutations** - Generate all permutations of a string
10. **Regular Expression Parser** - Implement simple regex parser with . and * support
11. **String to Integer (atoi)** - Implement atoi function to convert string to integer
12. **Minimum Window Substring** - Find minimum window in string that contains all characters of another string

## 🏗️ OOP Programming Questions

### Basic Level
13. **Bank Account System** - Create BankAccount class with account operations and proper encapsulation
14. **Student Management** - Create Student class with constructor overloading and methods

### Intermediate Level
15. **Shape Hierarchy** - Create abstract Shape class with Circle, Rectangle, Triangle implementations
16. **Library Management** - Create Library system with Borrowable interface and relationships

### Advanced Level
17. **Observer Pattern Implementation** - Implement Observer pattern with Subject and Observer interfaces
18. **Factory Pattern for Vehicle Creation** - Implement Factory pattern for Vehicle creation

## 📦 Collections Framework Questions

### Basic Level
19. **Find Maximum Element** - Find maximum element in ArrayList without using Collections.max()
20. **Remove Duplicates** - Remove duplicates from ArrayList while maintaining order
21. **Count Frequency** - Count frequency of each element in list using HashMap

### Intermediate Level
22. **Sort HashMap by Value** - Sort HashMap by values in descending order
23. **Find Common Elements** - Find common elements between two arrays
24. **LRU Cache Implementation** - Implement LRU Cache using LinkedHashMap

### Advanced Level
25. **Custom HashMap Implementation** - Implement your own HashMap with put(), get(), remove() methods
26. **Merge K Sorted Lists** - Merge K sorted ArrayLists into one sorted ArrayList
27. **Time Based Key-Value Store** - Implement time-based key-value store with timestamp support

## ⚠️ Exception Handling Questions

### Basic Level
28. **Safe Division Calculator** - Create calculator that handles division by zero and invalid number format
29. **File Reader with Exception Handling** - Read file with proper exception handling using try-with-resources

### Intermediate Level
30. **Custom Bank Exception** - Create custom exceptions for banking operations
31. **Retry Mechanism** - Implement retry mechanism with exponential backoff

### Advanced Level
32. **Exception Chain Handler** - Create exception handler that chains exceptions properly
33. **Circuit Breaker Pattern** - Implement Circuit Breaker pattern with OPEN, CLOSED, HALF_OPEN states

## 🔄 Control Structures & Arrays Questions

### Basic Level
34. **Fibonacci Series** - Generate Fibonacci series up to n terms
35. **Prime Number Check** - Check if number is prime and find all primes up to N
36. **Array Rotation** - Rotate array by k positions

### Intermediate Level
37. **Stock Buy Sell** - Find maximum profit from stock prices (buy and sell)
38. **Spiral Matrix** - Print matrix in spiral order
39. **Trapping Rain Water** - Calculate how much water can be trapped between bars

### Advanced Level
40. **N-Queens Problem** - Solve N-Queens problem (place N queens on N×N chessboard)
41. **Sudoku Solver** - Implement Sudoku solver using backtracking

## 🎯 Project-Level Integration Questions

### Intermediate Level
42. **Student Management System** - Complete system with CRUD operations, search, sort, and file handling
43. **Library Management System** - Library system with book inventory, member management, and fine calculation

### Advanced Level
44. **E-commerce Shopping Cart** - Complete e-commerce system with catalog, cart, payment processing
45. **Multi-threaded Bank ATM System** - Bank ATM system with thread synchronization and transaction logging

## 📊 Algorithm & Data Structure Questions

### Basic Level
46. **Two Sum** - Find two numbers that add up to target
47. **Valid Parentheses** - Check if string has valid parentheses order
48. **Merge Two Sorted Arrays** - Merge two sorted arrays into one sorted array

### Intermediate Level
49. **Binary Search Implementation** - Implement binary search for sorted array
50. **Linked List Cycle Detection** - Detect if linked list has cycle (Floyd's Cycle Detection)
51. **Implement Stack using Arrays** - Implement stack data structure using arrays

### Advanced Level
52. **Implement Trie (Prefix Tree)** - Implement Trie data structure for efficient word search
53. **Course Schedule (Topological Sort)** - Check if course schedule is possible (no cycles in graph)
54. **Word Break Problem** - Check if string can be segmented into dictionary words

## 🧪 Testing & Debugging Questions

55. **Unit Test for Calculator** - Write JUnit tests for calculator covering all edge cases
56. **Debug Memory Leak** - Identify and fix memory leak in given code
57. **Performance Optimization** - Optimize slow-performing string concatenation code

## 📝 Practice Plan

### Week 1-2: Basics Mastery
- **Complete all Basic level questions** (1-4, 13-14, 19-21, 28-29, 34-36, 46-48)
- **Focus on**: Strings, Arrays, and OOP basics
- **Daily Goal**: 3-5 questions

### Week 3-4: Intermediate Level
- **Solve Intermediate level questions** (5-8, 15-16, 22-24, 30-31, 37-39, 49-51)
- **Work on**: Collections and Algorithms
- **Start**: Small projects

### Week 5-6: Advanced Concepts
- **Tackle Advanced level questions** (9-12, 17-18, 25-27, 32-33, 40-41, 52-54)
- **Implement**: Design patterns
- **Build**: Complete systems

### Week 7-8: Integration & Review
- **Solve project-level questions** (42-45)
- **Practice**: Debugging and optimization (55-57)
- **Review**: All concepts

## 🔧 Problem Solving Framework

### Step-by-Step Approach:
1. **Understand the Problem** - Read carefully and clarify requirements
2. **Design Solution** - Choose appropriate data structures and plan algorithm
3. **Implement** - Write clean, readable code with meaningful variable names
4. **Test** - Test with normal cases, edge cases, and large inputs
5. **Optimize** - Analyze complexity and refactor if needed

### Example Solution Structure:
```java
/**
 * Problem: [Problem Name]
 * Approach: [Brief description of approach]
 * Time Complexity: O(...)
 * Space Complexity: O(...)
 */
public class Solution {
    public ReturnType methodName(Parameters) {
        // Implementation
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test different scenarios
    }
}