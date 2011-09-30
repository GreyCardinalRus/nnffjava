// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:09:56
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.io.IOException;
import java.util.*;
import javax.microedition.lcdui.*;

public final class ab extends be
{

    public ab(az az1, String s1, String s2, String s3)
    {
        super(az1);
        a = s1;
        e = s3;
        d = 0;
        g(x.c(s2, s1));
        super.l = az.i(c);
        super.q = az1.O().f(s1).d();
        az1.j(this);
        F();
        super.r = s1;
    }

    public final void b()
    {
        c = 0;
        super.l = 381;
        e = null;
        f = null;
        d = 0;
        super.b();
    }

    public final String n_()
    {
        return a;
    }

    public ab(ba ba1, s s1)
    {
        super(ba1);
        a = s1.j();
        g(s1.g(null));
        super.q = ba1.O().f(a).d();
        c = 0;
        super.l = az.i(0);
        ba1.j(this);
        F();
        super.r = a;
    }

    public final void a(s s1)
    {
        s1.a(a).b(super.o);
    }

    private final int Z()
    {
        int i;
        int l = (i = p_()) & 0xffff;
        if(super.i instanceof ah)
            if(l >= 381 && l <= 384)
                return i + 4;
            else
                return i;
        if(super.i instanceof a)
        {
            if(l >= 381 && l <= 384)
                return i + 18;
            else
                return i;
        } else
        {
            return i;
        }
    }

    public final av o_()
    {
        return av.a(super.q).a(Z()).a(X(), 0, d).a(this);
    }

    public final int p_()
    {
        int i;
        if((i = super.p_()) == 16384)
            return i;
        if(a(0x402ec, e) || a(0x41ae6, e) || a(0x31aee, e))
            i = 384;
        if(a(0x2022e, e))
            i = i & 0xffff | 0x13a0000;
        return i;
    }

    public final boolean q_()
    {
        return false;
    }

    public final boolean g()
    {
        return false;
    }

    public final boolean r_()
    {
        return false;
    }

    public final boolean s_()
    {
        return b;
    }

    public final boolean j()
    {
        return a(0x41ae6, e) || a(0x402ec, e);
    }

    public final void k()
    {
    }

    public final void a(String s1, ao ao1)
    {
        f = s1;
        c = 0;
        if(a(0x91885, s1))
            c = c(ao1);
        a(this);
    }

    public final void a(ab ab1)
    {
        c = ab1 == null ? 0 : ab1.c;
        f = ab1 == null ? null : ab1.f;
        super.j = c != 0;
        super.l = az.i(c);
        d = c != 0 ? 3 : 0;
        super.n = true;
        F();
    }

    private static int c(ao ao1)
    {
        if((ao1 = ao1.f(0x41ae2)) == null)
            return 1;
        if(a(ao1 = a(ao1.c)))
            return 1;
        if(a(0x40368, ao1))
            return 4;
        if(a(0x41a8d, ao1))
            return 2;
        if(a(0x21a91, ao1))
            return 6;
        if(a(0x31a93, ao1))
            return 5;
        return !a(0x31a96, ao1) ? 1 : 3;
    }

    public final void w_()
    {
        t.h(1278);
    }

    public final int a(int i)
    {
        int l;
        if((l = ((az)super.i).a(this, i)) != i)
        {
            return l;
        } else
        {
            b(1);
            b(0);
            return i;
        }
    }

    public final void b(int i)
    {
        ((az)super.i).d(a, i);
    }

    public final bc n()
    {
        return (new bc(this)).f(Z());
    }

    private static final void aa()
    {
        Object obj = t.c(674);
        obj = bh.r().append(((String) (obj)));
        Vector vector = t.n(1263);
        for(int i = 0; i < x.c(vector); i++)
            ((StringBuffer) (obj)).append('\0').append(d((ao)vector.elementAt(i)));

        t.a(1262, ((StringBuffer) (obj)));
    }

    private static final Vector ab()
    {
        Vector vector;
        (vector = bh.q()).addElement(t.c(675));
        return vector;
    }

    private static final void a(Vector vector, Object obj)
    {
        obj = ((ao)obj).b;
        for(int i = 0; i < x.c(((Vector) (obj))); i++)
            vector.addElement(d((ao)((Vector) (obj)).elementAt(i)));

    }

    private static final Vector d(int i)
    {
        Vector vector = ab();
        if(i > 0)
            a(vector, t.n(1263).elementAt(i - 1));
        return vector;
    }

    private static final Vector a(int i, int l)
    {
        Vector vector = ab();
        if(i > 0)
            a(vector, ((ao)t.n(1263).elementAt(l - 1)).b.elementAt(i - 1));
        return vector;
    }

    private static final String d(ao ao1)
    {
        String s1;
        if((s1 = ao1.c(110)) != null)
            return s1;
        else
            return a(ao1.c);
    }

    public static final void q()
    {
        r();
        t.a(1263, (new s(bh.a(25135L), 41000)).P().b);
        aa();
        aw.b(aw.b(3295));
    }

    public static final void r()
    {
        t.b(1258, 1263);
        t.c(1451, 0);
        t.c(1452, 0);
        t.c(1453, -1);
        t.c(1454, -1);
        t.c(1455, 0);
        t.c(1456, 0);
        t.c(1457, 0);
        t.c(1458, 0);
        t.c(1459, 0);
        t.c(1460, 0);
        t.c(1461, 0);
    }

    public static final void a(ad ad1, Object obj)
    {
        Object obj1 = ((Object[])((av) (obj = (av)obj)).d)[0];
        v.i();
        int i = ((Integer)obj1).intValue();
        obj = ((av) (obj)).b;
        String s1 = t.c(680);
        String s2 = t.c(681);
        String s3 = t.c(682);
        String s4 = t.c(679);
        String s5 = t.c(683);
        String s6 = t.c(684);
        av av1 = null;
        av av2 = null;
        av av3 = null;
        av av4 = null;
        av av5 = null;
        int l = 0;
        Vector vector;
        av av6;
        Object obj2;
        for(int i1 = x.c(vector = ad1.j); --i1 >= 0;)
            if((av6 = (av)vector.elementAt(i1)).a == 9)
                if(((String) (obj2 = av6.b)).startsWith(s4))
                    av3 = av6;
                else
                if(((String) (obj2)).startsWith(s1))
                {
                    obj2 = ((Object[])av6.d)[0];
                    v.i();
                    l = ((Integer)obj2).intValue();
                } else
                if(((String) (obj2)).startsWith(s2))
                    av1 = av6;
                else
                if(((String) (obj2)).startsWith(s3))
                    av2 = av6;
                else
                if(((String) (obj2)).startsWith(s5))
                    av4 = av6;
                else
                if(((String) (obj2)).startsWith(s6))
                    av5 = av6;

        if(a(((String) (obj)), s1))
        {
            av1.a(d(i), 0, s2);
            av2.a(x.b(t.c(675), '\0'), 0, s3);
        } else
        if(a(((String) (obj)), s2))
            av2.a(a(i, l), 0, s3);
        else
        if(a(((String) (obj)), s4))
        {
            av4.a(x.b(t.c(678), '\0'), 0, s5);
            av5.a(x.b(t.c(677), '\0'), 0, s6);
        } else
        if(a(((String) (obj)), s5) || a(((String) (obj)), s6))
            av3.a(x.b(t.c(676), '\0'), 0, s4);
        ad1.u();
    }

    public static final String[] s()
    {
        String as[] = new String[16];
        String s1;
        if(!a(s1 = x.h(t.c(1258))))
        {
            int l;
            if((l = d(s1 = e(s1.toLowerCase()))) >= 0)
            {
                as[0] = b(s1, l);
                s1 = c(s1, l + 1);
                as[1] = s1.equals("icq.com") ? "uin.icq" : s1;
            }
            v.g();
            return as;
        }
        as[2] = x.h(t.c(1259));
        as[3] = x.h(t.c(1260));
        as[4] = x.h(t.c(1261));
        as[5] = e(t.f(1452));
        as[7] = e(t.f(1453));
        as[8] = e(t.f(1454));
        int i;
        if((i = t.f(1456)) > 0)
        {
            ao ao1;
            as[15] = (ao1 = (ao)t.n(1263).elementAt(i - 1)).c(105);
            if((i = t.f(1457)) > 0)
            {
                as[11] = (ao1 = (ao)ao1.b.elementAt(i - 1)).c(105);
                as[15] = null;
                if((i = t.f(1458)) > 0)
                    as[11] = ((ao)ao1.b.elementAt(i - 1)).c(105);
            }
        }
        as[12] = e(t.f(1455));
        as[13] = e(t.f(1459));
        as[14] = e(t.f(1460));
        if(t.g(1461))
            as[9] = e(Integer.toString(1));
        v.g();
        return as;
    }

    private static final String e(int i)
    {
        if(i > 0)
            return e(Integer.toString(i));
        else
            return null;
    }

    public static final int a(Object aobj[])
    {
        t.h(1233);
        String s1;
        if((s1 = (String)aobj[20]) != null)
        {
            if(x.c(s1) == 0)
            {
                Object obj = aobj[7];
                v.i();
                obj = aobj[9];
                v.i();
                if(0 != (aobj = bb.a(0, null, s1 = (String)obj, (String)obj)))
                {
                    return v.m(((int) (aobj)));
                } else
                {
                    z.a(bb.a(0, s1));
                    return 4;
                }
            }
            if(x.c(s1) == 4004)
                aobj[21] = z.i(-1);
        }
        t.a(1233, ((Object) (aobj)));
        return 164;
    }

    private static final void ac()
    {
        Object aobj[] = (Object[])t.m(1233);
        v.g();
        t.h(1233);
        Object obj = aobj[7];
        v.i();
        String s1;
        int i;
        String s2;
        if((i = d(s1 = (String)obj)) >= 0)
        {
            s2 = c(s1, i);
            s1 = b(s1, i);
        } else
        {
            s2 = t.i();
        }
        v.b();
        v.b();
        int l = 0;
        for(int i1 = (i = x.b(t.c(0x220756), '\0')).size(); --i1 >= 0;)
            if(a(s2, i.elementAt(i1)))
                l = i1;

        bh.a(i);
        t.a(1303, aobj[3]);
        t.a(1304, aobj[4]);
        t.a(1305, aobj[5]);
        t.a(1254, s1);
        t.c(1445, l);
        t.a(1255, aobj[9]);
        t.a(1246, aobj[10]);
        i = ((int) (aobj[11]));
        v.i();
        t.c(4291, ((Integer)i).intValue());
        t.a(1249, aobj[12]);
        t.a(1250, aobj[13]);
        t.a(1260, aobj[14]);
        t.a(1261, aobj[15]);
        i = ((int) (aobj[16]));
        v.i();
        t.c(1460, ((Integer)i).intValue());
        i = ((int) (aobj[17]));
        v.i();
        t.c(1459, ((Integer)i).intValue());
        i = ((int) (aobj[18]));
        v.i();
        t.c(1463, ((Integer)i).intValue());
        i = ((int) (aobj[19]));
        v.i();
        t.c(1452, ((Integer)i).intValue());
        t.a(1259, aobj[20]);
        i = ((int) (aobj[21]));
        v.i();
        t.c(1451, ((Integer)i).intValue());
    }

    public static final void t()
    {
        ac();
        aw.b(aw.b(4316));
        String s1;
        if((s1 = t.c(1259)) != null)
        {
            int i;
            char c1;
            String s2 = t.c(c1 = (i = x.c(s1)) != 78 ? i != 101 ? i != 114 ? i != 150 ? i != 152 ? i != 154 ? i != 155 ? i != 175 ? i != 555 ? i != 573 ? i != 4003 ? i != 4004 ? i != 5005 ? '\u0323' : '\u0322' : '\u0321' : '\u0320' : '\u031F' : '\u031E' : '\u031D' : '\u031C' : '\u031B' : '\u031A' : '\u0319' : '\u0318' : '\u0317' : '\u0316');
            v.d(c1 == '\u0323' ? s2 + i : s2);
            return;
        } else
        {
            v.w();
            return;
        }
    }

    public static final void b(ad ad1, Object obj)
    {
        Object aobj[];
        Object obj1 = (aobj = (Object[])((av) (obj = (av)obj)).d)[0];
        v.i();
        int i = ((Integer)obj1).intValue();
        aobj = (String[])aobj[1];
        av av1 = null;
        Vector vector;
        av av2;
        for(int l = (vector = ad1.j).size(); --l >= 0;)
            if((av2 = (av)vector.elementAt(l)).a == 15 && av2.b.startsWith(t.c(783)))
                av1 = av2;

        if(((av) (obj)).b.equals(t.c(781)))
            av1.e(i != 0 ? aobj[i] : x.h(t.c(1249)));
        ad1.u();
    }

    public static final int v()
    {
        Object obj;
        ay.G();
        if(!a.a(((String) (obj = a.l()))))
            obj = b(((String) (obj)), x.d(0x220756, t.f(1445)));
        if(!a.b(((String) (obj))))
            return v.m(568);
        1233;
        obj;
        x.h(t.c(1255));
        x.h(t.c(1246));
        int i;
        if(0 != (i = t.f(4291))) goto _L2; else goto _L1
_L1:
        x.h(t.c(1249));
          goto _L3
_L2:
        i = ((int) (x.b(t.c(782), '\0').elementAt(i)));
        v.i();
        (String)i;
_L3:
        x.h(t.c(1250));
        x.h(t.c(1260));
        x.h(t.c(1261));
        t.f(1460);
        t.f(1459);
        t.f(1463);
        t.f(1452);
        t.f(1451);
        t.c(1304);
        t.c(1305);
        bh.a();
        t.a();
        JVM INSTR pop ;
        return 13;
    }

    public static final void w()
    {
        t.h(1254);
        t.h(1255);
        t.h(1246);
        t.c(1445, 0);
        t.c(4291, 0);
        t.b(1303, 1305);
        r.ae();
        r();
    }

    public static final void a(ax ax1)
    {
        new f(31, ((Object) (x.a(ax1, z.i(0), ((ba) (ax1)).i, ax1.aa()))));
    }

    public static final void b(Object aobj[])
    {
        ax ax1;
        w w1;
        ax1 = (ax)aobj[0];
        w1 = null;
        int i;
        v.bS();
        Object obj = aobj[1];
        v.i();
        if(((Integer)obj).intValue() != 0)
            break MISSING_BLOCK_LABEL_162;
        ax1.p = 30;
        bf.c = true;
        (w1 = w.b(t.c(0x2a11b4), ax1, 0)).b(bh.a(0x54534f50L));
        obj = (new s()).c(0x2a11de).a(aobj[2]).c(0x5130c).a(aobj[3]);
        u.a(w1, 0xc1005, 0x210fe4);
        w1.a(((s) (obj)).a, ((s) (obj)).b);
        if((i = w1.b()) != 200)
            break MISSING_BLOCK_LABEL_366;
        ax1.p = 40;
        bf.c = true;
        a(aobj, (new s(w1)).O());
        i = w1;
        try
        {
            i.a();
        }
        catch(Throwable _ex) { }
        v.bT();
        return;
        ax1.p = 50;
        bf.c = true;
        i = ((int) (aobj[5]));
        v.i();
        i = ((int) (aobj[6]));
        v.i();
        if((i = (w1 = w.a((new s()).c(0x2d1208).f(63).f(i = (new s()).c(0x206c0).a(aobj[3]).c(0xa51235).b(aobj[4]).l()).c(0xc12da).f(c((new s()).c(0x41311).f(ay.a(t.c(0x2d1208), false)).f(38).f(ay.a(i, false)).l(), c((String)i, (String)i))).l(), 0).a(0, 0x544547, 0x5035d)).b()) != 200)
            break MISSING_BLOCK_LABEL_366;
        ax1.p = 60;
        bf.c = true;
        b(aobj, w1.d().O());
        i = w1;
        try
        {
            i.a();
        }
        catch(Throwable _ex) { }
        v.bT();
        return;
        throw new Throwable(e(Integer.toString(i)));
        Throwable throwable;
        throwable;
        a(aobj, throwable);
        w w2 = w1;
        try
        {
            w2.a();
        }
        catch(Throwable _ex) { }
        v.bT();
        return;
        Exception exception;
        exception;
        w w3 = w1;
        try
        {
            w3.a();
        }
        catch(Throwable _ex) { }
        v.bT();
        throw exception;
    }

    private static final String c(String s1, String s2)
    {
        v.b();
        v.b();
        return (new s()).b(ay.a(s2.getBytes(), s2.length(), s1.getBytes(), s1.length())).e();
    }

    private static final void a(Object aobj[], ao ao1)
    {
        int i;
        if((i = Integer.parseInt(a(ao1.f(0xa12e6).c))) == 200)
        {
            ao1 = ao1.f(0x4000c);
            new f(31, ((Object) (x.a(aobj[0], z.i(1), a(ao1.f(0x712f0).c), a(ao1.f(0x50a7f).f(0x10002).c), a(ao1.f(0x812f7).c), a(ao1.f(0xd12ff).c), aobj[3]))));
            return;
        }
        if(i == 330)
        {
            ao1 = null;
            ((ax)aobj[0]).ab();
            aobj[0] = null;
        }
        ao1 = 0;
        throw new RuntimeException(e(Integer.toString(i)));
    }

    private static final void b(Object aobj[], ao ao1)
    {
        ao1 = ao1.f(0x4000c);
        aobj = ((Object []) (aobj[2]));
        v.i();
        ((ax)aobj[0]).b = x.a((String)aobj, bh.b(bh.r().append(((String) (aobj = a(ao1.f(0x412f7).c)))).append(':').append(a(ao1.f(0x412cd).c))), a(ao1.f(0x61064).c));
    }

    private static final void a(Object aobj[], Throwable throwable)
    {
        ((ax)aobj[0]).a(throwable);
    }

    public static k x()
    {
        return (k)t.m(1351);
    }

    public static final void y()
    {
        t.a(1349, bh.q());
        t.a(1350, new k(t.c(961), 0x3ecbe2L, 0x730bfbL, 0x411dc3L, 0x711b70L));
        try
        {
            d(z.i(t.c(227)));
        }
        catch(Throwable _ex) { }
        k k1;
        (k1 = new k(t.c(960), 0x1c7c7dL, 0xf151d4L, 0x14f88e6L, 0x3f10e8L)).b = 0xa5878dL;
        k1.c = 0x85a4b7L;
        t.a(1351, k1);
    }

    private static void a(k k1)
    {
        Vector vector;
        if(k1 != null && !(vector = t.n(1349)).contains(k1))
            vector.addElement(k1);
    }

    private static void ad()
    {
        t.n(1349).removeAllElements();
    }

    private static final s c(s s1)
    {
        Vector vector;
        int i;
        s1.q(i = (vector = t.n(1349)).size());
        for(int l = 0; l < i; l++)
            ((k)vector.elementAt(l)).a(s1);

        return s1;
    }

    private static final void d(s s1)
    {
        ad();
        if(s1.b > 0)
        {
            for(int i = s1.z(); --i >= 0;)
                a(new k(s1));

        }
    }

    public static final k a(long l, long l1)
    {
        k k1 = null;
        Vector vector;
        k k2;
        for(int i = (vector = t.n(1349)).size(); --i >= 0;)
            if((k2 = (k)vector.elementAt(i)).a(l, l1) && k2.d != -1 && (k1 == null || k2.a(k1)))
                k1 = k2;

        return k1;
    }

    public static final boolean b(long l, long l1)
    {
        Vector vector;
        k k1;
        for(int i = x.c(vector = t.n(1349)); --i >= 0;)
            if((k1 = (k)vector.elementAt(i)).a(l, l1) && t.b(k1.a, 960) < 0)
                return true;

        return false;
    }

    public static final k c(long l, long l1)
    {
        Vector vector;
        k k1;
        for(int i = x.c(vector = t.n(1349)); --i >= 0;)
            if((k1 = (k)vector.elementAt(i)).a(l, l1))
                return k1;

        return null;
    }

    public static final void a(ao ao1)
    {
        Vector vector;
label0:
        {
            if(ao1 != null)
            {
                Object obj = null;
                if((vector = ao1.b) != null)
                    break label0;
            }
            return;
        }
        ad();
        if((ao1 = ao1.b(0x914f7)) != null)
            t.a(254, ao1);
        for(ao1 = 0; ao1 < x.c(vector); ao1++)
        {
            Object obj1;
            String s1;
            if(a(s1 = ((ao) (obj1 = (ao)vector.elementAt(ao1))).a, 0x73676572L))
            {
                obj1 = ((ao) (obj1)).b;
                for(s1 = 0; s1 < x.c(((Vector) (obj1))); s1++)
                {
                    ao ao2 = (ao)((Vector) (obj1)).elementAt(s1);
                    k k1;
                    (k1 = new k(ao2.c(0x656d616e), ao2.d(28780), ao2.d(28788), ao2.d(28786), ao2.d(28770))).f = ao2.c(25705);
                    k1.b = ao2.d(0x6e6f6c63);
                    k1.c = ao2.d(0x74616c63);
                    k1.g = ao2.e(0x7a78616d);
                    a(k1);
                }

            } else
            if(a(0x61500, s1))
                m.a(((ao) (obj1)));
        }

        try
        {
            t.a(227, t.i());
            t.a(227, c(new s()).e());
            return;
        }
        catch(Throwable _ex)
        {
            t.a(254, t.i());
        }
    }

    public static final void b(ao ao1)
    {
        ao ao2;
        k k1;
        for(int i = (ao1 = ao1.b).size(); --i >= 0;)
            if(a(0x41506, (ao2 = (ao)ao1.elementAt(i)).a) && (k1 = h(ao2.b(0x20206))) != null)
                k1.a(ao2.e(98), ao2.e(29300));

    }

    private static final k h(String s1)
    {
        v.b();
        Vector vector;
        k k1;
        for(int i = (vector = t.n(1349)).size(); --i >= 0;)
            if((k1 = (k)vector.elementAt(i)).f.equals(s1))
                return k1;

        return null;
    }

    public static final void z()
    {
        A();
        r.M();
        t.a(1356, bh.q());
        Object aobj[];
        t.a(1355, ((Object) (aobj = v.m(t.i()))));
        a.c(aobj);
        ae();
        t.a(1357, bh.q());
        new f(8);
    }

    public static final void A()
    {
        int i = t.g(277) ? ((t.f(1384) >> 7) + 2) * ((t.f(1385) >> 7) + 2) << 1 : ((t.f(1384) >> 7) + 2) * ((t.f(1385) >> 7) + 2);
        t.a(1354, new d(i));
        t.c(1530, i);
    }

    private static final void ae()
    {
        Image image;
        Graphics g1 = (image = Image.createImage(128, 128)).getGraphics();
        int i = 0;
        g1.setColor(0xc8c8c8);
        for(int l = 0; l < 128; l += 2)
        {
            for(int i1 = i; i1 < 128; i1 += 4)
                g1.fillRect(l, i1, 2, 2);

            i ^= 2;
        }

        (new ar(g1)).a(312, 56, 56);
        t.a(1353, image);
    }

    public static final void a(Vector vector)
    {
        Vector vector1;
        synchronized(vector1 = t.n(1357))
        {
            vector1.removeAllElements();
            int i = vector.size();
            for(int l = 0; l < i; l++)
                vector1.addElement(vector.elementAt(l));

            bh.a(vector);
        }
    }

    public static final Image a(bh bh1)
    {
        Image image;
        if((image = (Image)ag().a(bh1)) == null)
            b(bh1);
        return image;
    }

    private static final void af()
    {
        Vector vector;
        synchronized(vector = t.n(1357))
        {
            r.b(vector);
        }
    }

    public static final void B()
    {
        int i = 4;
        for(; 0 == t.f(1529); af())
        {
            Object aobj[] = (Object[])t.m(1355);
            while(r.N()) 
            {
                a.d(aobj);
                try
                {
                    Thread.sleep(100L);
                }
                catch(Throwable _ex) { }
            }
            bh bh1;
            int l;
            String s2 = t.c((l = (bh1 = r.O()).a) != 3 ? ((int) (l != 1 ? 964 : 963)) : 962);
            String s1 = s2 + bh.k();
            Object aobj1[] = aobj;
            aobj[1] = s1;
            a.c(aobj1);
            try
            {
                Object obj;
                if((obj = c(bh1)) == null)
                    obj = bh.a(bh1);
                if(obj == null)
                {
                    if(l == 3)
                    {
                        for(obj = t.n(1356); ((Vector) (obj)).size() >= t.f(1530); ((Vector) (obj)).removeElementAt(0));
                        ((Vector) (obj)).addElement(bh1);
                        a.v();
                    } else
                    {
                        a(bh1, t.o(1353));
                    }
                    throw new Throwable();
                }
                i = 4;
                a(bh1, ((Image) (obj)));
                r.a(bh1);
            }
            catch(IOException _ex)
            {
                if(i-- > 0)
                {
                    af();
                    r.b(bh1);
                } else
                {
                    t.c(1529, 1);
                }
            }
            catch(Throwable _ex)
            {
                r.a(bh1);
            }
        }

    }

    private static final void b(bh bh1)
    {
        bh bh2 = bh1;
        if(!t.n(1356).contains(bh2))
            r.c(bh1);
    }

    private static final void a(bh bh1, Image image)
    {
        try
        {
            ag().a(bh1, image);
            o.c = true;
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    public static final void C()
    {
        bh bh1;
        for(Enumeration enumeration = ag().a(); enumeration.hasMoreElements();)
            if((bh1 = (bh)enumeration.nextElement()).a == 3)
                ag().b(bh1);

    }

    private static final d ag()
    {
        return (d)t.m(1354);
    }

    private static final Image c(bh bh1)
    {
        if(bh1.a == 1 && t.g(1531))
            return ay.a(bh1);
        else
            return null;
    }

    public static final void D()
    {
        g = new Vector(128);
    }

    public static final boolean a(String s1)
    {
        return s1 != null && s1.length() == 0;
    }

    public static final boolean a(String s1, long l)
    {
        int i = s1.length();
        for(int i1 = 0; i1 < i; i1++)
        {
            if((long)s1.charAt(i1) != (l & 255L))
                return false;
            l >>>= 8;
        }

        return l == 0L;
    }

    public static final boolean a(int i, String s1)
    {
        if(s1 == null)
            return false;
        if(i > 5399)
        {
            byte abyte0[] = t.a(300);
            int l;
            if((l = i >> 16) != s1.length())
                return false;
            i &= 0xffff;
            while(--l >= 0) 
                if(s1.charAt(l) != abyte0[i + l])
                    return false;
            return true;
        } else
        {
            return a(t.c(i), s1);
        }
    }

    public static final StringBuffer a(int i, Object obj)
    {
        int l;
        String s1 = (i = t.c(i)).substring(0, l = i.indexOf('%'));
        return bh.r().append(s1).append('\'').append(obj).append('\'').append(i.substring(l + 1));
    }

    public static final boolean a(String s1, Vector vector, int i)
    {
        s1 = ((String) (vector.elementAt(i)));
        v.i();
        return a(s1, (String)s1);
    }

    public static final boolean a(String s1, Object obj)
    {
        s1 = ((String) (obj));
        v.i();
        return a(s1, (String)s1);
    }

    public static final String b(String s1)
    {
        return b(s1, d(s1));
    }

    public static final String c(String s1)
    {
        return c(s1, d(s1) + 1);
    }

    public static final boolean a(String s1, String s2)
    {
        if(s1 == s2)
            return true;
        if(s2 == null || s1 == null)
            return false;
        else
            return s1.equals(s2);
    }

    public static final int d(String s1)
    {
        v.b();
        return s1.indexOf('@');
    }

    public static final String b(int i, String s1)
    {
        v.b();
        return bh.b(bh.e(i).append(s1));
    }

    public static final String b(int i, Object obj)
    {
        v.i();
        return bh.b(bh.e(i).append(obj));
    }

    public static final String b(String s1, String s2)
    {
        v.b();
        v.b();
        return bh.b(bh.r().append(s1).append(s2));
    }

    public static final String b(String s1, Object obj)
    {
        v.b();
        v.i();
        return bh.b(bh.r().append(s1).append(obj));
    }

    public static final String a(String s1, int i)
    {
        v.b();
        return bh.b(bh.r().append(s1).append(i));
    }

    public static final String[] a(String as[])
    {
        if(as != null)
        {
            for(int i = as.length; --i >= 0;)
                as[i] = e(as[i]);

        }
        return as;
    }

    public static final String a(StringBuffer stringbuffer)
    {
        if(stringbuffer != null)
            return e(stringbuffer.toString());
        else
            return null;
    }

    public static final String a(String s1, int i, int l)
    {
        return e(s1.substring(i, l));
    }

    public static final String b(String s1, int i)
    {
        return e(s1.substring(0, i));
    }

    public static final String b(StringBuffer stringbuffer)
    {
        String s1 = a(stringbuffer);
        stringbuffer.setLength(0);
        return s1;
    }

    public static final String c(String s1, int i)
    {
        return e(s1.substring(i));
    }

    public static final String b(Object obj)
    {
        v.i();
        return c((String)obj, 13);
    }

    public static final String a(TextBox textbox)
    {
        return x.h(e(textbox.getString()));
    }

    public static final String e(String s1)
    {
        if(s1 == null)
            return null;
        if(s1.length() > 256)
            return s1;
        Vector vector;
        synchronized(vector = g)
        {
            int i;
            if((i = vector.indexOf(s1)) < 0)
            {
                if(vector.size() > 64)
                {
                    if(vector.size() == 128)
                        vector.removeElementAt(127);
                    vector.insertElementAt(s1, 64);
                } else
                {
                    vector.addElement(s1);
                }
                return s1;
            }
            s1 = x.a(vector, i);
            if(i != 0)
            {
                vector.removeElementAt(i);
                vector.insertElementAt(s1, 0);
            }
        }
        return s1;
    }

    public static final Object b(s s1)
    {
        Object obj = b(s1, ((StringBuffer) (s1 = bh.r())));
        bh.b(s1);
        return obj;
    }

    private static final char a(s s1, StringBuffer stringbuffer)
    {
        char c1;
        while((c1 = e(s1, stringbuffer)) == ' ' || c1 == '\n' || c1 == '\r' || c1 == '\t') ;
        return c1;
    }

    private static final Object b(s s1, StringBuffer stringbuffer)
    {
        int i;
        if((i = a(s1, stringbuffer)) == '\uFFFF')
            throw new RuntimeException();
        if(i == 125 || i == 93 || i == 44)
        {
            stringbuffer.append(i);
            return null;
        }
        if(i == 123)
        {
            Hashtable hashtable = new Hashtable();
            do
            {
                if((i = ((int) (b(s1, stringbuffer)))) instanceof String)
                    if(a(s1, stringbuffer) == ':')
                    {
                        hashtable.put(i, b(s1, stringbuffer));
                        i = (String)i;
                        String s2 = t.c(0x91de6);
                        String s3 = t.c(0xa1def);
                        if(i.startsWith(s2) || i.startsWith(s3))
                            t.a(i, hashtable.get(i));
                    } else
                    {
                        throw new RuntimeException();
                    }
                if((i = a(s1, stringbuffer)) != '}')
                {
                    if(i != 44)
                        throw new RuntimeException();
                } else
                {
                    return hashtable;
                }
            } while(true);
        }
        if(i == 91)
        {
            Vector vector = bh.q();
            do
            {
                if((i = ((int) (b(s1, stringbuffer)))) != null)
                    vector.addElement(i);
                if((i = a(s1, stringbuffer)) != ']')
                {
                    if(i != 44)
                        throw new RuntimeException();
                } else
                {
                    return vector;
                }
            } while(true);
        } else
        if(i == 34)
        {
            return c(s1, stringbuffer);
        } else
        {
            stringbuffer.append(i);
            return d(s1, stringbuffer);
        }
    }

    private static final String c(s s1, StringBuffer stringbuffer)
    {
        StringBuffer stringbuffer1 = bh.r();
        do
        {
            char c1;
            char c2;
            while((c1 = f(s1, stringbuffer)) != '"') 
                if(c1 == '\\')
                    switch(c2 = e(s1, stringbuffer))
                    {
                    case 34: // '"'
                        stringbuffer1.append('"');
                        break;

                    case 92: // '\\'
                        stringbuffer1.append('\\');
                        break;

                    case 47: // '/'
                        stringbuffer1.append('/');
                        break;

                    case 102: // 'f'
                        stringbuffer1.append('\f');
                        break;

                    case 98: // 'b'
                        stringbuffer1.append('\b');
                        break;

                    case 110: // 'n'
                        stringbuffer1.append('\n');
                        break;

                    case 114: // 'r'
                        stringbuffer1.append('\r');
                        break;

                    case 116: // 't'
                        stringbuffer1.append('\t');
                        break;

                    default:
                        stringbuffer1.append(c1).append(c2);
                        break;
                    }
                else
                    stringbuffer1.append(c1);
            return bh.b(stringbuffer1);
        } while(true);
    }

    private static final Object d(s s1, StringBuffer stringbuffer)
    {
        StringBuffer stringbuffer1 = bh.r();
        do
        {
            char c1;
            if((c1 = e(s1, stringbuffer)) == ',' || c1 == '}' || c1 == ']')
            {
                stringbuffer.append(c1);
                break;
            }
            stringbuffer1.append(c1);
        } while(true);
        String s2;
        if(a(0x40b2c, s2 = bh.b(stringbuffer1)))
            return z.i;
        if(a(0x50800, s2))
            return z.j;
        if(a(1328, s2))
            return z.g;
        else
            return z.i(x.c(s2));
    }

    private static final char e(s s1, StringBuffer stringbuffer)
    {
        int i;
        if((i = stringbuffer.length() - 1) >= 0)
        {
            s1 = stringbuffer.charAt(i);
            stringbuffer.setLength(i);
            return s1;
        }
        if((s1 = s1.p()) == -1)
            throw new RuntimeException();
        else
            return (char)s1;
    }

    private static final char f(s s1, StringBuffer stringbuffer)
    {
        int i;
        if((i = stringbuffer.length() - 1) >= 0)
        {
            s1 = stringbuffer.charAt(i);
            stringbuffer.setLength(i);
            return s1;
        } else
        {
            return aa.a(s1);
        }
    }

    public static final Object a(Object obj, String s1)
    {
        return ((Hashtable)obj).get(s1);
    }

    public static final Object a(Object obj, int i)
    {
        return ((Hashtable)obj).get(t.c(i));
    }

    public static final int b(Object obj, String s1)
    {
        obj = a(obj, s1);
        v.i();
        return ((Integer)obj).intValue();
    }

    public static final int c(Object obj)
    {
        obj = a(obj, t.c(0x51cf6));
        v.i();
        return ((Integer)obj).intValue();
    }

    public static final String c(Object obj, String s1)
    {
        return (String)a(obj, s1);
    }

    public static final String b(Object obj, int i)
    {
        return (String)a(obj, t.c(i));
    }

    public static final int c(Object obj, int i)
    {
        obj = d(obj, i);
        v.i();
        return ((Integer)obj).intValue();
    }

    public static final Object d(Object obj, int i)
    {
        return ((Vector)obj).elementAt(i);
    }

    public static final String e(Object obj, int i)
    {
        return x.a((Vector)obj, i);
    }

    public static final boolean d(Object obj)
    {
        Object obj1 = null;
        if(a(0x20b30, e(obj, 1)))
        {
            Object obj2 = d(obj, 0);
            v.i();
            if(a(0xc0a97, (String)obj2))
                return true;
        }
        return false;
    }

    public static boolean e(Object obj)
    {
        Object obj1 = null;
        if(!a(0xf0aa3, e(obj, 1)))
        {
            Object obj2 = d(obj, 0);
            v.i();
            if(a(0xc0a97, (String)obj2))
                return true;
        }
        return false;
    }

    public static boolean f(Object obj)
    {
        return x.n(((String) (obj = e(obj, 1)))) && a(0xc0f0f, ((String) (obj)));
    }

    public String a;
    private int c;
    private int d;
    private String e;
    private String f;
    public boolean b;
    private static Vector g;
}