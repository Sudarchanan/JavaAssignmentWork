function validateForm() {
    let name = document.getElementById('name').value;
    let email = document.getElementById('email').value;
    let contactNo = document.getElementById('contactNo').value;
    let accountType = document.getElementById('type').value;
    let isValid = true;

    // Name validation
    if (!/^[a-zA-Z ]+$/.test(name)) {
        document.getElementById('nameError').innerText = 'Invalid name (Alphabets and spaces only)';
        isValid = false;
    } else {
        document.getElementById('nameError').innerText = '';
    }

    // Email validation
    if (!/^\S+@\S+\.\S+$/.test(email)) {
        document.getElementById('emailError').innerText = 'Invalid email format';
        isValid = false;
    } else {
        document.getElementById('emailError').innerText = '';
    }

    // Contact No validation
    if (!/^[7-8]\d{9}$/.test(contactNo)) {
        document.getElementById('contactNoError').innerText = 'invalid Contact No';
        isValid = false;
    } else {
        document.getElementById('contactNoError').innerText = '';
    }

    // Account Type validation
    if (accountType === '') {
        document.getElementById('accountTypeError').innerText = 'Please select an account type';
        isValid = false;
    } else {
        document.getElementById('accountTypeError').innerText = '';
    }

    if (isValid) {
        displayCustomerDetails(name, email, contactNo, accountType);
    }

    return false;
}

function displayCustomerDetails(name, email, contactNo, accountType) {
    let table = document.getElementById('customerTable');
    let tableBody = document.getElementById('customerTableBody');
    let newRow = tableBody.insertRow();
    let cell1 = newRow.insertCell(0);
    let cell2 = newRow.insertCell(1);
    let cell3 = newRow.insertCell(2);
    let cell4 = newRow.insertCell(3);

    cell1.innerText = name;
    cell2.innerText = email;
    cell3.innerText = contactNo;
    cell4.innerText = accountType;

    table.style.display = 'table';
}