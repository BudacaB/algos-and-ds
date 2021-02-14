## Data Structures + Algorithms = Programs

---

## Big O asymptotic analysis (Big O notation)

- how long an algorithm takes to run
- as elements passed as input increase, how many operations do we have to do? (algorithmic efficiency)

### Types:
- O(1) -> Constant time - no loops
- O(log N) -> Logarithmic - usually searching algorithms have log n if they are sorted (Binary Search)
- O(n) -> Linear time - for loops, while loops through n items
- O(n log(n)) -> Log Linear - usually sorting operations
- O(n^2) -> Quadratic - every element in a collection needs to be compared to ever other element. Two
  nested loops
- O(2^n) -> Exponential - recursive algorithms that solve a problem of size N
- O(n!) -> Factorial - you are adding a loop for every element

Iterating through half a collection is still O(n)

Two separate collections: O(a * b)


```
// What is the Big O of the below function? (Hint, you may want to go line by line)
function funChallenge(input) {
  let a = 10; // O(1)
  a = 50 + 3; // O(1)

  for (let i = 0; i < input.length; i++) {
    anotherFunction(); // O(n)
    let stranger = true; // O(n)
    a++; // O(n)
  }
  return a; // O(1)
}

// BIG O(3 + 3n) -> O(n)
```

```
// What is the Big O of the below function? (Hint, you may want to go line by line)
function anotherFunChallenge(input) {
  let a = 5; // O(1)
  let b = 10; // O(1)
  let c = 50; // O(1)
  for (let i = 0; i < input; i++) {
    let x = i + 1; // O(n)
    let y = i + 2; // O(n)
    let z = i + 3; // O(n)

  }
  for (let j = 0; j < input; j++) {
    let p = j * 2; // O(n)
    let q = j * 2; // O(n)
  }
  let whoAmI = "I don't know"; // O(1)
}

// BIG O(4 + 5n) -> O(n)
```

### Rules:
1. Worst case
2. Remove constants
3. Different terms for inputs
   
   Different inputs should have different variables. O(a+b). A and B arrays nested would be
   O(a*b)
- for steps in order +
- for nested steps *
4. Drop non dominants

---

## What is good code?

- Readable
- Scalable - measured by Big O
    - Speed - Time Complexity
    - Memory - Space Complexity
      - heap - storing variables
      - stack - keeping track of function calls
  
### What can cause Time in a function?
- Operations (+, -, *, /)
- Comparisons (<, >, ==)
- Looping (for, while)
- Outside Function call (function())

### What causes Space complexity?
- Variables
- Data Structures
- Function Call
- Allocations

---

## Arrays (or Lists)

- organizes items sequentially in memory
- smallest footprint
- ideal for storing data to iterate through it, especially if knowing the indexes of the stored items
- lookup - O(1)
- push - O(1)
- insert - O(n)
- delete - O(n)

### Types

- Static - size declared beforehand
- Dynamic - copy and rebuild array at a new location in memory - don't need to declare size ahead of time
    - push or 'append' might become O(n) if the programming language iterates through the elements to copy them in a new larger space (usually double than the initial)

