# kata-roman-numerals
Write a number with roman symbols.
Here is its Wikipedia definition : https://fr.wikipedia.org/wiki/Num%C3%A9ration_romaine

Examples of Roman symbols :

Roman symbol | I | IV | V | IX | X | XX | XL | L | XC | C |
--- | --- | --- | --- |--- |--- |--- |--- |--- |--- |--- |
Value | 1 | 4 | 5 | 9 | 10 | 20 | 40 | 50 | 90 | 100 |


## TDD
The aim of this kata is to practise TDD and to have a good 
understanding of Unit testing and its implementation.
#### Cycles

Objective : 
- write code motivated by the design and by the functional test requirements. 
  - “As the tests get more specific, the code gets more generic.”
 
On Each cycle, we want to :
- make tests more specific,
- make code more generic.

Cycles of the roman numerals kata :

* Cycle 1 : 1 .. 3
* Cycle 2 : 5
* Cycle 3 : 6 .. 8
* Cycle 4 : 4
* Cycle 5 : 9
* Cycle 6 : 10 .. 30
* Cycle 7 : 50
* Cycle 8 : 60 .. 80
* Cycle 9 : 40
* Cycle 10 : 90

...

## Unit Test
### F.I.R.S.T
**F** Fast

**I** Independant (or Isolated)

**R** Repeatable

**S** Self validating

**T** Timely

### But, when a test is not considered as TU ?!
 - when it queries DB,
 - when it deals with network,
 - when it uses FS,
 _ when it can not be //
 - when it needs environment preparation before execution  

