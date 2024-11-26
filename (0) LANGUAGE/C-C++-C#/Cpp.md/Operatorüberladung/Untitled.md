with () you can put more variable,
but the standard is: 
- operator within classes 1, because the class is always the one where the operator ist
- global 2

const int * p;
*p=7; geht nicht
p=null; geht

const int * const p; // v1
int const * const p; // v2

const int const * const p: // (?)


template <class T>

class Array {
	T *data;
	public:
		T &operator[] (int index);
}

// you can not compile templates
// like headerfiles

compiler -> machine code