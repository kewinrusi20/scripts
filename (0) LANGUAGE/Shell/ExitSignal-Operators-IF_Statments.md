

# Syntax
```bash
$?                      # check Exit-Status value of the last command executed
exit [n]                # it says you the Exit-Status for the value n</span>
test <expression>       # it prints the Exit-Status value for that expression
[ <expression> ]        # -//- 
[[ <expression> ]]      # -//-
```
### Example:
```bash
[[ "a" == "b" ]]; echo $?  # -> 1
```

### Java: 
```java
System.exit(n)
```


# Exit-Status List
> it check the status of a command or a file

- `0` -> all ok
- `1` -> a general error
- `2` -> your command sucks
- `27` -> command not found
- `126` -> command not playable

128+N -> command ended throuw a signal mit number N
- `130` -> for typing `Ctrl + C` (signal interrupt SIGINT 2 -> 128+2)

## Combinations
> 2>&1 -> #stderr


```bash
# redirect errors in files
<command> <file> 2> log.txt
<command> <file> 2>&1 > log.txt
```

### Example
```bash
ls /myFile 2>&1 > log.txt
# Ausgabe des Fehlers weiter auf Bildschirm

cat log.txt # -> File didn't exist
```

### Try
```bash
(GOOD)
ls /myFile 2> log.txt 
  # it redirect the error inside the file log.txt:
  # ls: cannot access '/myFile': No such file or directory

ls /myFile > log.txt 2>&1
  # it redirect the error inside the file log.txt:
  # ls: cannot access '/myFile': No such file or directory
```
```bash
(WRONG)
ls /myFile > log.txt 2>&1 
  # it creates 2 files: 1 and log.txt
  # log.txt is empty
  # 1:  ls: cannot access '/myFile': No such file or directory
      # ls: cannot access '2': No such file or directory

ls /myFile > log.txt 
  # it print an error in the terminal

ls /myFile 1> log.txt 
  # 1> and > are the same

ls /myFile 2>&1 > log.txt 
  # it creates an empty log.txt
  # and print in the terminal:
  # ls: cannot access '/myFile': No such file or directory

ls /myFile 2>&1 log.txt
  # it prints in the terminal:
  # ls: cannot access '/myFile': No such file or directory
  # ls: cannot access 'log.txt': No such file or directory

```

<div style="page-break-after: always;"></div>

# Logic Operators
> [ [more](https://en.wikipedia.org/wiki/Test_(Unix)) ]
for the logic operators, the answer 0 is true, because it signals that all is ok

OLD Version | NEW Version | Operator
:--: | :--: | --
`[ ]` | `[[ ]]` | Strings
idk | `(( ))` | for Integers

## General Operators:
Old | New | Operator
:--: | :--: | :--
-a | `&&` | UND
-o | `\|\|` | OR
. | `!` | Negation

<span style="color:red">**Note:**</span>
- the `-a` operator has higher precedence than the `-o` operator
- `\(<expression>\)` - Parentheses for grouping must be escaped with a backslash `\`

### Example:
```bash
configure && make && make install # if configure == 0(true), than execute make, ...
```

## Integer Operators:
OLD Version | NEW Version | Operator
:--: | :--: | --
` [ ... -eq ... ]` | `[[ ... == ... ]]`
|
`-eq` | `==` | equal
`-ne` | `!=` | not equal
|
`-gt` | `>` | greater than
`-ge` | `>=` | greater or equal
|
`-lt` | `<` | lower than
`-le` | `<` | lower or equal


## String Operators:

Operator | Task
:--: | --
`-d` | is this a directory?
`-f` | is this a regular file(no directory)?
`-e` | exist this file?
|
`-L` or `-h` | the file is a symbolic link
`-p` | the file is a named pipe (FIFO)
`-c` | FileName is a character special file
`-b` | Returns a True exit value if the specified FileName exists and is a block special file
|
`-r` | the file is readable by the current process
`-t` | FileDescriptor is open and associated with a terminal
| 
`-k` | the file's sticky bit is set
`-u` | the file's Set User ID bit is set
`-g` | the file's Set Group ID bit is set

## String Arguments
Operator | Task
:-- | --
`-s <fileName>` | the file has a size greater than 0
`-n <string1>` | the length of the String1 variable is nonzero
`-z <string1>` | the length of the String1 variable is 0 (zero)
`<string1> = <string2>` | String1 and String2 variables are identical
`<string1> != <string2>` | String1 and String2 variables are not identical
`<string1>` | true if String1 variable is not a null string


## Examples:
```bash
[ <String1> = <String2> ]
[[ <String1> == <String2> ]]

[ <integer1> -eq <integer2> ]
(( <integer1> == <integer2> ))

[ -e <fileName> ]
[ -d <fileName> ]
[ -f <fileName> ]
```

# IF-Statement
> Every IF-Statement must start with an `if` and end with `fi`

## Syntax
- `if` ... `fi` -> if, open and close the statement
- `then` -> then consequents ...
- `elif` -> else if statement
- `else` -> else statement

## Example 1
```bash
 if [ "$#" -lt 2 ] || ! [ -e "$1" ]
 then
   exit
 fi
```

## Example 2
```bash
if test-commands; then          # open if
    consequent-commands
[elif more-test-commands; then  # else if
    more-consequents]
[else alternate-consequents]    # else
fi                              # close if
```
```bash
if ls /usr/bin/ | grep \\.dll > /dev/null
  then echo Windows            #
  else echo Unix
fi
```