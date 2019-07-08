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