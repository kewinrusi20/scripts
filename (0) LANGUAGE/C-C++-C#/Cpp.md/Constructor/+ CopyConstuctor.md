
<span style="color:red">Note:</span>
- You crete a copy of che Objects every time you give/receive to/from a function
- There is a standard Copy-Constructor, if not defined

## Create Copy Constructor
```cpp
// header file
class Person {
public:
	Person(Person const & other);
}

// cpp file
Person::Person(Person const & other) {}
```

# More
## Verwendung von Kopierkonstruktor / Operator „=“ verhindern

Verhindern der Verwendung von Kopierkonstruktor / Operator „=“:
- Einfach private deklarieren!
- Implementierung nicht nötig

Wenn Kopierkonstruktor private:
- kein call-by-value mehr möglich
- nur Übergabe als Referenz oder Zeiger

## Speicherverwaltung 
Regel 1: Wenn eine Klasse Zeiger als Member-Variablen verwendet, dann müssen (sehr wahrscheinlich) 
- Destruktor
- Kopierkonstruktor
- überladener Zuweisungsoperator
definiert werden. 

Regel 2: Wenn einer der drei benötigt wird, dann werden (sehr wahrscheinlich) auch die anderen beiden benötigt