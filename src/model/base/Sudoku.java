/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/


import java.util.*;

// line 13 "model.ump"
// line 32 "model.ump"
public class Sudoku
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Sudoku Associations
  private List<Group> rows;
  private List<Group> columns;
  private List<Group> groups;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Sudoku(Group[] allRows, Group[] allColumns, Group[] allGroups)
  {
    rows = new ArrayList<Group>();
    boolean didAddRows = setRows(allRows);
    if (!didAddRows)
    {
      throw new RuntimeException("Unable to create Sudoku, must have 9 rows. See https://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    columns = new ArrayList<Group>();
    boolean didAddColumns = setColumns(allColumns);
    if (!didAddColumns)
    {
      throw new RuntimeException("Unable to create Sudoku, must have 9 columns. See https://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    groups = new ArrayList<Group>();
    boolean didAddGroups = setGroups(allGroups);
    if (!didAddGroups)
    {
      throw new RuntimeException("Unable to create Sudoku, must have 9 groups. See https://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Group getRow(int index)
  {
    Group aRow = rows.get(index);
    return aRow;
  }

  public List<Group> getRows()
  {
    List<Group> newRows = Collections.unmodifiableList(rows);
    return newRows;
  }

  public int numberOfRows()
  {
    int number = rows.size();
    return number;
  }

  public boolean hasRows()
  {
    boolean has = rows.size() > 0;
    return has;
  }

  public int indexOfRow(Group aRow)
  {
    int index = rows.indexOf(aRow);
    return index;
  }
  /* Code from template association_GetMany */
  public Group getColumn(int index)
  {
    Group aColumn = columns.get(index);
    return aColumn;
  }

  public List<Group> getColumns()
  {
    List<Group> newColumns = Collections.unmodifiableList(columns);
    return newColumns;
  }

  public int numberOfColumns()
  {
    int number = columns.size();
    return number;
  }

  public boolean hasColumns()
  {
    boolean has = columns.size() > 0;
    return has;
  }

  public int indexOfColumn(Group aColumn)
  {
    int index = columns.indexOf(aColumn);
    return index;
  }
  /* Code from template association_GetMany */
  public Group getGroup(int index)
  {
    Group aGroup = groups.get(index);
    return aGroup;
  }

  public List<Group> getGroups()
  {
    List<Group> newGroups = Collections.unmodifiableList(groups);
    return newGroups;
  }

  public int numberOfGroups()
  {
    int number = groups.size();
    return number;
  }

  public boolean hasGroups()
  {
    boolean has = groups.size() > 0;
    return has;
  }

  public int indexOfGroup(Group aGroup)
  {
    int index = groups.indexOf(aGroup);
    return index;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfRows()
  {
    return 9;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRows()
  {
    return 9;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfRows()
  {
    return 9;
  }
  /* Code from template association_SetUnidirectionalN */
  public boolean setRows(Group... newRows)
  {
    boolean wasSet = false;
    ArrayList<Group> verifiedRows = new ArrayList<Group>();
    for (Group aRow : newRows)
    {
      if (verifiedRows.contains(aRow))
      {
        continue;
      }
      verifiedRows.add(aRow);
    }

    if (verifiedRows.size() != newRows.length || verifiedRows.size() != requiredNumberOfRows())
    {
      return wasSet;
    }

    rows.clear();
    rows.addAll(verifiedRows);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfColumns()
  {
    return 9;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfColumns()
  {
    return 9;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfColumns()
  {
    return 9;
  }
  /* Code from template association_SetUnidirectionalN */
  public boolean setColumns(Group... newColumns)
  {
    boolean wasSet = false;
    ArrayList<Group> verifiedColumns = new ArrayList<Group>();
    for (Group aColumn : newColumns)
    {
      if (verifiedColumns.contains(aColumn))
      {
        continue;
      }
      verifiedColumns.add(aColumn);
    }

    if (verifiedColumns.size() != newColumns.length || verifiedColumns.size() != requiredNumberOfColumns())
    {
      return wasSet;
    }

    columns.clear();
    columns.addAll(verifiedColumns);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfGroups()
  {
    return 9;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGroups()
  {
    return 9;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfGroups()
  {
    return 9;
  }
  /* Code from template association_SetUnidirectionalN */
  public boolean setGroups(Group... newGroups)
  {
    boolean wasSet = false;
    ArrayList<Group> verifiedGroups = new ArrayList<Group>();
    for (Group aGroup : newGroups)
    {
      if (verifiedGroups.contains(aGroup))
      {
        continue;
      }
      verifiedGroups.add(aGroup);
    }

    if (verifiedGroups.size() != newGroups.length || verifiedGroups.size() != requiredNumberOfGroups())
    {
      return wasSet;
    }

    groups.clear();
    groups.addAll(verifiedGroups);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    rows.clear();
    columns.clear();
    groups.clear();
  }

}