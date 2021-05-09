!!! Main is in The_Raven  !!!

# Java_Final_Project
My code base for my java project.

You will be creating a Mad Lib based on the poem The Raven. Every time you run the program, a different set of words
will be displayed.

Use the attached interfaces for Class1 and Class2. Class1 and Class2 only have the public methods provided in the
interface. Any other methods need to be non-public. All the words used in the program need to be contained in a
collection (ie. verbs, nouns, plural nouns, places, female names, etc.). Each collection needs to have at least 10
elements. The elements may be hard coded or read from a file (Chapter 17). All String getXXX() methods need to return
a random String from the collection.

The Client calls Class1 and Class2. The Client displays the Mad Lib based on the data provided from Class 1 and Class 2.

Note: Since your Client is only calling the public methods provided in the interface, your project should be
compatible with another teams Class1 and Class2 code.



Structure:

Class1 (use linked or array lists)

Contains the following collections:
adjectives
nouns

Class2 (use linked or array lists)

Contains the following collections:
adverbs
verbs

Client (calls classes)

Contains the following collections:
female names
places
nouns - plural nouns (special case not in the other classes)
verbs - ending in "ed" (special case not in the other classes)
verbs - ending in "ing" (special case not in the other classes)
