> Package: `grub efibootmgr`<br>
> [Wiki](https://www.gnu.org/software/grub/manual/grub/html_node/Simple-configuration.html) - [Arch Doc]([GRUB - ArchWiki (archlinux.org)](https://wiki.archlinux.org/title/GRUB))

# Installation
```bash
$ pacman -S grub efibootmgr
$ grub-install --target=x86_64-efi --efi-directory=/boot --bootloader=GRUB
$ grub-mkconfig -o /boot/grub/grub.cfg
```
You can see the path for  ""`--efi-directory=/boot`"", by typing `$ lsblk`

# Configuration Folders
- `/etc/default/grub` boot configuration
- `/boot/grub/grub.conf` do not touch
- `/etc/grib.d`

---
# Grub Config File
> Path: `/etc/default/grub`<br>
> **Note**: use always the command `$ grub-mkconfig -o /boot/grub/grub.cfg` to load the saves

## Default version
```bash
GRUB_DEFAULT=0
GRUB_TIME=5
GRUB_DISTRIBUTOR="Arch"
GRUB_CMDLINE_LINUX_DEFAULT="loglevel=3 quiet"
GRUB_CMDLINE_LINUX=""
```

## Silent Boot version
```bash

```

---
# Multi Boot
```bash
# Download the package
$ sudo pacman -S os-prober

# Edit Grub config file
$ sudo vim /etc/default/grub
GRUB_DISABLE_OS_PROBER=false # add this line

# Enable Settings
$ sudo os-prober
$ grub-mkconfig -o /boot/grub/grub.cfg
```
