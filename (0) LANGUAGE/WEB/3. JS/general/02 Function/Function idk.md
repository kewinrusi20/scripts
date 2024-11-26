
```jsx
function printBuilder(msg) {
    return function (name) {
        console.log(msg + " " + name);
    }
}
  
function printBuilder(msg) {
    return (name) => {
        console.log(msg + " " + name);
    }
}
  
printBuilder("Winner")("Alex");
printBuilder("Loser")("Bob");
  
const greating = printBuilder("welcome");
greating("Giorge");
greating("Marc");
  
const goodbye = printBuilder("bye");
goodbye("Luca");
goodbye("Giovanni");
```

```jsx
{CategoryList.map(e => <Category eReceiver={e} />)} //v1
{CategoryList.map( function (e) { return (<Category category={e} />)})} //v2
```
