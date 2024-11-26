---
tags:
- loop
- list
---



Append List (??)
```js
let todoList = [
	'Get groceries',
	'Make dinner',
	'Wash car'
];

todoList.forEach(todo => {
	let div = document.createElement('div');
	div.innerText = todo;
	document.body.appendChild(div);
});
```


```js
let comments = [
	{
		test: 'lol?',
		user: {
			id: 'A007',
			name: 'Bond',
		}
	}, {
		test: 'bro?',
		user: {
			id: 'A001',
			name: 'Smith',
		}
	}	   
];


comments.forEach(comment => {
	const container = document.createElement('div');
	coninter.classList.add('comment-conteiner');
	
});
```
