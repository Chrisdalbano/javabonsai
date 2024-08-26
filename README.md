## Java Bonsai
A Java Application that uses a Bonsai class to print a Bonsai in the terminal when summoned.

### Core methods

The Bonsai class owns three methods to build the tree

```java
printTrunk();
printLeaves();
printRoots();

```
And the Bonsai constructor takes the following parameters:

```java
public Bonsai(int heightOfLeaves, int trunkWidth, int rootLength ) {

```

### How to construct a Bonsai ?
Begin by using the *Bonsai* constructor the following way 

```java
//Note that the parameters of the constructor are all integers
Bonsai yourTreeName = new Bonsai(heightOfLeaves, trunkWidth, rootLength);

//Then you can summon the method .displayBonsai()

yourTreeName.displayBonsai();
```

This will display a nice Tree in the console:
```java
This Tree properties: 
Height of leaves: 3
Trunk width: 2
Root length: 2
**
  **
 **
**
*
*

*
*

```
The current `Main` class has randomized values for our Bonsai: 

```java
int rn1 = ThreadLocalRandom.current().nextInt(1, 4);
int rn2 = ThreadLocalRandom.current().nextInt(1, 4);
int rn3 = ThreadLocalRandom.current().nextInt(1, 4);

Bonsai tree = new Bonsai(rn1, rn2, rn3);
```

### Important to note that the tree might look horrible, its more like a sapling :) 

