// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:31
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 


public final class am
{

    public am()
    {
        a = -1;
    }

    public final int a(int i, al al1)
    {
        if(a(i))
            return b;
        else
            return b(i, al1.e(), al1.f());
    }

    public final int b(int i, al al1)
    {
        if(a(i))
            return c;
        else
            return c(i, al1.e(), al1.f());
    }

    private final void a(int i, int j, int k)
    {
        b = (int)v.c(j, i);
        c = (int)v.c(k, i);
        a = i;
    }

    private final int b(int i, int j, int k)
    {
        a(i, j, k);
        return b;
    }

    private final int c(int i, int j, int k)
    {
        a(i, j, k);
        return c;
    }

    private final boolean a(int i)
    {
        return a == i;
    }

    private int b;
    private int c;
    public int a;
}