// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:42
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Vector;

public final class n extends be
    implements al
{

    public n(ba ba1, int i, int i1, int j1, String s1, String s2, int k1, 
            int l1, String s3, String s4, String s5)
    {
        super(ba1);
        a = i;
        b = i1;
        c = j1;
        d = s1;
        e = k1;
        s = l1;
        f = s3;
        t = s5;
        g(x.c(s2, s1));
        super.l = z.a(l1, s4, s1);
        super.j = l1 != 0;
        x();
        y = new am();
    }

    public n()
    {
        super(null);
        a = 0;
        y = new am();
    }

    public final String n_()
    {
        if(m_())
            return c(f);
        else
            return d;
    }

    private static String c(String s1)
    {
        String s2 = (String)(s1 = x.b(s1, ',')).elementAt(0);
        bh.a(s1);
        return s2;
    }

    public n(ba ba1, s s1)
    {
        super(ba1);
        a = s1.g();
        ba1 = t.i();
        b = s1.g();
        d = ab.e(s1.j().toLowerCase());
        g(s1.g(null));
        e = s1.g();
        f = s1.j();
        if((super.m = s1.q()) != 0)
            r.c(this);
        t = ba1;
        super.l = v();
        x();
        y = new am();
    }

    public final av o_()
    {
        av av1;
        (av1 = av.a(super.q).a(p_())).a(X(), g() ? 3 : ((int) (q_() ? 2 : 0)), a(b, s)).a(this);
        if(!m_() && x.n(f))
            av1.a(27);
        if(x.n(h))
            av1.a(242);
        return av1.a(this);
    }

    private final int v()
    {
        return !x.r(d) ? 155 : 255;
    }

    public final void b()
    {
        super.l = v();
        s = 0;
        h = null;
        g = null;
        y();
        super.b();
    }

    private static final int a(int i, int i1)
    {
        if((i & 0x100000) != 0)
            return 0;
        if((i & 8) != 0)
            return 4;
        if((i & 4) != 0)
            return 5;
        return i1 != 0 ? 3 : 0;
    }

    public final void a(s s1)
    {
        s1.r(a).r(b).a(d).b(super.o).r(e).a(f).f(super.m);
    }

    public final int a(int i, String s1, String s2)
    {
        int i1 = s;
        s = i;
        t = s2;
        super.l = z.a(i, s1, d);
        super.j = i != 0;
        if(i == 0)
            y();
        super.n = true;
        F();
        return i1;
    }

    public final boolean a(String s1)
    {
        return v != null && v.contains(s1);
    }

    public final void a(Vector vector)
    {
        if(vector == null)
        {
            bh.a(v);
            v = null;
            return;
        }
        if(v == null)
            v = bh.q();
        v.removeAllElements();
        for(int i = vector.size(); --i >= 0;)
            v.addElement(vector.elementAt(i));

    }

    public final boolean m_()
    {
        return (b & 0x100000) != 0;
    }

    public final int p_()
    {
        if(m_())
            return super.m != 0 ? 16384 : 27;
        if(p())
            return super.m != 0 ? 16616 : 232;
        int i;
        if((i = super.p_()) == 16384 || i == 26)
            return i;
        if(0 != (e & 1) || s_())
            return !x.r(d) ? 154 : 263;
        else
            return i;
    }

    private final String w()
    {
        int i;
        try
        {
            if((i = f.indexOf(',')) >= 0)
                return ab.b(f, i);
        }
        catch(Throwable _ex) { }
        return x.h(f);
    }

    private void x()
    {
        super.r = m_() ? w() : d;
        super.q = super.i.O().f(a()).l();
        if(m_())
            super.r = x.j(a());
        if(x.r(d))
            super.r = x.s(d);
        F();
        super.i.j(this);
    }

    public final int a(String s1, String s2)
    {
        return ((bi)super.i).a(this, s1, s2);
    }

    public final int m()
    {
        return ((bi)super.i).a(this);
    }

    public final int n()
    {
        long l1;
        if((l1 = t.i(1511)) - u > 60000L)
        {
            u = l1;
            if(0 != (l1 = ((bi)super.i).b(this)))
            {
                return l1;
            } else
            {
                a(1, t.c(889), 0L, 0L);
                return 0;
            }
        } else
        {
            return 890;
        }
    }

    public final boolean b(String s1)
    {
        Vector vector;
        for(int i = (vector = x.b(f, ',')).size(); --i >= 0;)
            if(s1.equals(vector.elementAt(i)))
            {
                bh.a(vector);
                return true;
            }

        bh.a(vector);
        return false;
    }

    public final String o()
    {
        return f;
    }

    public final void k()
    {
        e &= -2;
    }

    public final boolean q_()
    {
        return (b & 8) != 0;
    }

    public final boolean g()
    {
        return (b & 4) != 0;
    }

    public final boolean r_()
    {
        return (b & 0x10) != 0;
    }

    public final boolean j()
    {
        return (e & 1) != 0;
    }

    public final boolean s_()
    {
        return (b & 0x10000) != 0;
    }

    public final boolean p()
    {
        return (b & 0x80) != 0;
    }

    public final void b(String s1, String s2)
    {
        g(s1);
        f = s2;
        super.r = m_() ? x.j(w()) : d;
    }

    public final int q()
    {
        String s1;
        if((s1 = t) != null)
        {
            if(aa.b(s1, 892))
                return 357;
            if(aa.b(s1, 891))
                return 317;
            if(aa.b(s1, 894))
                return 355;
            if(aa.b(s1, 893))
                return 356;
            if(aa.b(s1, 895))
                return 358;
            if(aa.b(s1, 896))
                return 359;
            if(aa.b(s1, 897))
                return 359;
            if(aa.b(s1, 898))
                return 307;
        }
        return -1;
    }

    public final String r()
    {
        String s1;
        int i = aa.b(s1 = x.h(t), 892) ? 901 : ((int) (aa.b(s1, 891) ? 900 : ((int) (aa.b(s1, 894) ? 902 : ((int) (aa.b(s1, 893) ? 903 : ((int) (aa.b(s1, 895) ? 904 : ((int) (aa.b(s1, 896) ? 905 : ((int) (aa.b(s1, 897) ? 906 : ((int) (aa.b(s1, 898) ? 907 : 899))))))))))))));
        StringBuffer stringbuffer = bh.r();
        int i1;
        if(i == 899)
        {
            if((i = t.a(s1, 0x223d746e65696c63L)) >= 0 && (i1 = s1.indexOf('"', i + 9)) >= 0)
                stringbuffer.append(ab.a(s1, i + 8, i1));
        } else
        {
            stringbuffer.append(t.c(i));
        }
        if((i = t.b(s1, 908)) >= 0 && (i1 = s1.indexOf('"', i + 11)) >= 0)
        {
            stringbuffer.append(t.c(909)).append(ab.a(s1, i + 10, i1));
            if((i = t.b(s1, 0x80662)) >= 0 && (i1 = s1.indexOf('"', i + 9)) >= 0)
                stringbuffer.append('.').append(ab.a(s1, i + 8, i1));
        }
        return bh.b(stringbuffer);
    }

    public final void a(int i, int i1, String s1, long l1)
    {
        v.b();
        if((i & 2) != 0)
        {
            h = s1;
            return;
        }
        if((i & 5) != 0)
        {
            if(t.g(244) && !ab.a(s1, g) && (int)(System.currentTimeMillis() / 1000L) - i1 < 0x2a300 && Q() != l1)
            {
                t.a(1199, super.q);
                v.o(6);
                c(2);
                a(16, s1, 0L, l1);
                if((i = super.i.i(this)) != null && ((e) (i)).d)
                    i.c();
                F();
            }
            g = s1;
        }
    }

    public final String s()
    {
        try
        {
            return w.a;
        }
        catch(Throwable _ex)
        {
            return null;
        }
    }

    public final void a(String as[])
    {
        if(as == null)
        {
            y();
            return;
        }
        try
        {
            w = new l();
            w.a(as[0], as[1], as[2], as[3], as[4], as[5], as[6], as[7]);
            x = true;
        }
        catch(Throwable _ex)
        {
            y();
        }
        y.a = -1;
    }

    private void y()
    {
        w = null;
        aa.b = null;
        o.c = true;
    }

    public final boolean t()
    {
        return w != null;
    }

    public final int t_()
    {
        return 3;
    }

    public final boolean u_()
    {
        return x && w != null && w.e();
    }

    public final void c()
    {
        x = false;
    }

    public final void d()
    {
        x = true;
    }

    public final int e()
    {
        try
        {
            return (int)w.c();
        }
        catch(Throwable _ex)
        {
            y();
        }
        return 0;
    }

    public final int f()
    {
        try
        {
            return (int)w.d();
        }
        catch(Throwable _ex)
        {
            y();
        }
        return 0;
    }

    public final String v_()
    {
        String s1 = X();
        StringBuffer stringbuffer = bh.r().append(s1);
        if((s1 = w.a).length() > 0)
            stringbuffer.append(',').append(' ').append(s1).append('.');
        return bh.b(stringbuffer);
    }

    public final int h()
    {
        if(w != null)
            return w.f();
        else
            return 10;
    }

    public final boolean x_()
    {
        return w.e() && !w.e;
    }

    public final int a(int i)
    {
        return y.a(i, this);
    }

    public final int b(int i)
    {
        return y.b(i, this);
    }

    public final boolean u()
    {
        return x.r(d);
    }

    public final int a;
    public int b;
    public int c;
    public String d;
    public int e;
    private int s;
    public String f;
    private String t;
    private long u;
    public String g;
    public String h;
    private Vector v;
    private l w;
    private boolean x;
    private am y;
}