##Boolean Only
Early version of Args parser, pre-first refactoring

---
`Listing 14-9`  
`Args.java` (Boolean only)
---
Although you can find plenty to complain about in this code, 
it's really not that bad. It's compact and simple and easy to understand. 
However, within this code it is easy to see the seeds of the later 
festering pile. It's quite clear how this grew into the latter mess.

##Boolean and String
The addition of just two more argument types had a massively negative impact 
on the code. It converted it from something that would have been 
reasonably maintainable into something that I would expect to become riddled 
with bugs and warts.

I added the two argument types incrementally. First, I added the `String` argument,
which yielded this:
---
`Listing 14-10`  
`Args.java` (Boolean and String)
---
You can see that this is starting to get out of hand. It's still not horrible, 
but the mess is certainly starting to grow. It's a pile, but it's not 
festering quite yet. It took the addition of the integer argument type 
to get this pile really fermenting and festering.

So I Stopped

I had at least two more argument types to add, and I could tell that 
they would make things much worse. If I bulldozed my way forward, 
I could probably get them to work, but I'd leave behind a mess that was too large
to fix. if the structure of this code was ever going to be maintainable, 
now was the time to fix it.

So I stopped adding features and started refactoring. 
Having just added the `String` and `integer` arguments, I knew that 
each argument type required new code in three major places. First, 
each argument type required some way to parse its schema element 
in order to select the `HashMap` for that type. Next, 
each argument type needed to be parsed in the command-line strings 
and converted to its true type. Finally, each argument type needed a 
`getXXX` method so that it could be returned to the caller as its true type.

Many different types, all with similar methods--that sounds like a class to me. 
And so the `ArgumentMarshaler` concept was born

##Incrementalism
The first change I made was to add the skeleton of the `ArgumentMarshaller` 
to the end of the festering pile (Listing 14-11).
---
`Listing 14-11`  
`ArgumentMarshaller appended to Args.java`
---
