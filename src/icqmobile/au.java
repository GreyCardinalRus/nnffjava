// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:31
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.*;

public final class au
{

    private au(byte byte0)
    {
        k = bh.q();
        e = bh.q();
        l = new Hashtable();
    }

    public au(Object obj)
    {
        this((byte)0);
        a(obj);
    }

    public final void a(s s1)
    {
        s1.b(b).r(c).r(a).r(d).a(j);
        if(f != null)
        {
            int i1;
            s1.r(i1 = f.size());
            for(int j1 = 0; j1 < i1; j1++)
            {
                String s2;
                s1.a(s2 = x.a(f, j1));
                ((y)g.get(s2)).a(s1);
            }

            return;
        } else
        {
            s1.r(0);
            return;
        }
    }

    public static final au b(s s1)
    {
        return (new au((byte)0)).c(s1);
    }

    private final au c(s s1)
    {
        b = s1.g(null);
        c = s1.g();
        a = s1.g();
        d = s1.g();
        j = s1.j();
        int i1 = s1.g();
        for(int j1 = 0; j1 < i1; j1++)
        {
            String s2;
            k.addElement(s2 = s1.j());
            l.put(s2, new y(s1, s2));
        }

        i();
        return this;
    }

    public final av a()
    {
        return av.d().a(234).h(b).a(this);
    }

    public final av b()
    {
        String s1 = ab.e(Integer.toString(d <= 0 ? c : d));
        int i1 = d <= 0 ? 0 : 1;
        byte byte0 = ((byte)(d <= 0 ? 20 : 18));
        int j1 = t.l(i1).a(s1) + 20;
        av av1 = av.d().a(this).b(5).a(5, 0).a(x.a(b, i1, j1), i1, byte0);
        if(i == 1)
            av1.a(397);
        else
        if(i == 2)
            av1.a(398);
        av1.h().a(s1, d <= 0 ? 0 : 1, byte0).a("\n", 0, 0).a(5, 0).a(1, 24).c(d <= 0 ? 23 : 22);
        return av1;
    }

    public final void a(Object obj)
    {
        b = aa.k((String)ab.d(obj, 1));
        b = aa.l(b);
        c = ab.c(obj, 3);
        a = ab.c(obj, 0);
        d = ab.c(obj, 2);
        i = ab.c(obj, 4);
        j = t.i();
        h = true;
    }

    public au()
    {
        a = -1;
        k = bh.q();
        e = bh.q();
        l = new Hashtable();
        m = new Hashtable();
        n = bh.q();
    }

    public final void b(Object obj)
    {
        obj = (Vector)ab.d(obj, 9);
        k.removeAllElements();
        Object obj1;
        for(obj = ((Vector) (obj)).elements(); ((Enumeration) (obj)).hasMoreElements(); l.put(((y) (obj1)).a, obj1))
        {
            String s2 = (String)((Vector) (obj1 = (Vector)((Enumeration) (obj)).nextElement())).elementAt(0);
            k.addElement(s2);
            obj1 = new y(((Vector) (obj1)));
        }

        for(Enumeration enumeration = l.keys(); enumeration.hasMoreElements();)
        {
            String s3 = (String)enumeration.nextElement();
            if(!k.contains(s3))
                l.remove(s3);
        }

        for(Enumeration enumeration2 = e.elements(); enumeration2.hasMoreElements();)
        {
            String s1 = (String)enumeration2.nextElement();
            if(!k.contains(s1))
                e.removeElement(s1);
        }

        for(Enumeration enumeration1 = k.elements(); enumeration1.hasMoreElements();)
        {
            obj = (String)enumeration1.nextElement();
            if(!((y)l.get(obj)).a())
            {
                j = ((String) (obj));
                break;
            }
        }

        h = false;
    }

    public final Enumeration c()
    {
        Vector vector = bh.q();
        Object obj;
        for(Enumeration enumeration = k.elements(); enumeration.hasMoreElements();)
            if(l.containsKey(obj = enumeration.nextElement()))
                vector.addElement(l.get(obj));

        return vector.elements();
    }

    public final Vector d()
    {
        Vector vector = bh.q();
        Object obj;
        for(Enumeration enumeration = k.elements(); enumeration.hasMoreElements();)
            if(l.containsKey(obj = enumeration.nextElement()))
                vector.addElement(obj);

        return vector;
    }

    public final boolean a(String s1)
    {
        return e.contains(s1);
    }

    public final y b(String s1)
    {
        if(s1 != null)
            return (y)l.get(s1);
        else
            return null;
    }

    public final y c(String s1)
    {
        if((s1 = (y)l.get(s1)).e())
            return s1;
        else
            return null;
    }

    public final boolean d(String s1)
    {
        return k.contains(s1);
    }

    public final boolean e()
    {
        return e.size() > 0;
    }

    public final void e(String s1)
    {
        e.addElement(s1);
    }

    public final void f(String s1)
    {
        x.a(e, s1);
    }

    public final void g(String s1)
    {
        if(!e.contains(s1))
        {
            e(s1);
            return;
        } else
        {
            f(s1);
            return;
        }
    }

    public final boolean f()
    {
        return a == 0x7a121;
    }

    public final void h(String s1)
    {
        v.b();
        x.a(k, s1);
        x.a(e, s1);
        l.remove(s1);
        if(s1.equals(j))
            j = t.i();
    }

    public final void g()
    {
        j = null;
        k.removeAllElements();
        e.removeAllElements();
        n.removeAllElements();
        l.clear();
        m.clear();
    }

    public final void a(Vector vector)
    {
        g();
        Vector vector1 = (Vector)(vector = (Vector)vector.elementAt(2)).elementAt(2);
        k.removeAllElements();
        c = ((Integer)vector.elementAt(1)).intValue();
        y y1;
        for(vector = vector1.elements(); vector.hasMoreElements(); m.put(y1.a, ab.e(Integer.toString(x.b(vector1.elementAt(7))))))
        {
            String s1 = (String)(vector1 = (Vector)vector.nextElement()).elementAt(0);
            k.addElement(s1);
            y1 = new y(vector1);
            l.put(y1.a, y1);
        }

        for(Enumeration enumeration = l.keys(); enumeration.hasMoreElements();)
        {
            String s2 = (String)enumeration.nextElement();
            if(!k.contains(s2))
                l.remove(s2);
        }

        for(Enumeration enumeration1 = e.elements(); enumeration1.hasMoreElements();)
        {
            String s3 = (String)enumeration1.nextElement();
            if(!k.contains(s3))
                e.removeElement(s3);
        }

    }

    public final void a(String s1, y y1)
    {
        if(!k.contains(s1))
            k.addElement(s1);
        l.put(s1, y1);
    }

    public final int i(String s1)
    {
        if(!x.n(s1 = (String)m.get(s1)))
            return 0;
        else
            return Integer.parseInt(s1);
    }

    public final av h()
    {
        return av.d().a(this).b(5).a(5, 0).a(392).a(b, 1, 36).h().a(x.f(d), 1, 36).a(5, 0).a(1, 34).c(32, 33).j();
    }

    public final void a(boolean flag)
    {
        d += 1 * (flag ? 1 : -1);
    }

    public final void i()
    {
        x.a(k, f = new Vector());
        g = new Hashtable();
        for(int i1 = 0; i1 < f.size(); i1++)
        {
            Object obj = f.elementAt(i1);
            g.put(obj, l.get(obj));
        }

    }

    public int a;
    public String b;
    public int c;
    public int d;
    private String j;
    private Vector k;
    public final Vector e;
    private Hashtable l;
    public Vector f;
    public Hashtable g;
    private Hashtable m;
    private Vector n;
    public boolean h;
    public int i;
}