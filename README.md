# SudokuSolver
A full stack project to visualize and see the solving of a sudoku grid with human sudoku solving techniques

# Technolgies
_Technologies I wanna use_
1. Java
2. JavaSpring
3. Java unit Test and integration testing
4. MVC
5. CRUD
6. Travis CI
7. Kanban Board
8. UML
9. React JS
10. AWS
11. Some form of database preferably DB2 -- To Store Sudokus
12. Selenium
13. Typescript
14. Docker

# Model

## **Cell** 
Number: _Integer_ \
Possible_Numbers: _ArrayList<Integer>_\
Given: _boolean_\ 
Solved: _boolean_

### <u>Methods</u>

- **Reset():** \
_Check if all the attributes are consistent_ 
>`If this.Given or this.Solved,` \
&ensp;&ensp;`{` \
&ensp;&ensp;`this.Number is in [0-9]` \
&ensp;&ensp;`this.Possible_Numbers = empty,` \
&ensp;&ensp;`}` \
`else: this.Number = null`
- **Remove(num)** \
_Remove num from the list of possible number_ \
>`PossibleNumbers.remove(num)`
- **NakedSingle()** \
_Check if the cell is a naked single aka has only one option to be filled in_
>`If size(this.PossibleNumbers) == 1:` \
&ensp;&ensp;`this.Number = this.PossibleNumbers[0]` \
&ensp;&ensp;`this.Solved = True` \
&ensp;&ensp;`this.PossibleNumbers = empty`

## Group
_List of 9 numbers_ \
Cells: _ArrayList<Cell>_ \

### <u>Methods</u>

- **Single(num)** \
_Check if there is only one possibility for num in the list of 9 numbers_