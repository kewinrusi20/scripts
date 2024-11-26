
# Flags of SSH Command
```
Flag | Description&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
:--: | --
`-b` | bind_address
`-e` | escape_char
`-i` | identity_file
`-l` | login_name
`-o` | option
`-w` | local_tun
|
`-c` | cipher_spec
`-m` | mac_spec
`-p` | port

</div> <!-- close 1st column -->
<div>

Flag | Description
:--: | --
`-B` | bind_interface
`-E` | log_file
`-I` | pkcs11
`-L` | address
`-O` | ctl_cmd
`-W` | host:port
|
`-D` | [bind_address:]port*
`-F` | configfile
`-J` | [user@]host[:port]*
`-Q` | query_option
`-R` | address
`-S` | ctl_path

*[:remote_tun]] destination [command [argument ...]

</div> <!-- close 2nd column -->
</div> <!-- close table -->
```


# Register & Connect key to the server
> You can use a SSH Key to connect to a Server.

```bash
ssh-copy-id -i ~/.ssh/myKey.pub <serverIP> # Register public key to the server
ssh -i ~/.shh/acme_key <serverIP> # Connect with the private key to the server
```



### Example:
```bash
# Example 1
ssh-copy-id -i ~/.ssh/acme_key.pub acme.learnlinux.cloud
ssh -i ~/.ssh/acme_key acme

# Example with a user
ssh-copy-id -i ~/.ssh/id_ed25519.pub admin@skynet.learnlinux.cloud
ssh -i ~/.ssh/skynet_key skynet

# Example with a port
ssh-copy-id -i ~/.ssh/shinra_key.pub -p 2222 root@shinra.learnlinux.cloud
ssh -i ~/.ssh/shinra_key shinra
```

## With a config file
> You can save all the information inside the config file

```bash
# inside config
Host acme
    Hostname 172.105.24.117
    IdentityFile ~/.ssh/acme_key

Host skynet
    Hostname skynet.learnlinux.cloud
    User admin
    IdentityFile ~/.ssh/skynet_key

Host shinra
    Hostname shinra.leranlinux.cloud
    User root
    Post 2222
    IdentityFile ~/.ssh/shinra_key
```

```bash
ssh shinra
```

# Agent
> The Agent allow you to connect to a Server without typing everytime the Passpharase.

<span style="color:red">Note:</span> You have to asign a SSH Key to an Agent every time you reopen the Bash.<br>
<span style="color:red">Requirement:</span> You must to have a **config** file.

```bash
# Create an Agent (i guess)
ssh eval $(ssh-agent)
ssh eval $(ssh-agent -s) # idk what the flag "-s" does
```
```bash
# Asign SSH Key to an Agent
ssh-add ~/ssh/myKey
```

[YT How to use Multiple SSH Keys | Managing Different SSH Keys on your System](https://youtu.be/pE3EuiyShoM?t=820)

# windows: get ssh key
```powershell
cat C:Users\Kewin\.ssh\id_ed25519.pub

```

# linux: how to add ssh key to authorized keys
1. create an file name "authorized_keys", inside the .ssh directory
2. paste the public key inside and save


# Create Armored SSH
```bash
echo -n '<token>' | ssh-keygen -Y sign -n gitea -f C:\Users\YourPC/.ssh/id_ed25519.pub
```
### Example outcome:
```
-----BEGIN SSH SIGNATURE-----
...
-----END SSH SIGNATURE-----
```