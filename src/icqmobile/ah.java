// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:30
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 


public final class ah extends az
{

    public ah(int i, String s, String s1)
    {
        super(i, s, s1);
        super.c = t.c(0xf1cd5);
        super.d = 5222;
    }

    public final int a()
    {
        return 3;
    }

    public ah(s s)
    {
        super(s);
        super.c = t.c(0xf1cd5);
        super.d = 5222;
    }

    public final int b()
    {
        int i;
        int j;
        if((j = (i = super.b()) & 0xffff) >= 381 && j <= 384)
            return i + 4;
        else
            return i;
    }

    public final boolean c_()
    {
        return true;
    }

    public final String c()
    {
        return super.c;
    }

    public final String i_()
    {
        return super.f;
    }

    public final int y_()
    {
        return 0x91913;
    }
}