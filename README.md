# Algorithms & Data structure (from uni course)

### This repository is designed to prepare for midterm exams and tests in the course "Algorithms and Data Structures".

***

**Every demo prints:**

1. **Initial state** of the data
2. **Per-iteration logs** showing index positions, comparisons, and swaps
3. **Resulting state** after each pass
4. **Final sorted / searched / traversed output**

## 🚀 Getting Started

1. **Clone the repo**
   ~~~bash
   git clone https://github.com/queenofmadhouse/AlgorithmsAndDataStructuresUNI.git
   cd AlgorithmsAndDataStructuresUNI
   ~~~
2. **Compile**
   ~~~bash
   javac -d out $(find src -name "*.java")
   ~~~
3. **Run (Bubble sort, for example)**
   ~~~bash
   java -cp out algorithms.sorting.BubbleSort
   ~~~
   
***

## Example output
~~~bash
----------------------------------------------------------

Bubble Sort
Array before sorting: [11, 1, 2, 12, 3, 13, 4, 14, 5, 15]

----------------------------------------------------------




----------------------------------------------------------
Iteration 0
Array before iteration: [11, 1, 2, 12, 3, 13, 4, 14, 5, 15]
j = 0; limit = 9; arr[j] = 11; arr[j+1] = 1; - Swapping 11 and 1
j = 1; limit = 9; arr[j] = 11; arr[j+1] = 2; - Swapping 11 and 2
j = 2; limit = 9; arr[j] = 11; arr[j+1] = 12; - No swap
j = 3; limit = 9; arr[j] = 12; arr[j+1] = 3; - Swapping 12 and 3
j = 4; limit = 9; arr[j] = 12; arr[j+1] = 13; - No swap
j = 5; limit = 9; arr[j] = 13; arr[j+1] = 4; - Swapping 13 and 4
j = 6; limit = 9; arr[j] = 13; arr[j+1] = 14; - No swap
j = 7; limit = 9; arr[j] = 14; arr[j+1] = 5; - Swapping 14 and 5
j = 8; limit = 9; arr[j] = 14; arr[j+1] = 15; - No swap
Array after iteration:  [1, 2, 11, 3, 12, 4, 13, 5, 14, 15]
----------------------------------------------------------




----------------------------------------------------------
Iteration 1
Array before iteration: [1, 2, 11, 3, 12, 4, 13, 5, 14, 15]
j = 0; limit = 8; arr[j] = 1; arr[j+1] = 2; - No swap
j = 1; limit = 8; arr[j] = 2; arr[j+1] = 11; - No swap
j = 2; limit = 8; arr[j] = 11; arr[j+1] = 3; - Swapping 11 and 3
j = 3; limit = 8; arr[j] = 11; arr[j+1] = 12; - No swap
j = 4; limit = 8; arr[j] = 12; arr[j+1] = 4; - Swapping 12 and 4
j = 5; limit = 8; arr[j] = 12; arr[j+1] = 13; - No swap
j = 6; limit = 8; arr[j] = 13; arr[j+1] = 5; - Swapping 13 and 5
j = 7; limit = 8; arr[j] = 13; arr[j+1] = 14; - No swap
Array after iteration:  [1, 2, 3, 11, 4, 12, 5, 13, 14, 15]
----------------------------------------------------------




----------------------------------------------------------
Iteration 2
Array before iteration: [1, 2, 3, 11, 4, 12, 5, 13, 14, 15]
j = 0; limit = 7; arr[j] = 1; arr[j+1] = 2; - No swap
j = 1; limit = 7; arr[j] = 2; arr[j+1] = 3; - No swap
j = 2; limit = 7; arr[j] = 3; arr[j+1] = 11; - No swap
j = 3; limit = 7; arr[j] = 11; arr[j+1] = 4; - Swapping 11 and 4
j = 4; limit = 7; arr[j] = 11; arr[j+1] = 12; - No swap
j = 5; limit = 7; arr[j] = 12; arr[j+1] = 5; - Swapping 12 and 5
j = 6; limit = 7; arr[j] = 12; arr[j+1] = 13; - No swap
Array after iteration:  [1, 2, 3, 4, 11, 5, 12, 13, 14, 15]
----------------------------------------------------------




----------------------------------------------------------
Iteration 3
Array before iteration: [1, 2, 3, 4, 11, 5, 12, 13, 14, 15]
j = 0; limit = 6; arr[j] = 1; arr[j+1] = 2; - No swap
j = 1; limit = 6; arr[j] = 2; arr[j+1] = 3; - No swap
j = 2; limit = 6; arr[j] = 3; arr[j+1] = 4; - No swap
j = 3; limit = 6; arr[j] = 4; arr[j+1] = 11; - No swap
j = 4; limit = 6; arr[j] = 11; arr[j+1] = 5; - Swapping 11 and 5
j = 5; limit = 6; arr[j] = 11; arr[j+1] = 12; - No swap
Array after iteration:  [1, 2, 3, 4, 5, 11, 12, 13, 14, 15]
----------------------------------------------------------

...

~~~
