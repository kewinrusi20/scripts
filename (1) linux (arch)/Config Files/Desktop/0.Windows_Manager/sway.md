> Window Manager

# Configuration File 
File Location
```bash
 # doc file location
 
~/.config/sway/config # config "config" file location
```

```bash
# Installation packs:
pacman -S sway swaybg swaymsg swayidle swaylock
```


```bash
#reload the sway config file
swaymsg reload
```

Config throw terminal
You can change Sway configs throw the command `swaymsg <command>`

## Title Bar
```bash
# Hide/Show Title Bar
# From the Terminal:
swaymsg border none # Hide
swaymsg border normal # Show Again

# From the Config File:
bindsym $mod+r border none
default_border none
```

## Status Bar
```bash
# Hide/Show Status Bar
# From the Terminal:
swaymsg bar mode hide # Hide
 # Show Again

# From the Config File:
bar {
	mode hide
}
```

## Keymap

```bash
# swap the escape key with the caps key
input "type:keyboard" xkb_options caps:swapescape
```

## Mouse

```bash
# disable mouse acceleration
input * accel_profile flat
```