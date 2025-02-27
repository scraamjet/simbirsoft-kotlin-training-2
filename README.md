# Description

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

## 6. `Type` Enum

Create an enum class `Type` with constants `DEMO` and `FULL`.

## 7. `User` Data Class

Implement a `User` data class with the following properties:
- `id` (type `Int`).
- `name` (type `String`).
- `age` (type `Int`).
- `type` (type `Type`).

In the `User` class, create a lazy property `startTime` that stores the current time when the property is accessed.

### Implementation Steps:
- Create the `User` class with the specified properties.
- Add a lazy `startTime` property that returns the current time.

## 8. `startTime` Testing

- Create an object of the `User` class.
- Log the `startTime` of the created user.
- After calling `Thread.sleep(1000)`, log the `startTime` again to check if it is recalculated or remains the same.

## 9. Users List and `apply` Function

- Create a list of users, initially containing one `User` object.
- Use the `apply` function to add more `User` objects to the list.

## 10. Filtering Users with Full Access

- Filter the list of users to get only those with the `FULL` access type.

## 11. List Transformation

- Convert the list of `User` objects into a list of user names.
- Get the first and last names from the list and log them.

## 12. Extension Function for Age Verification

- Create an extension function for the `User` class that checks if the user is older than 18.
- If the user is older than 18, log a success message.
- If the user is not older than 18, return an error.

## 13. `AuthCallback` Interface and Anonymous Implementation

- Create an interface `AuthCallback` with the following methods:
  - `authSuccess()`
  - `authFailed()`

- Implement an anonymous object of this interface and log the status of authentication in both methods.

## 14. `auth` Inline Function

- Implement an inline function `auth`, which accepts a function parameter `updateCache`.
- The `updateCache` function should log the cache update information.
- Inside the `auth` function:
  - If the user is verified (via the extension function for age), call the `authSuccess()` method from the callback and execute the `updateCache()` function.
  - If the user is not verified, call the `authFailed()` method from the callback.

## 15. Action Classes

- Create an isolated `Action` class and its subclasses: `Registration`, `Login`, and `Logout`.
  - `Login` should accept an instance of `User` as a parameter.

## 16. `doAction` Method

- Implement the `doAction` method, which accepts an instance of `Action`.
  - Depending on the action type, log appropriate messages such as "Auth started".
  - For the `Login` action, call the `auth` method to initiate the authentication process.

---
