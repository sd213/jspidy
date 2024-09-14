const OTPGenerator = () => {
  return (
    <div className="otpGenerator">
      <h2>Otp Geneator</h2>
      <div className="form">
        <input type="text" className="input1" />
        <button className="btn2" onClick={otpgen}>
          Otp Generate
        </button>
      </div>
    </div>
  );
};
const otpgen = () => {
  document.querySelector("input").value = Math.trunc(
    Math.random() * (10000 - 1000) + 1000
  );
};
export default OTPGenerator;
