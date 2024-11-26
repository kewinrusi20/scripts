> shield commands with `:!`

```bash
#execute and display shield commands in vim
:!pwd
:!cat .config/.vimrc
```

```bash
# it will print the result inside ...
# ... a new line in the current position
:read !pwd 

:8read !date # print result as new line 8
:$read !date # print in the last line
```