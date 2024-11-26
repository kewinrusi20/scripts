
# Create Server access Point
```bash
sudo pacman -S openssh

# inside /etc/ssh/sshd_configs
# uncomment `Port 22`

sudo systemctl enable sshd.socket
sudo systemctl enable sshd.service
sudo systemctl start sshd.socket
```

---
# Generate SSH Key
```bash
mkdir ~/.ssh
chmon 700 ~/.ssh
ssh-keygen -t ed25519
```
