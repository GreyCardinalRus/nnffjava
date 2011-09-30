// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:06:46
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.lcdui.*;
import javax.microedition.media.*;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.rms.RecordStore;

public final class a extends az
{

    public a(int i1, String s1, String s2)
    {
        super(i1, s1, s2);
        super.c = t.c(0x151b2b);
        super.d = 5222;
    }

    public final int a()
    {
        return 4;
    }

    public a(s s1)
    {
        super(s1);
        super.c = t.c(0x151b2b);
        super.d = 5222;
    }

    public final int b()
    {
        int i1;
        int j1;
        if((j1 = (i1 = super.b()) & 0xffff) >= 381 && j1 <= 384)
            return i1 + 18;
        else
            return i1;
    }

    public final String c()
    {
        return t.c(0x101b30);
    }

    public final int y_()
    {
        return 0xb1b20;
    }

    public final void a(ao ao1)
    {
        Object obj = (ao1 = ab.a(ao1.c)).substring(3, ao1.indexOf(','));
        ao1 = ao1.substring(4 + ao1.indexOf("key="));
        Object obj1 = obj;
        ((s) (obj = (new s()).f(((String) (obj1))))).S();
        ((s) (obj)).j((new s()).f(((String) (obj1 = super.i))).T());
        obj.b = 4;
        s s1 = ((s) (obj)).J();
        ((s) (obj)).f(aa());
        obj = ((s) (obj)).E();
        s1.d(((s) (obj)));
        obj1 = ao1;
        (ao1 = (new s()).f(((String) (obj1)))).S();
        ao1.j(s1);
        obj1 = aa();
        ao1 = (new s()).f(((String) (obj1))).i(ao1).e();
        b(ao.a(0x40814).h(0x201a13).a(0x91855, t.c(0xf1b40)).a(ao1));
    }

    public static final int a(ba ba1)
    {
        int i1;
        if((i1 = x.c(ba1 = ba1.j_())) > 0)
        {
            StringBuffer stringbuffer = bh.r();
            for(int j1 = 0; j1 < i1; j1++)
                stringbuffer.append(((e)ba1.elementAt(j1)).c).append('\0');

            t.a(1285, stringbuffer);
            t.a(1286, ba1);
            t.c(1481, 0);
        }
        return i1;
    }

    public static final void e()
    {
        Object obj;
        ba ba1;
        if(a(ba1 = ((bc) (obj = (bc)t.m(1281))).d()) == 0)
        {
            bh.a(734);
            return;
        }
        if(t.g(1482))
        {
            t.a(1284, 335);
            t.c(1482, 0);
        } else
        {
            t.a(1284, 732);
        }
        if(ba1.a() == 1)
        {
            t.a(1282, ((bc) (obj)).k());
            t.a(1283, ((bc) (obj)).m());
            aw.b(aw.b(3866));
            return;
        }
        if(((bi)ba1).a)
        {
            t.c(1483, 1);
            t.c(3843, 5);
        } else
        {
            t.c(1483, 0);
            t.c(3843, 4);
        }
        t.a(1282, ((bc) (obj)).l());
        t.a(1283, ((bc) (obj)).n());
        if(x.r(((String) (obj = t.c(1282)))))
        {
            t.c(3845, 0x807b5);
            t.c(1483, 0);
            t.c(3843, 4);
        } else
        {
            t.c(3845, 0x707bd);
        }
        t.a(1287, x.s(((String) (obj))));
        aw.b(aw.b(3834));
    }

    public static final int f()
    {
        ay.G();
        int i1;
        if(0 != (i1 = ((bc)t.m(1281)).d().a(x.h(t.c(1282)), x.h(t.c(1283)), x.h(t.c(1284)), (e)t.n(1286).elementAt(t.f(1481)), t.g(1483))))
            return v.m(i1);
        else
            return 0;
    }

    public static final void g()
    {
        t.h(1281);
        t.b(1282, 1286);
    }

    public static final void h()
    {
        ad ad1 = aw.c(3);
        ba ba1;
        switch((ba1 = t.m()).a())
        {
        case 0: // '\0'
            a(ad1);
            break;

        case 1: // '\001'
            a((ax)ba1, ad1);
            break;

        default:
            a((az)ba1, ad1);
            break;
        }
        aw.b(ad1.a(t.c(1017), t.c(1019), 199, 12, 199));
    }

    public static final int a(int i1)
    {
        ba ba1;
        switch((ba1 = t.m()).a())
        {
        case 0: // '\0'
            return a((bi)ba1, i1);

        case 1: // '\001'
            return c((ax)ba1, i1);
        }
        return a((az)ba1, i1);
    }

    private static final void a(ax ax1, ad ad1)
    {
        ad1.a(ad1 = ax1.h(), 634, 0).a(ad1 | 0xfa0000, 635, 1).a(ad1 | 0xfb0000, 637, 3).a(ad1 | 0xf90000, 636, 4).a(ad1 | 0xfd0000, 640, 5).a(ad1 | 0xfe0000, 646, 6).a(ad1 | 0x1040000, 641, 7).a(ad1 | 0x1030000, 642, 8).a(ad1 | 0x1020000, 643, 9).a(ad1 | 0x1010000, 644, 10).a(ad1 | 0x1050000, 645, 11).a(ad1 | 0xfc0000, 638, 2).a(255, 639, 12).b(ax1.k_(), 647, 14).b(-1, 710, 13);
    }

    private static final int c(ax ax1, int i1)
    {
        if(i1 == 13)
            return 17;
        if(i1 == 14)
            return 109;
        if(i1 == 12)
            if(0 != (ax1 = ax1.p()))
                return v.m(ax1);
            else
                return 4;
        if(0 != (ax1 = ax1.c((new int[] {
    0, 32, 256, 2, 1, 4, 16, 24576, 20480, 16384, 
    12288, 8193
})[i1])))
            return v.m(ax1);
        else
            return 4;
    }

    private static final void a(ad ad1)
    {
        ad1.a(156, 634, 0).a(159, 635, 1).a(157, 636, 2).a(160, 637, 3).a(158, 638, 4).a(155, 639, 5).b(-1, 710, 6);
    }

    private static final int a(bi bi1, int i1)
    {
        if(i1 == 6)
            return 17;
        if(i1 == 5)
            if(0 != (bi1 = bi1.p()))
                return v.m(bi1);
            else
                return 4;
        if(0 != (bi1 = bi1.c(x.a(1, 260, 2, 516, 3)[i1])))
            return v.m(bi1);
        else
            return 4;
    }

    private static final void a(az az1, ad ad1)
    {
        if(az1.c_())
        {
            ad1.a(387, 634, 1).a(385, 639, 0);
            return;
        } else
        {
            ad1.a(383, 634, 1).a(0xfa017f, 635, 4).a(0xf9017f, 636, 2).a(0xfb017f, 637, 5).a(0xfd017f, 640, 6).a(0xfc017f, 638, 3).a(381, 639, 0);
            return;
        }
    }

    private static final int a(az az1, int i1)
    {
        if(i1 == 0)
        {
            if(0 != (az1 = az1.p()))
                return v.m(az1);
        } else
        if(0 != (az1 = az1.h(i1)))
            return v.m(az1);
        return 4;
    }

    private static final int ar()
    {
        ba ba1;
        if(null != (ba1 = t.m()))
            return ba1.a();
        else
            return t.f(1446);
    }

    public static final void a_()
    {
        if(ar() == 1)
        {
            z.F();
            return;
        }
        if(ar() == 2)
        {
            as();
            return;
        }
        if(ar() == 3)
        {
            v.T();
            return;
        }
        if(ar() == 4)
        {
            v.R();
            return;
        }
        k();
        t.c(1445, 0);
        Object obj;
        if(null != (obj = t.m()))
        {
            t.a(1255, ((ba) (obj)).j);
            obj = ((ba) (obj)).i;
            Vector vector;
            int i1 = (vector = x.b(t.c(0x220756), '\0')).size();
            for(int j1 = 0; j1 <= i1; j1++)
            {
                if(j1 == i1)
                {
                    t.a(1254, ((String) (obj)));
                    break;
                }
                int k1;
                if((k1 = ((String) (obj)).indexOf((String)vector.elementAt(j1))) < 0)
                    continue;
                t.c(1445, j1);
                t.a(1254, ab.b(((String) (obj)), k1));
                break;
            }

        }
        aw.b(aw.b(2722));
    }

    public static final int j()
    {
        ay.G();
        if(ar() == 1)
            return z.G();
        if(ar() == 2)
            return b(2);
        if(ar() == 3)
            return v.U();
        if(ar() == 4)
            return v.S();
        String s1 = x.h(t.c(1255));
        String s2;
        if(ab.a(s2 = l()))
            return v.m(305);
        if(!a(s2) && !k(s2))
            s2 = ab.b(s2, x.d(0x220756, t.f(1445)));
        if(!b(s2))
            return v.m(568);
        int i1;
        if(0 != (i1 = bb.a(0, t.m(), s2, s1)))
        {
            return v.m(i1);
        } else
        {
            z.a(bb.a(0, s2));
            return 0;
        }
    }

    public static final void k()
    {
        t.b(1254, 1255);
        t.h(1259);
    }

    public static final boolean a(String s1)
    {
        v.b();
        return e(s1, 0x220756);
    }

    private static final boolean k(String s1)
    {
        v.b();
        return e(s1, 0x330778);
    }

    private static final boolean e(String s1, int i1)
    {
        v.b();
        for(int j1 = (i1 = x.b(t.c(i1), '\0')).size(); --j1 >= 0;)
            if(s1.indexOf((String)i1.elementAt(j1)) >= 0)
                return true;

        bh.a(i1);
        return false;
    }

    public static final String l()
    {
        return ab.e(x.h(t.c(1254)).toLowerCase());
    }

    public static final boolean b(String s1)
    {
        v.b();
        char c1;
        for(int i1 = s1.length(); --i1 >= 0;)
            if(((c1 = s1.charAt(i1)) < 'A' || c1 > 'Z') && (c1 < 'a' || c1 > 'z') && (c1 < '0' || c1 > '9') && c1 != '.' && c1 != '_' && c1 != '-' && c1 != '@')
                return false;

        return true;
    }

    private static void as()
    {
        az az1;
        if((az1 = (az)t.m()) != null && az1.R())
        {
            v.n(304);
            return;
        }
        k();
        at();
        t.c(1445, 0);
        if(az1 != null)
        {
            String s1 = ((ba) (az1)).i;
            Vector vector;
            int i1;
            int j1;
            for(i1 = x.c(vector = x.b(t.c(685), '\0')); --i1 > 0;)
                if((j1 = s1.indexOf((String)vector.elementAt(i1))) >= 0)
                {
                    s1 = ab.b(s1, j1);
                    break;
                }

            if(i1 == 1)
                au();
            t.c(1445, i1);
            t.a(1254, s1);
            t.a(1255, ((ba) (az1)).j);
            t.a(1259, ((ba) (az1)).F);
        } else
        if(t.g(1442))
            au();
        aw.b(aw.b(3372));
    }

    private static final void at()
    {
        t.c(3372, 686);
        t.c(3384, 3);
        t.c(3385, 665);
    }

    private static final void au()
    {
        t.c(3372, 690);
        t.c(3384, 12);
        t.c(3385, 3);
        t.c(1445, 1);
    }

    public static final int b(int i1)
    {
        String s2 = x.h(t.c(1255));
        String s1;
        if(ab.a(s1 = l()))
            return v.m(305);
        int k1;
        if((k1 = t.f(1445)) != 0 && ab.d(s1) < 0)
            s1 = ab.b(s1, x.b(t.c(685), '\0').elementAt(k1));
        if(i1 == 2 && ab.d(s1) < 0)
            return v.m(689);
        int j1;
        if(0 != (j1 = bb.a(i1, t.m(), s1, s2)))
        {
            return v.m(j1);
        } else
        {
            z.a(bb.a(i1, s1).f(x.h(t.c(1259))));
            return 0;
        }
    }

    public static final int m()
    {
        t.h(1275);
        t.h(1241);
        t.h(1276);
        return 65;
    }

    public static final void n()
    {
        Vector vector;
        int i1;
        if((i1 = x.c(vector = x.b(t.l().f, ','))) != 0)
        {
            StringBuffer stringbuffer = bh.r();
            for(int j1 = 0; j1 < i1; j1++)
                stringbuffer.append(x.j(x.a(vector, j1))).append('\0');

            t.a(1275, stringbuffer);
            t.c(1465, 0);
            aw.b(aw.b(3572));
            return;
        } else
        {
            v.n(705);
            return;
        }
    }

    public static final int o()
    {
        ay.G();
        t.a(1276, x.b(t.l().f, ',').elementAt(t.f(1465)));
        return 0;
    }

    public static final int b_()
    {
        TextBox textbox;
        if(v.b(9, 3000L) && (textbox = ay.j()) != null)
        {
            String s1 = ab.a(textbox);
            String s2;
            int i1;
            if(t.g(106))
            {
                if(!ab.a(s2 = ay.i(s1), s1))
                    textbox.setString(s2);
            } else
            if((i1 = l(s1)) > 0)
                textbox.setString(ab.b(s1, s1.length() - i1));
        }
        return 0;
    }

    private static final int l(String s1)
    {
        v.b();
        int i1;
        for(int j1 = i1 = s1.length(); --j1 >= 0;)
            if((s1.charAt(j1) & 0xffffff80) != 0)
                return i1 - 39;

        return i1 - 120;
    }

    public static final void q()
    {
        t.c(3652, 0);
        be be1;
        if((be1 = t.k()).p())
        {
            t.c(3730, 92);
            t.c(3731, 3);
            aw.b(aw.b(3729));
            return;
        } else
        {
            k(be1);
            boolean flag;
            t.a(1467, flag = be1 instanceof n);
            boolean flag1 = flag && be1.m_();
            t.a(1468, flag1);
            boolean flag2 = (be1 instanceof j) && ((j)be1).l();
            t.a(1478, flag2);
            t.a(1477, flag1 || flag2);
            t.a(1469, flag && !flag1);
            t.a(1470, be1.s_());
            t.a(1471, be1.j() && !be1.s_());
            t.a(1473, flag && !flag1 && ((n)be1).t());
            t.c(3651, 3);
            t.c(3650, 92);
            aw.b(aw.b(3649));
            return;
        }
    }

    public static final int a(String s1, int i1)
    {
        t.h(1243);
        be be1 = t.k();
        if(i1 == 63)
        {
            if(!be1.i.S())
                return v.m(303);
            if(be1.V())
                return v.m(546);
        }
        if(i1 == 54 || i1 == 63 || i1 == 85)
            bd.e();
        if(ab.a(709, s1))
            if(0 != (s1 = ((n)be1).n()))
                return v.m(s1);
            else
                return i1;
        if(i1 == 65)
        {
            bd.e();
            return m();
        }
        if(i1 == 66)
        {
            if(be1 instanceof ab)
                return ((ab)be1).a(40);
            t.a(1281, new bc(be1));
        } else
        if(i1 == 54)
        {
            t.d(be1.i);
            s1 = null;
            m.a((String)z.h(((n)be1).d).elementAt(0), null, null, null);
        } else
        if(i1 == 6)
        {
            (s1 = (al)be1).d();
            ay.a(s1);
        }
        return i1;
    }

    private static void k(be be1)
    {
        t.a(1476, (be1 instanceof ab) && !((az)be1.i).c_());
    }

    public static final void r()
    {
        t.c(3652, 1);
        Object obj;
        if((obj = t.b[1324]) instanceof e)
            if(((e)obj).a())
            {
                return;
            } else
            {
                t.c(1466, 1);
                aw.b(aw.b(3631));
                return;
            }
        if(((be) (obj = (be)obj)).p())
        {
            t.c(3730, 30);
            t.c(3731, 4);
            aw.b(aw.b(3729));
            return;
        } else
        {
            k(((be) (obj)));
            t.c(1466, 0);
            boolean flag;
            t.a(1467, flag = obj instanceof n);
            boolean flag1 = flag && ((be) (obj)).m_();
            t.a(1468, flag1);
            boolean flag2 = (obj instanceof j) && ((j)obj).l();
            t.a(1478, flag2);
            t.a(1477, flag1 || flag2);
            t.a(1469, flag && !flag1);
            t.a(1470, ((be) (obj)).s_());
            t.a(1471, ((be) (obj)).j() && !((be) (obj)).s_());
            t.a(1473, flag && !flag1 && ((n)obj).t());
            t.c(3651, 4);
            t.c(3650, 30);
            aw.b(aw.b(3649));
            return;
        }
    }

    public static final int b(String s1, int i1)
    {
        t.h(1243);
        Object obj = t.b[1324];
        if(i1 == 63)
        {
            if(!((be)obj).i.S())
                return v.m(303);
            if(((be)obj).V())
                return v.m(546);
        }
        if(i1 == 40 || i1 == 63 || i1 == 85)
        {
            bd.e();
            if(i1 != 85)
                z.p();
        }
        if(ab.a(709, s1))
            if(0 != (s1 = ((n)obj).n()))
                return v.m(s1);
            else
                return 40;
        if(i1 == 65)
        {
            bd.e();
            z.p();
            return m();
        }
        if(i1 == 66)
        {
            if(obj instanceof ab)
                return ((ab)obj).a(4);
            t.a(1281, new bc((be)obj));
        } else
        if(i1 == 54)
        {
            t.d(((be) ((n)obj)).i);
            s1 = null;
            m.a((String)z.h(((n)obj).d).elementAt(0), null, null, null);
        } else
        if(i1 == 6)
        {
            (s1 = (al)obj).d();
            ay.a(s1);
            z.a(true, false, !t.g(276));
            t.c(281, 1);
        }
        return i1;
    }

    public static final s a(ax ax1)
    {
        ax1.c = 0;
        return ax1.a(((Object) (x.a(v.a(ax1, 4868, null), z.i(6)))));
    }

    public static final boolean a(ax ax1, s s1, int i1)
    {
        i1 = (i1 & 1) != 0 ? 0 : 1;
        s1.g(1);
        Vector vector = bh.q();
        int j1 = s1.x();
        for(int k1 = 0; k1 < j1; k1++)
        {
            String s2 = s1.D();
            int i2 = s1.x();
            int l2 = s1.x();
            int i3 = s1.x();
            int k3 = s1.x();
            switch(i3)
            {
            case 0: // '\0'
                String s3 = s2;
                boolean flag = false;
                int i4;
                for(; k3 > 0; k3 -= i4 + 4)
                {
                    int l3 = s1.x();
                    i4 = s1.n(0);
                    if(l3 == 305)
                    {
                        s3 = s1.D();
                    } else
                    {
                        if(l3 == 102)
                            flag = true;
                        s1.g(i4 + 2);
                    }
                }

                vector.addElement(new j(ax1, l2, i2, s2, s3, flag));
                break;

            case 1: // '\001'
                if(i2 != 0)
                    ((ba) (ax1)).g.addElement(new ap(ax1, i2, s2));
                s1.g(k3);
                break;

            case 2: // '\002'
                ax1.a(s2, l2);
                s1.g(k3);
                break;

            case 3: // '\003'
                ax1.b(s2, l2);
                s1.g(k3);
                break;

            case 4: // '\004'
                int j3;
                for(; k3 > 0; k3 -= j3 + 4)
                {
                    if(s1.x() == 202)
                        ax1.d = l2;
                    s1.g(j3 = s1.x());
                }

                break;

            case 14: // '\016'
                ax1.c(s2, l2);
                s1.g(k3);
                break;

            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            default:
                s1.g(k3);
                break;
            }
        }

        ax1.c = j1;
        j j2;
        ap ap1;
        for(int l1 = vector.size(); --l1 >= 0;)
            if(null != (ap1 = ax1.b((j2 = (j)vector.elementAt(l1)).b)))
                ap1.b(j2);

        if(i1 != 0)
        {
            ax1.d(b(ax1));
            int k2;
            if((k2 = ax1.d) != 0)
                ax1.d(b(ax1, k2));
            ax1.d(v.f(ax1));
            ax1.d(bh.a(ax1));
            ax1.q();
            if(((ba) (ax1)).g.size() == 0)
                ax1.d(z.a(ax1, t.c(0x70349)));
            ax1.o = 100;
            ax1.p = 100;
        }
        bh.a(vector);
        bh.m();
        return i1;
    }

    private static final s b(ax ax1)
    {
        return v.a(ax1, 4871, null);
    }

    public static final boolean a(ax ax1, int i1)
    {
        if(i1 == 0)
            ax1.c(v.c(ax1));
        else
            bh.c(i1);
        return true;
    }

    public static final s b(ax ax1, int i1)
    {
        return ax1.a(((Object) (x.a(v.a(ax1, 4873, (new s()).r(0).o(i1).o(4).o(5).o(202).o(1).f(ax1.r())), z.i(20)))));
    }

    public static final boolean c(int i1)
    {
        if(i1 != 0)
            bh.c(i1);
        return true;
    }

    public static final void a(az az1)
    {
        az1 = ((ba) (az1)).j;
        v.i();
        new f(30, ((Object) (x.a(az1, (new s()).c(0x241b63).c(0x3a1b87).f(((ba) (az1)).G).c(0x141b4f).f(ay.d(az1)).l(), z.h[0]))));
    }

    public static final void a(Object aobj[])
    {
        w w1 = null;
        v.bS();
        Object obj = aobj[1];
        v.i();
        int i1;
        if((i1 = (w1 = w.a((String)obj, (ba)aobj[0], 0)).b()) == 200)
        {
            i1 = x.b((new s(w1)).d(), '\n');
            Object obj1 = aobj[2];
            v.i();
            if(((Integer)obj1).intValue() == 0)
                a(aobj, i1);
            else
                a(aobj, i1.elementAt(0));
            bh.a(i1);
        } else
        if(i1 == 403)
            ((az)aobj[0]).ab();
        else
            throw new Throwable(ab.e(Integer.toString(i1)));
        w w2 = w1;
        try
        {
            w2.a();
        }
        catch(Throwable _ex) { }
        v.bT();
        return;
        Throwable throwable;
        throwable;
        a(aobj, throwable);
        w w3 = w1;
        try
        {
            w3.a();
        }
        catch(Throwable _ex) { }
        v.bT();
        return;
        Exception exception;
        exception;
        w w4 = w1;
        try
        {
            w4.a();
        }
        catch(Throwable _ex) { }
        v.bT();
        throw exception;
    }

    private static final void a(Object aobj[], Vector vector)
    {
        aobj[2] = z.i(1);
        aobj[1] = (new s()).c(0x241b63).c(0x291bc1).b(vector.elementAt(0)).f(38).b(vector.elementAt(1)).l();
        new f(30, ((Object) (aobj)));
    }

    private static final void a(Object aobj[], Object obj)
    {
        ((az)aobj[0]).e = obj;
    }

    public static final Object[] b(az az1)
    {
        if(ab.d(((ba) (az1)).i) <= 0)
        {
            ((ah)az1).f = ((ba) (az1)).i;
            return null;
        } else
        {
            String s1;
            new f(34, az1 = ((az) (x.a(az1, s1 = ab.b(x.f(), 16), (new s()).c(0x501c5b).f(s1).l(), z.h[0], ((ba) (az1)).i, az1.aa()))));
            return az1;
        }
    }

    public static final void b(Object aobj[])
    {
        w w1 = null;
        int i1;
        v.bS();
        Object obj = aobj[2];
        v.i();
        if((i1 = (w1 = w.a((String)obj, (ba)aobj[0], 0)).b()) != 200)
            break MISSING_BLOCK_LABEL_101;
        i1 = (new s(w1)).O();
        obj = aobj[3];
        v.i();
        if(((Integer)obj).intValue() == 0)
            a(aobj, i1);
        else
            b(aobj, i1);
        w w2 = w1;
        try
        {
            w2.a();
        }
        catch(Throwable _ex) { }
        v.bT();
        return;
        throw new Throwable(ab.e(Integer.toString(i1)));
        Throwable throwable;
        throwable;
        a(aobj, throwable);
        w w3 = w1;
        try
        {
            w3.a();
        }
        catch(Throwable _ex) { }
        v.bT();
        return;
        Exception exception;
        exception;
        w w4 = w1;
        try
        {
            w4.a();
        }
        catch(Throwable _ex) { }
        v.bT();
        throw exception;
    }

    private static final void a(Object aobj[], Throwable throwable)
    {
        ((az)aobj[0]).a(throwable);
    }

    private static final void a(Object aobj[], ao ao1)
    {
        ao1 = ((ao) (aobj[5]));
        v.i();
        aobj[2] = (new s()).c(0x3e1c5b).c(0x141cab).b(aobj[1]).c(0x7173e).b(aobj[4]).c(0x81cbf).f((new s()).c(0x321c29).f(58).b(aobj[1]).f(58).f(ab.a(ao1.f(0x50a7f).c)).f(58).f((new s()).b(aobj[4]).c(0x81cc7).e((String)ao1).E().M()).E().M()).l();
        aobj[3] = z.i(1);
        new f(34, ((Object) (aobj)));
    }

    private static final void b(Object aobj[], ao ao1)
    {
        aobj = (ah)aobj[0];
        if(ab.a(0x51ad2, ao1.a))
        {
            ((ba) (aobj)).ab();
            return;
        } else
        {
            aobj.f = ab.b(0x20206, ab.a(ao1.f(0x20206).c));
            return;
        }
    }

    public static final void s()
    {
        t.a(1209, bh.q());
        av();
    }

    public static final void b(ba ba1)
    {
        Vector vector;
        if(!(vector = t.n(1209)).contains(ba1))
        {
            vector.addElement(ba1);
            av();
        }
    }

    public static final void c(ba ba1)
    {
        Vector vector;
        if((vector = t.n(1209)).contains(ba1))
        {
            x.a(vector, ba1);
            av();
        }
    }

    public static final void a(ar ar1)
    {
        int i1;
        if((i1 = t.f(1377)) > 0)
        {
            ar1.a(t.l(0));
            int k1 = t.h() - 1;
            int j1;
            ar1.b(0, k1 - i1 - 1, j1 = t.f(1509), i1 + 1);
            ar1.c(13);
            ar1.d(0, k1 - i1 - 1, j1, i1 + 1);
            ar1.b(1, k1 - i1, j1 - 2, i1);
            ar1.c(1);
            ar1.d(0, 0, 2048, 2048);
            i1 = x.b(t.f(1419), 16);
            Vector vector;
            for(int l1 = x.c(vector = t.n(1209)); --l1 >= 0;)
            {
                a(ar1, ba.a(vector, l1), k1);
                k1 -= i1;
            }

        }
    }

    private static final void a(ar ar1, ba ba1, int i1)
    {
        int j1;
        int k1 = x.b(j1 = t.f(1419), 16);
        ar1.c(12);
        ar1.d(1, j1 = i1 - j1, ((t.f(1509) - 2) * ba1.p) / 100, k1);
        ar1.a(ba1.b(), 3, j1 + aw.m());
        ar1.c(0);
        ar1.a(bh.b(bh.r().append(ar1 = ba1.Q()).append(' ').append(ba1.p).append('%')), 21, i1, 36);
    }

    private static final void av()
    {
        t.c(1377, t.n(1209).size() * x.b(16, t.f(1419)));
        bf.c = true;
    }

    public static final void t()
    {
        int i1 = 3072;
        if(bb.f().size() > 0)
            i1 = 11264;
        al al1;
        if((al1 = a == null ? (a = o.e) : a) != null && al1.u_())
            switch(al1.t_())
            {
            case 3: // '\003'
                i1 = 4384;
                break;

            case 4: // '\004'
                i1 |= 3;
                break;

            case 5: // '\005'
                i1 = 128;
                break;

            case 6: // '\006'
                i1 = 2064;
                break;

            case 7: // '\007'
                i1 = 64;
                break;

            case 8: // '\b'
                i1 = 4640;
                break;

            case 10: // '\n'
                i1 &= 0xfffffbff;
                break;
            }
        if(!t.g(277))
            i1 &= 0xfffffbff;
        int j1 = 1393;
        for(int k1 = 1; k1 < 16384; k1 <<= 1)
            t.c(j1++, i1 & k1);

        aw.b(aw.b(1736));
    }

    public static final int a_(int i1)
    {
        Object obj;
        int j1 = (obj = a) != null ? ((al) (obj)).t_() : 0;
        switch(i1)
        {
        case 8: // '\b'
        case 9: // '\t'
        default:
            break;

        case 0: // '\0'
            t.c(obj);
            bd.e();
            return 63;

        case 1: // '\001'
            if(j1 == 8)
            {
                t.c(4822, 0);
                z.a(null, ((af)obj).a);
            } else
            {
                t.c(a);
            }
            bd.e();
            return 102;

        case 2: // '\002'
            if(j1 == 3)
            {
                t.c(a);
                bd.e();
                return 85;
            }
            t.c(null);
            if(x.c(i1 = bb.f()) > 0)
            {
                i1 = (bi)i1.firstElement();
                obj = (af)obj;
                String _tmp = ((af) (obj)).b;
                obj = new ak(((af) (obj)).a, 1);
                i1.a(((ak) (obj)));
                bd.e();
                return 85;
            } else
            {
                return v.m(424);
            }

        case 3: // '\003'
            if((i1 = bb.f()) != null && i1.size() > 0)
            {
                i1 = (bi)i1.firstElement();
                obj = (af)obj;
                String _tmp1 = ((af) (obj)).b;
                obj = new ak(((af) (obj)).a, 2);
                i1.a(((ak) (obj)));
                bd.e();
            } else
            {
                return v.m(424);
            }
            break;

        case 4: // '\004'
            bd.e();
            return z.a((ac)obj);

        case 5: // '\005'
            z.a(l.a((i)obj, 0), (i)obj, 0);
            return 12;

        case 6: // '\006'
            t.d(obj);
            bd.e();
            return 167;

        case 7: // '\007'
            t.d(obj);
            bd.e();
            return 151;

        case 10: // '\n'
            m.v();
            break;

        case 11: // '\013'
            m.w();
            break;

        case 12: // '\f'
            p.c();
            o.c = true;
            break;

        case 13: // '\r'
            o.w();
            o.c = true;
            break;

        case 14: // '\016'
            m.t();
            if(!p.f())
            {
                t.c(1411, 1);
                return 158;
            }
            break;

        case 15: // '\017'
            m.u();
            if(!p.e())
            {
                t.c(1411, 0);
                return 158;
            }
            break;

        case 16: // '\020'
            return 159;

        case 17: // '\021'
            return 114;

        case 18: // '\022'
            bd.e();
            if((i1 = bb.f()).size() > 1)
            {
                return 172;
            } else
            {
                t.d(i1.elementAt(0));
                return 173;
            }

        case 19: // '\023'
            return 110;

        case 20: // '\024'
            m.a((m)a);
            break;

        case 21: // '\025'
            m.q();
            break;

        case 22: // '\026'
            m.r();
            break;
        }
        return 6;
    }

    public static final void a(String s1, String s2, String s3, String s4)
    {
        v.b();
        v.b();
        v.b();
        v.b();
        new f(17, (new s()).c(0x160677).c(0x1006a1).w(0x3d613f).f(s1).w(0x3d6226).f(s2).c(0x706d3).c(0x706cc).f(ay.d(s3)).f(s4).d());
    }

    public static final void a(Object obj)
    {
        w w1;
        v.i();
        if(!(obj instanceof String))
            break MISSING_BLOCK_LABEL_101;
        w1 = null;
        v.bS();
        if((w1 = w.a(obj, null, 3)).b() == 200)
            e(new s(w1));
        else
            throw new Throwable();
        w w2 = w1;
        try
        {
            w2.a();
        }
        catch(Throwable _ex) { }
        v.bT();
        return;
        b();
        w w3 = w1;
        try
        {
            w3.a();
        }
        catch(Throwable _ex) { }
        v.bT();
        return;
        Exception exception;
        exception;
        w w4 = w1;
        try
        {
            w4.a();
        }
        catch(Throwable _ex) { }
        v.bT();
        throw exception;
    }

    private static final void e(s s1)
    {
        d(s1.N());
        bh.a(507);
    }

    private static final String d(ao ao1)
    {
        String s1 = null;
        boolean flag = false;
        Object obj = null;
        for(int i1 = (ao1 = ao1.b).size(); --i1 >= 0;)
        {
            Object obj1;
            String s2 = ((ao) (obj1 = (ao)ao1.elementAt(i1))).a;
            obj1 = ab.a(((ao) (obj1)).c);
            v.b();
            v.b();
            if(ab.a(0x60963, s2) && ab.a(0x306c2, ((String) (obj1))))
                flag = true;
            else
            if(ab.a(0x406da, s2))
                s1 = ((String) (obj1));
            if(flag && s1 != null)
            {
                bh.a(ao1);
                return s1;
            }
        }

        throw new RuntimeException();
    }

    private static final void b(Throwable throwable)
    {
        throwable = ab.b(506, throwable);
        v.b();
        bh.a(throwable);
    }

    public static final void u()
    {
        t.a(1362, bh.q());
    }

    public static final void v()
    {
        synchronized(t.n(1362))
        {
            t.c(1546, 1);
        }
    }

    private static final void aw()
    {
        synchronized(t.n(1362))
        {
            t.c(1546, 0);
        }
    }

    public static final boolean w()
    {
        synchronized(t.n(1362))
        {
            if(t.g(1546))
            {
                aw();
                return true;
            }
        }
        return false;
    }

    public static final Object[] c(Object aobj[])
    {
        Vector vector;
        if(aobj != null)
            synchronized(vector = t.n(1362))
            {
                if(!vector.contains(((Object) (aobj))))
                    vector.addElement(((Object) (aobj)));
                v();
            }
        return aobj;
    }

    public static final void d(Object aobj[])
    {
        if(aobj != null)
        {
            Vector vector;
            synchronized(vector = t.n(1362))
            {
                if(vector.contains(((Object) (aobj))))
                {
                    vector.removeElement(((Object) (aobj)));
                    v();
                }
            }
            return;
        } else
        {
            return;
        }
    }

    public static final void a(Graphics g1)
    {
        Object obj;
        int i1;
        synchronized(obj = t.n(1362))
        {
            if((i1 = ((Vector) (obj)).size()) > 0)
            {
                String s1 = null;
                int j1 = 0;
                Object aobj[];
                int k1;
                for(int i2 = i1; --i2 >= 0;)
                    if((k1 = v.c(aobj = (Object[])((Vector) (obj)).elementAt(i2))) > j1)
                    {
                        j1 = k1;
                        s1 = (String)aobj[1];
                    }

                obj = g1.getFont();
                aobj = g1.getColor();
                Font font;
                g1.setFont(font = t.r());
                int j2;
                g1.setColor(t.f(5057 + (j2 = t.f(72))));
                int l1;
                g1.fillRoundRect(5, 5, l1 = font.stringWidth(s1) + 10, font = t.f(1419), 10, 10);
                g1.setColor(t.f(j2 + 4841));
                g1.drawRoundRect(5, 5, l1, font, 10, 10);
                g1.drawString(s1, 10, 5, 20);
                g1.setFont(((Font) (obj)));
                g1.setColor(((int) (aobj)));
            }
        }
    }

    public static final void x()
    {
        ay.d(78, 838);
        ax();
    }

    public static final int y()
    {
        if(H)
        {
            int i1;
            if((i1 = ae.g()) != 0)
                H = false;
            return i1;
        }
        Object aobj[];
        if((aobj = r.Z()) == null)
            return 0;
        if((aobj = u.c(aobj)) != null)
        {
            int j1;
            if((j1 = r.h(aobj)) != 0)
                return j1;
            H = true;
            j1 = null;
            t.n().b(false);
            ae.f();
        }
        return 0;
    }

    private static final void ax()
    {
        Object obj = t.c(0x220a75);
        obj = bh.r().append(((String) (obj))).append(t.c(0x120bd1)).append(t.c(0xc0cff)).append(t.c(0x120afe)).append(t.c(0xb0d25)).append(t.c(0xa0d40));
        s s1;
        (s1 = new s()).d(0xb0de7).d(0x70e01).d(0xc0e08).d(0x90e14).d(t.g(1504) ? 0x20017 : 0x1006f).d(0xd0e1d).d(0x80e60).f(ab.e(Integer.toString(0x7a122)));
        for(Enumeration enumeration = t.n(1316).elements(); enumeration.hasMoreElements(); s1.c(0x409bf).b(enumeration.nextElement()));
        r.f(u.a(bh.b(((StringBuffer) (obj))), s1));
    }

    public static final void z()
    {
        ay.d(72, 841);
        B();
    }

    public static final int A()
    {
        Object aobj[];
        if((aobj = u.c(r.Z())) != null)
        {
            int i1;
            if((i1 = r.h(aobj)) != 0)
                return i1;
            bi bi1 = t.n();
            Object obj1 = null;
            Object obj;
            for(Enumeration enumeration = ((Hashtable)(obj = ab.d(r.aa(), 2))).keys(); enumeration.hasMoreElements();)
            {
                Object obj2 = enumeration.nextElement();
                v.i();
                obj2 = (String)obj2;
                au au1;
                y y1 = (au1 = bi1.p(((String) (obj2)))).b(((String) (obj2)));
                Object obj3 = ab.a(obj, ((String) (obj2)));
                au1.f(((String) (obj2)));
                if(x.n(((String) (obj2 = (String)ab.d(obj3, 1)))))
                {
                    bi1.b(!ab.a(((String) (obj2)), 49L));
                    au1.a(!ab.a(((String) (obj2)), 49L));
                    y1.a(4, !ab.a(((String) (obj2)), 49L));
                }
                if(x.n(((String) (obj2 = (String)ab.d(obj3, 0)))))
                    y1.a(64, ab.a(((String) (obj2)), 49L));
            }

            return 43;
        } else
        {
            return 0;
        }
    }

    public static final void B()
    {
        s s1 = new s();
        Vector vector;
        for(int i1 = x.c(vector = t.n(1316)); --i1 >= 0;)
            s1.c(0x409bf).b(vector.elementAt(i1));

        r.f(u.a((new s()).c(0x220a75).c(0x100baf).c(0x100db).c(0x1409c3).v(t.f(1505)).c(0xa0d40).c(0x120afe).l(), s1));
    }

    public static final void C()
    {
        ay.d(42, 839);
        ay();
    }

    public static final int D()
    {
        Vector vector;
        Object aobj[];
        if((aobj = u.c(r.Z())) == null)
            break MISSING_BLOCK_LABEL_182;
        int i1;
        if((i1 = r.h(aobj)) != 0)
            return i1;
        vector = null;
        x.a(t.n(1316), vector = bh.q());
        if(vector != null && vector.size() > 0)
        {
            int j1 = t.f(1508);
            au au2 = v.by();
            bi bi1;
            au au1 = (bi1 = t.n()).e(j1);
            for(int k1 = 0; k1 < vector.size(); k1++)
            {
                String s1 = (String)vector.elementAt(k1);
                y y1 = au2.b(s1);
                if(!t.g(1371))
                {
                    if(!y1.b())
                    {
                        au2.a(false);
                        bi1.b(false);
                    }
                } else
                {
                    t.c(1371, 0);
                }
                au2.h(s1);
            }

            au1.h = true;
        }
        if(vector != null)
            bh.a(vector);
        break MISSING_BLOCK_LABEL_179;
        Exception exception;
        exception;
        if(vector != null)
            bh.a(vector);
        throw exception;
        return 43;
        return 0;
    }

    private static final void ay()
    {
        s s1 = (new s()).c(0xb0b1b);
        for(Enumeration enumeration = t.n(1316).elements(); enumeration.hasMoreElements(); s1.c(0x409bf).b(enumeration.nextElement()));
        r.f(u.a((new s()).c(0x220a75).c(0x100baf).c(0x100db).c(0x70e31).c(0xb0d25).c(0xa0d40).c(0x120afe).c(0x80e60).L().l(), s1));
    }

    public static final void E()
    {
        t.h(1233);
        aw.b(aw.b(5383));
    }

    public static final int F()
    {
        ay.G();
        ay.d(186, 807);
        t.h(1233);
        String s1 = t.c(1308);
        int i1 = t.f(1488);
        Vector vector;
        if((vector = t.n().e(i1).e) == null || vector.size() == 0)
            (vector = new Vector()).addElement(s1);
        a(vector);
        return -1;
    }

    public static final int G()
    {
        Object aobj[];
        if((aobj = r.Z()) == null)
            return 0;
        if((aobj = u.c(aobj)) != null)
        {
            int i1 = r.h(aobj);
            int j1 = t.f(1488);
            au au1 = t.n().e(j1);
            if(i1 != 0)
                return i1;
            Object obj = ab.d(r.aa(), 2);
            try
            {
                for(int k1 = 0; k1 < ((Vector)obj).size(); k1++)
                {
                    Object obj1;
                    String s1 = (String)ab.a(obj1 = ab.d(obj, k1), 0x60963);
                    obj1 = (String)ab.a(obj1, 0x90f8c);
                    if(ab.a(0x41cee, s1))
                        au1.b(((String) (obj1))).a(2, true);
                }

            }
            catch(Throwable _ex)
            {
                return v.m(916);
            }
            return 43;
        } else
        {
            return 0;
        }
    }

    private static final void a(Vector vector)
    {
        Object obj = t.c(0x220a75);
        obj = bh.r().append(((String) (obj))).append(t.c(0x120bbf)).append(t.c(0x100db)).append(t.c(0x120afe));
        s s1;
        (s1 = new s()).c(0x190cce).c(0xc0d19).c(0xc0e4f).f(x.h(t.c(1374))).c(0x50e9b);
        String s2;
        for(vector = vector.elements(); vector.hasMoreElements(); s1.c(0x409bf).f(s2))
            s2 = (String)vector.nextElement();

        r.f(u.a(bh.b(((StringBuffer) (obj))), s1));
    }

    public static final void H()
    {
        t.a(236, System.currentTimeMillis());
    }

    private static final void az()
    {
        boolean flag;
        do
        {
            do
            {
                Thread.sleep(3072L);
                if(bf.a)
                    throw new Throwable();
            } while(System.currentTimeMillis() - t.i(236) < 0x6ddd00L);
            flag = false;
            Vector vector;
            int i1 = x.c(vector = bb.i());
            while(--i1 >= 0) 
            {
                ba ba1;
                if(!(ba1 = ba.a(vector, i1)).S())
                    continue;
                if(ba1 instanceof bi)
                {
                    flag = false;
                    H();
                    break;
                }
                flag = true;
            }
            bh.a(vector);
        } while(!flag);
    }

    public static final void I()
    {
        do
        {
            az();
            b(m(a(m(t.c(0x110393)))));
        } while(true);
    }

    private static final g m(String s1)
    {
        return c(new g(s1));
    }

    private static final String a(g g1)
    {
        String s2;
        s s1 = new s();
        int i1;
        do
        {
            Thread.sleep(100L);
            g1.b(s1);
        } while((i1 = s1.b) == 0);
        StringBuffer stringbuffer = bh.r();
        char c1;
        while(i1-- > 0) 
            if(x.a(c1 = (char)s1.q()))
                stringbuffer.append(c1);
        s2 = bh.b(stringbuffer);
        if(g1 != null)
            g1.a = 3;
        return s2;
        Exception exception;
        exception;
        if(g1 != null)
            g1.a = 3;
        throw exception;
    }

    private static final void b(g g1)
    {
        String s3;
        bi bi2;
        bi bi1;
        bi2 = new bi(-1, s3 = t.c(0xa0000), s3);
        bi1 = bi2;
        bi2.m = g1;
        bi1.d(bi1.B());
        s s2 = new s();
        s s1;
        do
        {
            Thread.sleep(100L);
            g1.b(s2);
        } while((s1 = s2.v()) == null);
        if(s1.h(12) == 4098)
        {
            bi1.d(bi1.a(false));
            Thread.sleep(5000L);
        }
        if(g1 != null)
            g1.a = 3;
        return;
        Exception exception;
        exception;
        if(g1 != null)
            g1.a = 3;
        throw exception;
    }

    private static final g c(g g1)
    {
        int i1;
        do
            Thread.sleep(100L);
        while((i1 = g1.a()) == 1);
        if(i1 != 2)
            g1.a = 3;
        return g1;
    }

    private static final int[] a(byte abyte0[], int i1)
    {
        int ai[];
        s s1;
        System.arraycopy(x.a((s1 = new s(bh.a(24879L), 4200)).a), 0, ai = new int[1060], 0, 1042);
        s1.c();
        int j1 = 0;
        for(int k1 = 0; k1 < 18; k1++)
        {
            int l1 = 0;
            for(int i2 = 0; i2 < 4; i2++)
                l1 = l1 << 8 | abyte0[j1++ % i1] & 0xff;

            ai[k1 + 1024 + 18] = ai[k1 + 1024] ^ l1;
        }

        long l2;
        ai[1042] = (int)((l2 = a(ai, 0, 0)) >>> 32);
        ai[1043] = (int)l2;
        abyte0 = 2;
        do
        {
            l2 = a(ai, ai[(abyte0 + 1024 + 18) - 2], ai[(abyte0 + 1024 + 18) - 1]);
            ai[1042 + abyte0++] = (int)(l2 >>> 32);
            ai[1042 + abyte0++] = (int)l2;
        } while(abyte0 != 18);
        ai[0] = (int)((l2 = a(ai, ai[1058], ai[1059])) >>> 32);
        ai[1] = (int)l2;
        abyte0 = 2;
        do
        {
            long l3 = a(ai, ai[abyte0 - 2], ai[abyte0 - 1]);
            ai[abyte0++] = (int)(l3 >>> 32);
            ai[abyte0++] = (int)l3;
        } while(abyte0 != 1024);
        return ai;
    }

    private static final long a(int ai[], int i1, int j1)
    {
        i1 ^= ai[1042];
        for(int k1 = 0; k1 < 16;)
        {
            j1 ^= (ai[i1 >>> 24] + ai[0x100 | i1 >>> 16 & 0xff] ^ ai[0x200 | i1 >>> 8 & 0xff]) + ai[0x300 | i1 & 0xff] ^ ai[++k1 + 1024 + 18];
            i1 ^= (ai[j1 >>> 24] + ai[0x100 | j1 >>> 16 & 0xff] ^ ai[0x200 | j1 >>> 8 & 0xff]) + ai[0x300 | j1 & 0xff] ^ ai[++k1 + 1024 + 18];
        }

        return (long)(j1 ^ ai[1059]) << 32 | ((long)i1 << 32) >>> 32;
    }

    public static final void a(byte abyte0[], int i1, byte abyte1[], int j1)
    {
        abyte0 = a(abyte0, i1);
        i1 = j1 >> 3;
        for(j1 = 0; j1 < i1; j1++)
            a(((int []) (abyte0)), abyte1, j1 << 3);

    }

    public static final void b(byte abyte0[], int i1, byte abyte1[], int j1)
    {
        abyte0 = a(abyte0, i1);
        i1 = j1 >> 3;
        for(j1 = 0; j1 < i1; j1++)
            b(((int []) (abyte0)), abyte1, j1 << 3);

    }

    private static final void a(int ai[], byte abyte0[], int i1)
    {
        int j1 = abyte0[i1] << 24 | (abyte0[i1 + 1] & 0xff) << 16 | (abyte0[i1 + 2] & 0xff) << 8 | abyte0[i1 + 3] & 0xff;
        int k1 = abyte0[i1 + 4] << 24 | (abyte0[i1 + 5] & 0xff) << 16 | (abyte0[i1 + 6] & 0xff) << 8 | abyte0[i1 + 7] & 0xff;
        j1 ^= ai[1042];
        for(int l1 = 0; l1 < 16;)
        {
            k1 ^= (ai[j1 >>> 24] + ai[0x100 | j1 >>> 16 & 0xff] ^ ai[0x200 | j1 >>> 8 & 0xff]) + ai[0x300 | j1 & 0xff] ^ ai[++l1 + 1024 + 18];
            j1 ^= (ai[k1 >>> 24] + ai[0x100 | k1 >>> 16 & 0xff] ^ ai[0x200 | k1 >>> 8 & 0xff]) + ai[0x300 | k1 & 0xff] ^ ai[++l1 + 1024 + 18];
        }

        k1 ^= ai[1059];
        abyte0[i1] = k1 >> 24;
        abyte0[i1 + 1] = (byte)(k1 >>> 16);
        abyte0[i1 + 2] = (byte)(k1 >>> 8);
        abyte0[i1 + 3] = (byte)k1;
        abyte0[i1 + 4] = j1 >> 24;
        abyte0[i1 + 5] = (byte)(j1 >>> 16);
        abyte0[i1 + 6] = (byte)(j1 >>> 8);
        abyte0[i1 + 7] = (byte)j1;
    }

    private static final void b(int ai[], byte abyte0[], int i1)
    {
        int j1 = abyte0[i1] << 24 | (abyte0[i1 + 1] & 0xff) << 16 | (abyte0[i1 + 2] & 0xff) << 8 | abyte0[i1 + 3] & 0xff;
        int k1 = abyte0[i1 + 4] << 24 | (abyte0[i1 + 5] & 0xff) << 16 | (abyte0[i1 + 6] & 0xff) << 8 | abyte0[i1 + 7] & 0xff;
        j1 ^= ai[1059];
        for(int l1 = 16; l1 > 0;)
        {
            k1 ^= (ai[j1 >>> 24] + ai[0x100 | j1 >>> 16 & 0xff] ^ ai[0x200 | j1 >>> 8 & 0xff]) + ai[0x300 | j1 & 0xff] ^ ai[1042 + l1--];
            j1 ^= (ai[k1 >>> 24] + ai[0x100 | k1 >>> 16 & 0xff] ^ ai[0x200 | k1 >>> 8 & 0xff]) + ai[0x300 | k1 & 0xff] ^ ai[1042 + l1--];
        }

        k1 ^= ai[1042];
        abyte0[i1] = k1 >> 24;
        abyte0[i1 + 1] = (byte)(k1 >>> 16);
        abyte0[i1 + 2] = (byte)(k1 >>> 8);
        abyte0[i1 + 3] = (byte)k1;
        abyte0[i1 + 4] = j1 >> 24;
        abyte0[i1 + 5] = (byte)(j1 >>> 16);
        abyte0[i1 + 6] = (byte)(j1 >>> 8);
        abyte0[i1 + 7] = (byte)j1;
    }

    public static final Object c(String s1)
    {
        v.b();
        return b(Connector.open(s1));
    }

    public static final Object d(String s1)
    {
        v.b();
        return b(Connector.open(s1, 3));
    }

    public static final Object b(Object obj)
    {
        v.i();
        if(obj != null)
            b.addElement(obj);
        return obj;
    }

    public static final void c(Object obj)
    {
        v.i();
        if(obj != null)
            x.a(b, obj);
    }

    public static final void a(InputStream inputstream)
    {
        try
        {
            if(inputstream != null)
            {
                c(inputstream);
                inputstream.close();
            }
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    public static final void a(OutputStream outputstream)
    {
        try
        {
            if(outputstream != null)
            {
                c(outputstream);
                outputstream.close();
            }
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    public static final void a(Connection connection)
    {
        try
        {
            if(connection != null)
            {
                c(connection);
                connection.close();
            }
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    public static final void a(RecordStore recordstore)
    {
        try
        {
            if(recordstore != null)
            {
                c(recordstore);
                recordstore.closeRecordStore();
            }
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    private static void a(Player player)
    {
        if(player != null)
        {
            c(player);
            try
            {
                player.stop();
            }
            catch(Throwable _ex) { }
            try
            {
                player.close();
                return;
            }
            catch(Throwable _ex) { }
        }
    }

    public static final RecordStore a(String s1, boolean flag)
    {
        v.b();
        return (RecordStore)b(RecordStore.openRecordStore(s1, flag));
    }

    public static final void J()
    {
        t.a(1320, ((Object) (new Object[60])));
        t.a(1321, new int[30]);
    }

    private static final int p(int i1)
    {
        if(i1 <= 354)
            return 0xff & t.a(300)[i1 + 39];
        else
            return 256 + t.a(300)[i1 + 39];
    }

    private static final Object[] aA()
    {
        return (Object[])t.m(1320);
    }

    private static final int[] aB()
    {
        return (int[])t.m(1321);
    }

    public static final void K()
    {
        synchronized(aA())
        {
            t.d(1376, 1);
        }
    }

    public static final void e(int i1)
    {
        Object aobj[];
        synchronized(aobj = aA())
        {
            aobj[i1] = null;
            aobj[i1 + 30] = null;
        }
    }

    public static final void L()
    {
        Object aobj[];
        synchronized(aobj = aA())
        {
            int i1 = t.f(1376);
            int ai[] = aB();
            int k1;
            for(int j1 = 30; --j1 >= 0;)
                if((k1 = i1 - ai[j1]) > 16)
                {
                    aobj[j1] = null;
                    if(k1 > 32)
                    {
                        bh.a((byte[])aobj[j1 + 30]);
                        aobj[j1 + 30] = null;
                    }
                }

        }
    }

    private static final void q(int i1)
    {
        aB()[i1] = t.f(1376);
    }

    public static final Image f(int i1)
    {
        Object aobj[];
        Image image1;
        synchronized(aobj = aA())
        {
            q(i1);
            if(aobj[i1] != null)
            {
                i1 = (Image)aobj[i1];
                return i1;
            }
            try
            {
                byte abyte0[];
                if((abyte0 = (byte[])aobj[i1 + 30]) == null)
                    aobj[i1 + 30] = abyte0 = (new s(bh.a(i1 >= 26 ? 0x676e702e47612fL + (long)(i1 << 16) : 0x676e702e612fL + (long)(i1 << 8)))).m();
                Image image = (Image)(aobj[i1] = Image.createImage(abyte0, 0, abyte0.length));
                return image;
            }
            catch(Throwable _ex)
            {
                aobj[i1] = aobj[i1 + 30] = null;
            }
            image1 = Image.createImage(1, 1);
        }
        return image1;
    }

    public static final void a(Graphics g1, int i1, int j1, int k1)
    {
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        if((l1 = g1.getClipX()) - j1 < 16 && (i2 = g1.getClipY()) - k1 < 16 && (l2 = (l1 - j1) + (j2 = g1.getClipWidth())) > 0 && (i3 = (i2 - k1) + (k2 = g1.getClipHeight())) > 0)
        {
            l2 = x.c(l2, 16);
            i3 = x.c(i3, 16);
            int j3 = (i1 = p(i1)) >> 4;
            int k3 = ((i1 &= 0xf) & 3) << 4;
            i1 = (i1 >> 2) << 4;
            int l3;
            if((l3 = l1 - j1) > 0)
            {
                l2 -= l3;
                j1 = l1;
                k3 += l3;
            }
            if(l2 > 0)
            {
                int i4;
                if((i4 = i2 - k1) > 0)
                {
                    i3 -= i4;
                    k1 = i2;
                    i1 += i4;
                }
                if(i3 > 0)
                {
                    g1.setClip(j1, k1, l2, i3);
                    g1.drawImage(f(j3), j1 - k3, k1 - i1, 20);
                    g1.setClip(l1, i2, j2, k2);
                }
            }
        }
    }

    public static final void g(int i1)
    {
        aC();
        try
        {
            if(null != t.a(1226, b(i1 = bh.f(0x90216).c(i1 + 429).r(0x2fff00).b())))
            {
                t.a(1227, b(i1 = Manager.createPlayer(i1, t.c(0xa01ff))));
                try
                {
                    i1.realize();
                }
                catch(Throwable _ex) { }
                if(t.g(87))
                    try
                    {
                        ((VolumeControl)i1.getControl(t.c(0xd0209))).setLevel(t.f(88));
                    }
                    catch(Throwable _ex) { }
                try
                {
                    i1.prefetch();
                }
                catch(Throwable _ex) { }
                try
                {
                    i1.start();
                }
                catch(Throwable _ex) { }
                v.a(6, 10000L);
            }
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    private static final void aC()
    {
        a(aE());
        a(aD());
        t.b(1226, 1227);
    }

    private static final InputStream aD()
    {
        return (InputStream)t.m(1226);
    }

    private static final Player aE()
    {
        return (Player)t.m(1227);
    }

    public static final void M()
    {
        if(v.bW())
            aC();
    }

    public static final String e(String s1)
    {
        boolean flag = false;
        Vector vector = x.b(t.c(0xda1378), '\0');
        Vector vector1 = x.b(t.c(925), '\0');
        v.j();
        v.j();
        Hashtable hashtable = new Hashtable();
        for(int i1 = vector.size(); --i1 >= 0;)
            hashtable.put(vector.elementAt(i1), vector1.elementAt(i1));

        String s2 = t.c(923);
        String s3 = t.c(924);
        Hashtable hashtable1 = new Hashtable();
        StringBuffer stringbuffer = bh.r();
        for(int l1 = s2.length(); --l1 >= 0;)
            hashtable1.put(ab.b(stringbuffer.append(s2.charAt(l1))), ab.b(stringbuffer.append(s3.charAt(l1))));

        int j1 = s1.length();
        for(int k1 = 0; k1 < j1; k1++)
        {
            String s4 = null;
            for(int i2 = 3; i2 > 0;)
                try
                {
                    String s5;
                    boolean flag1 = Character.isUpperCase((s5 = ab.a(s1, k1, k1 + i2)).charAt(0));
                    if((s4 = (String)hashtable.get(ab.e(s5.toLowerCase()))) == null)
                        continue;
                    if(flag1 && (s5 = (String)hashtable1.get(ab.b(s4, 1))) != null)
                        s4 = s4.length() != 1 ? ab.b(s5, ab.c(s4, 1)) : s5;
                    k1 += i2 - 1;
                    stringbuffer.append(s4);
                    break;
                }
                catch(Throwable throwable)
                {
                    i2--;
                }

            if(s4 == null)
                stringbuffer.append(s1.charAt(k1));
        }

        bh.a(vector);
        bh.a(vector1);
        return bh.b(stringbuffer);
    }

    public static al a;
    private static boolean H;
    public static Vector b;
}