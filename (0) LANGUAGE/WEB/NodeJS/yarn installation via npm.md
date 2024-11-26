```
npm i -g yarn
yarn install
yarn start

```

when an error like this appears: cannot be loaded because running scripts is disabled on this system
open shell in administrator mode an type this:
```shell
Get-ExecutionPolicy
Set-ExecutionPolicy RemoteSigned
	# or Set-ExecutionPolicy AllSigned
	# or Set-ExecutionPolicy Bypass
```
