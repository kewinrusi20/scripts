
- The String Object has no methods, only:
	- One attribute/variable: `lenght`
	- All the Methods inherited from Object: (e.g.: `toString()`)
	- All the "Helping Methods" came form the class "Array"


Length
- `array.length`

Compare
- `array1 == array2` 
- `array1.equals(array2)`
- `Arrays.equals(array1, array2)`
- `Arrays.equals(array1, start index, num elements, array2, start index, num elements )`
- `Arrays.deepEquals(nested array1, nested array2)`
- `Arrays.compare(array1, array2)`
- `compareTo()`  // from the interface "Comparable"

Copy
- `System.arraycopy(old array, start index, new array, start index, num ofelements to copy)`
- `Arrays.copyOf(array, length)`

Sort
- `Arrays.sort(array)`
- `Arrays.sort(numbers, Collections.reverseOrder())`
- `Arrays.sort(numbers, 1, 4)`

Print
- `Arrays.toString(b)`
- `b.toString()`

Search
- `Arrays.binarySearch(arrays, target)`

Fill
- `Arrays.fill(array, value)`

More
- `deepHashCode(T[])`
- `deepToString(T[])`
- `hashCode(T[])`
- `mismatch(T[], T[])`
- `parallelPrefix(T[] array, int fromIndex, int toIndex, BinaryOperator<T> o)`
- `parallelSort(T[])`
- `setAll(T[], UnaryOperator)`
