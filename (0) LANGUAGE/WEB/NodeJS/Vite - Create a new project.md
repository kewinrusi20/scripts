1. open the terminal in an empty folder
2. in the terminal, type: `npm create vite@latest` or `npm create vite@latest <App Name>`
3. select: `React` > `Javascript`

Starter Commands
```shell
cd <Project Name>
npm install
npm run dev
```

# Host Project on Server
> [Stack Overflow - linux - npm run dev --host network: not exposed](https://stackoverflow.com/questions/71939532/npm-run-dev-host-network-not-exposed)
```shell
npm run dev -- --host
```

## Option 2
Inside the `package.json` file, change the dev command:
```json
If you use **vite** in the _package.json_ file, do this on the _dev_ line:

```json
  "scripts": {
    "dev": "vite --host --port 8888",
  },
```

To host on a different post
```json
"start": "sirv public --no-clear --host 0.0.0.0 --port 8888",
```
