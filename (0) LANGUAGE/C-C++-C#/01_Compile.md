> GCC: GNU Compiler Collection<br>

1. Save the code as `.c` for C / `.cpp .cxx .C .cc` for C++
2. Compile the file with: `gcc -c <codeFile>.c`
3. Link the compiled Object-File with: `gcc -o <nameExeFile> <compiledFile>.o`

<ins>Preprocess</ins>: 
<ins>Compile</ins>: 
<ins>Linker</ins>: 
merge the compiled file with the libraries in an .exe file<br>
java, will automaticly link at the start of the program

```bash
# Compile
gcc -c <codeFile>.c
gcc -c Hello.c # -> Hello.o / Hello.obj

# Link
gcc -o <exeName> <compiledFile>.o
gcc -o sayHello Hello.o # ->  sayHello.exe
```

```bash
# Compile + Link + exe
gcc Hello.c

# Compile + Link + exe
gcc Hello.c -o sayHello
```


## Check Compiling
```bash
gcc -DGIBTSNICHT -E teil2.c
```


## Compile Raspberry Pi - Wiring Pi GPIO
```bash
g++ -o startFile myCppFile.cpp -lwiringPi
```


# Makefile
```bash
# install
packman -S make
```

## Example
```shell
# Main Program
hallo: haupt.o teil2.o
	gcc -o hello haupt.o teil2.o

haupt.o: haupt.c meinheader.h
	gcc -c haupt.c

teil2.o: teil2.c meinheader.h
	gcc -c teil2.c

# Program 2
pCode2: meinCpp.o
	g++ -o pStart meinCpp.o

meinCpp.o:
	g++ -c meinCpp.cpp

# Program 3
pStart:
	./meinCpp.exe

# Program 4
clean:
	rm *.o *.exe
```

```bash
# execution
make
make pCode2
make pStart
make pClean
```
