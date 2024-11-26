
# Save Content
```bash
<cat/more/less/head/tail/...> <flag> <fileToView> > <fileToSaveTheContent>
    # (">" redirect) it save the content of the file inside an another file
```

<div style="page-break-after: always;"></div>

# Absolute vs Relative path
> if the path stats with the slash /, is absolute.

/ # is the root directory

```
"cd" or "ls" + + ".." parent directory
"cd" or "ls" + "." current directory
"cd" or "ls" + "~" User directory with tilde
```


<span style="color:green"># if you are in `/home` and you `~/../.`</span><br>
<span style="color:green"># idk man</span>


<div style="page-break-after: always;"></div>

# Wrapping
## temp directory

There is a temp directory in the root directory named "tmp"

You can access to it simplty with 
`/tmp`
from anywhere.

# Hystory
`hystory`<br>
<span style="color:green"> # it display the commands that you used</span><br>

`! <line>`<br>
<span style="color:green"> # to use the command at this specific line</span><br>

`! <shellCommand>`<br>
<span style="color:green">
    # to use the last command used of this time<br>
    # example: by using !head, it will use the last head command you used
</span>


# Enviroment Variable
> Enviroment variable are stored information that are is avaiable all the time. 

Variable | Purpose | Value
-- | -- | --
`HOME` | User's home directory | `/home/repl`
`PWD` | Present working directory | Same as `pwd` command
`SHELL` | Which shell program is being used | `/bin/bash`
`USER` | User's ID | `repl`
`HISTFILESIZE` | Determines how many old commands are stored in your command history

```bash
# how to crea Variables
set | grep HISTFILESIZE # -> HISTFILESIZE:2000
echo $HISTFILESIZE      # -> 2000
```

# Search Programs
```bash
where vim # where <program>
which vim # which <program>
explorer .
```


# Extra
comma-separated values (CSV) // file type<br>
you can separate commands with `;` <br>