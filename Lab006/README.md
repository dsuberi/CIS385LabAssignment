## Programming Assignment: Implementing a Singly Linked List

### Objective 
The purpose of this assignment is to implement the basic operations of a singly linked list data structure. You will understand how linked lists function through hands-on practice by creating methods to manipulate them.

### Requirements
1. Class Definition:
   - Define a class named ```Node``` with at least two attributes: ```data``` (to store the node's value) and ```next``` (to point to the next node in the list).
   - Define a class named ```LinkedList``` that has the attribute ```first``` and ```last``` which points to the first and last node of the list.
2. LinkedList Operations:
    - Implement the following methods within the LinkedList class:
      - ```insertFirst(data)```: Inserts a new node with the specified data at the **beginning** of the list.
      - ```insertFirst(data)```: Inserts a new node with the specified data at the **end** of the list.
      - ```insertLast(data)```: Inserts a new node with the specified data at the beginning of the list.
      - ```insertNodeAtPosition(position, data)```: Inserts a new node with the specified data at a specified position.
      - ```deleteFirst()```: Remove the node at the beginning of the list 
      - ```deleteNodeAtPosition(position):``` Removes the node at the specified position.
      - ```find(data)```: Searches for a node with data and returns True if found, else False.
      - ```display()```: Prints out the elements in the list.
      - ```length()```: Returns the number of nodes in the list.

3. Testing:
   - Write a testing script where you:
     - Create an instance of LinkedList.
     - Use the ```insertFirst``` and ```insertLast``` methods to add elements to the list.
     - Display the list using the ```display``` method.
     - Delete an element using ```deleteFirst``` and ```deleteNodeAtPosition``` method.
     - Search for elements using the ```find``` method.
     - Print the length of the list using the ```length``` method.

### Deliverables

- A source code file containing the implementation of the Node and LinkedList classes along with all the required methods.
- A separate source code file for the testing script showing the usage of linked list operations.
