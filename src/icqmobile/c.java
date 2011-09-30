// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:41
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 


public final class c
{

    public c(s s1)
    {
        a = s1.z();
        b = s1.z();
        c = s1.g(null);
        d = s1.j();
        e = s1.z();
        f = s1.j();
    }

    public c(int i, String s1, int j, String s2)
    {
        a = 1;
        b = i;
        c = s1;
        d = null;
        e = j;
        f = s2;
    }

    public final s a(s s1)
    {
        return s1.q(a).q(b).b(c).a(d).q(e).a(f);
    }

    public final int a;
    public final int b;
    public final String c;
    public String d;
    public final int e;
    private String f;
}