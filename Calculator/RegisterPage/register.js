let fullname=""
let email=""
let mobile=""
let uname=""
let password=""
const register=(e)=>{
    
    fullname=document.getElementById("name").value
    email=document.getElementById("email").value
    mobile=document.getElementById("mobile").value
    uname=document.getElementById("username").value
    password=document.getElementById("password").value

    console.log(fullname)
    console.log(email)
    console.log(mobile)
    document.getElementById("data1").innerHTML=fullname
    document.getElementById("data2").innerHTML=email
    document.getElementById("data3").innerHTML=mobile
    document.getElementById("data4").innerHTML=uname
    document.getElementById("data5").innerHTML=password


}

const clear=()=>{
    console.log("clicked")
    document.getElementById("data1").innerHTML=" "
    document.getElementById("data2").innerHTML=" "
    document.getElementById("data3").innerHTML=" "
    document.getElementById("data4").innerHTML=" "
    document.getElementById("data5").innerHTML=""

    document.getElementById("name").innerHTML=" "
    document.getElementById("email").innerHTML=" "
    document.getElementById("mobile").innerHTML=" "
    document.getElementById("username").innerHTML=" "
    document.getElementById("password").innerHTML=""
  
}

var a=66;
var b=99;
var c=34;
var res=a>b ? a>c?a:c :b>c?b:c ;
console.log("res:",res);


var marks=30

// if (marks >= 60){
//     console.log("first class")
// }
// else if(marks >=40 && marks <=60){
//     console.log("second class")
// }
// else if(marks >=33 && marks <40){
//     console.log("third class")

// }
var x= marks >=60 ?"first class":marks >=40 && marks <=60?"second":marks >=33 && marks <40?"third ":"fail";
// console.log(x)


const cal=()=>{
//     var a=2;
// var b=3
// var opearator="*";
    switch (opearator){
        case "+":
            return eval(a+b);
        case "-":
            return eval(a-b);
        case "*":
            return eval(a*b)
    }

}
// console.log("cal",cal(2,3,"+"))
var x,y;
var z=[]
for (x=1;x<=50;x++){
    for ( y=2;y<x;y++){
        if(x%y==0){
            break;
        }
        else{
          z=z+x 
        }
    }


}
// console.log(z)

