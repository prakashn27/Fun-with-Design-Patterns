####Problem:
2. Define in Java an external iterator for inorder traversal of a generic binary search tree (BST),
and use this iterator to define the equality of two BSTs. 
The external iterator should be generic and should support two public methods: a boolean function 
done(), which tests whether the iterator has any more values to yield, and a function next(), which 
returns the next value if the iterator is not yet done. It may contain other helper methods, which 
should be declared private. 
The equality test should repeatedly obtain one value from each tree, in alternating fashion, and 
compare these values for equality. It should return false if the values are not equal (mismatch). If there 
are no mismatches and the iterators are done at the same time, the equality test should return true.
Refer to the file GenericTreeEquality.java on PiazzaResourcesHomeworks. This file contains the 
complete definition of a generic BST, the main driver, and the outline of the iterator and equality test. 
Complete these definitions, run the program through JIVE and save the sequence diagram in 
GenericTreeEquality.png. Submit the .java and .png file online when you have completed them.
