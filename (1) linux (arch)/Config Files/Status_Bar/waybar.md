# Configuration File 
File Location
```bash
~/.config/waybar/config # doc "config" file location
~/.config/waybar/style.css # doc "style.css" file location


/etc/xdg/waybar/config # config "config" file location
/etc/xdg/waybar/style.css # config "style.css" file location
```

1. First add this line into the config file of sway:
`bar { swaybar_command waybar }` to enable Waybar instead of Sway
2. Install the font "otf-font-awesome"