# Leet
All my solutions to Leet code problems can be found here

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