# Generate SSH Key (Secure Shell Protocol)

## 1. Create an SSH Key
Write the following command inside the ssh path: C:\Users\\\.ssh
```bash
ssh-keygen -t ed25519 -C "your_email@example.com" # Algorithm: 25519
ssh-keygen -t rsa -b 4096 -C "your_email@example.com" # Algorithm: rsa
```

## 2. Customise Name
Enter the path of the key, as well as a custom name for the key:
> Press enter to use the standard path and name.

> If you want to create multiple keys, use this template -> id_25519_myGitHub.
```bash
/Users/YourPC/.ssh/id_ed25519_myGitHub
```

# 3. Create a passphrase
```bash
> Enter passphrase:
> Enter same passphrase again: 
```
You can also save the password with an **Agent** or save it inside a file **.old**.


# Extra
## To Know
- `-C` flag: `Comment`
- `-t` flag: `type`
- the file with `.pub` is the public ssh key





