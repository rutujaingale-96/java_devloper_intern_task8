<h3>Interfaces & Abstraction – Payment Gateway Simulator</h3>
<h5>Interface:</h5>
Payment is a blueprint. Every payment method must implement the pay() method.

<h5> Abstraction:</h5>
User does not know how payment is processed internally — they just call pay().

 <h5>Loose Coupling:</h5>
We use:

Payment payment;


So we can switch between Credit Card, UPI, or Cash easily.

<h5> Multiple Inheritance:</h5>
Java does not allow multiple class inheritance, but allows multiple interfaces.
