package model.base;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/


import java.util.*;

// line 2 "model.ump"
// line 21 "model.ump"
public class Cell
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Cell Attributes
  private int number;
  private List<Integer> possible_numbers;
  private boolean given;
  private boolean solved;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Cell(int aNumber, boolean aGiven, boolean aSolved)
  {
    number = aNumber;
    possible_numbers = new ArrayList<Integer>();
    given = aGiven;
    solved = aSolved;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNumber(int aNumber)
  {
    boolean wasSet = false;
    number = aNumber;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addPossible_number(Integer aPossible_number)
  {
    boolean wasAdded = false;
    wasAdded = possible_numbers.add(aPossible_number);
    return wasAdded;
  }

  public boolean removePossible_number(Integer aPossible_number)
  {
    boolean wasRemoved = false;
    wasRemoved = possible_numbers.remove(aPossible_number);
    return wasRemoved;
  }

  public boolean setGiven(boolean aGiven)
  {
    boolean wasSet = false;
    given = aGiven;
    wasSet = true;
    return wasSet;
  }

  public boolean setSolved(boolean aSolved)
  {
    boolean wasSet = false;
    solved = aSolved;
    wasSet = true;
    return wasSet;
  }

  public int getNumber()
  {
    return number;
  }
  /* Code from template attribute_GetMany */
  public Integer getPossible_number(int index)
  {
    Integer aPossible_number = possible_numbers.get(index);
    return aPossible_number;
  }

  public Integer[] getPossible_numbers()
  {
    Integer[] newPossible_numbers = possible_numbers.toArray(new Integer[possible_numbers.size()]);
    return newPossible_numbers;
  }

  public int numberOfPossible_numbers()
  {
    int number = possible_numbers.size();
    return number;
  }

  public boolean hasPossible_numbers()
  {
    boolean has = possible_numbers.size() > 0;
    return has;
  }

  public int indexOfPossible_number(Integer aPossible_number)
  {
    int index = possible_numbers.indexOf(aPossible_number);
    return index;
  }

  public boolean getGiven()
  {
    return given;
  }

  public boolean getSolved()
  {
    return solved;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isGiven()
  {
    return given;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isSolved()
  {
    return solved;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "number" + ":" + getNumber()+ "," +
            "given" + ":" + getGiven()+ "," +
            "solved" + ":" + getSolved()+ "]";
  }
}