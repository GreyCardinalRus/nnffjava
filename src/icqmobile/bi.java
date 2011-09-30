// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:41
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.*;

public final class bi extends ba
    implements al
{

    public bi(int i1, String s1, String s2)
    {
        super(i1, s1, s2);
        super.q = 0;
        super.r = 1;
        (i1 = new r(this, -1, 102, t.c(1007))).d = true;
        super.A = i1;
        d = new l();
        e = true;
        J = new am();
        K = bh.q();
    }

    public static final bi b(Vector vector, int i1)
    {
        return (bi)vector.elementAt(i1);
    }

    public final int a()
    {
        return 0;
    }

    public final s a(int i1, s s1)
    {
        return (new s()).r(0xdeadbeef).r(0x10016).r(F()).r(i1).r(s1 == null ? 0 : s1.b).b(24).d(s1);
    }

    public bi(s s1)
    {
        super(s1);
        for(int i1 = s1.g(); --i1 >= 0;)
            super.g.addElement(new r(this, s1));

        r r1;
        (r1 = new r(this, s1)).d = true;
        super.A = r1;
        f(s1.f());
        d = new l();
        e = true;
        J = new am();
        K = bh.q();
    }

    public final ba a(s s1, boolean flag, boolean flag1)
    {
        super.a(s1, flag, flag1);
        if(flag1)
            s1.f(c(flag));
        else
            s1.r(0);
        return this;
    }

    public final void b(s s1)
    {
        s1.r(13).r(super.s).r(super.t).r(super.u);
        l.a(d, s1);
    }

    public final void a(s s1)
    {
        int i1;
        if((i1 = s1.g()) == 12)
        {
            super.s = s1.g();
            super.t = s1.g();
            super.u = s1.g();
            s1.g();
            return;
        }
        if(i1 == 13)
        {
            super.s = s1.g();
            super.t = s1.g();
            super.u = s1.g();
            d = l.b(s1);
        }
    }

    private final s c(boolean flag)
    {
        s s1 = new s();
        if(flag)
            try
            {
                flag = x.c(b);
                if(I == null || flag < 3)
                    throw new Throwable();
                s1.a(20480);
                s1.o(4660);
                s1.b(I);
                s1.r(0);
                s1.r(flag - 1);
                for(int i1 = 0; i1 < flag; i1++)
                {
                    au au1;
                    if((au1 = (au)b.elementAt(i1)) != e(-1))
                        au1.a(s1);
                }

                s1.o(21554);
            }
            catch(Throwable _ex)
            {
                s1.c();
            }
        return s1;
    }

    private final void f(s s1)
    {
        try
        {
            if(s1.b == 0)
                throw new Throwable();
            if(s1.n(0) != 4660)
                throw new RuntimeException();
            s1.s();
            I = s1.g(null);
            s1.j();
            b = bh.q();
            int i1 = s1.g();
            for(int j1 = 0; j1 < i1; j1++)
                b.addElement(au.b(s1));

            if(s1.x() != 21554)
            {
                throw new Throwable();
            } else
            {
                d(false);
                return;
            }
        }
        catch(Throwable _ex)
        {
            I = null;
        }
        b = null;
    }

    public final av j()
    {
        return av.a(P()).a(E()).h(Q()).a(this);
    }

    public final n c(String s1)
    {
        v.b();
        return (n)d(s1);
    }

    public final String k()
    {
        String _tmp = f;
        v.b();
        return f;
    }

    public final void d(String s1)
    {
        v.b();
        f = s1;
    }

    public final String m()
    {
        String _tmp = H;
        v.b();
        return H;
    }

    private final void q(String s1)
    {
        v.b();
        H = s1;
    }

    public final e d_()
    {
        return new r(this, -1, 101, t.c(1008));
    }

    public final e e_()
    {
        return new r(this, -1, 104, t.c(1010));
    }

    public final e f_()
    {
        return new r(this, -1, 103, t.c(1009));
    }

    public final e g_()
    {
        return new r(this, -1, 105, t.c(1011));
    }

    public final r n()
    {
        return (r)super.g.elementAt(0);
    }

    private int E()
    {
        if(super.o > 0 && super.o < 100)
            return 153;
        switch(super.q)
        {
        case 0: // '\0'
            return 155;

        case 1: // '\001'
            return 156;

        case 2: // '\002'
            return 157;

        case 3: // '\003'
            return 158;

        case 260: 
            return 159;

        case 516: 
            return 160;
        }
        return 157 + (super.q >> 8);
    }

    public final int i()
    {
        X();
        super.x = 0L;
        super.w = 0L;
        ae();
        super.z.removeAllElements();
        return 0;
    }

    public final int b()
    {
        return E();
    }

    private int F()
    {
        return super.l++;
    }

    public final void h_()
    {
        switch(super.o)
        {
        case 0: // '\0'
            super.k.c();
            super.p = 0;
            break;

        case 1: // '\001'
            super.p = 20;
            super.l = 0;
            super.m = new g(0x110393);
            super.o = 2;
            bf.c = true;
            break;

        case 2: // '\002'
            super.p = 30;
            if(super.m.a() == 2)
            {
                super.p = 40;
                super.o = 3;
                bf.c = true;
            }
            break;

        case 3: // '\003'
            G();
            int i1;
            if((i1 = super.k.b) > 0)
            {
                r.a(this, i1);
                super.p = 60;
                StringBuffer stringbuffer = bh.r();
                char c1;
                while(i1-- > 0) 
                    if(x.a(c1 = (char)super.k.q()))
                        stringbuffer.append(c1);
                super.m.a = 3;
                super.m = new g(bh.b(stringbuffer));
                super.o = 4;
                bf.c = true;
            }
            break;

        case 4: // '\004'
            if(super.m.a() == 2)
            {
                super.p = 80;
                d(B());
                super.o = 5;
                bf.c = true;
            }
            break;
        }
        if(super.o >= 5)
        {
            G();
            s s1;
            while((s1 = super.k.v()) != null) 
            {
                r.a(this, s1);
                int j1 = s1.h(12);
                int k1 = s1.h(8);
                s1.g(44);
                switch(j1)
                {
                case 4098: 
                    j(s1);
                    break;

                case 4100: 
                    K();
                    break;

                case 4101: 
                    m(s1);
                    break;

                case 4105: 
                    bh.a(this, s1, 0L);
                    break;

                case 4111: 
                    k(s1);
                    break;

                case 4114: 
                    z.a(this, s1, k1);
                    break;

                case 4115: 
                    Z();
                    break;

                case 4117: 
                    l(s1);
                    break;

                case 4122: 
                    z.a(this, s1, k1);
                    break;

                case 4124: 
                    z.a(this, s1, k1);
                    break;

                case 4125: 
                    o(s1);
                    break;

                case 4129: 
                    i(s1);
                    break;

                case 4133: 
                    z.a(this, s1, k1);
                    break;

                case 4136: 
                    z.a(this, s1, k1);
                    break;

                case 4151: 
                    ay.a(this, s1);
                    break;

                case 4160: 
                    z.a(this, s1, k1);
                    break;

                case 4168: 
                    p(s1);
                    break;

                case 4180: 
                    h(s1);
                    break;

                case 4195: 
                    n(s1);
                    break;

                case 4215: 
                    g(s1);
                    break;

                case 4229: 
                    z.a(this, s1);
                    break;

                case 4163: 
                    v.a(this, s1, k1);
                    break;
                }
                s1.c();
                bf.b = true;
            }
            if(s1 == null && super.q != 0 && super.m != null && super.m.a() == 0)
            {
                X();
                super.q = i();
            }
            if(super.w > 0L && v.b(super.x))
                c(L());
        }
    }

    private final void G()
    {
        super.m.b(super.k);
    }

    public final s a(Object obj)
    {
        if(S())
        {
            Object aobj[];
            s s1 = (s)(aobj = (Object[])obj)[0];
            aobj[0] = z.i(s1.h(8));
            super.z.addElement(obj);
            return s1;
        } else
        {
            return null;
        }
    }

    public final n e(String s1)
    {
        v.b();
        n n1;
        for(Enumeration enumeration = super.n.elements(); enumeration.hasMoreElements();)
            if((n1 = (n)enumeration.nextElement()).b(s1) && n1 != null)
                return n1;

        return null;
    }

    private void f(int i1)
    {
        long l1;
        super.x = System.currentTimeMillis() + (l1 = super.w = x.c(i1, m.N() ? 25 : 45) * 1000);
        J();
        super.o = 6;
    }

    private final String H()
    {
        int i1 = 1194;
        switch(super.r)
        {
        case 1: // '\001'
            i1--;
            // fall through

        case 2: // '\002'
            i1++;
            // fall through

        case 3: // '\003'
            i1 -= 3;
            // fall through

        case 260: 
            i1--;
            // fall through

        case 516: 
            return t.c(i1);

        default:
            return ab.a(t.c(1195), super.r >> 8);
        }
    }

    private final String I()
    {
        switch(super.r)
        {
        case 1: // '\001'
            return t.c(634);

        case 2: // '\002'
            return t.c(636);

        case 3: // '\003'
            return t.c(634);

        case 260: 
            return t.c(635);

        case 516: 
            return t.c(637);
        }
        return t.c(151 + (super.r >> 8));
    }

    public final Vector al()
    {
        Vector vector = super.al();
        n n1;
        for(Enumeration enumeration = super.n.elements(); enumeration.hasMoreElements();)
            if((n1 = (n)enumeration.nextElement()).p() && !n1.r_())
                vector.addElement(n1);

        return vector;
    }

    public final int c(int i1)
    {
        super.r = i1;
        if(S())
        {
            super.q = i1;
            return c(a(super.r & 7, H(), I()));
        }
        if(R())
            return 498;
        else
            return b_(0);
    }

    public final int a(be be1, String s1, long l1)
    {
        int i1;
        if(0 != (i1 = super.a(be1, s1, l1)))
        {
            return i1;
        } else
        {
            super.t++;
            return c(bh.a(this, (n)be1, s1, l1));
        }
    }

    public final void b(String s1, String s2)
    {
        v.b();
        v.b();
        a.a(super.i, super.j, s1, x.h(s2));
    }

    public final int a(String s1, boolean flag, Vector vector)
    {
        return c(bh.a(this, s1, flag, vector));
    }

    public final int a(n n1, Vector vector)
    {
        return c(bh.a(this, n1, vector));
    }

    public final int a(n n1)
    {
        return c(bh.a(this, n1));
    }

    public final int a(String s1, boolean flag, long l1)
    {
        if(!S())
        {
            return 303;
        } else
        {
            bh.a(507);
            return c(a(flag ? 5 : 20, s1, l1));
        }
    }

    private int a(int i1, String as1[], l l1)
    {
        if(l1.e() && !l1.e)
            c(a(i1, as1, l1.a()));
        return 0;
    }

    private int a(String as1[], String s1)
    {
        return c(b(as1, s1));
    }

    public final void o()
    {
        if(S())
        {
            int i1;
            if((i1 = d.b) == 1)
            {
                a(1, t.c, d);
                return;
            }
            if(i1 == 2)
            {
                a(0, t.c, d);
                return;
            }
            if(i1 == 3)
                a(0, d.c, d);
        }
    }

    public final void q()
    {
        c(x(d.b().toString()));
    }

    public final void r()
    {
        int i1 = d.b;
        d.b = 1;
        if(S())
        {
            if(i1 == 3)
                a(d.c, t.c(0x903d9));
            a(1, t.c, d);
        }
    }

    public final void v()
    {
        int i1 = d.b;
        d.b = 2;
        if(S())
        {
            if(i1 == 3)
                a(d.c, t.c(0x903d9));
            a(0, t.c, d);
        }
    }

    public final void w()
    {
        int i1 = d.b;
        d.b = 4;
        if(S())
        {
            if(i1 == 3)
                a(d.c, t.c(0x903d9));
            a(t.c, t.c(0x903d9));
        }
    }

    public final void x()
    {
        int i1 = d.b;
        d.b = 3;
        if(S())
        {
            if(i1 == 3)
                a(d.d, t.c(0x903d9));
            else
            if(i1 == 1 || i1 == 2)
                a(t.c, t.c(0x903d9));
            a(0, d.c, d);
        }
    }

    private final void g(s s1)
    {
        a(s1.j(), s1.r());
    }

    public final void a(String s1, Vector vector)
    {
        v.b();
        v.j();
        for(int i1 = 0; i1 < vector.size(); i1++)
        {
            s s2;
            (s2 = (s)vector.elementAt(i1)).g();
            if(ab.a(0x903d9, s2.j()))
                b(s1, l.a(s2));
        }

        bh.a(vector);
    }

    private final void b(String s1, String as1[])
    {
        v.b();
        v.g();
        if((s1 = c(s1)) != null)
            s1.a(as1);
    }

    private final void h(s s1)
    {
        d(s1.j(), s1.j());
    }

    private final void d(String s1, String s2)
    {
        v.b();
        v.b();
        if(ab.a(0x8038b, s1))
        {
            r(s2);
            o();
        }
    }

    private final void r(String s1)
    {
        v.b();
        d.a((new aq(s1)).a());
    }

    public final void c(String s1, String s2)
    {
        v.b();
        v.b();
        String s3;
        try
        {
            d.a(s2, s1, t.c(0x8031c), s3 = t.i(), s3, s3, s3, s3);
        }
        catch(Throwable _ex)
        {
            d.g();
        }
        J.a = -1;
    }

    public final void a(String s1, String s2, String s3, String s4)
    {
        v.b();
        v.b();
        v.b();
        v.b();
        String s5;
        try
        {
            d.a(s2, s1, t.c(0x90324), s5 = t.i(), s5, s5, s3, s4);
        }
        catch(Throwable _ex)
        {
            d.g();
        }
        J.a = -1;
    }

    public final void y()
    {
        d.e = true;
    }

    public final void k(String s1)
    {
        v.b();
        d.a = s1;
    }

    public final void a(m m1)
    {
        v.c();
        String s1;
        try
        {
            d.a(r.b(m1.b), r.a(m1.a), t.c(0x90324), m1.k(), s1 = t.i(), s1, ab.e(Integer.toString(m1.g)), ab.e(Integer.toString(m1.f)));
        }
        catch(Throwable _ex)
        {
            d.g();
        }
        J.a = -1;
    }

    public final int b(n n1)
    {
        v.i();
        return c(c(n1));
    }

    public final int a(e e1, String s1)
    {
        v.b();
        v.i();
        int i1;
        if(0 != (i1 = super.a(e1, s1)))
            return i1;
        else
            return c(a((r)e1, s1));
    }

    public final int b_(String s1)
    {
        v.b();
        int i1;
        if(0 != (i1 = super.b_(s1)))
            return i1;
        else
            return c(bh.a(this, s1));
    }

    public final int a(e e1)
    {
        v.i();
        int i1;
        if(0 != (i1 = super.a(e1)))
            return i1;
        else
            return c(a((r)e1));
    }

    public final int b(be be1)
    {
        v.i();
        int i1;
        if(0 != (i1 = super.b(be1)))
            return i1;
        if(be1.s_())
            return f(be1);
        else
            return c(e((n)be1));
    }

    public final int a(be be1)
    {
        return l(((n)be1).d);
    }

    public final int l(String s1)
    {
        v.b();
        return c(d(s1, 7));
    }

    public final int a(n n1, String s1, String s2)
    {
        v.b();
        v.b();
        if(!S())
        {
            return 303;
        } else
        {
            String s3;
            n1.a(1, bh.b(x.a(bh.r().append(s3 = t.c(0x407c8)).append(x.j(s2))).append(s1)), 0L, 0L);
            return c(b(n1, s1, s2));
        }
    }

    public final int a_(Object obj)
    {
        v.i();
        return c(a((String[])obj));
    }

    public final int a(String s1, String as1[])
    {
        if(!S())
            return 303;
        if(!x.n(s1))
            return 699;
        int i1;
        if(as1 == null || (i1 = as1.length) == 0)
            return 700;
        for(Enumeration enumeration = super.n.elements(); enumeration.hasMoreElements();)
        {
            n n1 = (n)enumeration.nextElement();
            for(int j1 = i1; --j1 >= 0;)
                if(n1.b(as1[j1]))
                    return 497;

        }

        return c(bh.a(this, s1, as1, n()));
    }

    public final int a(be be1, Object aobj[])
    {
        int i1;
        if(0 != (i1 = super.a(be1, aobj)))
            return i1;
        String s1 = (String)aobj[0];
        int j1;
        String as1[] = new String[j1 = aobj.length - 1];
        for(int k1 = 0; k1 < j1; k1++)
            as1[k1] = x.k((String)aobj[k1 + 1]);

        if(((n) (aobj = (n)be1)).m_() && j1 == 0)
            return 700;
        for(Enumeration enumeration = super.n.elements(); enumeration.hasMoreElements();)
        {
            n n1 = (n)enumeration.nextElement();
            for(int l1 = j1; --l1 >= 0;)
                if(n1 != be1 && n1.b(as1[l1]))
                    return 497;

        }

        return c(c(((n) (aobj)), s1, x.a(as1)));
    }

    private final void i(s s1)
    {
        s(s1.j());
    }

    private final void s(String s1)
    {
        if(null != (s1 = c(s1)))
            s1.e &= -2;
    }

    public final void a(String s1, int i1)
    {
        c(c(s1, i1));
    }

    public final void m(String s1)
    {
        c(v(s1));
    }

    public final int z()
    {
        Vector vector;
        int i1 = (vector = super.g).size();
        for(int j1 = 0; j1 < 20; j1++)
        {
            for(int k1 = 0; k1 <= i1; k1++)
            {
                if(k1 == i1)
                    return j1;
                if(((r)vector.elementAt(k1)).e == j1)
                    break;
            }

        }

        return 0;
    }

    public final int a(String s1, String s2, String s3, e e1, boolean flag)
    {
        int i1;
        if(0 != (i1 = super.a(s1, s2, s3, e1, flag)))
            return i1;
        n n1;
        if((n1 = c(s1)) == null || n1.s_())
        {
            c(v(s1));
            return c(bh.a(this, 0, s1, s2, s3, (r)e1, flag));
        } else
        {
            c(a(n1, (r)e1));
            return c(bh.a(this, s1, s3, flag ? 0x8000c : 12));
        }
    }

    public final int c(be be1)
    {
        if((be1 = (n)be1).s_())
            return c(bh.a(this, 48, ((n) (be1)).d, be1.o, t.i(), n(), false));
        else
            return c(a(be1, ((be1 = ((n) (be1)).b) & 0x10) == 0 ? be1 | 0x10 | 0x20 : be1 & 0xffffffcf));
    }

    public final int d(be be1)
    {
        int i1;
        if(((i1 = ((n) (be1 = (n)be1)).b ^ 8) & 8) != 0)
            i1 &= -5;
        return c(a(be1, i1));
    }

    public final int e(be be1)
    {
        int i1;
        if(((i1 = ((n) (be1 = (n)be1)).b ^ 4) & 4) != 0)
            i1 &= -9;
        return c(a(be1, i1));
    }

    public final int h(be be1)
    {
        int i1;
        if(0 != (i1 = super.h(be1)))
            return i1;
        else
            return c(d((n)be1));
    }

    public final int a(be be1, e e1, e e2)
    {
        if(0 != (e1 = super.a(be1, e1, e2)))
            return e1;
        else
            return c(a((n)be1, (r)e2));
    }

    public final int p()
    {
        int i1;
        if(0 != (i1 = super.p()))
        {
            return i1;
        } else
        {
            c(M());
            X();
            super.q = i();
            return 0;
        }
    }

    private final String t(String s1)
    {
        v.b();
        n n1;
        if((n1 = c(s1)) != null)
            return n1.X();
        else
            return s1;
    }

    private final StringBuffer u(String s1)
    {
        v.b();
        s1 = t(s1);
        return x.a(bh.r().append(s1), true).append('\n');
    }

    public final void a(String s1, String s2, String s3, String s4, long l1)
    {
        v.b();
        v.b();
        v.b();
        v.b();
        n n1;
        if(null == (n1 = c(s1)))
            n1 = e(s1, s3);
        super.u++;
        n1.a(l1, u(s4).append(s2));
    }

    public final void a(String s1, String s2, String s3, s s4, long l1)
    {
        v.b();
        v.b();
        v.b();
        v.b();
        if(null == (s1 = c(s1)))
            return;
        super.u++;
        s2 = u(s3).append(s2);
        s4.g();
        for(s3 = s4.g(); --s3 >= 0;)
            x.a(s2.append(t(s4.j())), s3 != 0);

        s1.a(l1, s2);
    }

    private final n e(String s1, String s2)
    {
        v.b();
        v.b();
        String s3 = t.i();
        n n1;
        super.A.b(n1 = new n(this, 0, 0x10080, 3, s1, s2, 0, 0, s3, s3, s3));
        if(super.g.size() > 0)
            c(bh.a(this, 128, s1, s2, s3, n(), false));
        return n1;
    }

    public final void n(String s1)
    {
        v.b();
        if(!ab.a(s1, super.i) && c(s1) == null)
            b(s1, 16);
    }

    public final be a_(String s1)
    {
        return b(s1, 13);
    }

    private final be b(String s1, int i1)
    {
        v.b();
        Object obj = t.i();
        super.A.b(obj = new n(this, 0, 0x10000, 3, s1, s1, 0, 0, ((String) (obj)), ((String) (obj)), ((String) (obj))));
        c(d(s1, i1));
        return ((be) (obj));
    }

    public final void a(bc bc1)
    {
        v.i();
        n n1;
        if(null != (n1 = (n)super.n.get(bc1.l())))
            n1.g(bc1.n());
    }

    public final void b(bc bc1)
    {
        v.i();
        n n1;
        String s1;
        if(null != (n1 = (n)super.n.get(s1 = bc1.l())))
        {
            n1.g(bc1 = bc1.n());
            a(s1, bc1, t.c(732), n(), true);
        }
    }

    public final void d(int i1)
    {
        switch(i1)
        {
        case 0: // '\0'
            i1 = 1;
            break;

        case 1: // '\001'
            i1 = 260;
            break;

        case 2: // '\002'
            i1 = 2;
            break;

        case 3: // '\003'
            i1 = 516;
            break;

        case 4: // '\004'
            i1 = 3;
            break;

        default:
            p();
            return;
        }
        c(i1);
    }

    public final av A()
    {
        return av.d().a(this).b(5).a(5, 0).a(super.i, 1, 36).h().a(x.f(L), 1, 36).a(5, 0).a(1, 34).c(32, 33).j();
    }

    public final void c(Object obj)
    {
        c = false;
        boolean flag = true;
        if(b == null)
        {
            flag = false;
            b = bh.q();
        }
        f(ab.d(obj, 8));
        L = ab.c(obj, 7);
        I = ab.e(obj, 2);
        d(flag);
    }

    private final void f(Object obj)
    {
        for(int i1 = 0; i1 < ((Vector)obj).size(); i1++)
        {
            Object obj1 = ab.d(obj, i1);
            au au1;
            if((au1 = e(ab.c(obj1, 0))) == null)
                b.addElement(new au(obj1));
            else
                au1.a(obj1);
        }

    }

    private void d(boolean flag)
    {
        if(!flag)
            b.addElement(new au());
    }

    public final au e(int i1)
    {
        if(b != null)
        {
            au au1;
            for(Enumeration enumeration = b.elements(); enumeration.hasMoreElements();)
                if((au1 = (au)enumeration.nextElement()).a == i1)
                    return au1;

        }
        return null;
    }

    public final boolean o(String s1)
    {
        v.b();
        for(Enumeration enumeration = b.elements(); enumeration.hasMoreElements();)
            if(((au)enumeration.nextElement()).a(s1))
                return true;

        return false;
    }

    public final int a(String s1, au au1)
    {
        v.b();
        v.i();
        if(au1 == e(-1))
            return 3;
        if(au1.d(s1))
        {
            int _tmp = au1.a;
            return 3;
        } else
        {
            return 3;
        }
    }

    public final au p(String s1)
    {
        v.b();
        au au1;
        for(Enumeration enumeration = b.elements(); enumeration.hasMoreElements();)
            if((au1 = (au)enumeration.nextElement()).d(s1))
                return au1;

        return null;
    }

    public final int t_()
    {
        return 6;
    }

    public final boolean u_()
    {
        return e && d != null && d.e();
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
        if(d != null)
            return (int)d.c();
        else
            return 0;
    }

    public final int f()
    {
        if(d != null)
            return (int)d.d();
        else
            return 0;
    }

    public final String v_()
    {
        StringBuffer stringbuffer = bh.r();
        if(d.e)
        {
            stringbuffer.append(t.c(500));
            String s1;
            if(x.n(s1 = d.a))
                stringbuffer.append(s1).append('.').append(' ');
            stringbuffer.append(t.c(501));
        } else
        {
            stringbuffer.append(t.c(499));
            if(bb.e().size() > 1)
                stringbuffer.append(' ').append('(').append(super.i).append(')').append('.').append(' ');
            String s2;
            if(x.n(s2 = d.a))
                stringbuffer.append(s2).append('.').append(' ');
            if(x.n(s2 = d.i()))
                stringbuffer.append(s2).append('.');
        }
        return bh.b(stringbuffer);
    }

    public final int h()
    {
        return d.f();
    }

    public final boolean x_()
    {
        return d.e() && !d.e;
    }

    public final int a(int i1)
    {
        return J.a(i1, this);
    }

    public final int b(int i1)
    {
        return J.b(i1, this);
    }

    public final void a(ak ak1)
    {
        if(S())
        {
            ak1.a = super.l;
            d(y(ak1.b));
            K.addElement(ak1);
        }
    }

    public final void a(int i1, String s1)
    {
        v.b();
        ak ak1;
        for(int j1 = K.size(); --j1 >= 0;)
            if(i1 == (ak1 = (ak)K.elementAt(j1)).a)
            {
                K.removeElementAt(j1);
                v.b();
                int k1;
                if((k1 = ak1.c) == 1)
                {
                    l(s1);
                    z.a(this, s1);
                } else
                if(k1 == 2)
                {
                    bc bc1;
                    (bc1 = bc.a(this)).e(s1);
                    t.a(1281, bc1);
                    bh.i();
                }
            }

    }

    public final void a(au au1)
    {
        int i1 = 0;
        for(Enumeration enumeration = b.elements(); enumeration.hasMoreElements();)
        {
            if(((au)enumeration.nextElement()).a == au1.a)
            {
                b.setElementAt(au1, i1);
                return;
            }
            i1++;
        }

    }

    private final void J()
    {
        d(a(true));
    }

    private final void j(s s1)
    {
        f(s1.g());
    }

    private final void K()
    {
        super.p = 85;
        ap();
    }

    private final s c(n n1)
    {
        return a(((Object) (x.a(a(4104, (new s()).r(16512).a(n1.d).b(t.c(502)).a(t.c(0x20403e2))), z.i(14)))));
    }

    private final s d(n n1)
    {
        return a(4104, (new s()).r(1024).a(n1.d).r(0).r(0));
    }

    private final s b(n n1, String s1, String s2)
    {
        v.b();
        v.b();
        StringBuffer stringbuffer = bh.r().append('+');
        if(s2.charAt(0) == '8')
            stringbuffer.append('7').append(ab.c(s2, 1));
        else
            stringbuffer.append(s2);
        return a(((Object) (x.a(a(4153, (new s()).r(0).a(bh.b(stringbuffer)).b(s1)), z.i(6), n1, s1, s2))));
    }

    public static void a(int i1, Object aobj[])
    {
        v.i();
        if(i1 != 1)
            bh.a(aobj, i1);
    }

    private final s L()
    {
        return a(4102, ((s) (null)));
    }

    private final s a(int i1, String s1, long l1)
    {
        return a(4196, (new s()).r(i1).b(s1).a(l1));
    }

    public final s B()
    {
        return a(4097, (new s()).r(120));
    }

    private final s a(int i1, String s1, String s2)
    {
        return a(4130, (new s()).r(i1 == 3 ? 0x80000001 : i1).a(s1).b(s2).r(0).r(t.g(105) ? -1 : 22));
    }

    private final s c(String s1, int i1)
    {
        return a(4113, (new s()).a(s1).r(i1));
    }

    private final s M()
    {
        return a(4194, ((s) (null)));
    }

    public final s C()
    {
        return a(4228, (new s()).Q().Q());
    }

    private s b(String as1[], String s1)
    {
        return a(4214, (new s()).b(as1).a(s1));
    }

    private final s v(String s1)
    {
        v.b();
        return a(4128, (new s()).a(s1));
    }

    private final s d(String s1, int i1)
    {
        v.b();
        return a(((Object) (x.a(w(s1), z.i(i1)))));
    }

    private final s a(String as1[])
    {
        v.g();
        s s1 = new s();
        for(int i1 = 0; i1 < as1.length; i1++)
        {
            String s2;
            if(i1 != 9 && x.n(s2 = as1[i1]))
                s1.r(i1).a(s2, 1 << i1 & 0x1c);
        }

        if(x.n(as1[9]))
            s1.r(9).a(as1[9]);
        return a(((Object) (x.a(a(4137, s1), z.i(8)))));
    }

    private final s w(String s1)
    {
        v.b();
        int i1;
        return a(4137, (new s()).r(0).a(ab.b(s1, i1 = ab.d(s1))).r(1).a(ab.c(s1, i1 + 1)));
    }

    private final s x(String s1)
    {
        return a(4181, (new s()).a(t.c(0x8038b)).a(s1));
    }

    private final s y(String s1)
    {
        v.b();
        return a(4162, (new s()).r(1).a(s1));
    }

    private final s a(int i1, String as1[], String as2[])
    {
        v.g();
        v.g();
        return a(4213, (new s()).r(i1).b(as1).a(t.c(0x903d9)).d(l.a(as2)));
    }

    private final s a(n n1, r r1)
    {
        return a(((Object) (x.a(a(4123, (new s()).r(n1.a).r(n1.b).r(r1.e).a(n1.d).b(n1.X()).a(n1.f)), z.i(12), n1, r1))));
    }

    public final void b(int i1, Object aobj[])
    {
        if(i1 == 0)
        {
            (i1 = (n)aobj[2]).c = ((r) (aobj = (r)aobj[3])).e;
            for(int j1 = super.g.size(); --j1 >= 0;)
                o(j1).c(i1);

            ((e) (aobj)).b(i1);
            return;
        } else
        {
            bh.b(aobj, i1);
            return;
        }
    }

    private final void k(s s1)
    {
        int i1 = s1.g();
        String s2 = s1.j();
        s1.g(null);
        s1.g(null);
        Object obj = ab.e(s1.j().toLowerCase());
        if((obj = c(((String) (obj)))) != null && !((n) (obj)).s_())
        {
            s1.g();
            if(((n) (obj)).a(i1, s2, s1.j()) == 0 && i1 != 0)
                v.o(1);
        }
    }

    private final void l(s s1)
    {
        String s2;
        String s3;
        while(s1.b > 0) 
            if(ab.a(0xd03a4, s2 = s1.j()))
                f(s1.g(null));
            else
            if(ab.a(0xf03b1, s2))
                b(x.c(s1.g(null)), null, null);
            else
            if(ab.a(0xf03c0, s2))
                q(ab.b(s3 = s1.g(null), s3.indexOf(':')));
            else
            if(ab.a(0xa03cf, s2))
            {
                s1.j();
                a = true;
            } else
            {
                s1.j();
            }
    }

    private final void m(s s1)
    {
        s1.g();
        switch(s1.g() & 0xff)
        {
        case 65: // 'A'
            g(494);
            return;

        case 66: // 'B'
            g(495);
            return;

        case 68: // 'D'
            g(496);
            return;

        case 73: // 'I'
            ab();
            return;

        case 67: // 'C'
        case 69: // 'E'
        case 70: // 'F'
        case 71: // 'G'
        case 72: // 'H'
        default:
            n(0);
            bh.m();
            return;
        }
    }

    private final void g(int i1)
    {
        bh.a(this, i1);
        ac();
    }

    private final void n(s s1)
    {
        int i1 = s1.g();
        Object obj = ab.e(s1.j().toLowerCase());
        long l1 = s1.o();
        int j1 = s1.g();
        s1 = s1.g(null);
        if((obj = c(((String) (obj)))) != null && !((n) (obj)).s_())
            ((n) (obj)).a(i1, j1, s1, l1);
    }

    public final s a(boolean flag)
    {
        a.H();
        s s1 = (new s()).f(aa());
        return a(4216, (new s()).a(super.i).f(flag ? s1.E() : s1).r((flag = t.g(105)) ? -1 : 22).a(flag ? null : N()).c(0x1a0379).a(ar()).d(aq()));
    }

    private static String N()
    {
        return (new s()).c(0x1f0643).e(0x220536).d();
    }

    private static String ar()
    {
        return (new s()).c(0xd066a).e(0x200536).e(0x2000de).c(0x3d6469756764616aL).e(0x200535).w(0x3d6c706d).e(0x200537).w(0x3d6f6d64).e(0x200538).w(0x74726170).c(0x75725f7163693dL).d();
    }

    private static int as()
    {
        return (m.h(0) << 16) + (m.h(1) << 8) + m.h(2);
    }

    public final s aq()
    {
        boolean flag = false;
        int i1 = x.c(x.h(t.c(222)));
        Object obj = null;
        obj = 0;
        obj = null;
        obj = 0;
        i1 = t.e(251);
        obj = null;
        s s1 = (new s()).x(515).r(i1).x(300).a(x.h(t.c(223))).x(513).r(super.s).x(335).a(bh.b(bh.r().append(t.f(1509)).append('x').append(t.f(1510)))).x(323).b(x.h(t.c(1335))).x(324).b(x.h(t.c(1336))).x(325).b(x.h(t.c(1340))).x(387).a(bh.a(0x75725f716369L)).x(389).a(x.h(t.c(295))).x(592).r(i1).x(573).r(t.e(250)).x(636).r(t.e(290)).x(514).r(t.e(291)).x(638).r(t.e(292)).x(639).r(t.e(294)).x(640).r(t.e(293));
        int j1;
        if(t.f(298) != (j1 = as()))
        {
            s1.x(652).r(1);
            t.c(298, j1);
        }
        ba ba1;
        for(int k1 = bb.c(); --k1 >= 0;)
            if(!((ba1 = bb.a(k1)) instanceof bi))
                s1.x(816).f(ba1.aq());

        t.a(true);
        return s1;
    }

    private final void o(s s1)
    {
        c(b(s1.g(), s1.g()));
        if(0 != super.v++)
            v.ba();
        Hashtable hashtable = new Hashtable();
        String s2 = null;
        int j1 = (s1 = x.c(s1.j(), '\r')).length();
        Object obj = bh.r();
        boolean flag = false;
        int l1;
        for(l1 = 0; l1 < j1; l1++)
        {
            char c1 = s1.charAt(l1);
            if(!flag)
            {
                if(c1 == '\n' && ((StringBuffer) (obj)).length() == 0)
                    break;
                if(c1 == ':')
                {
                    s2 = bh.a(((StringBuffer) (obj)), false);
                    flag = true;
                    l1++;
                } else
                {
                    ((StringBuffer) (obj)).append(c1);
                }
            } else
            if(c1 == '\n')
            {
                hashtable.put(s2, bh.a(((StringBuffer) (obj)), false));
                flag = false;
            } else
            {
                ((StringBuffer) (obj)).append(c1);
            }
        }

        bh.b(((StringBuffer) (obj)));
        int i1;
        String s5;
        String s3 = (i1 = (s5 = (String)hashtable.get(t.c(0x1505f2))) != null ? Integer.parseInt(s5) : -1) >= 0 ? z.i(ab.b(hashtable.get(t.c(0x70d95)))).k() : null;
        obj = (String)hashtable.get(t.c(0x605ec));
        int k1 = Integer.parseInt((String)hashtable.get(t.c(0xc0607)), 16);
        long l2 = x.c((String)hashtable.get(t.c(0x405e8)));
        int i2 = 1;
        if((k1 & 0x80) == 0)
        {
            String s4 = ab.c(s1, l1);
            if((k1 & 0x200008) == 0)
            {
                s1 = z.i(s4).k();
            } else
            {
                s1 = s4;
                i2 = 0;
            }
        } else
        {
            s1 = z.i(ab.a(s1, (s4 = t.a(s1, 0x343665736162L)) + 6, s1.indexOf(t.c(0x205e6), s4))).k();
        }
        if(i1 == -1 || i1 >= 0 && i1 <= 5 && i1 != 1 && i1 != 3)
            bh.a(this, (new s()).r(0).r(k1 | 4 | 0x80).a((String)hashtable.get(t.c(0x40f83))).a(s1, i2).r(0).r(0).r(i1).b(s3).a(((String) (obj))), l2);
        v.bb();
        return;
        JVM INSTR pop ;
        v.bb();
        return;
        Exception exception;
        exception;
        v.bb();
        throw exception;
    }

    private final s b(int i1, int j1)
    {
        return a(4126, (new s()).r(i1).r(j1));
    }

    private final s a(r r1, String s1)
    {
        return a(((Object) (x.a(a(4123, (new s()).r(r1.e).r(r1.f).r(0).b(s1).b(s1).r(0)), z.i(1), r1, s1))));
    }

    public static void c(int i1, Object aobj[])
    {
        if(i1 == 0)
        {
            i1 = ((int) (aobj[3]));
            v.i();
            ((r)aobj[2]).b((String)i1);
            return;
        } else
        {
            bh.b(aobj, i1);
            return;
        }
    }

    private final s c(n n1, String s1, String s2)
    {
        return a(((Object) (x.a(a(4123, (new s()).r(n1.a).r(n1.b).r(n1.c).a(n1.d).b(s1).a(s2)), z.i(0), n1, s1, s2))));
    }

    public static void d(int i1, Object aobj[])
    {
        if(i1 == 0)
        {
            i1 = ((int) (aobj[3]));
            v.i();
            i1 = ((int) (aobj[4]));
            v.i();
            ((n)aobj[2]).b((String)i1, (String)i1);
            return;
        } else
        {
            bh.b(aobj, i1);
            return;
        }
    }

    private final s a(n n1, int i1)
    {
        return a(((Object) (x.a(a(4123, (new s()).r(n1.a).r(i1).r(n1.c).a(n1.d).b(n1.X()).a(n1.f)), z.i(11), n1, z.i(i1)))));
    }

    public static final void e(int i1, Object aobj[])
    {
        if(i1 == 0)
        {
            i1 = ((int) (aobj[3]));
            v.i();
            ((n)aobj[2]).b = ((Integer)i1).intValue();
            return;
        } else
        {
            bh.b(aobj, i1);
            return;
        }
    }

    private final s e(n n1)
    {
        return a(((Object) (x.a(a(4123, (new s()).r(n1.a).r(n1.b | 1).r(n1.c).a(n1.d).b(n1.X()).a(n1.f)), z.i(2), n1))));
    }

    public final void f(int i1, Object aobj[])
    {
        if(i1 == 0)
        {
            f((n)aobj[2]);
            return;
        } else
        {
            bh.d(aobj, i1);
            return;
        }
    }

    private final s a(r r1)
    {
        String s1;
        return a(((Object) (x.a(a(4123, (new s()).r(r1.e).r(r1.f | 1).r(0).b(s1 = ((e) (r1)).c).b(s1).r(0)), z.i(3), r1))));
    }

    public final void g(int i1, Object aobj[])
    {
        if(i1 == 0)
        {
            aobj = ((r) (i1 = (r)aobj[2])).f >> 24;
            r r1;
            for(int j1 = super.g.size(); --j1 >= 0;)
                if((r1 = (r)o(j1)).f >> 24 > aobj)
                    r1.f -= 0x1000000;

            c(i1);
            return;
        } else
        {
            bh.d(aobj, i1);
            return;
        }
    }

    private final void p(s s1)
    {
        b(s1.g(), s1.i(), s1.i());
    }

    private final void b(int i1, String s1, String s2)
    {
        boolean flag = t.g(91);
        boolean flag1 = t.g(90);
        v.b();
        v.b();
        if(flag1 || flag)
        {
            if(s1 != null)
            {
                int j1 = s1.lastIndexOf('<');
                if(s1.length() > 30 && j1 > 1)
                    ab.b(s1, j1 - 1);
                v.o(0);
            }
            if(flag && (bb.h() != 10 || !t.a()))
            {
                StringBuffer stringbuffer = bh.r();
                if(s2 != null && s1 != null)
                    bh.c(this, bh.b(stringbuffer.append(t.c(489)).append(s1).append(' ').append('"').append(s2).append('"').append('.').append('\n').append((i1 <= 0 ? t.i() : t.c(490) + i1 + t.c(491 + x.k(i1)) + '\n') + t.c(488))));
                else
                if(i1 > 0)
                    bh.c(this, bh.b(stringbuffer.append(t.c(490)).append(i1).append(t.c(491 + x.k(i1))).append('\n').append(t.c(488))));
            }
            if(flag1 && (i1 > 0 || s2 != null && s1 != null))
                z.a(this);
        }
    }

    public final String D()
    {
        String s1 = super.i;
        return (new s()).f(s1).a((new s()).c(0x9063a)).M();
    }

    public final String e(s s1)
    {
        String s2 = super.j;
        return (new s()).f(s2).a(s1).M();
    }

    public final void b(boolean flag)
    {
        L += 1 * (flag ? 1 : -1);
    }

    public final int a(String s1, String s2)
    {
        if((s1 = super.a(s1, s2)) == 0)
        {
            d(((String) (null)));
            c = true;
            t.c(1370, 1);
        }
        return s1;
    }

    private String f;
    private String H;
    public boolean a;
    public Vector b;
    public boolean c;
    private String I;
    public l d;
    public boolean e;
    private am J;
    private Vector K;
    private int L;
}