# Java OOP Tasks - Sheet 1 🚀

---

## 🛠️ Tasks Overview & Logic

### 1. Say Hello ✉️
* **File:** `SayHell.java`
* **Description:** Takes a name as input and prints a personalized greeting.
* **OOP Concept:** Basic class structure, constructors, and string manipulation.

### 2. Basic Calculator 🧮
* **File:** `Calculator.java`
* **Description:** Takes two numbers and performs basic arithmetic operations (Addition, Multiplication, Subtraction).
* **OOP Concept:** Method separation for each arithmetic operation using `long` data type to prevent overflow.

### 3. Max and Min 📊
* **File:** `MaxAndMin.java`
* **Description:** Accepts 3 numbers and identifies the minimum and maximum values.
* **OOP Concept:** Conditional logic (`if-else`) encapsulated within a single method to return clean, formatted results.

### 4. Age in Days 📅
* **File:** `AgeInDays.java`
* **Description:** Converts a given number of days into years, months, and days.
* **OOP Concept:** Mathematical division and modulo (`%`) logic, returning the formatted output in distinct lines using `\n`.

### 5. Two Intervals 🗺️
* **File:** `TwoIntervals.java`
* **Description:** Finds the intersection boundaries between two distinct numerical intervals.
* **OOP Concept:** Boundary comparison logic. It finds the largest starting point and the smallest ending point, checking for overlap and returning `-1` if no intersection exists.

### 6. Hard Compare 🔍
* **File:** `HardCompare.java`
* **Description:** Compares two massive exponential expressions ($A^B$ vs $C^D$) where exponents reach up to $10^{12}$.
* **OOP Concept / Trick:** Advanced mathematical logic using Natural Logarithms ($\ln$) via `Math.log()` to safely compare huge numbers without triggering a memory overflow (`B * ln(A) > D * ln(C)`).
