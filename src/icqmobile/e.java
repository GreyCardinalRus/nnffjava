// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:41
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Vector;

public abstract class e
    implements ai
{

    public e(ba ba1)
    {
        a = ba1;
    }

    public final boolean a()
    {
        be be1;
        for(int k = b.size(); --k >= 0;)
            if(((be1 = a(k)) instanceof j) && ((j)be1).l())
                return true;

        return false;
    }

    public final void a(be be1)
    {
        x.a(b, be1);
    }

    public final be a(int k)
    {
        return (be)b.elementAt(k);
    }

    public void a(s s1, boolean flag)
    {
        int k;
        s1.r(k = b.size());
        for(int l = 0; l < k; l++)
            a(l).a(s1);

        s1.a(d);
        if(flag)
            b.removeAllElements();
        x.b(b);
    }

    private int g()
    {
        int k = 0;
        be be1;
        for(int l = b.size(); --l >= 0;)
            if((be1 = a(l)).j && !be1.j() && !be1.r_() && !be1.m_() && !be1.p())
                k++;

        return k;
    }

    private int h()
    {
        int k;
        be be1;
        for(int l = k = b.size(); --l >= 0;)
            if((be1 = a(l)).m_() || be1.j() || be1.r_() || be1.p())
                k--;

        return k;
    }

    public final av b(int k)
    {
        av av1 = av.a(j()).a(i()).a(this);
        String s1;
        if(e())
            av1.a(bh.b(bh.r().append(s1 = c).append(' ').append('(')), 1, 0).a(ab.e(Integer.toString(g())), 1, 14).a(bh.b(bh.r().append('/').append(h()).append(')')), 1, 0);
        else
        if(k >= 0)
            av1.a(bh.b(bh.r().append(s1 = c).append(' ').append('(').append(k).append(')')), 1, 0);
        else
            av1.a(c, 1, 0);
        return av1;
    }

    public int b()
    {
        return a.a(this);
    }

    public int c()
    {
        d ^= true;
        return 4;
    }

    public final boolean d()
    {
        return !d;
    }

    private int i()
    {
        return !d ? 31 : 30;
    }

    public int a(String s1)
    {
        return a.a(this, s1);
    }

    public final boolean b(be be1)
    {
        return b.contains(be1);
    }

    public abstract boolean e();

    public final int a(Object obj)
    {
        return e.compareTo(((e)obj).e);
    }

    public final void b(Object obj)
    {
        b.addElement(obj);
    }

    public final void c(Object obj)
    {
        x.a(b, obj);
    }

    public final void b(String s1)
    {
        v.b();
        if(!ab.a(s1, c))
        {
            c(s1);
            bf.b = true;
        }
    }

    public final void c(String s1)
    {
        v.b();
        e = ab.e((c = s1).toLowerCase());
    }

    private String j()
    {
        return (new s()).f(35).v(a.h).f(35).v(f()).l();
    }

    public abstract int f();

    public final String toString()
    {
        return c;
    }

    public final ba a;
    public final Vector b = bh.q();
    public String c;
    public boolean d;
    private String e;
}