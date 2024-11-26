> Guide to disable some Systems to be able to shrink the Storage.

# Disable Defrag

1. Open `cmd` as administrator
2. Type `powercfg.exe /h off` to disable it
3. And `powercfg.exe /h on` to turn it back on

## Check Defrag Files
1. Open the Path `C:`
2. Enable `View Hidden Protected Operating System Files`
3. There you will find the File Named `hiberfil.sys`

---
# Disable Virtual Memory

1. Search `performance` and open: `Adjust the appearance and perfomance of Windows`
2. Go to the Tab `Advanced`
3. Open `Change...`
4. Disable `Automatically manage paging file size for all drives`
5. Enable `No paging file`
6. Confirm pressing `Set`
7. Restart

## Check Virtual Memory Files
1. Open the Path `C:`
2. Enable `View Hidden Protected Operating System Files`
3. There you will find the File Named `pagefile.sys` and `swapfile.sys`

---
# Delete Restore Point

1. Search for `Create a restore point`
2. Press `Configure...`
3. Switch `Restore Setting` to `Disable system protection`
