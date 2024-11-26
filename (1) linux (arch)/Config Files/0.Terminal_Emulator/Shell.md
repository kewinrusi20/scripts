1. ZSH
2. BASH

ZSH Shell
```python
$ sudo pacman -Sy zsh
$ chsh -s /usr/bin/zsh
#$ chsh -s /usr/bin/bash # If you want to change back
$ echo $SHELL
```

---
.bashrc
```bash
alias _oldCommand_=_newCommand_ # abstract example
alias vim=lvim # example
```

---
## ls


```bash
# use ll, when creating a script alias

-l prin in column and with more details
-a print hidden file
-h print file inze in K,M,G,...
-g hide username
-F show the "/", after the directory
--color=auto # set color from the variable `$LS_COLORS`
--groud-directory-first # sort directory first

# set color
LS_COLORS=$LS_COLORS:'di=0,37:' ; export LS_COLORS 
#(di) = directory
#(0) = normal # (1) bold
#(37) = white
```



---
## change default text editor for `git commit`
```bash
git config --global core.editor "lvim"
```