# Design Patterns

**Creational**- creational design patterns deal with the process of object creation, trying to make it more flexible and efficient. It makes the system independent and how its objects are created, composed, and represented.

**Structural** - Structural design patterns focus on the composition of classes or objects to form larger, more complex structures. They help in organizing and managing relationships between objects to achieve greater flexibility, reusability, and maintainability in a software system.

**Behavioral** - Behavioral design patterns  deal with the communication and interaction between objects and classes. They focus on how objects and classes collaborate and communicate to accomplish tasks and responsibilities

## Creational Design Pattern

### Factory Design Pattern 
- The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class. Example: here

Example: [Factory](./src/CreationalDesignPaterns/factoryDesign)

### Abstract Factory
- Abstract Factory pattern is almost similar to Factory Pattern and is considered as another layer of abstraction over factory pattern.
- Abstract Factory patterns work around a super-factory which creates other factories.
- Abstract factory pattern implementation provides us with a framework that allows us to create objects that follow a general pattern.
- So at runtime, the abstract factory is coupled with any desired concrete factory which can create objects of the desired type.

Example: [Abstract Factory](./src/CreationalDesignPaterns/abstractFactoryDesign)

### Builder
- Problem with Method Chaining: In java, Method Chaining is used to invoke multiple methods on the same object which occurs as a single statement. Method-chaining is implemented by a series of methods that return the this reference for a class instance.
- Need of Builder Pattern: Method chaining is a useful design pattern but however if accessed concurrently, a thread may observe some fields to contain inconsistent values. Although all setter methods in above example are atomic, but calls in the method chaining can lead to inconsistent object state when the object is modified concurrently.

Example: [Builder Factory](./src/CreationalDesignPaterns/builderDesign)

### Singleton
- Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine.
- The singleton class must provide a global access point to get the instance of the class.
- Singleton pattern is used for logging, drivers objects, caching, and thread pool.
- Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade, etc.
- Singleton design pattern is used in core Java classes also (for example, java.lang.Runtime, java.awt.Desktop).

Example: [Singleton](./src/CreationalDesignPaterns/singletonDesign)

### Prototype
- The Prototype Design Pattern is a creational pattern that enables the creation of new objects by copying an existing object. 
- Prototype allows us to hide the complexity of making new instances from the client.
- The concept is to copy an existing object rather than create a new instance from scratch, something that may include costly operations. 
- The existing object acts as a prototype and contains the state of the object.

Example: [Prototype](./src/CreationalDesignPaterns/prototypeDesign)

## Structural Design Pattern

### Adapter
- The Adapter design pattern is a structural pattern that allows the interface of an existing class to be used as another interface. 
- It acts as a bridge between two incompatible interfaces, making them work together. 
- This pattern involves a single class, known as the adapter, which is responsible for joining functionalities of independent or incompatible interfaces.



