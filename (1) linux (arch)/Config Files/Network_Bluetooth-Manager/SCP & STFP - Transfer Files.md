# Option 1
Download:
- WinSCP (Only Windows)
- FileZilla


# Option 2
## STFP (Secure Transfer File Protocol)
- Windows --> Linux (*with Powershell*)
```powershell
sftp wood@jonsbo
```

- **Send**
```powershell
put C:\path\to\file.txt /remote/path/
```

- **Get**
```powershell
get /remote/path/file.txt C:\path\to\
```


## SCP (Secure Copy Protocol)
- Linux --> Windows:
```shell
scp /path/to/local/file user@windows_ip_or_hostname:C:/path/to/destination/
scp /home/user/file.txt user@192.168.1.20:C:/Users/user/Documents/
```

- Windows --> Linux (*with Git Bash*)
```shell
scp /c/Users/rusil/Desktop/affinity\ spot.pdf wood@jonsbo:~/Desktop
```
