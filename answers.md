ACT 5
1 ► isEmpty()
        - the boolean expression could be incorrect
        - the size of the deck could not have been initialized properly
        - the size of the deck could have been changed during construction
        - a method could have changed the size to be incorrect
2 ► size()
        - the method could return something other than size
        - the size of the deck could not have been initialized properly
        - the size of the deck could have been changed during construction
        - a method could have changed the size to be incorrect
3 ► size() || isEmpty()
        - the allMatches variable is generated from these 2 functions which call no more than each other. This means that there could be a problem with either as listed above. There could be a faliure of the code to dectect when the deck is empty meaning that when the code compares the some of the unshuffeled cards which would probably be different. Since isEmpty is based on size a change in size could also affect it.
4 ►  deal || size() || isEmpty()
        - this kinda builds on all the errors so far which could effect it since deal is dependant on all the functions above. I think that there is likely a problem with the constructor that made the 1st card null (one off error). There are a lot of other possibilities as well becasue there are multiple functions that deal calls and lots of functions that could change the output of the methods deal calls.
