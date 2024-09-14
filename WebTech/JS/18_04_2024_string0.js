
/*
//Strings
    it is a group of character written in quotes .
    To declare the strings we follow thse ways ' ' / " " / ``
    Using backtik(``) symbol we  can do interpocation.
    positive index strats from 0 , & negative index starts from -1
    To check length of the string we are using property.
*/
/*
    String Methods :
        1.startWith()
        2.endsWith()
        3.toUpperCase()
        4.toLowerCase()
        5.charAt()
        6.charCodeAt()
        7.indexOf()
        8.lastIndexOf()
        9.subString()
        10.substr()
        11.slice()
        12.repeat()
        13.trim()
        14.split()
        15.join()
        16.concat()
        17.include()
        18.fromCharCode()
*/
/*
let str = 'javascript'
console.log(str);

console.log(typeof str);
console.log(str.length);
console.log(str[3]);
*/

//startswith()
// let str2 = 'javascript';
// console.log(str2.startsWith('j'));
// console.log(str2.startsWith('java'));
// console.log(str2.startsWith('ava'));
// console.log(str2.startsWith('t'));
// console.log(str2.startsWith('s'));
// console.log(str2.startsWith('s',4));
// console.log(str2.startsWith('a',3));


/*
// String Methods:
    1.startswith():-

*/

// ends with
// let str3 = 'javascript';
// console.log(str3.endsWith('t'));
// console.log(str3.endsWith('a'));
// console.log(str3.endsWith('j'));
// console.log(str3.endsWith('j',1));
// console.log(str3.endsWith('a',4));
// console.log(str3.endsWith('i',8));


//toUppercase and toLowercase


// let para1 = "facilis alias culpa quis!Voluptatem aperiam reprehenderit vitae minima id ea aliquam soluta beatae esse magni nostrum iste, sequi alias repudiandae hic cumque asperiores quam incidunt tenetur? Rerum quod perspiciatis vel minus dicta quasi eligendi at sapiente delectus, voluptatem corporis! Accusantium expedita possimus facere facilis quam? Alias earum voluptatibus nobis.Id quibusdam nulla reiciendis aperiam sint consequuntur laborum quidem soluta ex pariatur explicabo necessitatibus minima dolorem provident, autem recusandae in eveniet doloribus dignissimos velit similique consequatur! Totam blanditiis voluptas vero! SKLJADFKLAJDFKL JLKJADSF; KJDS;LJF J;SDJAKFJKLAJDFLKJAKLSDJF JDSLKAFJKL JLSD;AJFKALDSFJL;KSDJFKL JLKJDSAFKLJ JDSJFALK;JFDJKLASDF;JSDKAFJLKSDJFLKJSD JFLKDJ J JSJDLFJJWIOWRIWJVCJHIEJRIOJKLYJIEOJIOVXIOJBIDJ JIO JIOE5KLELKJKLWEJOIJ IJWEJREW JOIIJQWOPEQ OPJ JLJKL"

// console.log(para1.toUpperCase());
// console.log(para1.toLowerCase())

//CharAt()
// let str4 = 'laxmi';
// console.log(str4.charAt(0));
// console.log(str4.charAt(2));
// console.log(str4.charAt(4));
// console.log(str4.charAt(5));
// console.log(str4.charAt(-1));
// console.log(str4.charCodeAt(-1));
// console.log(str4.charCodeAt(1));
// console.log(str4.charCodeAt(4));
// console.log(str4.charCodeAt(5));

//substring()
let str5 = 'javascript';
console.log(str5.substring(0,4)); // java
console.log(str5.substring(2,5));// vas
console.log(str5.substring(6,9)); // rip
console.log(str5.substring(6,3)); // asc

//substr method
// let str6 = 'javascript';
// console.log(str6.substr(0,4)); //java
// console.log(str6.substr(2,4));//vasc
// console.log(str6.substr(5)); //cript
// console.log(str6.substr(4)); //Script


//repeat 
// let str6= "Welcome";
// let str7= " Welcome ";
// console.log(str6);
// console.log(str6.repeat(3));
// console.log(str7.repeat(3));
// //trim
// let str8 = "                Tell Me something   !               ";
// console.log(str8);
// console.log(str8.length);

// let str9 = "                Tell Me something   !               ";
// let t1 = str9.trim();
// console.log(t1);
// console.log(t1.length);

// let str10 = "                Tell Me something   !               ";
// let t2 = str10.trimStart();
// console.log(t2);
// console.log(t2.length);

// let str11 = "                Tell Me something   !               ";
// let t3 = str11.trimEnd();
// console.log(t3);
// console.log(t3.length);


//split()
// let str = "just looking like a wow";
// console.log(str);

// console.log(str.split());
// console.log(str.split(' '));
// console.log(str.split(''));



//fromCharCode();
let str12 = String.fromCharCode(65,73,87,98);
console.log(str12);
//WAP to print alphabets.
for(let i = 65; i<=90 ;i++){
    console.log(String.fromCharCode(i));
}
// let stringcharCode = (...arr) =>{
//     a = String.fromCharCode()
// }

/*
    startsWith():
        it will check whether the string is starting with the particular character or not , & it will get the result in boolean value.

        Syntax: string.startsWith(para1,para2)
            para1 : search character
            para2 : index position.
    
        ex:--
    
    endsWith():
        It will check whether the string is ending with particular character or not & it will get the result in boolean value.
        
        Syntax: String.endsWith(para1,para2)
            para1: search character
            para2: ending position(length of string)
        
        Ex:-

    toUpperCase():-
        it is used to convert lowercase to uppercase

    tolowerCase():-
        It is used to convert uppercase to lowercase.
        
        Note:-  It is not affecting to the original String.
        
        Ex:--

    charAt():-
        Returns the character at the specified index position.
    
    charCodeAt():-
        Returns the ASCII value of the character at the specified index position.
        
        Ex:----

    substring():-
        substring mehtod is used to returns the substring at the specified location within a String object.

        Ex:----

    substr(para1,para2) :-
        para1: position
        para2: character count

        Ex:-

    trim():
        trim extra space from starting & ending of the String
        eX:-
    
    repeat():-
        repeat the string.
        Ex:-

    split():-
        It is used to convert the String to array.
        Here we can split the character , words or total string.
        Ex:-

    fromCharCode():
        Want to pass ASCII value of the character & it display the result as character.
        Ex:-

    

*/
// WAP to  reverse a String
let strn1 = 'Hello'

let program = (strn1) =>{
    // console.log(strn1);
    // let ex1 = strn1.split('').reverse();
   
    // console.log(ex1);
    // let ex2 = ex1.join('');
    // console.log(ex2);

    console.log(strn1);
    let ex1 = strn1.split('').reverse().join('');
    console.log(ex1);
  
}
program(strn1);

// WAP to check whether given string is palindrome or not

let palindromeChecker = (str1) =>{
    
    let str2 = str1.split('').reverse().join('');
    (str1 === str2)? console.log("Yes , It is palindrome ") : console.log("No it is not palindrome");
}
let palindromeCheckerWithcaseSensitive = (str1) =>{
    str1 = str1.toLowerCase();
    let str2 = str1.split('').reverse().join('');
    (str1 === str2)? console.log("Yes , It is palindrome ") : console.log("No it is not palindrome");
}
palindromeChecker("Mother");
palindromeChecker("MoM");
palindromeChecker("Mom");
palindromeCheckerWithcaseSensitive("Mother");
palindromeCheckerWithcaseSensitive("MoM");
palindromeCheckerWithcaseSensitive("Mom");
