# Favor Composition over Inheritance (FCoI)
## Purpose & Structure

The Purpose of this Project is to show a good and a bad example for the Favor Composition over Inheritance (FCoI)
principle. It was created for purely educational purposes as a school-project and is not meant to be used in any professional
capacity.

The examples are made in Java and will be split into two packages: `good` and `bad`.
As the names suggest, the `good` package will contain a good example of the FCoI principle,
while the `bad` package will contain a bad example, and both can be run though their respective `Main` classes.

# What is FCoI?

Favor Composition over Inheritance is a principle in object-oriented programming that suggests that classes should 
preferably be implemented using composition over inheritance. This means that classes should be designed to be composed of other classes, rather
than inheriting from a parent class.

This is because inheritance can lead to a number of problems, such as the fragile base class problem, the duplication of
code, and the inability to change the behavior of a class at runtime.
Composition, on the other hand, allows for greater flexibility and reusability, as classes can be composed of other
classes at runtime, rather than being bound to a parent class at compile time.

The Design Pattern I chose to implement FCoI in a Project is the [Decorator Pattern](https://refactoring.guru/design-patterns/decorator),
because the use of Interfaces is one of the simplest ways to implement Composition.

## Example Explanations

Both examples will be based on the following scenario:
A Car class that can have either a Combustion or an Electric Engine, and a `Start` method
that will output a string based on the engine type.

While the bad example will use inheritance to implement the Car class, the good example will use composition.
The main difference between the two examples is that the bad example will have a `CombustionCar` and an `ElectricCar`,
which becomes a problem when you would like to change a car's engine type at runtime. The only way to achieve this
would be to create a new car object with the desired engine type, which is not ideal since properties like `chassisNumber`
that cannot be assigned by the user would be changed.

The good example, on the other hand, will have a `Car` class that is composed of an `Engine` class, which can be either
a `CombustionEngine` or an `ElectricEngine`. This allows for greater flexibility and reusability, as the engine type can
be changed at runtime by simply changing the engine object that the car is composed of.

## Usage Instructions

To run the examples, simply clone the repository and run the `Main` class in the `good` or `bad` package.

## Maintainer and Contributors

This Project is maintained by me, [Christian Nuttli](https://github.com/ChrisNuttli) alone.

## References
- [clean code](https://clean-code-developer.de/die-grade/roter-grad/#elementor-toc__heading-anchor-7)
- [Medium - Fcoi](https://sheldonrcohen.medium.com/favoring-composition-over-inheritance-ff2ece6b7b4e)
- [Decorator Pattern](https://refactoring.guru/design-patterns/decorator)
