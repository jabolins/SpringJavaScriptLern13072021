document.getElementById('registrationForm').addEventListener("submit", checkForm);

function checkForm(event){ // event ir notikums kas tiek saņemts pēc addEventListener

var element= document.getElementById('registrationForm');

var name= element.name.value;
var password= element.password.value;
var rePassword= element.rePassword.value;


var state= element.state.value;
var dateOfBirth= element.dateOfBirth.value;

var fail ="";


if ( name=="" || password =="" || state==""|| dateOfBirth==""){
fail= "aipildiet visus laukus"
}
else if (password !=rePassword){
fail ="paroles nesakrīt"
}


if (fail!="") {
event.preventDefault(); //  šādi atslēdz standarta event rezultātu kas standartā ir lapas pārlādēšana. Mūsu gadījumā lapa nepārlādējas kamēr nav viss sarakstīts korekti
document.getElementById('error').innerHTML= fail; // šādi nododam uz elementu error vērtību. Un no tā brīža tas var parādīties
return false; // TODO tad lapa nepārlādēsies, bet varbūt šo var izņemt
}
else{
alert("visi lauki aizpildīti korekti");
return true}
}
