Lesson 9: Unit 5
Converting Between Types

House house = new Dog(100, 100, "Fido.jpg");

Fails because 'Error: incompatible types. Dog is not a kind of House'  

=============================================================
Lesson 9: Unit 6
Converting Between Types

Drawable drawable = new Drawable(100,100);

Fails because: 'You can't contruct an interface type.' (Note the 'Drawable' on the rhs)
=============================================================
Lesson 9: Unit 7

Drawable drawable = new Rectangle(50,50,100,100);

Fails because: You can't assign an object of a class to a variable of an interface type the object's class does not implement.
