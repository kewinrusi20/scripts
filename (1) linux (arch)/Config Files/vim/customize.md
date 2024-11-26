create file: `touch ~/.vimrc`

```
echom 'Yo Bro' " display
set nocompatible " make this settings file only work for "vim"

" PLUGINS for the .vimrc.plug file
if filereadable(expand("~./vimrc.plug"))
	source ~./vimrc.plug
endif
```

```
set clipboard=unnamedplus

" Copy selected text to system clipboard
" (requires gvim/nvim/vim-xll installed)
vnoremap <C-c> " +y
map <C-c> " +P
```

```
set number " set numbers
set laststatus=2 " show status bar below

set wrap " auto wrapping
set encoding=utf-8 " select encoding type
```

---
crete file: `touch ~/.vimrc.plug`
```vim
call plug#begin('~/.vim/plugged')

"Fugutive Vim Github Wrapper
Plug 'tpope/vim-fugitive'

call plug#end()
```

---
crete directory: `mkdir -p .vim/plug`

---
download: `sudo pacman -S curl`
```bash
# inside the terminal
curl -fLo ~/.vim/autoload/plug.vim --create-dirs https://raw.githubusercontent.com/junegunn/vim-plug/master/plug.vim

apt install git
```

```bash
# inside vim
:PlugInstall
```

---
Auto replace
`%s//g`