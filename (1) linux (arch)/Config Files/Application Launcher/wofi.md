> Application Launcher

Download
```bash
sudo pacman -S wofi
```

Enable
```bash
# replace:
set $menu dmenu_path | dmenu | xargs swaysmg exec--

# with:
set $menu wofi --show run
```

Activation
```bash
# Mod + D
```