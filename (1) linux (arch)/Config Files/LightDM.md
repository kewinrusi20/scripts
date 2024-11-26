> Package: `lightdm`

Locations: `/etc/lightdm/lightdm.conf`

Download:
```
sudo pacman -S lightdm
sudo pacman -S lightdm-gtk-greeter
sudo pacman -S lightdm-gtk-greeter-settings

sudo pacman -S xorg xorg-servers
```

Activation:
```bash
sudo systemctl enable lightdm.service
```

# Theme
> Package: `lightdm-slick-greeter`

Setup:<br>
inside `/etc/lightdm/lightdm.conf`, under `[Seat:*]`, write `greeter-session=lightdm-slick-greeter`

---
# Set Background

`sudo lightdm-gtk-greeter-settings`

```
$ sudo pacman -S dbus
sudo systemctl enable dbus
sudo systemctl start dbus
```

