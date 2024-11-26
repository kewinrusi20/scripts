

# Install Chocolatey
> [Chocolatey Installation Guide](https://chocolatey.org/install)

1. Open PowerShell in Administrator  mode
2. Rights
	- With PowerShell, you must ensure [Get-ExecutionPolicy](https://go.microsoft.com/fwlink/?LinkID=135170) is not Restricted. We suggest using `Bypass` to bypass the policy to get things installed or `AllSigned` for quite a bit more security.
	- Run `Get-ExecutionPolicy`. If it returns `Restricted`, then run `Set-ExecutionPolicy AllSigned` or `Set-ExecutionPolicy Bypass -Scope Process`.
	- Run `Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))` in the console


# List Commands
- `choco`
- `choco /?`
