# Namespace
## Syntax
```c++
using namespace std;     // Example
```

## Namespaces
- `std` 



## Example
```c++
// Here it is necessary to put ‘using namespace std’ before the code.
#include <iostream>
int main() { cout << "Hello World" << endl: }

// Here there is no need to put ‘using namespace std’ before the code.
#include <iostream>
using namespace std;
int main() { std::cout << "Hello World" << std::endl: } 
```
> You can eather import it, or use it direcly adiacent to the words


`std::` stand for namespace std<br>
you can avoid writing so by "importing it"<br>
with: `using namespace std;`<br>

you import the Namespace to indicate, with work is relate to with funtions<br>
Example: `std::cout` | here cout is related to the library std