# For:
## Example 1
```bash
for <variable> in <listName/...>
do
    <commands>
done

# single line version
for var in <nameList>; do <command>; <commands; ...> done
```
```bash

for var in eins zwei; do echo $var; echo "nochmal: $var"; done
    # -> eins
    # -> nochmal: eins
    # -> zwei
    # -> nochmal: zwei
```

## Example for i
```bash
for (( <expr1> ; <expr2> ; <expr3> ))
do
    <commands>
done
```

```bash
for (( i=5; i>0; i--)); do echo $i; sleep 1; done
```

## Example for filetype/filename
for filename/filetype/file

```bash
# to open all the files/variable from the type:
for filetype in gif jpg png; do echo $filetype; done
    # -> gif # -> jpg # -> png
for filetype in docx odt pdf; do echo $filetype; done
    # -> docx # -> odt # -> pdf

for filename in seasonal/*.csv; do echo $filename; done
    # -> seasonal/autumn.csv
    # -> seasonal/spring.csv
    # -> seasonal/summer.csv
    # -> seasonal/winter.csv

files=seasonal/*.csv$ 
for f in $files; do echo $f; done
    # -> seasonal/autumn.csv
    # -> seasonal/spring.csv
    # -> seasonal/summer.csv
    # -> seasonal/winter.csv
files=seasonal/*.csv
for f in files; do echo $f; done
    # -> files

file=seasonal/*
for file in $file; do grep 2017-07 $file | tail -n 1; done
    # -> 2017-07-21,bicuspid
    # -> 2017-07-23,bicuspid
    # -> 2017-07-25,canine
    # -> 2017-07-17,canine

# execute  with the command bash inside a shell script
# does it work without the ; at the end ??
for filename in $@
do
    cut -d , -f 1 $filename | grep -v Date | sort | head -n 1
    cut -d , -f 1 $filename | grep -v Date | sort | tail -n 1
done

```

# While
## Example 1
```bash
while test_commands
do
    <commands>
done
    oder als Einzeiler:

# single line version
while test_commands; do Befehl; [Befehle; …] done
```

## Example 2
```bash
# Zeilenweises Verarbeiten einer Datei mit Namen datei:
while read var
do
    Befehle … # in var steht die akuelle Zeile
done < datei

# single line version
cat datei | while read var; do Befehle …; done
```
As long var is true, the loop will keep going