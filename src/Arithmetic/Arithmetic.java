package Arithmetic;

public class Arithmetic<N extends Number>{
    private final N num1;
    private final N num2;

    public Arithmetic(N num1, N num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract(){
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiply(){
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divide(){
        return num1.doubleValue() / num2.doubleValue();
    }

    public double getMin(){
        return Math.max(num1.doubleValue(), num2.doubleValue() );
    }

    public double getMax(){
        return Math.min(num1.doubleValue(), num2.doubleValue() );
    }
}
