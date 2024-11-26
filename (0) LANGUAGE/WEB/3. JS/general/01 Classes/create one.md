```js
class Product{
	constructor (name, price){
	this.name = name
	this.price = price
	}
	
	displayProduct(){
		console.log('Product: ${this.name}')
		console.log('Price: ${this.price}')
	}
	
}


// create object
const product1 = new Product('Shirt', 20)


// call function
product1.displayProduct()
	//
```