package model.base;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/


import java.util.*;

// line 9 "model.ump"
// line 26 "model.ump"
public class Group
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Group Associations
  private List<Cell> cells;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Group(Cell... allCells)
  {
    cells = new ArrayList<Cell>();
    boolean didAddCells = setCells(allCells);
    if (!didAddCells)
    {
      throw new RuntimeException("Unable to create Group, must have 9 cells. See https://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Cell getCell(int index)
  {
    Cell aCell = cells.get(index);
    return aCell;
  }

  public List<Cell> getCells()
  {
    List<Cell> newCells = Collections.unmodifiableList(cells);
    return newCells;
  }

  public int numberOfCells()
  {
    int number = cells.size();
    return number;
  }

  public boolean hasCells()
  {
    boolean has = cells.size() > 0;
    return has;
  }

  public int indexOfCell(Cell aCell)
  {
    int index = cells.indexOf(aCell);
    return index;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfCells()
  {
    return 9;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCells()
  {
    return 9;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfCells()
  {
    return 9;
  }
  /* Code from template association_SetUnidirectionalN */
  public boolean setCells(Cell... newCells)
  {
    boolean wasSet = false;
    ArrayList<Cell> verifiedCells = new ArrayList<Cell>();
    for (Cell aCell : newCells)
    {
      if (verifiedCells.contains(aCell))
      {
        continue;
      }
      verifiedCells.add(aCell);
    }

    if (verifiedCells.size() != newCells.length || verifiedCells.size() != requiredNumberOfCells())
    {
      return wasSet;
    }

    cells.clear();
    cells.addAll(verifiedCells);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    cells.clear();
  }

}