// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:30
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 


public final class ag
{

    public ag()
    {
        b = false;
        c = false;
        e = null;
    }

    public final void a()
    {
        if(d == 3)
            throw new RuntimeException();
        else
            return;
    }

    public final void a(int i)
    {
        a();
        d = i;
    }

    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public Object e[];
}