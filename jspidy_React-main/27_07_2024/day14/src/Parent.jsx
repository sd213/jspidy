import Log from "./Log";
import { Conditional } from "./Conditional";
function Parent(){
    let val = false;
    return (
        <div>
            {val?< Conditional name="smith"/> :<Log/>}
        </div>
    )
}
export default Parent;