package python;

@org.python.Module(
    __doc__ =
        "TODO: add doc"
)
public class math extends org.python.types.Module {
    @org.python.Attribute
    public static org.python.Object __file__ = new org.python.types.Str("python/common/python/math.java");
    
    @org.python.Method(
            __doc__ = ""
    )
    public static org.python.Object factorial(org.python.Object number) {
        if(number instanceof org.python.types.Int){
            throw new org.python.exceptions.TypeError("an integer is required (got type " + number.typeName() + ")");
        } 
        int number_value=(int)((org.python.types.Int) number.__int__()).value;
        if(number_value<0){
            throw new org.python.exceptions.ValueError("factorial() only accepts integral values.");
        }
        int factorial = 1;
        if(number_value==0){
            return new org.python.types.Int(factorial);
        }
        for(int i = number_value; i>0;i--){
            factorial = factorial*i;
        }
            return new org.python.types.Int(factorial);
    }
}
