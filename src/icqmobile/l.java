// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:41
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Hashtable;
import java.util.Vector;

public final class l
{

    public l()
    {
        k = t.i();
        l = t.i();
        m = t.i();
        a = t.i();
        n = t.i();
        o = t.i();
        p = t.i();
        q = t.i();
        b = 2;
        c = t.c;
        d = t.c;
    }

    public final void a(String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            String s8)
    {
        v.b();
        v.b();
        v.b();
        v.b();
        v.b();
        v.b();
        v.b();
        v.b();
        k = s1;
        l = s2;
        m = s3;
        a = s4;
        n = s5;
        o = s6;
        p = s8;
        q = s7;
        e = false;
    }

    private void a(int i1, String as[])
    {
        v.g();
        b = i1;
        d = c;
        c = as;
    }

    public final void a(Vector vector)
    {
        v.j();
        d = c;
        int i1;
        c = new String[i1 = vector.size()];
        for(int j1 = 0; j1 < i1; j1++)
            c[j1] = (String)vector.elementAt(j1);

    }

    public final String[] a()
    {
        return x.a(k, l, m, a, n, o, q, p);
    }

    public final void a(ao ao1)
    {
        if(ao1 == null)
        {
            return;
        } else
        {
            d = c;
            c = b(ao1);
            return;
        }
    }

    private static String[] b(ao ao1)
    {
        String as[] = t.c;
        if(ao1.b == null)
            return as;
        if((ao1 = ((ao)ao1.b.elementAt(0)).b) == null)
            return as;
        int i1;
        String as1[] = new String[i1 = ao1.size()];
        for(int j1 = 0; j1 < i1; j1++)
            as1[j1] = ((ao)ao1.elementAt(j1)).b(0x50305);

        return as1;
    }

    public final ao b()
    {
        String as[] = c;
        ao ao1 = new ao(114);
        ao ao2 = new ao("visible", ao1, null);
        ao1.a(ao2);
        int i1 = as.length;
        for(int j1 = 0; j1 < i1; j1++)
        {
            ao ao3;
            (ao3 = new ao("u", ao2, null)).a(0x50305, as[j1]);
            ao2.a(ao3);
        }

        return ao1;
    }

    public static final String[] a(s s1)
    {
        if(s1.b == 0 || s1.g() == 0)
            return null;
        String as[];
        (as = new String[8])[0] = s1.j();
        as[1] = s1.j();
        as[2] = s1.j();
        as[3] = s1.g(null);
        as[4] = s1.j();
        as[5] = s1.j();
        if(ab.a(0x90324, as[2]))
        {
            as[6] = s1.j();
            as[7] = s1.j();
        } else
        {
            as[6] = t.i();
            as[7] = t.i();
        }
        return as;
    }

    public static final s a(String as[])
    {
        return (new s()).f((new s()).a(as[0]).a(as[1]).a(as[2]).b(as[3]).a(as[4]).a(as[5]).a(as[6]).a(as[7]));
    }

    public final long c()
    {
        try
        {
            return r.d(l);
        }
        catch(Throwable _ex)
        {
            throw new RuntimeException();
        }
    }

    public final long d()
    {
        try
        {
            return r.f(k);
        }
        catch(Throwable _ex)
        {
            throw new RuntimeException();
        }
    }

    public static final void a(l l1, s s1)
    {
        boolean flag;
        s1.a(flag = l1.e());
        if(flag)
            s1.a(l1.k).a(l1.l).a(l1.m).b(l1.a).a(l1.n).a(l1.o).a(l1.q).a(l1.p).q(l1.b).a(l1.e);
    }

    public static final l b(s s1)
    {
        l l1 = new l();
        if(s1.n())
            try
            {
                l1.a(s1.j(), s1.j(), s1.j(), s1.g(null), s1.j(), s1.j(), s1.j(), s1.j());
                l1.a(s1.z(), t.c);
                l1.e = s1.n();
            }
            catch(Throwable _ex)
            {
                return null;
            }
        return l1;
    }

    public final boolean e()
    {
        return !ab.a(k) && !ab.a(l);
    }

    public final int f()
    {
        try
        {
            if(ab.a(0x90324, m))
                return m.e(Integer.parseInt(p));
        }
        catch(Throwable _ex) { }
        return 10;
    }

    public final void g()
    {
        k = l = t.i();
        e = false;
    }

    public static final String a(int i1, String s1, String s2)
    {
        return (new s()).c(0x350276).v(i1).c(0x3032d).f(s1).c(0x30330).f(s2).c(0x1402f1).v(x.e()).d();
    }

    public static final boolean h()
    {
        return (o.b < f || o.b > h || o.a > i || o.a < g || (long)t.f(39) != j) && t.g(280);
    }

    public static final String a(i i1, int j1)
    {
        return (new s()).c(0x1d02ab).f(i1.b).c(0x6030a).f(i1.a).c(0x60310).f(i1.d).c(0x60316).f(i1.c).c(0x1402dd).v(j1).c(0x602ff).v(x.e()).d();
    }

    public static final Vector a(s s1, long l1, long l2)
    {
        Vector vector = null;
        Vector vector1 = null;
        try
        {
            vector = (Vector)ab.b(s1);
        }
        catch(Throwable _ex) { }
        if(vector != null)
        {
            if(!vector.isEmpty())
                vector1 = bh.q();
            for(s1 = vector.size(); --s1 >= 0;)
            {
                Hashtable hashtable = (Hashtable)vector.elementAt(s1);
                int i1;
                m m1;
                (m1 = new m(ab.b(hashtable, 0x40333), l1, l2, m.e(i1 = Integer.parseInt(ab.b(hashtable, 0x80337))))).e = 1;
                m1.f = i1;
                m1.g = Integer.parseInt(ab.b(hashtable, 0x7033f));
                vector1.addElement(m1);
            }

        }
        return vector1;
    }

    public final String i()
    {
        char c1;
        switch(b)
        {
        case 1: // '\001'
            c1 = '\u0302';
            break;

        case 2: // '\002'
            c1 = '\u0303';
            break;

        case 3: // '\003'
            c1 = '\u0304';
            break;

        case 4: // '\004'
            c1 = '\u0305';
            break;

        default:
            return null;
        }
        return t.c(c1);
    }

    private String k;
    private String l;
    private String m;
    public String a;
    private String n;
    private String o;
    private String p;
    private String q;
    public int b;
    public String c[];
    public String d[];
    public boolean e;
    public static long f;
    public static long g;
    public static long h;
    public static long i;
    public static long j;
}