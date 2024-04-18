### Programming Assignment: Implementing a Binary Search Tree

**Objective:** The purpose of this assignment is to develop a complete understanding of binary search trees through the implementation of its core operations. You will build functions to add, remove, and search for elements in a BST, as well as traverse it in various ways.

#### Requirements:

1. **Class Definition:**
   - Define a class named `Node` with attributes `data` (to store the node's value), `parent` (to point to the parent), `left` (to point to the left child), and `right` (to point to the right child).
   - Define a class named `BinarySearchTree` that has an attribute `root` which points to the root node of the tree.

2. **BST Operations:**
   - Implement the following methods within the `BinarySearchTree` class:
     - `insert(data)`: Inserts a new node with the specified `data` into the BST following the rules of BST insertion.
     - `delete(data)`: Removes the node containing `data` from the BST, ensuring the tree remains a valid BST after removal.
     - `search(data)`: Searches for a node with the specified `data` and returns `True` if found, otherwise `False`.
     - `find_min()`: Returns the minimum value found in the BST.
     - `find_max()`: Returns the maximum value found in the BST.
     - `successor(data)`: Returns the successor of the given node.
     - `in_order_traversal()`: Returns a list of elements in in-order traversal (left, root, right).
     - `pre_order_traversal()`: Returns a list of elements in pre-order traversal (root, left, right).
     - `post_order_traversal()`: Returns a list of elements in post-order traversal (left, right, root).

3. **Testing:**
   - Write a testing script where you:
     - Create an instance of `BinarySearchTree`.
     - Insert multiple elements into the BST.
     - Perform search operations for both existing and non-existing elements.
     - Display the tree using in-order, pre-order, and post-order traversals.
     - Delete elements and display the tree after each deletion.
     - Find and print the minimum and maximum values in the BST.

#### Deliverables:
- A source code file containing the implementation of the `Node` and `BinarySearchTree` classes along with all required methods.
- A separate source code file for the testing script demonstrating the usage of tree operations.
