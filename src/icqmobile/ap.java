// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:31
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Vector;

public final class ap extends e
{

    public ap(ax ax1, int i, String s1)
    {
        super(ax1);
        e = i;
        b(s1);
    }

    public ap(ax ax1, s s1)
    {
        super(ax1);
        e = s1.g();
        b(s1.g(null));
        for(int i = s1.g(); --i >= 0;)
            b(new j(ax1, s1));

        super.d = s1.n();
    }

    public ap()
    {
        super(null);
    }

    public final void a(s s1, boolean flag)
    {
        s1.r(e);
        s1.b(super.c);
        super.a(s1, flag);
    }

    public final int f()
    {
        return e;
    }

    public final s a(String s1, int i, int k)
    {
        int l;
        s s2 = (new s()).o(200).o(((k == -1 ? 0 : 2) - (i == -1 ? 0 : 2)) + ((l = super.b.size()) << 1));
        for(int i1 = 0; i1 < l; i1++)
        {
            int j1;
            if(i != (j1 = ((j)a(i1)).a))
                s2.o(j1);
        }

        if(k != -1)
            s2.o(k);
        return (new s()).m(s1).o(e).q(1).e(s2);
    }

    public final boolean e()
    {
        return e >= 0;
    }

    public int e;
}