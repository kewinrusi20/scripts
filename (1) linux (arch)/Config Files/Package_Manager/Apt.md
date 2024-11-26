- **Install/Download**
```shell
apt install ...
```

- **Update**
```bash
sudo apt -y update
sudo apt -y upgrade
sudo apt-get update

sudo apt update # v2 (?)
sudo apt dist-upgrade # (?)

sudo apt full-upgrade
 # This command will perform a full upgrade
 # which may remove some packages if necessary to complete the upgrade
sudo apt autoremove
 # This command removes packages that were automatically installed 
 # to satisfy dependencies for other packages and are now 
 # no longer needed
```


```bash
sudo pacman -S dpkg fakeroot base-devel
```

---
- Check Program Installation
```shell
apt list --installed | grep openssh
```

- Remove
```shell
sudo apt-get purge openjdk*
sudo apt-get remove openjdk
```