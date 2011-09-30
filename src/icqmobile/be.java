// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:41
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.*;

public abstract class be
    implements ai
{

    public be(ba ba1)
    {
        i = ba1;
    }

    public abstract void a(s s1);

    public String a()
    {
        return r;
    }

    public int p_()
    {
        if(m != 0)
            return (m & 1) == 0 ? 16386 : 16384;
        if(k != 0)
            return 26;
        else
            return l;
    }

    public final void c(int i1)
    {
        m |= i1;
        r.c(this);
        n = true;
        c = t.i(1511);
        F();
    }

    public final be E()
    {
        r.d(this);
        m = 0;
        n = true;
        F();
        return this;
    }

    public String o()
    {
        return t.i();
    }

    public final void F()
    {
        int i1 = m == 0 ? 0 : 0x40000000;
        if(c != 0L)
            i1 |= 0x10000000;
        if(j)
            i1 |= 0x20000000;
        if(!j())
            i1 |= 0x4000000;
        if(!m_())
            i1 |= 0x2000000;
        else
            i1 &= 0x8dffffff;
        if(!s_())
            i1 |= 0x8000000;
        else
            i1 &= 0xf9ffffff;
        if(i1 != b)
        {
            b = i1;
            bf.b = true;
        }
    }

    private boolean n()
    {
        return m != 0;
    }

    private String q()
    {
        String _tmp = q;
        v.b();
        return q;
    }

    public final void G()
    {
        a = new s();
        s();
    }

    public abstract boolean s_();

    public abstract boolean j();

    public boolean p()
    {
        return false;
    }

    public final void H()
    {
        k = t.f(1512);
        n = true;
    }

    public final void I()
    {
        k = 0;
        n = true;
    }

    public final void a(long l1, StringBuffer stringbuffer)
    {
        a(l1, bh.b(stringbuffer), 4);
    }

    public final void a(long l1, String s1, int i1)
    {
        v.b();
        String _tmp = q;
        v.b();
        t.a(1199, q);
        v.o(2);
        c(i1);
        i.h(n_());
        I();
        a(i1 == 4 ? 8 : 0, s1, l1, 0L);
        if((l1 = i.i(this)) != null && ((e) (l1)).d)
            l1.c();
        F();
        bg.a(i, q);
    }

    public final int f(String s1)
    {
        v.b();
        v.o(4);
        if(ab.a(s1))
            return 313;
        int i1;
        long l1;
        if(0 != (i1 = i.a(this, s1, l1 = t.i(1511))))
        {
            return i1;
        } else
        {
            a(1, s1, l1, l1);
            c = t.i(1511);
            F();
            return 0;
        }
    }

    public final int J()
    {
        return i.c(this);
    }

    public final int K()
    {
        if(s_())
            return 314;
        else
            return i.d(this);
    }

    public final int L()
    {
        if(s_())
            return 314;
        else
            return i.e(this);
    }

    public final int c(Object aobj[])
    {
        if(s_())
        {
            g((String)aobj[0]);
            bf.b = true;
            return 0;
        } else
        {
            return i.a(this, aobj);
        }
    }

    public final int M()
    {
        if(s_() || j() || m_())
            return 0;
        else
            return i.h(this);
    }

    public final int a(e e1)
    {
        if(s_())
            return 314;
        else
            return i.a(this, i.i(this), e1);
    }

    public final int N()
    {
        return i.a(this);
    }

    public final int O()
    {
        return i.g(this);
    }

    public final int a(Object obj)
    {
        int i1;
        if((i1 = ((be) (obj = (be)obj)).b - b) != 0)
            return i1;
        long l1;
        if((l1 = ((be) (obj)).c - c) != 0L)
            return l1 >= 0L ? 1 : -1;
        else
            return p.compareTo(((be) (obj)).p);
    }

    public void b()
    {
        if(s_())
            c = 0L;
        j = false;
        F();
    }

    private final void a(int i1)
    {
        s s1 = a;
        int j1 = 0;
        int k1 = 0;
        for(int l1 = s1.b; l1 > 0;)
        {
            int i2 = s1.n(k1);
            k1 += i2 + 2;
            l1 -= i2 + 2;
            j1++;
        }

        for(; j1 > i1; j1--)
            s1.g(s1.x());

    }

    public final void a(long l1, int i1)
    {
        n = true;
        s s1;
        int j1 = (s1 = a = a != null ? a : ay.j(q())).b;
        int i2;
        for(int k1 = 0; k1 < j1; k1 += i2 + 2)
        {
            i2 = s1.n(k1);
            s1.i(k1 + 2);
            s1.l(k1 + 3);
            if(l1 == s1.l(k1 + 3 + 8))
                s1.a(k1 + 2, s1.i(k1 + 2) | i1);
        }

        s();
    }

    public final void a(int i1, String s1, long l1, long l2)
    {
        v.b();
        n = true;
        s s2 = a = a != null ? a : ay.j(q());
        a(t.f(102) - 1);
        s2.o(17 + (s1.length() << 1)).f(i1).a((l1 == 0L ? System.currentTimeMillis() : l1) + (long)((t.f(246) - 13) * 0x36ee80)).a(l2).k(s1).a();
        s();
        c = t.i(1511);
        F();
    }

    public final boolean P()
    {
        return c != 0L;
    }

    public final long Q()
    {
        long l1 = 0L;
        s s1;
        for(s1 = r().J(); s1.b > 0;)
        {
            int i1 = s1.x();
            byte byte0 = s1.q();
            s1.o();
            long l2 = s1.o();
            s1.g(i1 - 17);
            if(byte0 == 16)
                l1 = l2;
        }

        s1.c();
        return l1;
    }

    public final ad R()
    {
        n = false;
        String s1;
        t.a(1252, s1 = X());
        int i1 = p_();
        if(this instanceof ab)
        {
            if(((az)i).c_() && i1 >= 381 && i1 <= 384)
                i1 += 4;
            if((i instanceof a) && i1 >= 381 && i1 <= 384)
                i1 += 18;
        }
        t.c(2545, i1);
        ad ad1 = aw.b(2542);
        s s2 = r().J();
        int j1 = t.q();
        while(s2.b > 0) 
        {
            int k1 = s2.x();
            int l1 = s2.q();
            long l2 = s2.o() - t.i(1513);
            long l3 = s2.o();
            String s3 = x.q(s2.s(k1 - 17));
            byte byte0 = l1 != 0 && l1 != 16 && l1 != 8 ? l1 != 1 ? ((byte)((l1 & 0x40) != 0 ? 0 : 11)) : 10 : 0;
            if(l1 == 16)
            {
                String s5;
                ad1.a(bh.b(bh.r().append(s5 = X()).append(t.c(315)).append(b(l2, j1))), 8);
                ad1.a(2, s3, 0);
                if(i.S())
                    ad1.b(-1, t.c(811), byte0, ((Object) (x.a(z.i(1), s3, s1, new Long(l3)))));
            } else
            if(l1 == 8)
            {
                String s4 = ab.b(s3, l1 = s3.indexOf('\n'));
                s3 = ab.c(s3, l1 + 1);
                ad1.a(ab.b(s4, b(l2, j1)), 8);
                a(ad1, s3, byte0);
            } else
            {
                String s6;
                ad1.a(bh.b(bh.r().append(s6 = l1 != 0 ? i.F : X()).append(',').append(' ').append(b(l2, j1))), l1 != 0 ? 9 : 8);
                a(ad1, s3, byte0);
            }
        }
        s2.c();
        return ad1;
    }

    private final void a(ad ad1, String s1, int i1)
    {
        v.b();
        int j1 = (s1 = aa.b(s1)).size();
        for(int k1 = 0; k1 < j1; k1++)
        {
            String s2;
            if(aa.g(s2 = (String)s1.elementAt(k1)))
            {
                ad1.b(264, aa.c(s2), i1, ((Object) (x.a(z.i(0), s2))));
            } else
            {
                int l1 = i.a();
                ad1.a(s2, i1, l1 != 0 || !u() ? l1 : 1);
            }
        }

        bh.a(s1);
    }

    private final s r()
    {
        if(a == null)
            a = ay.j(q());
        return a;
    }

    private final void s()
    {
        ay.a(q(), r().J());
    }

    public final ad S()
    {
        ad ad1 = aw.b(2582);
        s s1;
        for(s1 = r().J(); s1.b > 0;)
        {
            int i1 = s1.x();
            s1.q();
            s1.o();
            s1.o();
            String s2;
            String s3;
            s3 = (s2 = s1.s(i1 - 17)).length() <= 50 ? s2 : bh.b(bh.r().append(s3 = ab.b(s2, 50)).append('\u2026'));
            ad1.b(s3, s2);
        }

        s1.c();
        return ad1;
    }

    public final boolean T()
    {
        return n() || n;
    }

    public final int U()
    {
        if(r().b > 0 || !i.S() || V())
            return 40;
        if(m_())
            return a.m();
        else
            return 63;
    }

    public final boolean V()
    {
        return (this instanceof j) && ((j)this).l() && !j;
    }

    public abstract av o_();

    public abstract boolean q_();

    public abstract boolean g();

    public abstract boolean r_();

    private static String b(long l1, int j1)
    {
        Calendar calendar;
        (calendar = t.p()).setTime(new Date(l1));
        StringBuffer stringbuffer = bh.r();
        if((calendar.get(1) << 16) + ((l1 = calendar.get(2)) << 8) + (i1 = calendar.get(5)) != j1)
            stringbuffer.append(x.c(i1)).append('/').append(x.c(l1 + 1)).append(' ');
        return bh.b(stringbuffer.append(x.c(calendar.get(11))).append(':').append(x.c(calendar.get(12))));
    }

    public final int W()
    {
        return i.b(this);
    }

    public abstract String n_();

    public boolean m_()
    {
        return false;
    }

    public abstract void k();

    public final void g(String s1)
    {
        v.b();
        if(!ab.a(s1, o))
        {
            p = ab.e((o = s1).toLowerCase());
            bf.b = true;
        }
    }

    public final String X()
    {
        String _tmp = o;
        v.b();
        return o;
    }

    public final String toString()
    {
        return X();
    }

    public void w_()
    {
    }

    public boolean u()
    {
        return false;
    }

    public final int Y()
    {
        if(q_())
            return 267;
        return !g() ? -1 : 266;
    }

    public final ba i;
    private s a;
    public boolean j;
    public int k;
    public int l;
    public byte m;
    public boolean n;
    public String o;
    public String p;
    private int b;
    private long c;
    public String q;
    public String r;
}