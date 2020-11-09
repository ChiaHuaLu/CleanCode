##Args Implementation

Listing 14-2 is the implementation of the `Args` class. Please read it very carefully. 
I worked hard on the style and structure and hope it is worth emulating.

---
`Listing 14-2`  
`Args.java`
---
Notice that you can read this code from the top to the bottom without a lot of 
jumping around or looking ahead. The one thing you may have had to look ahead for 
is the definition of `ArgumentMarshaler`, which I left out intentionally. 
Having read this code carefully, you should understand what the 
`ArgumentMarshaler` interface is and what its derivatives do. 
I'll show a few of them to you now (Listing 14-3 through Listing 14-6)
---
`Listing 14-3`  
`ArgumentMarshaler.java`

`Listing 14-4`  
`BooleanArgumentMarshaler.java`

`Listing 14-5`  
`StringArgumentMarshaler.java`

`Listing 14-6`  
`IntegerArgumentMarshaler.java`
---
The other `ArgumentMarshaler` derivatives simply replicate this pattern for `doubles`
and `String` arrays and would serve to clutter this chapter. I'll leave them to you
as an exercise.

One other bit of information might be troubling to you: the definition of the 
error code constants. They are in the `ArgsException` class (Listing 14-7)
---
`Listing 14-7`  
`ArgsException.java`
---
Please read the code over one more time. Pay special attention to the way 
things are named, the size of the functions, and the formatting of the code. 
If you are an experienced programmer, you may have some quibbles here and there 
with various parts of the style or structure. Overall, however, I hope 
you conclude that this program is nicely written and has a clean structure.

For example, it should be obvious how you would add a new argument type, 
such as a date argument or a complex number argument, and that such an addition 
would require a trivial amount of effort. In short, it would simply require 
a new derivative of `ArgumentMarshaler`, annew `getXXX` function, 
and a new case statement in the parseSchemaElement function. 
There would also probably be a new `ArgsException.ErrorCode` and a new error message.

##How Did I Do This?
Let me set your mind at rest. I did not simply write this program from 
beginning to end in its current form. More importantly, I am not expecting you 
to be able to write clean and elegant programs in one pass. 
If we have learned anything over the last couple of decades, it is that 
programming is a craft more than it is a science. To write clean code, 
you must first write dirty code *and then clean it*.

This should not be a surprise to you. We learned this truth in grade school 
when out teachers tried (usually in vain) to get us to write rough drafts 
of our compositions. The process, they told us, was that we should write 
a rough draft, then a second draft, then several subsequent drafts
 until we had our final version. Writing clean compositions, 
 they tried to tell us, is a matter of successive refinement.
 
 Most freshman programmers (like most grade-schoolers) don't follow this advice 
 particularly well. They believe that the primary goal is to get 
 the program working. Once it's "working", they move on to the next task, 
 leaving the "working" program in whatever state they finally got it to "work". 
 Most seasoned programmers know that this is professional suicide.