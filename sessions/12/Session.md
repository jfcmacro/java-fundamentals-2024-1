# Session 11

---

## Agenda

* Introduction
* `Queue` and `Deque`
* `Set`
* `Map`
* Examples 
* Proposed Problems

---

## Introduction

---

## `Queue` and `Deque`

---

## `Set`

---

## `Maps`

---

## Examples - Reverse String

**Problem:** Consider you've been given a string. Use a `Stack` to reverse it.

```java
String reverse(String str) {
    // TODO
}
```

---

## Examples - Reverse String - Solution

**Solution:**

```java
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
```

---

## Examples - Stack of curly braces

**Problems:** Consider you've been given a `String` containing curly braces.
Write a snippet of code that returns `true` if there are matching pairs of curly
braces. If we can find a closing curly brace for an opening one in the proper
order, then we can say we have a matching pair.

For example:

`{{{}}}{}{{}}` -> `true`.
`{{{}}}}{}{}` -> `false`.

```java
public static boolean bracesMatching(String braceStr) {
   // TODO
}
```

---

## Examples - Stack of curly braces - Solution

```java
```


---

## Proposed Problems
