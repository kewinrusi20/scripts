Installation
```bash
$ sudo pacman -S bluez 
$ sudo pacman -S bluez-utils

$ sudo systemctl start bluetooth.service
$ sudo systemctl enable bluetooth.service
```

```bash
$ bluetoothctl # open program inside the terminal

# Command list inside the CTL
help # Print Commands available
exit # exit v1 ...
quit # exit v2 ...

power on # bluetooth on
power off # bluetooth off

# Search for devices
scan on
scan off
devices # Print list of [Connected, Paired, Bounded, Trusted]
```

Connect to device
```bash
# an agent that reconnect automatictly with all the devices once the pc is on
agent on
default-agent

# Connect to the devices
trust <mac-address>
pair <mac-address>
connect <mac-address>
```

Bluetooth App:
```bash
sudo pacman -S blueman
sudo pacman -S pavucontrol # Audio Manager
	pavucontrol # turn on
sudo alsa-utils
sudo pacman -S apulse
	alsamixer # turn on
```

---
# IDK

```bash
$ sudo pacman -S pulseaudio3
$ sudo pacman -S pulseaudio-bluetooth

$ sudo vim /etc/bluetooth/main.conf
	# switch: `AutoEnable` from `false` to `true`
$ pulseaudio --start
```