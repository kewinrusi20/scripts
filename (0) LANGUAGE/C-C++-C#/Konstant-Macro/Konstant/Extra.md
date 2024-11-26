# Check OS
> more https://blog.kowalczyk.info/article/j/guide-to-predefined-macros-in-c-compilers-gcc-clang-msvc-etc..html

Some C program work different depends on the OS
OS | Constant
:-- | :--
Linux | `__linux__`
Android | `__ANDROID__`
Darwin (Mac) | `__APPLE__`
Windows 32 bit | `_WIN32`
Windows 64 bit | `_WIN64`


you can Check the OS and use a specific part of a code:
```c
#ifdef __linux__
    ...
#elif _WIN64
    ...
#endif
```

# Check Compiler
> more https://blog.kowalczyk.info/article/j/guide-to-predefined-macros-in-c-compilers-gcc-clang-msvc-etc..html

Compiler | Constant
:-- | :--
Visual Studio | `_MSC_VER`
gcc | `__GNUC__`
Clang | `__clang__`
Emscripten | `__EMSCRIPTEN__` (for asm.js and webassembly)
MinGW 32bit | `__MINGW32__`
MinGW 64bit | `__MINGW64__`

same story for the compilers
```c
#ifdef _MSC_VER /* nur Compiler */
#if _MSC_VER >= 1500 /* mind. Version 15 */
```

# Check Language
for C++ `__cplusplus`

## Example
```h
#ifdef __cplusplus
extern "C" {
#endif

#ifndef FUNC_H
#define FUNC_H

float drittewurzel(float x);

#endif //FUNC_H

#ifdef __cplusplus
}
#endif
```