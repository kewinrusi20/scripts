When a new object is created in Java, the memory is allocated in two different areas: the **Heap** and the **Stack**.

**Heap**:

- The actual **object** itself is stored in the heap.
- This includes the **values of the instance variables**.

**Stack**:

- Each time an object is declared, a new **reference** is created in the stack.
- This reference points to the location in the heap where the actual object is stored.
- If the object is created inside a method, the reference is removed when the method execution is completed.

So, in summary, the object’s actual data (instance variables) are stored in the heap, while the reference to the object is stored in the stack. This allows for efficient memory management and garbage collection.