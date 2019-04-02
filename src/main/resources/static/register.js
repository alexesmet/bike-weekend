"use strict";

function registerFromSubmit(event) {

    let form = event.target;
    document.location.href = "/register?name=" + form.elements.firstname.value + "&surname=" + form.elements.surname.value +
        "&phone=" + form.elements.firstname.phone;
    event.preventDefault();

}