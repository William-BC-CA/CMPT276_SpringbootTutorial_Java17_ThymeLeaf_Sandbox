// var n = window.prompt("name?", "William")
// console.log("hello " + n)

// for (let i = 0; i < 10; i++){ // Let is block scoped, var is more global
//     console.log(i)
// }

// console.log(i);

// objects

var person = {
    name: 'William',
    age: 22,
    email: 'wchan@sfu.ca',
    address: {
        number: '456',
        street: 'euclidean abyss'
    },
    speak: function(words){
        console.log(words)
    }
}

// functions

// var a = 9

// function myfunc(){
//     console.log('hello world');
//     console.log(a);
// }

// var myfunc2 = function(){
//     console.log('hello world 2');
// }

// myfunc2();

// callbacks

// function asc(a, b){ // similar to comparables or compare function in java, CPSC 1181
//     return a - b
// }
// var i = 0
// var inter = window.setInterval(function(){
//     console.log(i)
//     i++
// }, 1000)

// person.speak("hello")

// window.addEventListener('keypress', processKey)

// function processKey(evt){
//     console.log(evt.key)
// }

var button = document.querySelector('input[value="SuBmIt"]')
button.addEventListener('click', function(evt){
    evt.preventDefault();
    var text = document.getElementById('fname').value;
    document.getElementsByTagName('legend')[0].innerHTML = text;
})

