Bootloader Type: `systemd-boot`

## arch.conf
```bash
# location
/boot/loader/entries/arch.conf

# content
title Arch Linux
linux /vmlinuz-linux
initrd /intel-ucode.img
initrd /initramfs-linux.img
options root=/dev/<name_rootPartition> rw
	#e.g.: options root=/dev/sda2 rw
#options root=UUID=_xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx_ rw # v2
	#you get the UUID through `lsblk -f`
```

---

## loader.conf
```bash
# location
/boot/loader/loader.conf

# content:
timeout 3
default arch.conf  # v1
default arch-*  # v2
default @saved # v3, to auto open the last one (e.g. windows update)
#console-mode max # v1
#console-mode keep  # v2
#console-mode auto  # v3
#console-mode 2  # v4
#editor no  # idk
#editor yes
```
- If the bootloader (during the entry selection) appears distorted/uses the wrong resolution you can try to set the `console-mode` to `auto` (uses heuristics to select the best resolution), `keep` (keeps the firmware provided resolution) or `2` (tries to select the first non-UEFI-standard resolution).