## Big O asymptotic analysis (Big O notation)

- how long an algorithm takes to run
- as elements passed as input increase, how many operations do we have to do? (algorithmic efficiency)

### What is good code?
- readable
- scalable -> measured by Big O

### Types:
- O(n) -> Linear time
- O(1) -> Constant time


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
4. Drop non dominants

---

## Arrays (or Lists)

- organizes items sequentially in memory
- smallest footprint
- ideal for storing data to iterate through it, especially if knowind the indexes of the stored items
- lookup - O(1)
- push - O(1)
- insert - O(n)
- delete - O(n)

