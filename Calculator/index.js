let value = '';
let value1 = '';
let num = [];
let ans;


const calculate=(digit)=>{
console.log("digit:",digit)
	num.push(digit);

	if(num.length != 1){
		value= '';
		document.getElementById('screen').innerHTML = value;	//it is used to clear the 'a'
        console.log("inside if=",value)	
	}


	for(i=0; i<num.length ; i++){

		value= value+ num[i];	
        console.log("num",value)			
		
	}

document.getElementById('screen').innerHTML = value;	

	
}


const equalTo=()=>{
	document.getElementById('screen').innerHTML = '';

	for(i=0; i<num.length ; i++){

		value1 += num[i];	
        console.log("b:",value1)		
        			
	}
console.log("ans:",eval(value1))
	ans = eval(value1);	

	document.getElementById('screen').innerHTML = ans;		

	while(num.length > 0){
    	num.pop();				
	}

	num.push(ans.toString());

	
}



const clearScr=()=>{
	document.getElementById('screen').innerHTML = '';
	
	while(num.length > 0){
    	num.pop();				
	}

	value ='';	
	value1='';
}