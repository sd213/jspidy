let handleSubmit = (e) =>{
    e.preventDefault();

    let fname = document.getElementsByName('fnm')[0].value;
    let lname = document.getElementsByName('lnm')[0].value;

    console.log(`My Name is ${fname} ${lname}`);
    document.getElementById("Show_Data").textContent = `My Name is ${fname} ${lname}`;
}
// Assignment 
// My version
let handleSubmit2 = (e) =>{
    e.preventDefault();

    let fname = document.getElementsByName('fullnm')[0].value;
    // let age = document.getElementsByName('age')[0].value;
    let pnum =  document.getElementsByName('pnum')[0].value;
    let pynum = document.getElementsByName('pynum')[0].value;
    let DOB = document.getElementsByName('DOB')[0].value;
    let dateObj = new Date();
    let currentDateObj = new Date(DOB);
    let ageDiffMs = currentDateObj - dateObj;
    let ageDate = new Date(ageDiffMs);
    let age = Math.abs(ageDate.getUTCFullYear() - 1970);
    let res = document.getElementById('data');
    res.innerHTML=`<p>Your Name is ${fname}</p> <p>DOB : ${DOB}</p> <p>Ph-no : ${pnum}</p> <p>Y.O.P : ${pynum}</p> <p>Age : ${age} </p>`
    console.log(ageDate,age);
    console.log(fname,pnum,pynum,DOB);
}

// Sir's Version
let ageCalculator = (e) =>{
    e.preventDefault();
    console.log(e); //SubmitEvent {isTrusted: true, submitter: button, type: 'submit', target: form, currentTarget: form, …}

    console.log(e.target); //SubmitEvent {isTrusted: true, submitter: button, type: 'submit', target: form, currentTarget: form, …}

    let nm = e.target[0].value;

    let dob = Number(e.target[1].value);
    console.log(dob);
    let dateObj = new Date();
    let age = dateObj.getFullYear() - dob;
    //console.log(nm,age)
    let res = document.getElementById('data2');
    res.innerHTML = `<h1>${nm} age is ${age}</h1>`;
}