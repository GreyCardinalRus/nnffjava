// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:31
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Vector;
import javax.microedition.lcdui.*;

public abstract class aw
{

    public static final void a()
    {
        t.a(1234, bh.q());
        b();
    }

    public static final void b()
    {
        int i1;
        i1 = (i1 = t.f(73)) != 0 ? ((int) (i1 != 1 ? 16 : 0)) : 8;
        ar ar2;
        t.a(1235, ar2 = new ar(0, i1));
        ar ar3;
        t.a(1236, ar3 = new ar(1, i1));
        ar ar1;
        t.a(1237, ar1 = t.g(70) ? new ar(2, i1) : ar2);
        t.a(1238, ar2);
        t.a(1239, ar2);
        t.a(1240, ar3);
        t.c(1419, ar2.c.getHeight());
        t.c(1422, ar2.c.getHeight());
        t.c(1423, ar2.c.getHeight());
        t.c(1424, ar3.c.getHeight());
        t.c(1420, ar3.c.getHeight());
        t.c(1421, ar1.c.getHeight());
        Vector vector;
        for(int j1 = x.c(vector = t.n(1234)); --j1 >= 0;)
            ((ad)vector.elementAt(j1)).u();

    }

    public static final ad c()
    {
        Vector vector;
        if((vector = t.n(1234)).isEmpty())
            return null;
        else
            return (ad)vector.lastElement();
    }

    public static final String d()
    {
        if(t.n(1234).size() > 0)
            return c().c();
        else
            return null;
    }

    public static final int e()
    {
        if(t.n(1234).size() > 0)
            return c().d();
        else
            return 200;
    }

    public static final av f()
    {
        if(t.n(1234).size() > 0)
            return c().e();
        else
            return null;
    }

    public static final av g()
    {
        if(t.n(1234).size() > 0)
            return c().f();
        else
            return null;
    }

    public static final int h()
    {
        return t.n(1234).size();
    }

    public static final void i()
    {
        ad ad1;
        if(!t.g(71) && null != (ad1 = c()))
            t.d().a(ad1.q, ad1.r);
    }

    public static final void a(ar ar1)
    {
        Vector vector;
        int i1;
        if((i1 = x.c(vector = t.n(1234))) > 0)
        {
            int j1;
            for(j1 = i1; --j1 >= 0;)
                if(((ad)vector.elementAt(j1)).e == 0)
                    break;

            int k1;
            int l1;
            ar1.b(0, 0, k1 = t.f(1509), l1 = t.f(1510));
            if(t.g(299))
            {
                b(ar1);
            } else
            {
                ar1.c(48);
                ar1.d(0, 0, k1, l1);
            }
            for(; j1 < i1; j1++)
            {
                boolean flag;
                if(flag = j1 == i1 - 1)
                    c(ar1);
                ((ad)vector.elementAt(j1)).a(ar1, flag);
                ar1.b(0, 0, k1, l1);
            }

        }
    }

    private static final void b(ar ar1)
    {
        int i1 = t.h();
        int j1 = t.f(1509);
        ar1.c(45);
        ar1.c(0, i1, j1, i1);
        ar1.c(46);
        ar1.c(0, i1 + 1, j1, i1 + 1);
        ar1.a(0, i1 + 2, j1, t.f(1510) - i1 - 2, ar.b(47), ar.b(48), false);
    }

    public static final void j()
    {
        Vector vector;
        int i1 = x.c(vector = t.n(1234)) - 1;
        ((ad)vector.elementAt(i1)).a();
        vector.removeElementAt(i1);
        x.b(vector);
    }

    public static final void a(ad ad1)
    {
        Vector vector;
        for(vector = t.n(1234); vector.size() > 0; bd.e());
        vector.addElement(ad1);
    }

    public static final void b(ad ad1)
    {
        int i1 = -1;
        ad ad3 = null;
        Vector vector;
        int k1;
        if((k1 = x.c(vector = t.n(1234)) - 1) >= 0)
            i1 = ((ad)vector.elementAt(k1)).a;
        if(i1 == 137 || i1 == 63)
            x.a(vector, ad3 = (ad)vector.elementAt(k1));
        if((i1 = ad1.a) != 112)
        {
            k1 = vector.size();
            for(int l1 = 0; l1 < k1; l1++)
                if(((ad)vector.elementAt(l1)).a == i1)
                    k1 = l1;

            for(; vector.size() > k1; bd.e());
        }
        if((1 << (k1 = ad1.d) & 0xd9c) != 0)
            ad1.g();
        int i2 = ad1.b;
        i1 = ad1.c;
        i2 = t.f(1509) - i2;
        int k2 = t.h() - i1;
        ad ad2;
        switch(k1)
        {
        case 5: // '\005'
        case 6: // '\006'
        case 9: // '\t'
        default:
            break;

        case 11: // '\013'
            ad1.d(i2 >> 1, t.h() - i1 - i1 / 10);
            break;

        case 10: // '\n'
            if((ad2 = c()) != null)
            {
                k1 = ad2.w();
                int j1 = ad2.x();
                if(k1 + ad1.b > t.f(1509))
                    k1 = t.f(1509) - ad1.b;
                if(j1 + ad1.c > t.h())
                    j1 = t.h() - ad1.c;
                ad1.d(k1, j1);
                break;
            }
            // fall through

        case 2: // '\002'
        case 7: // '\007'
        case 8: // '\b'
            ad1.d(i2 >> 1, k2 >> 1);
            break;

        case 3: // '\003'
            ad1.d(0, k2);
            break;

        case 4: // '\004'
            ad1.d(i2, k2);
            break;
        }
        k1 = vector.size();
        for(int j2 = 0; j2 < k1; j2++)
            if(((ad)vector.elementAt(j2)).d == 7)
                k1 = j2;

        for(; vector.size() > k1; bd.e());
        ad1.q();
        vector.addElement(ad1);
        if(ad3 != null)
            vector.addElement(ad3);
    }

    public static final void k()
    {
        a(b(3984));
    }

    public static final boolean a(int i1)
    {
        Vector vector;
        for(int j1 = x.c(vector = t.n(1234)); --j1 >= 0;)
            if(((ad)vector.elementAt(j1)).a == i1)
                return true;

        return false;
    }

    public static final boolean l()
    {
        Vector vector;
        int j1;
        for(int i1 = x.c(vector = t.n(1234)); --i1 >= 0;)
            if((j1 = ((ad)vector.elementAt(i1)).d) == 8 || j1 == 7)
                return true;

        return false;
    }

    public static final int m()
    {
        return x.b(0, t.f(1419) - 16 >> 1);
    }

    private static final void c(ar ar1)
    {
        if(t.g(66) && t.g(1516))
        {
            int i1;
            int ai[] = new int[i1 = t.f(1509)];
            for(int j1 = i1; --j1 >= 0;)
                ai[j1] = 0x78ffffff;

            ar1 = ar1.b;
            for(int k1 = t.h(); --k1 >= 0;)
                ar1.drawRGB(ai, 0, i1, 0, k1, i1, 1, true);

        }
    }

    public static final int n()
    {
        if(t.g(1524))
        {
            t.b(new Object());
            return 0;
        } else
        {
            return v.m(473);
        }
    }

    public static final ad b(int i1)
    {
        int j1 = i1;
        String s = x.h(t.c(t.f(i1++)));
        int l1 = t.f(i1++);
        int i2;
        boolean flag = ((i2 = t.f(i1++)) & 0x10) != 0;
        i2 &= 0xf;
        int j2 = t.f(i1++);
        int k2 = t.f(i1++);
        int l2 = t.f(i1++);
        int i3 = t.f(i1++);
        int j3 = t.f(i1++);
        int k3 = t.f(i1++);
        int l3 = t.f(i1++);
        ad ad1;
        int j4 = ((ad1 = t.f(1509)) * 9) / 10;
        int i4;
        int k4 = ((i4 = t.h()) * 9) / 10;
        switch(i2)
        {
        case 0: // '\0'
        case 1: // '\001'
            ad1 = new ad(0, l1, ad1, i4, true);
            break;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 10: // '\n'
        case 11: // '\013'
            ad1 = new ad(0, l1, j4, k4, true);
            break;

        case 5: // '\005'
        case 9: // '\t'
            ad1 = new ad(0, l1, ad1, i4, false);
            break;

        case 6: // '\006'
        case 12: // '\f'
            ad1 = new ad(1, l1, ad1, i4, true);
            break;

        case 7: // '\007'
        case 8: // '\b'
            ad1 = new ad(0, l1, j4, k4, false);
            break;

        default:
            ad1 = null;
            break;
        }
        if(ad1 != null)
            ad1.d = i2;
        if(i2 != 3 && i2 != 4 && i2 != 2 && i2 != 11 && i2 != 10 && i2 != 8)
            if(i2 != 7)
                ad1.a(j2, s);
            else
                ad1.a(av.c(s).g(s));
        ad1.s = flag;
        ad1.f = j1;
        for(int k1 = 0; k1 < l3; k1++)
            i1 = c(ad1, i1, l1);

        return ad1.a(k2 <= 0 ? null : t.c(k2), l2 <= 0 ? null : t.c(l2), i3, j3, k3);
    }

    public static final boolean a(int i1, int j1)
    {
        if(t.g(71) && j1 > t.h())
        {
            if(i1 < t.f(1509) >> 1)
                bd.c();
            else
                bd.d();
            return true;
        } else
        {
            return false;
        }
    }

    public static final ad c(int i1)
    {
        (i1 = new ad(0, i1, (t.f(1509) * 9) / 10, (t.h() * 9) / 10, true)).d = 2;
        i1.s = true;
        return i1;
    }

    public static final boolean o()
    {
        Vector vector;
        for(int i1 = (vector = t.n(1234)).size(); --i1 > 0;)
            if(((ad)vector.elementAt(i1)).d != 1 && ((ad)vector.elementAt(i1)).e == 0)
                return true;

        return false;
    }

    private static final int a(ad ad1, int i1, boolean flag, boolean flag1)
    {
        if(flag1)
            flag = t.g(t.f(i1++));
        flag1 = t.f(i1++);
        int j1 = t.f(i1++);
        int k1 = t.f(i1++);
        if(!flag)
            ad1.a(j1, k1, flag1);
        else
            ad1.b(j1, k1, flag1);
        return i1;
    }

    private static final int a(ad ad1, int i1)
    {
        String s;
        av av1 = av.e().a(bh.b(bh.r().append(s = x.h(t.c(t.f(i1++)))).append(' ')), 0, 0);
        if(!ab.a(s = x.h(t.c(t.f(i1++)))))
            av1.a(s, 0, 6);
        ad1.a(av1);
        return i1;
    }

    private static final int b(ad ad1, int i1)
    {
        ad1.a(av.a(x.h(t.c(t.f(i1++))), t.g(t.f(i1++))));
        return i1;
    }

    private static final int c(ad ad1, int i1)
    {
        String s = x.h(t.c(t.f(i1++)));
        ad1.a(av.b(x.b(x.h(t.c(t.f(i1++))), '\0'), t.f(t.f(i1++)), s));
        return i1;
    }

    private static final int d(ad ad1, int i1)
    {
        av av1 = av.e();
        String s = x.h(t.c(t.f(i1++)));
        int j1 = ad1.d;
        ad1.a(j1 != 2 && j1 != 3 && j1 != 4 && j1 != 10 && j1 != 11 && j1 != 8 && j1 != 7 ? av1.a(s, 1, 0) : av1.b(0).g(s));
        return i1;
    }

    private static final int a(ad ad1, int i1, int j1)
    {
        j1 = ((int) (j1 != 49 ? ((int) (x.h(t.c(t.f(i1++))))) : ((int) (t.d(i1++)))));
        int k1 = t.f(i1++);
        String s = x.h(t.c(t.f(i1++)));
        int l1;
        String s1;
        if((l1 = t.f(i1++)) == 2)
            s1 = x.e(t.f(t.f(i1++)));
        else
            s1 = x.h(x.h(t.c(t.f(i1++))));
        ad1.a(av.a(j1, s1, k1, l1, s));
        return i1;
    }

    private static final int e(ad ad1, int i1)
    {
        av av1 = av.e();
        String s = x.h(t.c(t.f(i1++)));
        int j1 = ad1.d;
        ad1.a(j1 == 8 || j1 == 7 ? av1.g(s) : av1.h(s));
        return i1;
    }

    private static final int a(ad ad1, int i1, boolean flag)
    {
        return a(t.g(t.f(i1++)), ad1, i1, flag);
    }

    private static final int b(ad ad1, int i1, boolean flag)
    {
        return a(!t.g(t.f(i1++)), ad1, i1, flag);
    }

    private static final int a(boolean flag, ad ad1, int i1, boolean flag1)
    {
        int j1 = t.f(i1++);
        int k1 = t.f(i1++);
        int l1 = t.f(i1++);
        if(flag)
            if(!flag1)
                ad1.a(k1, l1, j1);
            else
                ad1.b(k1, l1, j1);
        return i1;
    }

    private static final int f(ad ad1, int i1)
    {
        ad1.a(av.a(x.h(t.c(t.f(i1++))), x.h(t.c(t.f(i1++))), x.h(t.c(t.f(i1++)))));
        return i1;
    }

    private static final int g(ad ad1, int i1)
    {
        ad1.a(av.f(x.h(t.c(t.f(i1)))));
        return i1 + 1;
    }

    private static final int h(ad ad1, int i1)
    {
        ad1.a(av.a(new ar((Image)t.m(t.f(i1)))));
        return i1 + 1;
    }

    private static final int b(ad ad1, int i1, int j1)
    {
        c(ad1, t.f(i1), j1);
        return i1 + 1;
    }

    private static final int c(ad ad1, int i1, int j1)
    {
        int k1;
        boolean flag = ((k1 = t.f(i1++)) & 0x40) != 0;
        boolean flag1 = (k1 & 0x20) != 0;
        switch(k1 & 0x1f)
        {
        case 0: // '\0'
            return a(ad1, i1, flag, flag1);

        case 1: // '\001'
            return a(ad1, i1);

        case 2: // '\002'
            return b(ad1, i1);

        case 3: // '\003'
            return c(ad1, i1);

        case 4: // '\004'
            return d(ad1, i1);

        case 5: // '\005'
            return a(ad1, i1, j1);

        case 6: // '\006'
            return e(ad1, i1);

        case 7: // '\007'
            return a(ad1, i1, flag);

        case 8: // '\b'
            return b(ad1, i1, flag);

        case 9: // '\t'
            return f(ad1, i1);

        case 10: // '\n'
            return g(ad1, i1);

        case 11: // '\013'
            return h(ad1, i1);

        case 12: // '\f'
            return i1 + t.f(i1);

        case 15: // '\017'
            return i(ad1, i1);

        case 13: // '\r'
        case 14: // '\016'
        default:
            return b(ad1, i1, j1);
        }
    }

    private static int i(ad ad1, int i1)
    {
        int j1 = t.f(i1++);
        int k1 = t.f(i1++);
        int l1 = t.f(i1++);
        int i2 = t.f(i1++);
        int j2 = t.f(t.f(i1++));
        ad1.a(k1, l1, i2, j2, j1);
        ((av)ad1.j.lastElement()).h = true;
        return i1;
    }
}