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
- **Remove(num: int)** \
_Remove num from the list of possible number_ \
>`PossibleNumbers.remove(num)`
- **NakedSingle()** \
_Check if the cell is a naked single aka has only one option to be filled in_
>`If size(this.PossibleNumbers) == 1:` \
&ensp;&ensp;`this.Number = this.PossibleNumbers[0]` \
&ensp;&ensp;`this.Solved = True` \
&ensp;&ensp;`this.PossibleNumbers = empty`

## Group
_List of 9 numbers representing a column, row or box_ \
Cells: _ArrayList\<Cell>_ 

### <u>Methods</u>

- **Single(num:int)** \
_Check if there is only one possibility for num in the list of 9 numbers_

- **possibilities(num:int)** \
_Return the list of cells where num can be placed_

- **pair()** \
_if 2 nums can be placed in the exact 2 cells, remove other nums in the 2 cells and the 2 nums from the other cells_

- **triple()** \
_if 3 nums can be placed in the exact 3 cells, remove other nums in the 3 cells and the 3 nums from the other cells_

- **clear()** \
_For every given or cleared cell, remove the numbers from the rest of the cells_

## Sudoku
_List of 9 groups(rows), giving a full sudoku grid_ \
rows: _ArrayList\<Group>_ 
columns: _ArrayList\<Group>_ 
boxes: _ArrayList\<Group>_ 

### <u>Methods</u>
- **SingleGroup(num:int)** \
_Calls Group.Single(num) for every num_

- **SingleCell()** \
_Check if there is a naked single in every cell_

- **Single(num:int)** \
_Check if there is only one possibility for num in the list of 9 numbers_

- **clear()** \
_Calls Group.clear() for every Group_

- **makeColumns(rows:_ArrayList\<Group>_)** \
_Converts a list of rows into a list of columns_

- **makeGroups(rows:_ArrayList\<Group>_)** \
_Converts a list of rows into a list of boxes_

- **pairUp()** \
_Calls Group.pair() for every num_

- **fromString(txt: String)** \
_Makes a list of cells from the String_