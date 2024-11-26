- Install
	- `openssh-client`: to connect to other devices
	- `openssh-server`: to let others connect to your device



- Check **Status**
```shell
sudo systemctl status sshd # On most Linux Distibutions
sudo service ssh status # On Debian/Ubuntu
```
(if it doesn't work) Use the variation `ssh`, instead of `sshd`

- **Start**
```shell
sudo systemctl start sshd # On most Linux Distibutions
sudo service ssh start # On Debian/Ubuntu
```
(if it doesn't work) Use the variation `ssh`, instead of `sshd`

- **Auto Start** on Boot
```shell
sudo systemctl enable sshd # On most Linux Distibutions
sudo service ssh enable # On Debian/Ubuntu
```
(if it doesn't work) Use the variation `ssh`, instead of `sshd`

- **Restart**
```shell
sudo systemctl restart sshd # On most Linux Distibutions
sudo service ssh restart # On Debian/Ubuntu
```
(if it doesn't work) Use the variation `ssh`, instead of `sshd`


---
# Connect to other devices
```shell
ssh Wood@192.168.178.56
ssh Wood@Jonsbo
```
