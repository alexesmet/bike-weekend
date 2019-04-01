"use strict";

function registerFromSubmit(event) {

    let form = event.target;

    let toLog =  form.elements.firstname.value + " " + form.elements.surname.value;
    console.log(toLog);
    document.location.href = "/register";
    event.preventDefault();

}