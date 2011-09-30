// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:31
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.*;

public final class ao
{

    public ao()
    {
        this(null, null, null);
    }

    public static final ao a(int j)
    {
        return new ao(t.c(j));
    }

    public ao(int j)
    {
        this(bh.a(j));
    }

    private ao(String s1)
    {
        v.b();
        a = s1;
    }

    public ao(String s1, ao ao1, Hashtable hashtable)
    {
        v.b();
        v.i();
        d = ao1;
        e = hashtable;
        a = s1;
    }

    public final ao a(int j, int k)
    {
        a(t.c(j), t.c(k));
        return this;
    }

    public final ao a(ao ao1)
    {
        if(b == null)
            b = bh.q();
        b.addElement(ao1);
        return this;
    }

    public final ao a(Object obj)
    {
        if(c == null)
            c = bh.r();
        c.append(obj);
        return this;
    }

    public final String b(int j)
    {
        return d(t.c(j));
    }

    public final String c(int j)
    {
        return d(bh.a(j));
    }

    public final long d(int j)
    {
        return Long.parseLong(c(j));
    }

    public final int e(int j)
    {
        return Integer.parseInt(c(j));
    }

    public final int a()
    {
        return Integer.parseInt(b(0x30d45));
    }

    private String d(String s1)
    {
        v.b();
        return (String)e.get(s1);
    }

    public final ao a(int j, String s1)
    {
        v.b();
        return b(t.c(j), s1);
    }

    public final ao b(int j, String s1)
    {
        v.b();
        return b(bh.a(j), s1);
    }

    private ao b(String s1, String s2)
    {
        v.b();
        v.b();
        if(s1 != null)
            if(s2 != null)
            {
                if(e == null)
                    e = new Hashtable();
                e.put(s1, s2);
            } else
            if(e != null)
                e.remove(s1);
        return this;
    }

    public final ao f(int j)
    {
        return a(t.c(j));
    }

    public final ao a(String s1)
    {
        ao ao1;
        for(int j = x.c(b); --j >= 0;)
            if(ab.a((ao1 = (ao)b.elementAt(j)).a, s1))
                return ao1;

        return null;
    }

    public final ao g(int j)
    {
        return (ao)b.elementAt(j);
    }

    public final String toString()
    {
        Object obj = f();
        obj = bh.r().append(((String) (obj)));
        if(c != null)
            ((StringBuffer) (obj)).append(b(c));
        for(int j = 0; j < x.c(b); j++)
            ((StringBuffer) (obj)).append(b.elementAt(j));

        return bh.b(e() ? ((StringBuffer) (obj)) : ((StringBuffer) (obj)).append(g()));
    }

    private static StringBuffer b(Object obj)
    {
        if(obj == null)
            return null;
        else
            return e(obj.toString());
    }

    private static StringBuffer e(String s1)
    {
        StringBuffer stringbuffer = bh.r();
        int j = s1.length();
        for(int k = 0; k < j; k++)
        {
            char c1;
            if((c1 = s1.charAt(k)) == '&')
                stringbuffer.append(bh.a(0x3b706d6126L));
            else
            if(c1 == '"')
                stringbuffer.append(bh.a(0x3b746f757126L));
            else
            if(c1 == '<')
                stringbuffer.append(bh.a(0x3b746c26L));
            else
            if(c1 == '>')
                stringbuffer.append(bh.a(0x3b746726L));
            else
                stringbuffer.append(c1);
        }

        return stringbuffer;
    }

    public final s b()
    {
        return (new s()).n(toString());
    }

    private final boolean e()
    {
        return c == null && b == null;
    }

    private final String f()
    {
        StringBuffer stringbuffer = bh.r().append('<').append(a);
        if(e != null)
        {
            Object obj;
            for(Enumeration enumeration = e.keys(); enumeration.hasMoreElements(); bh.b(((StringBuffer) (obj))))
                stringbuffer.append(' ').append(obj = enumeration.nextElement()).append('=').append('"').append(obj = b(e.get(obj))).append('"');

        }
        return bh.b(e() ? stringbuffer.append('/').append('>') : stringbuffer.append('>'));
    }

    private final String g()
    {
        return bh.b(bh.r().append('<').append('/').append(a).append('>'));
    }

    public final ao b(String s1)
    {
        ao ao1;
        for(int j = x.c(b); --j >= 0;)
            if(ab.a(s1, ab.a((ao1 = (ao)b.elementAt(j)).c)))
                return ao1;

        return null;
    }

    public final ao h(int j)
    {
        return a(0x51940, t.c(j));
    }

    public final ao i(int j)
    {
        return a(0x401ca, t.c(j));
    }

    public final ao a(String s1, String s2)
    {
        s1 = new ao(s1);
        if(s2 != null)
            s1.a(s2);
        a(((ao) (s1)));
        return s1;
    }

    public final ao b(int j, int k)
    {
        return a(t.c(j), ((String) (null))).h(k);
    }

    public final ao c(int j, int k)
    {
        return a((new ao(t.c(j))).h(k));
    }

    public final String c()
    {
        return d(t.c(0x401ca));
    }

    public final String c(String s1)
    {
        try
        {
            return ab.a(a(s1).c);
        }
        catch(Throwable _ex)
        {
            return t.i();
        }
    }

    public final ao d(int j, int k)
    {
        ao ao1;
        for(int l = x.c(b); --l >= 0;)
            if(ab.a(j, (ao1 = g(l)).a) && ab.a(k, ao1.d(t.c(0x51940))))
                return ao1;

        return null;
    }

    public final ao d()
    {
        return i(0x60d31).a(0x2022e, d(t.c(0x402ec))).a(0x402ec, ((String) (null)));
    }

    public String a;
    public Vector b;
    public StringBuffer c;
    public ao d;
    private Hashtable e;
}