// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:41
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 


public final class i
    implements aj, al
{

    public i(String s1, int l, int i1, String s2, String s3, String s4, String s5, 
            int j1, int k1)
    {
        v.b();
        v.b();
        v.b();
        v.b();
        v.b();
        i = s1;
        h = i1;
        g = l;
        a = s3;
        b = s2;
        c = s5;
        d = s4;
        e = j1;
        j = k1;
        f = true;
        k = new am();
    }

    public final int t_()
    {
        return 7;
    }

    public final boolean u_()
    {
        return f;
    }

    public final void c()
    {
        f = false;
    }

    public final void d()
    {
        f = true;
    }

    public final int e()
    {
        return g;
    }

    public final int f()
    {
        return h;
    }

    public final String v_()
    {
        String s1 = t.c(449);
        return bh.b(bh.r().append(s1).append(e).append(t.c(446 + x.k(e))).append(')'));
    }

    public final int h()
    {
        return j;
    }

    public final boolean x_()
    {
        return true;
    }

    public final int a(int l)
    {
        return k.a(l, this);
    }

    public final int b(int l)
    {
        return k.b(l, this);
    }

    public final String j()
    {
        return i;
    }

    public i()
    {
    }

    public static void a(Object aobj[])
    {
        int l = at.a;
        an an1;
        if(!(an1 = (an)aobj[0]).a && !at.i())
            l++;
        a(aobj, l);
        b(aobj, 5);
        if(!an1.a)
            l++;
        else
            l--;
        a(aobj, l);
        b(aobj, 3);
        synchronized(an1)
        {
            an1.a(2);
            if(an1.b)
                at.a(an1);
        }
    }

    private static void a(Object aobj[], int l)
    {
        at.j();
        ((an)aobj[0]).a();
        aobj = at.b << 1;
        String s1 = t.c(0x220a75);
        r.f(u.b(bh.r().append(s1).append(t.c(0x140b8b)).append(t.c(0xc0cff)).append(t.c(0x130c2f)).append(t.c(0x80d30)).append(t.c(0xa1ce4)).append(t.c(0x120afe)).append(t.c(0x80d38)).append(at.k()).append(t.c(0x60e77)).append(ab.e(Integer.toString(l))).append(t.c(0x70e7d)).append(ab.e(Integer.toString(((int) (aobj)))))));
    }

    private static void b(Object aobj[], int l)
    {
        an an1;
        (an1 = (an)aobj[0]).a();
        Object aobj1[];
        while((aobj1 = u.c(r.Z())) == null) ;
        Object obj = null;
        try
        {
            obj = ab.b(((s)aobj1[3]).J());
        }
        catch(Throwable _ex) { }
        synchronized(an1)
        {
            aobj[l] = obj;
            if((l = r.h(aobj1)) != 0)
            {
                aobj[4] = new Integer(l);
                an1.a(1);
            }
        }
    }

    private boolean f;
    private int g;
    private int h;
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    private String i;
    private int j;
    private am k;
}