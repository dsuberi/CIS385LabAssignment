## Abstraction

### Class Diagram

Write a test class to implement the methods of the class Counter

```mermaid
classDiagram
      class Counter{
            -String name
            -int count
            +Counter(String)
            +void increment()
            +int tally()
            +String toString()
      }
```


```Java
public class Counter
{
    private String name;
    private int count;

    public Counter(String id)
    {
        name = id;
    }

    public void increment()
    {
        count++;
    }

    public int tally()
    {
        return count;
    }

    public String toString()
    {
        return count + " " + name;
    }
}
```


