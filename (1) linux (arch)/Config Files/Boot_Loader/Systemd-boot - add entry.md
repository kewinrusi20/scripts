1. Mount the Root and the Boot partition
```shell
mount /dev/nvme0n1p4 /mnt
sudo mount --mkdir /dev/nvme0n1p3 /mnt/boot
```

2. Copy the files
```shell
sudo cp /mnt/debian/boot/vmlinuz-6.1.0-23-amd64 /boot/EFI/debian/vmlinuz-debian
sudo cp /mnt/debian/boot/initrd.img-6.1.0-23-amd64 /boot/EFI/debian/initrd-debian.img
```

3. Create an entry inside `/boot/loader/entries/`
```shell
title  Debian
linux vmlinuz-debian
initrd
option root=UUID=
```

4. Close Everything
	1. Unmount the partitions `sudo umount /mnt/*`
	2. Update the boot manager `sudo bootctl update`
	3. Reboot `sudo reboot`
