# StatePattern
Software design pattern
Now we are ready to implement our Context object that will change it’s behaviour based on it’s internal state.

First of all we will create State interface that 
will define the method that should be implemented 
by different concrete states and context class.

In our example, we can have two states 
-->one for turning TV on and another to turn it off. 
So we will create two concrete state implementations for these behaviour.
