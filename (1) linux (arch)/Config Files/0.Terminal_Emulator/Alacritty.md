
# Terminal: Alacritty
```bash
/usr/share/doc/alacritty/example/alacritty.yml # Default Pattern
.config/alacritty/alacritty.yml # config file
```



# Activation in Windows Manager
```bash
bindsym $mod+Return exec alacritty # version i3
```

start the terminal at boot:
```
exec_always --no-startup-id alacrity
```


# Opacity
```bash
# Background Opacity:
opacity: 1.0 # v1
background_opacity: 1.0 # v2
```

<span style="color:red">Note:</span> if you are using i3, you may need a compositor like: Kwin or Picom or Mutter