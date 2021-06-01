const closure=()=>{
console.log("clicked")
const multi=()=>{
    let x=10;
    let y=8;
    return x*y;

}
document.getElementById("res").innerHTML=multi();

}
let a="";
let b="";
let c=""
const swap=()=>{
   a= document.getElementById("a").textContent;
   console.log(a)
   b= document.getElementById("b").textContent;
   console.log(b)
   c=a.split("=")[1]
   a=b.split("=")[1]
   b=c;
   document.getElementById("a1").innerHTML="a="+a;
   document.getElementById("b1").innerHTML="b="+b;

   console.log("a=",a)
   console.log("b=",b)

}


const add=(m)=>{
    console.log(m)
      function mul(y){
          let res=m*y
         console.log(m*y)
         function sub(o){
             console.log(res-o)
         }
         return sub(30);
     }
     return mul(20);
}

add(10)

function sum(){
    this.p=10;
    this.q=23;
}
const addition = new sum();
const subtraction =new sum();
sum.prototype.r=40;
console.log("prototype",sum.prototype)
console.log("add",addition.r)
console.log("sub",subtraction.r)


function main(){
    this.m=11;
    this.n=12;
}
const main1=new main();
main.prototype.o=222;
console.log(main1.o)


 // function constructor
 function Person(name, job, yearOfBirth){  
    this.name= name;
    this.job= job;
    this.yearOfBirth= yearOfBirth;
}
// adding calculateAge() method to the Prototype property
Person.prototype.calculateAge= function(){ 
    console.log('The current age is: '+(2019- this.yearOfBirth));
}
console.log(Person.prototype);
  
// creating Object Person1
let Person1= new Person('Jenni', 'clerk', 1986); 
console.log(Person1)
let Person2= new Person('Madhu', 'Developer', 1997);
console.log(Person2)
  
Person1.calculateAge();
Person2.calculateAge();