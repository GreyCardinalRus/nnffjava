// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:41
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 


public final class k
{

    private k()
    {
        d = -1;
        g = 16;
    }

    public k(String s1, long l, long l1, long l2, 
            long l3)
    {
        this();
        v.b();
        a = s1;
        h = l;
        i = l1;
        j = l2;
        k = l3;
    }

    public final k a(int l, int i1)
    {
        d = l;
        e = i1;
        return this;
    }

    public final s a(s s1)
    {
        return s1.b(a).a(h).a(i).a(j).a(k).b(f).a(b).a(c).r(g);
    }

    public k(s s1)
    {
        this(s1.g(null), s1.o(), s1.o(), s1.o(), s1.o());
        f = s1.g(null);
        b = s1.o();
        c = s1.o();
        g = s1.g();
    }

    public final boolean a(long l, long l1)
    {
        return l < j && l > h && l1 < i && l1 > k;
    }

    public final boolean a(k k1)
    {
        return j - h < k1.j - k1.h && i - k < k1.i - k1.k;
    }

    public String a;
    private long h;
    private long i;
    private long j;
    private long k;
    public long b;
    public long c;
    public int d;
    public int e;
    public String f;
    public int g;
}