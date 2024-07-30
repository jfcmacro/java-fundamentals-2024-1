

# Session 2 - Arrays

---

## Introduction

* Arrays
* Objects
* Multidimension

---

## Examples

---

### Example 1. Remove Duplicates

#### Definition

Assuming a sorted array of positive numbers

```java
int[] sortedNumbers = { 1, 2, 2, 3, 3, 4, 4, 4};
```

removing the duplicates should give the following result:

```plaintext
[ 1, 2, 3, 4]
```

> Job Interview Tips: Problem-solving strategies
>
> It would help if you asked a few questions to clarify the context and gain a better understanding.
>
> 1. Is it necessary to keep the order/sorting of the numbers?
> 2. May a new array be created, or must the actions be performed in place—within the original array?
> 3. For in place, there are further questions:
>    1. What exactly should happen when removing/deleting?
>    2. What values represent no entry?

---

### Example 1. Solution

```java
public void removeDuplicates(int[] array) {
   
}
public int[] removeDuplicates2(int[] array) {
    
}
```

---

### Example 2. Even Before Odd Numbers

#### Description 

Write the method void orderEventBeforeOdd(int[]). This method is supposed to rearrange an array of `int` values so that the even numbers appear first, followed by the odd numbers. The order within the even and odd numbers is not relevant.

#### Examples

| Input                    | Output                   |
| ------------------------ | ------------------------ |
| `[1,2,3,4,5,6,7,8,9,10]` | `[2,4,6,8,10,3,7,1,9,5]` |
| `[2,4,6,1,8]`            | `[2,4,6,8,1]`            |
| `[2,4,6,8,1]`            | `[2,4,6,8,1]`            |

---

### Example 2. Solution

```java
void orderEventBeforedOdd(int[] ary) {
    
}
```



---

## Proposed Problems

---

### Proposed Problems - [Max Method](https://gitlab.com/juan_cardona_epam/max)

The purpose of this exercise is to train you to work with arrays.

The estimated workload of this exercise is *20 min*.

#### Description

Please, proceed to the `MaxMethod` class and implement the `max` method.

The correct implementation should receive an array of `int` values and return its maximum value.

Details:

- An input array is guaranteed to not be an empty array or `null`.
- `max` method must not modify the array.
- Input array may contain any `int` value between `Integer.MIN_VALUE` and `Integer.MAX_VALUE`.

#### Example

```java
   int[] vals = new int[]{-2, 0, 10, 5};
   int result = MaxMethod.max(vals);
   System.out.println(result == 10); // true
```

---

### Proposed Problems - [Sum of Previous]()

The purpose of this exercise is to train you to work with arrays.

The estimated workload of this exercise is *20 min*.

#### Description

Please, proceed to [`SumOfPrevious`](https://gitlab.com/juan_cardona_epam/sum-of-previous/-/blob/master/src/main/java/com/epam/rd/autotasks/arrays/SumOfPrevious.java) class and implement `getSumCheckArray` method.

The correct implementation should receive an array of `int` values and return an array of booleans where each element is a result of a check if a corresponding element is a sum of two previous elements in given array.

Details:

- The length of given array is guaranteed to be 2 or more.
- Given array is guaranteed to be not null.
- Method returns an array of booleans where each element is a result for corresponding element in given array.
- First two elements of the boolean array are always false.

#### Example

Input array: `[1, -1, 0, 4, 6, 10, 15, 25]`

Output array: `[false, false, true, false, false, true, false, true]`

---

### Proposed Problems - [Local Maxima Remove](https://gitlab.com/juan_cardona_epam/local-maxima-remove)

The purpose of this exercise is to train you to work with arrays.

Estimated workload of this exercise is *30 min*.

#### Description

Please, proceed to the [LocalMaximaRemove]() class and implement the `removeLocalMaxima` method.

The correct implementation should receive an array of `int` values and return a copy of a given array with all local maxima removed in it. The original array must not be changed.

**Local maximum** is an element that is bigger that any of its neighbour elements. You should remove elements that are local maxima in the original array.

Details:

- The size of given array is guaranteed to be more than 1.
- Given array is guaranteed to be not null.
- If the array has no local maxima, then you should return its copy without changes.
- You may use `java.util.Arrays.*` methods.

#### Example

Input array: `[18, 1, 3, 6, 7, -5]`

Output array: `[1, 3, 6, -5]`

---

### Proposed Problems - [Cycle Swap](https://gitlab.com/juan_cardona_epam/cycle-swap)

The purpose of this exercise is to train you to work with arrays.

Estimated workload of this exercise is *30 min*.

#### Description

Please, proceed to [`CycleSwap`]() class and implement its static methods:

- `void cycleSwap(int[] array)`
   Shifts all the elements in the given array to the right by 1 position.
   In this case, the last array element becomes first.
   For example, `1 3 2 7 4` becomes `4 1 3 2 7`.
- `void cycleSwap(int[] array, int shift)`
   Shift all the elements in the given array to the right in the cycle manner by `shift` positions.
   Shift value is guaranteed to be non-negative and not bigger than the array length.
   For example, `1 3 2 7 4` with a shift of `3` becomes `2 7 4 1 3`.

For a greater challenge, try not using loops in your code (not mandatory).

Note that input array may be empty.

#### Examples

##### Example 1

Code Sample:

```java
...
int[] array = new int[]{1, 3, 2, 7, 4};
CycleSwap.cycleSwap(array);
System.out.println(Arrays.toString(array));
```

Output:

```plaintext
[4, 1, 3, 2, 7]
```

##### Example 2

Code Sample:

```java
...
int[] array = new int[]{1, 3, 2, 7, 4};
CycleSwap.cycleSwap(array, 2);
System.out.println(Arrays.toString(array));
```

Output:

```plaintext
[7, 4, 1, 3, 2]
```

##### Example 3

Code Sample:

```java
...
int[] array = new int[]{1, 3, 2, 7, 4};
CycleSwap.cycleSwap(array, 5);
System.out.println(Arrays.toString(array));
```

Output:

```plaintext
[1, 3, 2, 7, 4]
```

---

### Proposed Problems - [Spiral](https://gitlab.com/juan_cardona_epam/spiral)

The purpose of this exercise is to train you to work with arrays.

Estimated workload of this exercise is *45 min*.

#### Description

Please, proceed to [`Spiral`]() class and implement its static method:

- ```
  int[][] spiral(int rows, int columns)
  ```

  Return a two-dimensional array coming in the form of a table and containing numbers from 

  ```
  1
  ```

   up to 

  ```
  rows * columns
  ```

  . The size of the table will be specified by the given parameters.

  Numbers fill the "table" clockwise from the top-level corner in a spiral manner.

  For example, for parameter values 

  ```
  (3, 4)
  ```

  , the output array should be:

  ```plaintext
   1  2  3  4
  10 11 12  5
   9  8  7  6
  ```

#### Examples

##### Example 1

Code Sample:

```java
...
int[][] spiral = Spiral.spiral(3, 4);

for (int i = 0; i < spiral.length; i++) {
    for (int j = 0; j < spiral[i].length; j++) {
        System.out.print(String.format("%4s", spiral[i][j]));
    }
    System.out.println();
}
```

Output:

```plaintext
   1   2   3   4
  10  11  12   5
   9   8   7   6
```

##### Example 2

Code Sample:

```java
...
int[][] spiral = Spiral.spiral(4, 3);

for (int i = 0; i < spiral.length; i++) {
    for (int j = 0; j < spiral[i].length; j++) {
        System.out.print(String.format("%4s", spiral[i][j]));
    }
    System.out.println();
}
```

Output:

```plaintext
   1   2   3
  10  11   4
   9  12   5
   8   7   6
```

##### Example 3

Code Sample:

```java
...
int[][] spiral = Spiral.spiral(5, 6);

for (int i = 0; i < spiral.length; i++) {
    for (int j = 0; j < spiral[i].length; j++) {
        System.out.print(String.format("%4s", spiral[i][j]));
    }
    System.out.println();
}
```

Output:

```plaintext
   1   2   3   4   5   6
  18  19  20  21  22   7
  17  28  29  30  23   8
  16  27  26  25  24   9
  15  14  13  12  11  10
```

##### Example 4

Code Sample:

```java
...
int[][] spiral = Spiral.spiral(5, 5);

for (int i = 0; i < spiral.length; i++) {
    for (int j = 0; j < spiral[i].length; j++) {
        System.out.print(String.format("%4s", spiral[i][j]));
    }
    System.out.println();
}
```

Output:

```plaintext
   1   2   3   4   5
  16  17  18  19   6
  15  24  25  20   7
  14  23  22  21   8
  13  12  11  10   9
```

---

