  
// program 1

function checkPalindrome(str) {

    // find the length of a string
    const len = string.length;

    // loop through half of the string
    for (let i = 0; i < len / 2; i++) {

        // check if first and last string are same
        if (string[i] !== string[len - 1 - i]) {
            return 'It is not a palindrome';
        }
    }
    return 'It is a palindrome';
}


const string = '123';
const value = checkPalindrome(string);
console.log(value);
  
//program 2

function wordsReverser(string){
    var words = string.split(' ');
    var result = [];
    for(var i = 0; i < words.length; i ++){
      result.push(words[i].split('').reverse().join(''));
    }  
    return result.join(' ');
 }
 
 console.log(wordsReverser('my name is malik ,i am from dahod'));

 //console.log("%cJavascript Jeep 🚙in Blue %cJavascript Jeep 🚙in red", "color:blue; font-size:50px", "color:red; font-size:50px" );
//  const publication = "freeCodeCamp";
//  publication[0].toUpperCase() + publication.substring(1);


//program 3
//capitalize each first word of the sentence

function capitalize(string){
    var words= string.split(' ');
    var result=[];

    for(var i=0;i<words.length;i++){

         words[i] =  words[i].charAt(0).toUpperCase() + words[i].substring(1);

        //var ans= words[i];
       // var ans2= ans[0].toUpperCase(0)+ans.slice(1);

        //result.push(ans2);
        //result=console.log(words);
    }
    return words.join(' ') ;

}

console.log(capitalize('my name is malik ,i am from dahod'))