> Wiki: [Network Manager](https://wiki.archlinux.org/title/NetworkManager)
> Package Name: `networkmanager`

Hardware: 
```bash
nmcli radio wifi on
nmcli radio wifi off
```

---
Display Network: 
```bash
nmcli device wifi list # Network List:
nmcli connection show # Show Current Network
nmcli coonnection up <name_wifi> # Switch Internet
```

---
Connect to the Network:
```bash
nmcli device wifi connect <NetworkName> password <NetworkPassword>
nmcli device wifi connect <NetworkName> password <NetworkPassword> ifname wlan1 <name_profile> # to try
```

```
nmtui # interface
```

