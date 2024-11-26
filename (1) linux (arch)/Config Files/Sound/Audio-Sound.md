```bash
sudo pacman -S alsa-utils
sudo pacman -S pulseaudio
sudo pacman -S pulseaudio-alsa

# idk
systemctl enable pulseaudio.service # enable
systemctl start pulseaudio.service # start
systemctl list-unit-files | grep pulseaudio # find
```

---
# DRIVER INSTALLATION
```bash
# installing paru (package manager)
git clone https://aur.archlinux.org/paru.git
cd paru/
makepkg -si
paru -Suy

# installing snapcraft (package manager)
paru snap

# installing hw-probe to check working hardware
paru hw-probe
paru smartmontools
sudo -E hw-probe -all -upload

# installing sound driver for hp
paru sof-firmware

```

---
# More 
```shall
panixer - terminal interface
pacman -S pavucontroll
	pavucontroll # to open

systemctl --user status pulseaudio.socket
systemctl --user enable pulseaudio
```