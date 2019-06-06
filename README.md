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