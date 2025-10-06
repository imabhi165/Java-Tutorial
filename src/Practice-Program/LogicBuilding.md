# 🧠 Programming Logic-Building Programs (with Mathematical Forms)

A comprehensive list of fundamental logic-building programs with their mathematical expressions and core algorithmic ideas.

---

## 🧮 1. Basic Arithmetic Logic

| Program | Mathematical Form | Core Logic |
|----------|------------------|-------------|
| **Sum of two numbers** | `S = a + b` | Simple arithmetic |
| **Difference / Product / Quotient** | `D = a - b`, `P = a × b`, `Q = a / b` | Arithmetic operations |
| **Average of n numbers** | `avg = (Σ xᵢ) / n` | Iteration, accumulation |
| **Swap two numbers** | `a, b = b, a` | Temporary variable or arithmetic swap |
| **Convert Celsius ↔ Fahrenheit** | `F = (9/5)C + 32`, `C = (5/9)(F - 32)` | Formula-based conversion |

---

## 🔁 2. Looping and Control Flow
s
| Program | Mathematical Form | Core Logic |
|----------|------------------|-------------|
| **Sum of first n natural numbers** | `S = n(n + 1) / 2` | Loop or direct formula |
| **Factorial of n** | `n! = 1 × 2 × 3 × … × n` | Iteration or recursion |s
| **Power of a number** | `xⁿ = x × x × … × x` (n times) | Repeated multiplication |
| **Reverse of a number** | `r = (r × 10) + (n mod 10)` | While loop, digit extraction |
| **Count digits of a number** | `count = floor(log₁₀(n)) + 1` | Loop / logarithm |

---

## 🔢 3. Number Theory and Patterns

| Program | Mathematical Form | Core Logic |
|----------|------------------|-------------|
| **Fibonacci series** | `Fₙ = Fₙ₋₁ + Fₙ₋₂`, with `F₀ = 0`, `F₁ = 1` | Iteration or recursion |
| **Prime check** | `n` is prime ⇔ divisible only by `1` and `n` | Loop, modulus |
| **GCD / HCF** | `gcd(a, b) = gcd(b, a mod b)` | Euclidean algorithm |
| **LCM** | `lcm(a, b) = |a × b| / gcd(a, b)` | Uses GCD |
| **Armstrong number** | `n = Σ (digitᵢ)ᵈ` | Digit extraction, power sum |
| **Palindrome number** | `n = reverse(n)` | String / arithmetic reversal |
| **Perfect number** | `n = Σ divisors of n` (excluding n) | Loop + sum of divisors |

---

## 🔠 4. String Logic

| Program | Mathematical Form | Core Logic |
|----------|------------------|-------------|
| **Count characters / vowels / consonants** | `count(x) = Σ 1 for each x ∈ S` | Loop / condition |
| **Reverse a string** | `S' = S[len(S)-1] … S[0]` | Index manipulation |
| **Check palindrome string** | `S = reverse(S)` | Comparison |
| **Count words** | Split by spaces and count | String tokenization |

---

## 🔲 5. Pattern Printing (Logic & Loops)

| Pattern Type | Mathematical Form | Core Logic |
|---------------|------------------|-------------|
| **Square of stars** | `n × n` stars | Nested loops |
| **Right triangle** | `i` stars on line `i` | Loop increasing count |
| **Pyramid** | `(n - i)` spaces + `(2i - 1)` stars | Loop + spacing math |
| **Number pyramid** | Print `i` repeated `i` times | Nested loops |

---

## 🔍 6. Searching & Sorting (Logic Algorithms)

| Algorithm | Mathematical Idea | Core Logic |
|------------|------------------|-------------|
| **Linear Search** | Scan sequentially until match | Loop + condition |
| **Binary Search** | Divide and conquer: `O(log n)` | Midpoint comparisons |
| **Bubble Sort** | Swap adjacent if out of order | Nested loops |
| **Selection Sort** | Select minimum each iteration | Loop + min search |
| **Insertion Sort** | Insert into sorted prefix | Shift elements |

---

## ⚙️ 7. Mathematical / Utility Algorithms

| Program | Mathematical Form | Core Logic |
|----------|------------------|-------------|
| **Check leap year** | `(Y mod 4 = 0) and ((Y mod 100 ≠ 0) or (Y mod 400 = 0))` | Conditionals |
| **Convert binary ↔ decimal** | `Decimal = Σ (bᵢ × 2ⁱ)` | Power of 2 |
| **Sum of digits** | `S = Σ digits(n)` | Modulus and division |
| **Power series sum** | `S = 1 + x + x² + … + xⁿ = (xⁿ⁺¹ - 1) / (x - 1)` | Loop or formula |

---

## 🧾 Notes

- These programs form the **foundation** of logic building and algorithmic thinking.  
- Ideal for practice in **C**, **C++**, **Java**, **Python**, and **JavaScript**.  
- Try to implement each using both **loops** and **recursion** where applicable.

---

📘 **Next Step:**  
You can extend this list with **code examples** or **flowcharts** for deeper understanding.
