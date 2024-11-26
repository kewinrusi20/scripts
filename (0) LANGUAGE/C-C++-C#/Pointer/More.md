Scan/Print Array
```c++
int nums[4];
for(int e: nums)        // it work
	cout << "e: " << e << endl;


int* pNums = nums;
for(int e: pNums)       // it did not work
	cout << "e: " << e << endl;
```


```c++
char alph = "asd";
for (int i = 0; alph[i] =! /0 ; i++)
```