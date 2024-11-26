## Replace


```bash
:s/potato/chips/ # only one
:s/potato/chips/g # line
```

```bash
# go on the work you want to replace and type
ci 
```

## Regex
### Syntax
```bash
,    # from - to
.    # current line
n	 # specific line
n-n  # set range

g    # global
%	 # every line
0    # first line
$	 # last line
^    # beginning of every line
```

### Examples
```bash
from - to
:.s/import/export/g # current line
:2s/import/export/g # specific line
:4,22s/diamonds/rocks/g # set range
:%s/potato/chips/ # every line
:$s/potato/chips/ # last one
```

### Combinations
```bash
:.,$s/potato/chips/ # from current line to end
:.,.+5s/potato/chips/ # from current line + 5 more line = 6
:g/^/pu = \"\n\" # create new lines
	# `pu =` = put
	# `\` = use symbol as chat and not as command
	# `\n` = new line
:g/^\s*$/d # delete every emply line 
	# `\s*` = 0 or more white space characters
:g/import/t$ # copy all the line with the word `import` and copy them to the end of the file
:g/import/t$ # move -//-
:g/^/m0 # move to the first line of the file
```


---
```bash
g/<word>/<command> # seach every line with "pattern" and execute command

# Example
:g/placeHolder/d # it will delete all the words "placeHolder"

:!g/important/d # it will delete all that non include the words "important"
:v/important/d # v2
```