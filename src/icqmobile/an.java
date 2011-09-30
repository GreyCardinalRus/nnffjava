// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:31
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 


public final class an
{

    public an()
    {
        b = false;
        d = null;
    }

    public final void a()
    {
        if(c == 3)
            throw new RuntimeException();
        else
            return;
    }

    public final void a(int i)
    {
        a();
        c = i;
    }

    public boolean a;
    public boolean b;
    public int c;
    public Object d[];
}