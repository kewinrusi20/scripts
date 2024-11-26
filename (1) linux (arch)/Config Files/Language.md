# Installation:
The default Keyboard Layout is US
```bash
# Open the config file
ls /usr/share/kbd/keymaps/**/*.map.gz

# Set prefered Keyboard Layout
loadkeys de-latin1 # German Layout
```

# Arch:


# Sway

```bash
# open the config file of Sway
vim ~/.config/sway/config

# add the line
input * xkb_layout de
```