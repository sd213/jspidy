function startFunc(){
    console.log("Uploaded");
}
function dataFetch(){
    console.log("Deta fetching ... ");
}
let a = 1;
function countFunc(){
    console.log(`${a}`);
    a++;
}
function funcInit(){
    a = 1;
}
function reset(){
    
}
/*
    Timing Function :-
        -   It is used to execute a block of code or function based on the given duration in milliseconds(ms).
        - 4 types 
        - SettimeOut
            -   SetTimeout methods is used to five delay of execution.
            -   set time out function will execute only once after the specified amount of time.
            -   It accept two parameter.
                    1st is call-back function / handler 
                    2nd is  timing to delay  the execution ( timings want to pass in the form of milliseconds i.e 2000ms = 2s)
            - This mehtods returns the number.
            - Ex:--

        - ClearTimeout
            -   It is used to stop the execution of set time out function.
            -   It will take one argument & that argument is return value of set time out 
            -   In this method we want to pass the return data of setTimeout method.
            -   Ex:-

        - Set Interval
            -   This methods same as a setTimeout But Different is in this method continuously executing the function in regular interval of time.
            -   Ex:-

        - ClearInterval
            -   It is used to stop the executing of regular interval of time .
            -   Ex:-
*/