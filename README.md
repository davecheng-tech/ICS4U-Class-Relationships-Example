# ICS4U Class Relationships Practice

This is an example of a series of related classes demonstrating HAS-A (i.e. aggregate) and IS-A (i.e.inheritance) relationships.

Implement the classes for `Person`, `TeamMember`, `Coach`, `Player`, and `Team` as per this [UML Class Diagram](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-class-diagram-tutorial/):

![diagram](images/diagram.png)

## Instructions
- Study the UML Class Diagram above. 
- Note the names and data types of the instance variables. The `-` symbol indicates these variables should be private to the class.
- Note the names, parameters, and return data types of the instance methods. The `+` symbol indicates these methods should be public.
- Write the code to implement these classes in the suggested order of `Person`, `TeamMember`, `Coach`, `Player`, and finally `Team`.
- You should not modify any of the code in `TeamDemo.java`. It should run successfully when all classes are implemented properly.

## Runtime Demonstration

You do not need to touch any of the code in the `TeamDemo.java` file!

Once the `Person`, `TeamMember`, `Coach`, `Player`, and `Team` classes are complete (with proper instance variables, constructors, and methods) the code in `TeamDemo.java` should execute cleanly and produce the following output:

```
Team 1: Toronto Raptors
Coach: Nick Nurse | Wins: 58 | Losses: 24 | Win Percentage: 70.73170731707317
Players:
Kawhi Leonard | Position: Forward | PPG: 26.6 | RPG: 7.3
Kyle Lowry | Position: Guard | PPG: 14.2 | RPG: 4.8
Marc Gasol | Position: Center | PPG: 9.1 | RPG: 6.6
Pascal Siakam | Position: Forward | PPG: 16.9 | RPG: 6.9
Danny Green | Position: Guard | PPG: 10.3 | RPG: 4.0
Total Team Salary: $1.009E8
Team Size: 5

Team 2: Golden State Warriors
Coach: Steve Kerr | Wins: 57 | Losses: 25 | Win Percentage: 69.51219512195121
Players:
Stephen Curry | Position: Guard | PPG: 27.3 | RPG: 5.3
Klay Thompson | Position: Guard | PPG: 21.5 | RPG: 3.8
Draymond Green | Position: Forward | PPG: 7.4 | RPG: 7.3
Kevin Durant | Position: Forward | PPG: 26.0 | RPG: 6.4
DeMarcus Cousins | Position: Center | PPG: 16.3 | RPG: 8.2
Total Team Salary: $1.28393903E8
Team Size: 5
```