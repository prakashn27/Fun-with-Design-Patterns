###Problem:

1. An important technique in the study of Design Patterns is the use of `delegation' to replace
`class inheritance'. A systematic way for doing this transformation was sketched in Lecture 14. 
Extend this technique so that the inheritance of attributes and methods, and also method over-riding 
are handled. Apply the resulting technique to the program in Delegation.java which defines four 
classes, C1, C11, C111, and C112, where the classes C111 and C112 extend C11 which in turn 
extends C1. 
The result of your transformation should be four classes called D1, D11, D111, and D112 which 
correspond to C1, C11, C111, and C112 respectively, but do not make use of class inheritance. 
Make the classes D1, D11, D111, and D112 implement interfaces I1, I11, I111 and I112 
respectively, where the interfaces I111 and I112 should inherit from I11 which in turn should 
inherit from I1. Define these interfaces suitably.
Refer to the file Delegation.java on PiazzaResourcesHomeworks. This file contains the ‘C’ 
classes and also a driver class called Delegation. It also contains the outline of the ‘D’ classes and 
the interfaces. Complete the ‘D’ classes and the interfaces in the same file. Run the program
through JIVE and save the sequence diagram in Delegation.png. Submit online the files 
Delegation.java and Delegation.png when you have completed them.
*Important: For full credit, the transformation should be done in a systematic way.*
