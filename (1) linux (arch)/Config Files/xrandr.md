Installation
```
$ sudo pacman -S xorg-xrandr
```
  
Check Monitor Information
- `eDP1` or `eDP-1` is the main monitor
```
$ xrandr
$ xrandr --properties
$ xrandr --listmonitors
$ man xrandr
```
  
Disable extern Monitor
```bash
$ xrandr
    --output "HDMI1" 
    --off 
    --output "eDP1"
```

---
# Set Up Screen
```bash
$ xrandr # v1
    --output "eDP1"
    --auto

$ xrandr # v2
    --output "HDMI1"
    --mode 1920x1080 # QFHD: 2560x1080
```  

```bash
$ xrandr
    --output "HDMI1"
    --same-as "eDP1" # duplicate/extend:
	    --same-as # duplicate main monitor
	    --left-of # extends to the left of the main monitor
	    --right-of
	    --above
        --below
```



---
# Extra

Audio
```bash
$ xrandr
    --output "HDMI1"
    --set audio force-dvi
```


Increase Scale of Resolution
```bash
$ xrandr 
	--output "HDMI1"
	--scale 1.2x1.2 # to increase it by 20%
```

Rotation
```bash
$ xrandr
	--output "eDP1"
	--rotate normal
		--rotate normal
		--rotate inverted
		--rotate left
		--rotate right
```
