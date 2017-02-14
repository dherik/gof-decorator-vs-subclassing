# gof-decorator-vs-subclassing
Example from GoF (Gang of Four) about decorator vs subclassing. Implementation in Java.

From GoF:

> Suppose you have a TextView class. Then in some place you want a scrolled text view, so you subclass TextView and create ScrolledTextView class. And in some other place you want a border around text view. So you subclass again and create BorderedTextView. Well, now in some place you want border and scroll both. None of the previous two sub classes have both capability. So you need to create a 3rd one. When creating a ScrolledBorderedTextView you are actually duplicating the effort. You don't need this class if you have any way to compose the capability of previous two. Well, things can go worse and these may lead to unnecessary class explosion.

This project brings an implementation of this problem using Decorator and Subclassing. Enjoy! ;)
