function validateForm(){

let name = document.getElementById("name").value.trim();
let email = document.getElementById("email").value.trim();
let mobile = document.getElementById("mobile").value.trim();
let department = document.getElementById("department").value;
let feedback = document.getElementById("feedback").value.trim();

let gender = document.getElementsByName("gender");


// Name validation
if(name === ""){
    alert("Name is required");
    return false;
}

// Email validation
if(!email.includes("@")){
    alert("Enter valid email");
    return false;
}

// Mobile validation
if(!/^[0-9]{10}$/.test(mobile)){
    alert("Enter valid 10-digit mobile number");
    return false;
}

// Gender validation
let genderSelected = false;
for(let i=0; i<gender.length; i++){
    if(gender[i].checked){
        genderSelected = true;
        break;
    }
}

if(!genderSelected){
    alert("Select gender");
    return false;
}

// Department validation
if(department === ""){
    alert("Select department");
    return false;
}

// Feedback validation (min 10 words)
let wordCount = feedback.split(/\s+/).filter(word => word.length > 0).length;

if(wordCount < 10){
    alert("Feedback must contain at least 10 words");
    return false;
}

// Success
alert("Feedback Submitted Successfully!");
return true;

}