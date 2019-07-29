class Stack {
	constructor() {
		this.items = [];
		this.minIndexStack = [];
	}

	push(element) {
		this.items.push(element);
		let minLen = this.minIndexStack.length;
		let minItemIndex = this.minIndexStack[minLen - 1];
		if(minLen === 0 || this.items[minItemIndex] > item) {
			this.minIndexStack.push(this.items.length - 1);
		} else {
			this.minIndexStack.push(minItemIndex);
		}
	}

	pop() {
		this.minIndexStack.pop();
		return this.items.pop();
	}
	
	min() {
		let len = this.minIndexStack.length;
		return (len > 0 && this.items[this.minIndexStack[len - 1]]) || 0;
	}

	peek() {
		return this.items[this.items.length - 1];
	}
	
	// 省略其它方法
}

let stack = new Stack();