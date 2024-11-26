## Endless Loop
```
START    CLR.W    D0        Clear variables D0

LOOP     ADD.W    #1,D0     Add value 1 to variable D0
         BNE      LOOP      Continue loop till D1 is 0
```

---
## Count Down
```
START    MOVE.W   #10,D0    Set variable D0 to 10

LOOP     SUB.W    #1,D0     Subtract 1 of variable D0
         BNE      LOOP      Continue loop till someone reaches the value 0
```

---
## Normal Counter
```
START    CLR.W    D0         Clear variable D0
         MOVE.W   #10,D1     Set variable D1 to value 10

LOOP     ADD.W    #1,D0      Add value 1 to variable D0
         SUB.W    #1,D1      Subtract value 1 from variable D1
         BNE      LOOP       Continue loop till someone reaches the value 0
```
In this Example, D0 will be SUM and D1 our COUNTER


---
## Normal Counter + Variables Name
```
START    CLR.W    SUM
         MOVE.W   COUNT,D0   Load COUNT value inside variable D0
                             (to not lose the original value of COUNT)

LOOP     ADD.W    #1,SUM     Add value 1 to variable SUM
         SUB.W    #1,D0      Subtract by 1 the value of D0
         BNE      LOOP       Continue loop till someone reaches the value 0

SUM      DS.W     1          Define normal variable or Reserve Word SUM
							 (by reserving with one value)
COUNT    DC.W     10         Define constant variable or Reserve Word COUNT (as const)
```

---
## Original Program
```
00000000                  1  
00000000                  2          ORG     $0 
00000000  00008000        3          DC.L    $8000      Stack pointer value after a reset
00000004  00002000        4          DC.L    START      Program counter value after a reset
00000008                  5  
00000008                  6  
00002000                  7          ORG     $2000      Start at location 2000 Hex
00002000                  8  
00002000  4279 00002018   9  START   CLR.W   SUM        Clear variable SUM
00002006  3039 0000201A  10          MOVE.W  COUNT,D0   Load COUNT value
0000200C  D179 00002018  11  LOOP    ADD.W   D0,SUM     ADD D0 to SUM
00002012  5340           12          SUB.W   #1,D0      Decrement counter
00002014  66F6           13          BNE     LOOP       Loop if counter not zero
00002016  4848           14          BREAK              Tell the simulator to BREAK if we're running
00002018                 15  
00002018                 16  SUM     DS.W    1          Reserve one word for SUM
0000201A  0019           17  COUNT   DC.W    25         Initial value for COUNT 
0000201C                 18  

No errors detected
No warnings generated

```

---
# NOTE
1. There is no such thing as Value, they are just Hex Numbers saved inside the Register
2. The loop stops when one Variable reaches the Hex Value of 0

## More
- `.b` is 8 Bit
- `.w` is 16 Bit
- `.l` is 32 Bit
