# Java ConcurrentModificationException Example

This repository contains a simple Java program that demonstrates the `ConcurrentModificationException`. The exception is a common issue when modifying a collection while iterating over it using an iterator that doesn't support concurrent modification.

## The Bug

The `ConcurrentModificationExceptionExample.java` file shows how trying to remove an element from an ArrayList during iteration with a for-each loop leads to this exception. 

## The Solution

The solution (`ConcurrentModificationExceptionExampleSolution.java`) provides two ways to safely remove elements during iteration: using an iterator's `remove()` method or iterating over a copy of the list.  These methods prevent the exception.