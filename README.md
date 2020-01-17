# Leet
All my solutions to Leet code problems can be found here

### 9.Palindrome Number (Solved)

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:
```
Input: 121
Output: true
```
Example 2:
```
Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```
Example 3:
```
Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```

> Runtime: 7 ms, faster than 80.06% of Java online submissions for Palindrome Number.
>> Memory Usage: 37.1 MB, less than 5.02% of Java online submissions for Palindrome Number.

### 13. Roman to Integer (Solved)

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
```
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```
For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

Example 1:
```
Input: "III"
Output: 3
```
Example 2:
```
Input: "IV"
Output: 4
```
Example 3:
```
Input: "IX"
Output: 9
```
Example 4:
```
Input: "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
```
Example 5:
```
Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
```

> Runtime: 4 ms, faster than 70.76% of Java online submissions for Roman to Integer.
>> Memory Usage: 36.6 MB, less than 100.00% of Java online submissions for Roman to Integer.

### 14. Longest Common Prefix (Solved)

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
```
Input: ["flower","flow","flight"]
Output: "fl"
```
Example 2:
```
Input: ["dog","racecar","car"]
Output: ""
```
Explanation: There is no common prefix among the input strings.

> Runtime: 1 ms, faster than 74.92% of Java online submissions for Longest Common Prefix.
>> Memory Usage: 38.6 MB, less than 69.59% of Java online submissions for Longest Common Prefix.


### 26. Remove Duplicates from Sorted Array (Solved)

Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
```
Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
```
Example 2:
```
Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
```

>Runtime: 1 ms, faster than 97.60% of Java online submissions for Remove Duplicates from Sorted Array.
>>Memory Usage: 38 MB, less than 99.47% of Java online submissions for Remove Duplicates from Sorted Array.

### 27. Remove Element (Solved)
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

>Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
>>Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Remove Element.

### 28. Implement strStr() (Solved)

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
```
Input: haystack = "hello", needle = "ll"
Output: 2
```
Example 2:
```
Input: haystack = "aaaaa", needle = "bba"
Output: -1
```

>Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement strStr().
>>````Memory Usage: 38.2 MB, less than 64.88% of Java online submissions for Implement strStr().

### 35. Search Insert

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:
```
Input: [1,3,5,6], 5
Output: 2
```

>Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
>>Memory Usage: 39.3 MB, less than 100.00% of Java online submissions for Search Insert Position.

### 258. Add Digits (Solved)

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:
```
Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.
```

> Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Digits.
>> Memory Usage: 39.4 MB, less than 6.67% of Java online submissions for Add Digits.

### 374. Guess Number Higher or Lower (Solved)
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

```
-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
```

Example :

```
Input: n = 10, pick = 6
Output: 6
```


### 383. Ransom Note (Solved)
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

```
canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
```

>Runtime: 2 ms, faster than 99.24% of Java online submissions for Ransom Note.
>> Memory Usage: 38 MB, less than 99.35% of Java online submissions for Ransom Note.

### 387. First Unique Character in a String (Solved)
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:
```
s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
```

Note: You may assume the string contain only lowercase letters.

>Runtime: 4 ms, faster than 98.94% of Java online submissions for First Unique Character in a String.
>>Memory Usage: 37 MB, less than 99.71% of Java online submissions for First Unique Character in a String.

### 389. Find the Difference (Solved)

Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.

Example:

```
Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.
```

>Runtime: 1 ms, faster than 99.43% of Java online submissions for Find the Difference.
>>Memory Usage: 35.7 MB, less than 99.46% of Java online submissions for Find the Difference.

### 400. Nth Digit (Solved)

Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...

Note:
n is positive and will fit within the range of a 32-bit signed integer (n < 231).

Example 1:
```
Input:
3

Output:
3
```
Example 2:
```
Input:
11

Output:
0

Explanation:
The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
```

>Runtime: 0 ms, faster than 100.00% of Java online submissions for Nth Digit.
>>Memory Usage: 32.9 MB, less than 46.59% of Java online submissions for Nth Digit

### 434. Number of Segments in a String (Solved)

Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:
```
Input: "Hello, my name is John"
Output: 5
```

>Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Segments in a String.
>>Memory Usage: 33.7 MB, less than 99.77% of Java online submissions for Number of Segments in a String.


### 438. Find All Anagrams in a String (Solved)

Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:
```
Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
```

>Runtime: 26 ms, faster than 34.21% of Java online submissions for Find All Anagrams in a String.
>>Memory Usage: 39.7 MB, less than 46.91% of Java online submissions for Find All Anagrams in a String.

### 404. Sum of Left Leaves (Solved) 

Find the sum of all left leaves in a given binary tree.

Example:
```
    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
```

>Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Left Leaves.
>>Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Sum of Left Leaves.

### 414. Third Maximum Number (Solved)

Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
```
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
```

Example 3:
```
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
```

>Runtime: 4 ms, faster than 35.04% of Java online submissions for Third Maximum Number.
>>Memory Usage: 37.6 MB, less than 98.72% of Java online submissions for Third Maximum Number.

### 415. Add Strings (Solved)

Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

- The length of both num1 and num2 is < 5100.
- Both num1 and num2 contains only digits 0-9.
- Both num1 and num2 does not contain any leading zero.
- You must not use any built-in BigInteger library or convert the inputs to integer directly.

>Runtime: 2 ms, faster than 97.02% of Java online submissions for Add Strings.
>>Memory Usage: 35.9 MB, less than 99.89% of Java online submissions for Add Strings.

### 448. Find All Numbers Disappeared in an Array (Solved)

Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:
```
Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
```
>Runtime: 4 ms, faster than 99.92% of Java online submissions for Find All Numbers Disappeared in an Array.
>>Memory Usage: 47 MB, less than 98.02% of Java online submissions for Find All Numbers Disappeared in an Array.

### 453. Minimum Moves to Equal Array Elements (Solved)

Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.

Example:
```
Input:
[1,2,3]

Output:
3

Explanation:
Only three moves are needed (remember each move increments two elements):

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
```
>Runtime: 15 ms, faster than 23.07% of Java online submissions for Minimum Moves to Equal Array Elements.
>>Memory Usage: 40.1 MB, less than 97.59% of Java online submissions for Minimum Moves to Equal Array Elements.

### 441. Arranging Coins (Solved)

You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:
```
n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
```
Example 2:
```
n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
```

>Runtime: 8 ms, faster than 43.49% of Java online submissions for Arranging Coins.
>>Memory Usage: 33.6 MB, less than 33.76% of Java online submissions for Arranging Coins.

### 456. 132 Pattern (Solved)

Given a sequence of n integers a1, a2, ..., an, a 132 pattern is a subsequence ai, aj, ak such that i < j < k and ai < ak < aj. Design an algorithm that takes a list of n numbers as input and checks whether there is a 132 pattern in the list.

Note: n will be less than 15,000.

Example 1:
```
Input: [1, 2, 3, 4]

Output: False

Explanation: There is no 132 pattern in the sequence.
```

> Runtime: 10 ms, faster than 82.19% of Java online submissions for 132 Pattern.
>> Memory Usage: 40.9 MB, less than 14.29% of Java online submissions for 132 Pattern.
 
### 459. Repeated Substring Pattern (Solved)

Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:
```
Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.
Example 2:
```
Input: "aba"
Output: False
Example 3:
```
Input: "abcabcabcabc"
Output: True
Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
```

>Runtime: 6 ms, faster than 94.83% of Java online submissions for Repeated Substring Pattern.
>>Memory Usage: 37.8 MB, less than 100.00% of Java online submissions for Repeated Substring Pattern.

### 482. License Key Formatting (Solved)

You are given a license key represented as a string S which consists only alphanumeric character and dashes. The string is separated into N+1 groups by N dashes.

Given a number K, we would want to reformat the strings such that each group contains exactly K characters, except for the first group which could be shorter than K, but still must contain at least one character. Furthermore, there must be a dash inserted between two groups and all lowercase letters should be converted to uppercase.

Given a non-empty string S and a number K, format the string according to the rules described above.

Example 1:
```
Input: S = "5F3Z-2e-9-w", K = 4

Output: "5F3Z-2E9W"

Explanation: The string S has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.
```
Example 2:
```
Input: S = "2-5g-3-J", K = 2

Output: "2-5G-3J"

Explanation: The string S has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.
```
Note:
The length of string S will not exceed 12,000, and K is a positive integer.
String S consists only of alphanumerical characters (a-z and/or A-Z and/or 0-9) and dashes(-).
String S is non-empty.

>Runtime: 18 ms, faster than 57.00% of Java online submissions for License Key Formatting.
>>Memory Usage: 38 MB, less than 99.83% of Java online submissions for License Key Formatting.

### 485. Max Consecutive Ones (Solved)

Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
```
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
```
Note:
- The input array will only contain 0 and 1.
- The length of input array is a positive integer and will not exceed 10,000

>Runtime: 2 ms, faster than 99.80% of Java online submissions for Max Consecutive Ones.
>>Memory Usage: 38 MB, less than 99.96% of Java online submissions for Max Consecutive Ones.

### 492. Construct the Rectangle (Solved)

For a web developer, it is very important to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:
```
1. The area of the rectangular web page you designed must equal to the given target area.

2. The width W should not be larger than the length L, which means L >= W.

3. The difference between length L and width W should be as small as possible.
You need to output the length L and the width W of the web page you designed in sequence.
```
Example:
```
Input: 4
Output: [2, 2]
Explanation: The target area is 4, and all the possible ways to construct it are [1,4], [2,2], [4,1]. 
But according to requirement 2, [1,4] is illegal; according to requirement 3,  [4,1] is not optimal compared to [2,2]. So the length L is 2, and the width W is 2.
```
Note:
- The given area won't exceed 10,000,000 and is a positive integer
- The web page's width and length you designed must be positive integers.

>Runtime: 0 ms, faster than 100.00% of Java online submissions for Construct the Rectangle.
>>Memory Usage: 33.8 MB, less than 24.00% of Java online submissions for Construct the Rectangle.

### 496. Next Greater Element I (Solved)

You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.

Example 1:
```
Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
Output: [-1,3,-1]
Explanation:
    For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
    For number 1 in the first array, the next greater number for it in the second array is 3.
    For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
```
Example 2:
```
Input: nums1 = [2,4], nums2 = [1,2,3,4].
Output: [3,-1]
Explanation:
    For number 2 in the first array, the next greater number for it in the second array is 3.
    For number 4 in the first array, there is no next greater number for it in the second array, so output -1.
```
Note:
All elements in nums1 and nums2 are unique.
The length of both nums1 and nums2 would not exceed 1000.

>Runtime: 2 ms, faster than 96.01% of Java online submissions for Next Greater Element I.
>>Memory Usage: 37.5 MB, less than 97.59% of Java online submissions for Next Greater Element I.

### 500. Keyboard Row (Solved)

Given a List of words, return the words that can be typed using letters of alphabet on only one row's of an American keyboard.

 Example:
 ```
 Input: ["Hello", "Alaska", "Dad", "Peace"]
 Output: ["Alaska", "Dad"]
 ```
 
 Note:
 
 - You may use one character in the keyboard more than once.
 - You may assume the input string will only contain letters of alphabet.

>Runtime: 1 ms, faster than 77.24% of Java online submissions for Keyboard Row.
>>Memory Usage: 34.4 MB, less than 99.77% of Java online submissions for Keyboard Row.

### 504. Base 7 (Solved)

Given an integer, return its base 7 string representation.

Example 1:
```
Input: 100
Output: "202"
```
Example 2:
```
Input: -7
Output: "-10"
```
Note: The input will be in range of [-1e7, 1e7].

>Runtime: 1 ms, faster than 94.87% of Java online submissions for Base 7.
>>Memory Usage: 34.4 MB, less than 100.00% of Java online submissions for Base 7.

### 506. Relative Ranks (Solved)

Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
```
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
```
Note:
1. N is a positive integer and won't exceed 10,000.
2. All the scores of athletes are guaranteed to be unique.

>Runtime: 10 ms, faster than 46.62% of Java online submissions for Relative Ranks.
>>Memory Usage: 40 MB, less than 82.02% of Java online submissions for Relative Ranks.

### 507. Perfect Number (Solved)

We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.

Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.
Example:
```
Input: 28
Output: True
Explanation: 28 = 1 + 2 + 4 + 7 + 14
```
Note: The input number n will not exceed 100,000,000. (1e8)

>Runtime: 0 ms, faster than 100.00% of Java online submissions for Perfect Number.
>>Memory Usage: 33.0 MB, less than 30.52% of Java online submissions for Perfect Number

### 509. Fibonacci Number (Solved)

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).

 

Example 1:
```
Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
```
Example 2:
```
Input: 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
```
Example 3:
```
Input: 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
```
Note:
0 ≤ N ≤ 30.

>Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
>>Memory Usage: 32.8 MB, less than 20.08% of Java online submissions for Fibonacci Number.

### 520. Detect Capital (Solved)

Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
 
Example 1:
```
Input: "USA"
Output: True
```
Example 2:
```
Input: "FlaG"
Output: False
```
Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.

>Runtime: 1 ms, faster than 100.00% of Java online submissions for Detect Capital.
>>Memory Usage: 35 MB, less than 99.47% of Java online submissions for Detect Capital.

### 521. Longest Uncommon Subsequence I (Solved)

Given a group of two strings, you need to find the longest uncommon subsequence of this group of two strings. The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this subsequence should not be any subsequence of the other strings.

A subsequence is a sequence that can be derived from one sequence by deleting some characters without changing the order of the remaining elements. Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.

The input will be two strings, and the output needs to be the length of the longest uncommon subsequence. If the longest uncommon subsequence doesn't exist, return -1.

Example 1:
```
Input: "aba", "cdc"
Output: 3
Explanation: The longest uncommon subsequence is "aba" (or "cdc"), 
because "aba" is a subsequence of "aba", 
but not a subsequence of any other strings in the group of two strings. 
```
Note:
- Both strings' lengths will not exceed 100.
- Only letters from a ~ z will appear in input strings.

>Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Uncommon Subsequence I .
>>Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Longest Uncommon Subsequence I .

### 532. K-diff Pairs in an Array (Solved)

Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Example 1:
```
Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
```
Example 2:
```
Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
```
Example 3:
```
Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).
```
Note:
- The pairs (i, j) and (j, i) count as the same pair.
- The length of the array won't exceed 10,000.
- All the integers in the given input belong to the range: [-1e7, 1e7].

>Runtime: 9 ms, faster than 83.98% of Java online submissions for K-diff Pairs in an Array.
>>Memory Usage: 40.2 MB, less than 81.62% of Java online submissions for K-diff Pairs in an Array.

### 541. Reverse String II (Solved)

Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
```
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
```
Restrictions:
- The string consists of lower English letters only.
- Length of the given string and k will in the range [1, 10000]

>Runtime: 3 ms, faster than 18.53% of Java online submissions for Reverse String II.
>>Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Reverse String II.

### 551. Student Attendance Record I (Solved)

You are given a string representing an attendance record for a student. The record only contains the following three characters:
- 'A' : Absent.
- 'L' : Late.
- 'P' : Present.

A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:
```
Input: "PPALLP"
Output: True
```
Example 2:
```
Input: "PPALLL"
Output: False
```

>Runtime: 0 ms, faster than 100.00% of Java online submissions for Student Attendance Record I.
>>Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Student Attendance Record I.

### 557. Reverse Words in a String III

Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
```
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
```
Note: In the string, each word is separated by single space and there will not be any extra space in the string.

>Runtime: 4 ms, faster than 84.50% of Java online submissions for Reverse Words in a String III.
>>Memory Usage: 38 MB, less than 99.59% of Java online submissions for Reverse Words in a String III.

### 561. Array Partition I (Solved)

Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:
```
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
```
Note:
- n is a positive integer, which is in the range of [1, 10000].
- All the integers in the array will be in the range of [-10000, 10000]. Accepted

>Runtime: 14 ms, faster than 92.77% of Java online submissions for Array Partition I.
>>Memory Usage: 40 MB, less than 99.83% of Java online submissions for Array Partition I.

### 575. Distribute Candies (Solved)

Given an integer array with even length, where different numbers in this array represent different kinds of candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister. Return the maximum number of kinds of candies the sister could gain.
Example 1:
```
Input: candies = [1,1,2,2,3,3]
Output: 3
Explanation:
There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too. 
The sister has three different kinds of candies. 
```
Example 2:
```
Input: candies = [1,1,2,3]
Output: 2
Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1]. 
The sister has two different kinds of candies, the brother has only one kind of candies. 
```
Note:
- The length of the given array is in range [2, 10,000], and will be even.
- The number in given array is in range [-100,000, 100,000].

>Runtime: 50 ms, faster than 22.01% of Java online submissions for Distribute Candies.
>>Memory Usage: 40.4 MB, less than 98.84% of Java online submissions for Distribute Candies.

### 581. Shortest Unsorted Continuous Subarray (Solved)

Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:
```
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
```
Note:
- Then length of the input array is in range [1, 10,000].
- The input array may contain duplicates, so ascending order here means <=.

>Runtime: 10 ms, faster than 22.61% of Java online submissions for Shortest Unsorted Continuous Subarray.
>>Memory Usage: 39.6 MB, less than 98.37% of Java online submissions for Shortest Unsorted Continuous Subarray.

### 594. Longest Harmonious Subsequence (Solved)

We define a harmounious array as an array where the difference between its maximum value and its minimum value is exactly 1.

Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.

Example 1:
```
Input: [1,3,2,2,5,2,3,7]
Output: 5
Explanation: The longest harmonious subsequence is [3,2,2,2,3].
```
Note: The length of the input array will not exceed 20,000.

>Runtime: 30 ms, faster than 57.97% of Java online submissions for Longest Harmonious Subsequence.
>>Memory Usage: 39.6 MB, less than 98.91% of Java online submissions for Longest Harmonious Subsequence.

### 599. Minimum Index Sum of Two Lists (Solved)

Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

Example 1:
```
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".
```
Example 2:
```
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["KFC", "Shogun", "Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
```
Note:
- The length of both lists will be in the range of [1, 1000].
- The length of strings in both lists will be in the range of [1, 30].
- The index is starting from 0 to the list length minus 1.
- No duplicates in both lists.

>Runtime: 13 ms, faster than 26.93% of Java online submissions for Minimum Index Sum of Two Lists.
>>Memory Usage: 38.8 MB, less than 97.27% of Java online submissions for Minimum Index Sum of Two Lists.

### 605. Can Place Flowers (Solved)

Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Example 1:
```
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True
```
Example 2:
```
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False
```
Note:
- The input array won't violate no-adjacent-flowers rule.
- The input array size is in the range of [1, 20000].
- n is a non-negative integer which won't exceed the input array size.

>Runtime: 1 ms, faster than 100.00% of Java online submissions for Can Place Flowers.
>>Memory Usage: 38.9 MB, less than 97.60% of Java online submissions for Can Place Flowers.

### 628. Maximum Product of Three Numbers (Solved)

Given an integer array, find three numbers whose product is maximum and output the maximum product.

Example 1:
```
Input: [1,2,3]
Output: 6
``` 
Example 2:
```
Input: [1,2,3,4]
Output: 24
```
Note:

- The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
- Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.

>Runtime: 2 ms, faster than 99.80% of Java online submissions for Maximum Product of Three Numbers.
>>Memory Usage: 38.9 MB, less than 98.73% of Java online submissions for Maximum Product of Three Numbers.

### 643. Maximum Average Subarray I (Solved)

Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

Example 1:
```
Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
```
Note:

1 <= k <= n <= 30,000.
Elements of the given array will be in the range [-10,000, 10,000].

>Runtime: 3 ms, faster than 97.09% of Java online submissions for Maximum Average Subarray I.
>>Memory Usage: 42.4 MB, less than 72.13% of Java online submissions for Maximum Average Subarray I.

### 645. Set Mismatch (Solved)

The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.

Given an array nums representing the data status of this set after the error. Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.

Example 1:
```
Input: nums = [1,2,2,4]
Output: [2,3]
```
Note:
- The given array size will in the range [2, 10000].
- The given array's numbers won't have any order.

>Runtime: 1 ms, faster than 100.00% of Java online submissions for Set Mismatch.
>>Memory Usage: 40 MB, less than 98.40% of Java online submissions for Set Mismatch.

### 657. Robot Return to Origin (Solved)

There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.

Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once, "L" will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.

Example 1:
```
Input: "UD"
Output: true 
Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
```
Example 2:
```
Input: "LL"
Output: false
Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.
```

>Runtime: 5 ms, faster than 94.04% of Java online submissions for Robot Return to Origin.
>>Memory Usage: 37.7 MB, less than 99.52% of Java online submissions for Robot Return to Origin.

### 665. Non-decreasing Array (Solved)

Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).

Example 1:
```
Input: [4,2,3]
Output: True
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
```
Example 2:
```
Input: [4,2,1]
Output: False
Explanation: You can't get a non-decreasing array by modify at most one element.
```
Note: The n belongs to [1, 10,000].

>Runtime: 1 ms, faster than 99.79% of Java online submissions for Non-decreasing Array.
>>Memory Usage: 40.1 MB, less than 95.39% of Java online submissions for Non-decreasing Array.

### 674. Longest Continuous Increasing Subsequence (Solved)

Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

Example 1:
```
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 
```
Example 2:
```
Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1. 
```
Note: Length of the array will not exceed 10,000.

>Runtime: 1 ms, faster than 99.77% of Java online submissions for Longest Continuous Increasing Subsequence.
>>Memory Usage: 38 MB, less than 100.00% of Java online submissions for Longest Continuous Increasing Subsequence.

### 680. Valid Palindrome II (Solved)

Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
```
Input: "aba"
Output: True
```
Example 2:
```
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
```
Note:
1. The string will only contain lowercase characters a-z. The maximum length of the string is 50000.

>Runtime: 5 ms, faster than 96.07% of Java online submissions for Valid Palindrome II.
>>Memory Usage: 38.1 MB, less than 100.00% of Java online submissions for Valid Palindrome II.

### 682. Baseball Game

You're now a baseball game point recorder.

Given a list of strings, each string can be one of the 4 following types:

Integer (one round's score): Directly represents the number of points you get in this round.
"+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
"D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
"C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
Each round's operation is permanent and could have an impact on the round before and the round after.

You need to return the sum of the points you could get in all the rounds.

Example 1:
```
Input: ["5","2","C","D","+"]
Output: 30
Explanation: 
Round 1: You could get 5 points. The sum is: 5.
Round 2: You could get 2 points. The sum is: 7.
Operation 1: The round 2's data was invalid. The sum is: 5.  
Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
Round 4: You could get 5 + 10 = 15 points. The sum is: 30.
```
Example 2:
```
Input: ["5","-2","4","C","D","9","+","+"]
Output: 27
Explanation: 
Round 1: You could get 5 points. The sum is: 5.
Round 2: You could get -2 points. The sum is: 3.
Round 3: You could get 4 points. The sum is: 7.
Operation 1: The round 3's data is invalid. The sum is: 3.  
Round 4: You could get -4 points (the round 3's data has been removed). The sum is: -1.
Round 5: You could get 9 points. The sum is: 8.
Round 6: You could get -4 + 9 = 5 points. The sum is 13.
Round 7: You could get 9 + 5 = 14 points. The sum is 27.
```
Note:
1. The size of the input list will be between 1 and 1000.
2. Every integer represented in the list will be between -30000 and 30000.

>Runtime: 2 ms, faster than 94.69% of Java online submissions for Baseball Game.
>>Memory Usage: 35.7 MB, less than 99.14% of Java online submissions for Baseball Game.

### 686. Repeated String Match (Solved)

Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.

For example, with A = "abcd" and B = "cdabcdab".

Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").

Note:
The length of A and B will be between 1 and 10000.

>Runtime: 68 ms, faster than 86.44% of Java online submissions for Repeated String Match.
>>Memory Usage: 36.7 MB, less than 99.55% of Java online submissions for Repeated String Match.

### 687. Longest Univalue Path (Solved)

Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.

The length of path between two nodes is represented by the number of edges between them.

Example 1:
```
Input:
              5
             / \
            4   5
           / \   \
          1   1   5
Output: 2
```
Example 2:
```
Input:

              1
             / \
            4   5
           / \   \
          4   4   5
Output: 2
```

Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.

>Runtime: 6 ms, faster than 12.20% of Java online submissions for Longest Univalue Path.
>>Memory Usage: 42.1 MB, less than 99.85% of Java online submissions for Longest Univalue Path.

### 696. Count Binary Substrings (Solved)

Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.

Example 1:
```
Input: "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".

Notice that some of these substrings repeat and are counted the number of times they occur.

Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
```
Example 2:
```
Input: "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
```
Note:
- s.length will be between 1 and 50,000.
- s will only consist of "0" or "1" characters.

>Runtime: 11 ms, faster than 80.13% of Java online submissions for Count Binary Substrings.
>>Memory Usage: 36.8 MB, less than 100.00% of Java online submissions for Count Binary Substrings.

### 989. Add to Array-Form of Integer (Solved)

For a non-negative integer X, the array-form of X is an array of its digits in left to right order.  For example, if X = 1231, then the array form is [1,2,3,1].

Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.

Example 1:
```
Input: A = [1,2,0,0], K = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
```
Example 2:
```
Input: A = [2,7,4], K = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
```

>Runtime: 16 ms, faster than 31.13% of Java online submissions for Add to Array-Form of Integer.
>>Memory Usage: 49.9 MB, less than 9.52% of Java online submissions for Add to Array-Form of Integer.