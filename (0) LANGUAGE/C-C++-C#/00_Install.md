# Download
Download [MSYS2](https://www.msys2.org/) and use **MINGW64** as bash
```bash
# Download C/C++
pacman -S mingw-w64-x86_64-gcc # compiler [gcc / g++]
pacman -S mingw-w64-x86_64-gdb # debugger [gdb]

pacman -S make # Filemaker
```

[CMaker](cmaker.org)

# Bind the Compiler to the Terminals
1. Open "Edit the system environment variables"
2. Go to 
    - Advanced > Environment Variables
    - Edit: Path
    - Add: the bin path of mingw64

# Version Check
```bash
gcc --version
g++ --version
gdb --version
```

# Update
```bash
pacman -Suy # x2
paccache -r # delete cache
```