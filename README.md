# Task Description

## Migration from simbirsoft-android-practice Repository

This task involves migrating tasks from the `simbirsoft-android-practice` repository, specifically from the `kotlin-part-1` and `kotlin-part-2` branches.

---

## 1. `Publication` Interface

You need to create an interface `Publication` with the following properties:
- `price` (price of the publication, type `Double`).
- `wordCount` (word count, type `Int`).

Additionally, include a method `getType()`, which returns a string based on the word count of the publication.

### Implementation:

- For the `Book` class, the method `getType()` should return:
  - "Flash Fiction", if the word count is less than or equal to 1000.
  - "Short Story", if the word count is exactly 7500.
  - "Novel", if the word count is greater than 7500.

- For the `Magazine` class, the method `getType()` should always return the string "Magazine".

## 2. `Book` and `Magazine` Classes

### `Book` Class:

Implements the `Publication` interface. Overrides the `equals` method to compare objects first by reference and then using the `equals` method.

### `Magazine` Class:

Implements the `Publication` interface. The `getType()` method always returns the string "Magazine".

## 3. Logging

For each object of the `Book` and `Magazine` classes, log the following information:
- Type of publication.
- Word count.
- Price in euros.

## 4. `buy()` Method

Create a `buy()` method, which takes a `Publication` parameter (not `null`) and logs the message:  
`“The purchase is complete. The purchase amount was [publication price]”`.

Also, create two variables of the `Book` class, one of which is `null`, and the other contains a non-null value. Using the `let` function, attempt to call the `buy()` method with both variables.

## 5. Lambda Expression

Create a variable `sum`, which holds a lambda expression that adds two numbers and logs the result.  
Call this lambda expression with arbitrary parameters.
