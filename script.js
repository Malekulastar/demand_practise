var a=5;
const PI= 3.14;
console.log(PI);

function factorial(num) {
    if (num === 0 || num === 1) {
      return num;
    }
    return num * factorial(num - 1);
  }
  
  let n = factorial(8);
  console.log(n);