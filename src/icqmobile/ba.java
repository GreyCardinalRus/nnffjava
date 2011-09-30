// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:40
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.*;

public abstract class ba
{

    public ba(int i1, String s1, String s2)
    {
        g = bh.q();
        h = i1;
        F = i = s1;
        j = s2;
        a = new int[9];
        k = new s();
        n = new Hashtable();
        z = bh.q();
        (i1 = d_()).d = true;
        B = i1;
        (i1 = f_()).d = true;
        C = i1;
        (i1 = e_()).d = true;
        D = i1;
        (i1 = g_()).d = true;
        E = i1;
        G = x.o(s1);
    }

    public ba(s s1)
    {
        this(s1.g(), ab.e(s1.j().toLowerCase()), s1.h());
        s1.g();
        for(int i1 = 2; i1 < 9; i1++)
            a[i1] = s1.g();

        r = s1.g();
        F = s1.g(null);
        h();
    }

    public static final ba a(Vector vector, int i1)
    {
        return (ba)vector.elementAt(i1);
    }

    private void h()
    {
        String _tmp = i;
        v.b();
        String _tmp1 = j;
        v.b();
        g _tmp2 = m;
        v.d();
        Hashtable _tmp3 = n;
        v.h();
        v.b();
        Vector _tmp4 = z;
        v.j();
        e _tmp5 = A;
        v.f();
        String _tmp6 = F;
        v.b();
        String _tmp7 = G;
        v.b();
    }

    public final s O()
    {
        return (new s()).v(h).f(95);
    }

    public final String P()
    {
        return (new s()).f(35).v(h).f(35).f(i).l();
    }

    public abstract e d_();

    public abstract e f_();

    public abstract e e_();

    public abstract e g_();

    public abstract int b();

    public void a(s s1)
    {
        if(s1.g() == 12)
        {
            s = s1.g();
            t = s1.g();
            u = s1.g();
            s1.g();
        }
    }

    public void b(s s1)
    {
        s1.r(12).r(s).r(t).r(u).r(0);
    }

    public ba a(s s1, boolean flag, boolean flag1)
    {
        s1.f(a() | 8).r(h).a(i).l(j).r(0);
        for(int i1 = 2; i1 < 9; i1++)
            s1.r(a[i1]);

        s1.r(r);
        if(F != null)
            s1.b(F);
        else
            s1.r(0);
        if(!flag1)
            break MISSING_BLOCK_LABEL_167;
        if(!flag)
            g.removeAllElements();
        s1.r(flag = g.size());
          goto _L1
_L3:
        o(flag).a(s1, true);
_L1:
        --flag;
        JVM INSTR ifge 131;
           goto _L2 _L3
_L2:
        A.a(s1, true);
        n.clear();
        break MISSING_BLOCK_LABEL_180;
        A.a(s1.r(0), false);
        return this;
    }

    public final int c(s s1)
    {
        if(S())
            return d(s1);
        else
            return 303;
    }

    public final int d(s s1)
    {
        r.b(this, s1);
        m.a(s1);
        long l1;
        if(w > 0L)
            x = System.currentTimeMillis() + (l1 = w);
        return 0;
    }

    public final ba f(String s1)
    {
        v.b();
        F = x.c(s1, i);
        return this;
    }

    public final String Q()
    {
        String _tmp = i;
        v.b();
        return i;
    }

    public final boolean R()
    {
        return o > 0;
    }

    public final boolean S()
    {
        return o == 100;
    }

    public final av T()
    {
        return av.a(P()).a(b()).h(Q()).a(this);
    }

    public final av U()
    {
        av av1;
        (av1 = av.a(P()).a(b()).h(Q()).a(244)).e = true;
        return av1.a(this);
    }

    public abstract int a();

    public Vector j_()
    {
        return g;
    }

    public final int V()
    {
        if(R())
            return p();
        else
            return b_(0);
    }

    public int b_(int i1)
    {
        if(R())
            return 301;
        if(i1 == 0)
            b = (i1 = j.charAt(0)) < 'A' || i1 > 90 ? 1 : 2;
        else
            b = i1;
        p = 0;
        o = 1;
        return 0;
    }

    public int p()
    {
        return R() ? 0 : 302;
    }

    public final void j(int i1)
    {
        int ai1[];
        (ai1 = a)[0] += i1;
        ai1[2] += i1;
        ai1[4] += i1;
        ai1[6] += i1;
    }

    public final void k(int i1)
    {
        int ai1[];
        (ai1 = a)[1] += i1;
        ai1[3] += i1;
        ai1[5] += i1;
        ai1[7] += i1;
    }

    public final void l(int i1)
    {
        int ai1[];
        int j1;
        if(i1 != (j1 = (ai1 = a)[8]))
        {
            ai1[2] = 0;
            ai1[3] = 0;
            if(i1 >>> 8 != j1 >>> 8)
            {
                ai1[4] = 0;
                ai1[5] = 0;
            }
            ai1[8] = i1;
        }
    }

    public final int a(int i1, int j1)
    {
        return a[i1 + i1 + j1];
    }

    public final void m(int i1)
    {
        a[i1 + i1] = a[i1 + i1 + 1] = 0;
    }

    public abstract void h_();

    public abstract int i();

    public final void W()
    {
        try
        {
            if(o <= 0 || o == 100)
                a.c(this);
            else
                a.b(this);
            h_();
            return;
        }
        catch(Throwable _ex)
        {
            Y();
        }
    }

    public final void X()
    {
        if(m != null)
            m.a = 3;
        m = null;
        o = 0;
    }

    public final void Y()
    {
        if(c && m.d())
            bh.b(this, m.c());
        else
            bh.a(this, m.e());
        X();
        q = i();
    }

    public final void Z()
    {
        bh.a(this, 460);
        X();
        q = i();
    }

    public final String aa()
    {
        if(b != 3)
            return j;
        else
            return bh.b(bh.r().append((char)(j.charAt(0) + 32)).append(ab.c(j, 1)));
    }

    public final void ab()
    {
        X();
        q = i();
        if(b == 2)
        {
            b_(3);
            return;
        } else
        {
            bh.a(this, 459);
            return;
        }
    }

    public final void ac()
    {
        X();
        q = i();
    }

    public final void n(int i1)
    {
        bh.b(this, i1);
        X();
        q = i();
    }

    public final void ad()
    {
        for(int i1 = g.size(); --i1 >= 0;)
        {
            e e1;
            for(int j1 = (e1 = o(i1)).b.size(); --j1 >= 0;)
            {
                be be1;
                f(be1 = e1.a(j1));
                r.d(be1);
            }

            c(e1);
        }

    }

    public final void ae()
    {
        for(Enumeration enumeration = n.elements(); enumeration.hasMoreElements(); ((be)enumeration.nextElement()).b());
        bf.b = true;
    }

    public final be d(Object obj)
    {
        return (be)n.get(obj);
    }

    public final void g(String s1)
    {
        if((s1 = d(s1)) != null && !s1.s_() && !s1.j() && !s1.p())
            z.c(s1);
    }

    public final void h(String s1)
    {
        if((s1 = d(s1)) != null)
            z.d(s1);
    }

    public final void a(String s1, long l1, String s2)
    {
        be be1;
        if((be1 = d(s1)) == null)
            be1 = a_(s1);
        u++;
        be1.a(l1, s2, 1);
    }

    public abstract be a_(String s1);

    public final void a(String s1, long l1, int i1)
    {
        v.b();
        if((s1 = d(s1)) != null)
            s1.a(l1, i1);
    }

    public int a(be be1, String s1, long l1)
    {
        return !S() ? 303 : 0;
    }

    public final void i(String s1)
    {
        v.b();
        e e1;
        for(int i1 = g.size(); --i1 >= 0;)
            if(ab.a(s1, (e1 = o(i1)).c))
                e1.d = true;

        if(s1.equals(A.c))
            A.d = true;
        if(s1.equals(B.c))
            B.d = true;
        if(s1.equals(E.c))
            E.d = true;
        if(s1.equals(C.c))
            C.d = true;
    }

    public final void j(String s1)
    {
        v.b();
        e e1;
        for(int i1 = g.size(); --i1 >= 0;)
            if(ab.a(s1, (e1 = o(i1)).c))
                e1.d = false;

        if(s1.equals(A.c))
            A.d = false;
        if(s1.equals(B.c))
            B.d = false;
        if(s1.equals(E.c))
            E.d = false;
        if(s1.equals(C.c))
            C.d = false;
    }

    public final int f(be be1)
    {
        if(be1 != null)
        {
            Object obj;
            for(Enumeration enumeration = n.keys(); enumeration.hasMoreElements();)
                if(n.get(obj = enumeration.nextElement()) == be1)
                {
                    n.remove(obj);
                    break;
                }

            for(int i1 = g.size(); --i1 >= 0;)
                o(i1).c(be1);

            A.c(be1);
            r.d(be1);
        }
        return 0;
    }

    public int a(String s1, String s2, String s3, e e1, boolean flag)
    {
        v.b();
        v.b();
        v.b();
        if(!S())
            return 303;
        if(ab.a(s2))
            return 305;
        return !ab.a(s3) ? 0 : 306;
    }

    public int a(be be1, Object aobj[])
    {
        v.g();
        if(!S())
            return 303;
        return !ab.a((String)aobj[0]) ? 0 : 305;
    }

    public abstract int a_(Object obj);

    public abstract int a(be be1);

    public int b_(String s1)
    {
        v.b();
        if(!S())
            return 303;
        return !ab.a(s1) ? 0 : 305;
    }

    public int a(e e1, String s1)
    {
        v.b();
        if(e1 == A || e1 == B || e1 == E || e1 == C)
            return 308;
        if(!S())
            return 303;
        return !ab.a(s1) ? 0 : 305;
    }

    public int a(String s1, String s2)
    {
        v.b();
        v.b();
        if(ab.a(s1))
            return 305;
        if(i.equals(s1) && j.equals(s2))
            return 0;
        if(R())
        {
            return 304;
        } else
        {
            G = x.o(i = s1);
            j = s2;
            return 0;
        }
    }

    public final int af()
    {
        if(R())
        {
            return 304;
        } else
        {
            bb.a(this);
            return 0;
        }
    }

    public int a(e e1)
    {
        if(e1 == A || e1 == B)
            return 308;
        return e1.b.size() <= 0 ? 0 : 307;
    }

    public int b(be be1)
    {
        return !be1.s_() && !S() ? 303 : 0;
    }

    public final int g(be be1)
    {
        return r.a(be1.n_(), this);
    }

    public final int e(Object obj)
    {
        v.i();
        return r.a((String)obj, this);
    }

    public abstract int c(be be1);

    public abstract int d(be be1);

    public abstract int e(be be1);

    public int h(be be1)
    {
        return S() ? 0 : 303;
    }

    public final Vector ag()
    {
        Vector vector = bh.q();
        be be1;
        for(Enumeration enumeration = n.elements(); enumeration.hasMoreElements();)
            if((be1 = (be)enumeration.nextElement()).r_())
                vector.addElement(be1);

        return vector;
    }

    public final Vector ah()
    {
        Vector vector = bh.q();
        be be1;
        for(Enumeration enumeration = n.elements(); enumeration.hasMoreElements();)
            if((be1 = (be)enumeration.nextElement()).g())
                vector.addElement(be1);

        return vector;
    }

    public final Vector ai()
    {
        Vector vector = bh.q();
        be be1;
        for(Enumeration enumeration = n.elements(); enumeration.hasMoreElements();)
            if((be1 = (be)enumeration.nextElement()).q_())
                vector.addElement(be1);

        return vector;
    }

    public final Vector aj()
    {
        Vector vector = bh.q();
        be be1;
        for(Enumeration enumeration = n.elements(); enumeration.hasMoreElements();)
            if((be1 = (be)enumeration.nextElement()).j())
                vector.addElement(be1);

        return vector;
    }

    public final Vector ak()
    {
        Vector vector = bh.q();
        be be1;
        for(Enumeration enumeration = n.elements(); enumeration.hasMoreElements();)
            if((be1 = (be)enumeration.nextElement()).m_())
                vector.addElement(be1);

        return vector;
    }

    public Vector al()
    {
        return bh.q();
    }

    public final Vector am()
    {
        Vector vector = bh.q();
        for(Enumeration enumeration = n.elements(); enumeration.hasMoreElements(); vector.addElement(enumeration.nextElement()));
        return vector;
    }

    public int a(be be1, e e1, e e2)
    {
        if(e1 == e2)
            return 309;
        return S() ? 0 : 303;
    }

    public final Vector an()
    {
        Vector vector = bh.q();
        be be1;
        for(Enumeration enumeration = n.elements(); enumeration.hasMoreElements();)
            if((be1 = (be)enumeration.nextElement()).s_())
                vector.addElement(be1);

        return vector;
    }

    public final e i(be be1)
    {
        if(be1.s_() || A.b(be1))
            return A;
        if(be1.p())
            return E;
        if(be1.j())
            return B;
        if(be1.m_())
            return C;
        e e1;
        for(int i1 = g.size(); --i1 >= 0;)
            if((e1 = o(i1)).b(be1))
                return e1;

        return null;
    }

    public final void j(be be1)
    {
        be be2;
        if((be2 = (be)n.get(be1.n_())) != null && be2 != be1)
        {
            a(A, be2);
            a(B, be2);
            a(C, be2);
            a(D, be2);
            a(E, be2);
            r.d(be2);
        }
        n.put(be1.n_(), be1);
    }

    private static void a(e e1, be be1)
    {
        if(e1 != null)
            e1.a(be1);
    }

    public final e o(int i1)
    {
        return (e)g.elementAt(i1);
    }

    public final void b(e e1)
    {
        g.addElement(e1);
    }

    public final void c(e e1)
    {
        x.a(g, e1);
    }

    public abstract void d(int i1);

    public final String toString()
    {
        return Q();
    }

    public final Vector ao()
    {
        Vector vector = bh.q();
        be be1;
        for(Enumeration enumeration = n.elements(); enumeration.hasMoreElements();)
            if(!(be1 = (be)enumeration.nextElement()).m_() && !be1.s_())
                vector.addElement(be1);

        return vector;
    }

    public int k_()
    {
        return -1;
    }

    public final void ap()
    {
        j = aa();
        c = true;
        s++;
    }

    public void l_()
    {
        t = 0;
        u = 0;
    }

    public int y_()
    {
        return 0;
    }

    public s aq()
    {
        s s1 = (new s()).x(515).r(x.c(x.h(t.c(222)))).x(300).a(x.h(t.c(223))).x(305).a(i).x(306).a(t.c(y_())).x(563).r(s).x(564).r(t).x(565).r(u);
        l_();
        return s1;
    }

    public final Vector g;
    public int h;
    public String i;
    public String j;
    private int a[];
    public final s k;
    public int l;
    public g m;
    public final Hashtable n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public long w;
    public long x;
    public int y;
    public final Vector z;
    public e A;
    public final e B;
    public final e C;
    public final e D;
    public final e E;
    public String F;
    public String G;
    private int b;
    private boolean c;
}