package code;

public class Fraction
{
    private int num, denom;

    public Fraction(int num, int denom)
    {
        this.num = num;
        this.denom = denom;
    }

    public Fraction(int num)
    {
        this.num = num;
        denom = 1;
    }

    public Fraction(Fraction other)
    {
        num = other.num;
        denom = other.denom;
    }

    public Fraction inverse(Fraction y)
    {
        if (num == 0)
            return null;
        return new Fraction (num*y.denom, denom*y.num);
    }

    @Override
    public String toString()
    {
        return num + " / " + denom;
    }

    public Fraction multiply(Fraction f)
    {
        return new Fraction(num*f.num,denom*f.denom);
    }




}

