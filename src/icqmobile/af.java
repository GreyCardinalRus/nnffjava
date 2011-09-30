// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:16:49
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 


public final class af
    implements aj, al
{

    private af()
    {
    }

    public af(int l, int i1, String s, int j1)
    {
        v.b();
        f = l;
        g = i1;
        h = s;
        i = j1;
        e = true;
        j = new am();
    }

    public final void a(String s)
    {
        v.b();
        a = s;
    }

    public final void b(String s)
    {
        v.b();
        b = s;
    }

    public final int t_()
    {
        return 8;
    }

    public final boolean u_()
    {
        return e;
    }

    public final void c()
    {
        e = false;
    }

    public final void d()
    {
        e = true;
    }

    public final int e()
    {
        return f;
    }

    public final int f()
    {
        return g;
    }

    public final String v_()
    {
        Object obj;
        obj = x.n(b) ? ((Object) (b)) : ((Object) (t.c(450)));
        obj = bh.r().append(((String) (obj)));
        if(c <= 0)
            break MISSING_BLOCK_LABEL_134;
        ((StringBuffer) (obj)).append(',').append(' ').append(c);
        if(c < 100) goto _L2; else goto _L1
_L1:
        327;
          goto _L3
_L2:
        if(c >= 5 && c <= 20) goto _L5; else goto _L4
_L4:
        int l;
        if((l = c % 10) != 1) goto _L7; else goto _L6
_L6:
        '\u0145';
          goto _L3
_L7:
        if(l < 2 || l > 4) goto _L5; else goto _L8
_L8:
        '\u0146';
          goto _L3
_L5:
        '\u0144';
_L3:
        t.c();
        append();
        JVM INSTR pop ;
        if(x.n(h))
            ((StringBuffer) (obj)).append(',').append(' ').append(h);
        return bh.b(((StringBuffer) (obj)));
    }

    public final int h()
    {
        return i;
    }

    public final boolean x_()
    {
        return true;
    }

    public final int a(int l)
    {
        return j.a(l, this);
    }

    public final int b(int l)
    {
        return j.b(l, this);
    }

    public final String j()
    {
        return a;
    }

    public final int k()
    {
        if(d == 1)
            return 377;
        return d != 2 ? 379 : 378;
    }

    private boolean e;
    private int f;
    private int g;
    private String h;
    public String a;
    public String b;
    public int c;
    public int d;
    private int i;
    private am j;
}