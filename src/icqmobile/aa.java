// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:09:17
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.*;

public abstract class aa
{

    public static final void a()
    {
        t.h(1243);
        t.h(1324);
        t.c(1447, 4);
        bg.a(4, bg.g);
        bg bg1;
        ad ad1;
        aw.a(ad1 = f().d((bg1 = bg.g()).e));
        ad1.c(bg1.f);
        ad1.q();
    }

    public static final void a(bg bg1)
    {
        bg.a(4, bg1.d);
    }

    public static final int b()
    {
        c();
        av av1;
        t.c((av1 = aw.f()) != null ? av1.d : null);
        return bf.d();
    }

    public static final void c()
    {
        ad ad1;
        bg bg1;
        (bg1 = bg.g()).f = (ad1 = aw.c()).h;
        bg1.e = ad1.c();
    }

    public static final void d()
    {
        t.h(1243);
        t.h(1324);
        c();
    }

    public static final void e()
    {
        d();
        bg bg1 = bg.g();
        ad ad1;
        aw.a(ad1 = f().d(bg1.e));
        ad1.c(bg1.f);
        ad1.q();
        bg.a(4, bg.g);
        bf.c = true;
    }

    public static final int a(String s1, Object obj)
    {
        if(s1 == null)
            return -1;
        c();
        t.c(obj);
        if(obj != null)
        {
            if(obj instanceof e)
            {
                bf.b = true;
                return ((e)obj).c();
            }
            if(obj instanceof be)
            {
                t.h(1241);
                z.p();
                return ((be)obj).U();
            }
        }
        return 0;
    }

    public static final int a(Object obj)
    {
        c();
        t.c(obj);
        return obj == null ? -1 : 30;
    }

    private static final void b(ad ad1, Object obj)
    {
label0:
        {
label1:
            {
                be be1;
                e e1;
                boolean flag;
                String s1;
label2:
                {
                    Object obj1 = null;
                    ad1 = ad1.k;
                    if(obj == null)
                        break label1;
                    be1 = null;
                    e1 = null;
                    int i1 = ((ba) (obj = (obj instanceof e) ? ((Object) ((e1 = (e)obj).a)) : ((Object) ((be1 = (be)obj).i)))).b();
                    s1 = ((ba) (obj)).G;
                    if(!t.g(243))
                        bg.a(i1, s1);
                    if(ad1 == null)
                        break label0;
                    flag = false;
                    s1 = t.i();
                    try
                    {
                        int j2 = 0;
                        if(be1 != null)
                        {
                            int j1;
                            if((j1 = be1.Y()) >= 0)
                            {
                                j2++;
                                Object obj2 = ad1.elementAt(0);
                                v.i();
                                if(((Integer)obj2).intValue() != j1)
                                {
                                    flag = true;
                                    break label2;
                                }
                            }
                            if(!ad1.elementAt(j2++).equals(be1.a()))
                            {
                                flag = true;
                                break label2;
                            }
                        }
                        if(e1 != null)
                        {
                            j2++;
                            if(!ad1.elementAt(0).equals(s1))
                            {
                                flag = true;
                                break label2;
                            }
                        }
                        int k1;
                        if((k1 = ((ba) (obj)).k_()) >= 0)
                        {
                            Object obj3 = ad1.elementAt(j2++);
                            v.i();
                            if(((Integer)obj3).intValue() != k1)
                            {
                                flag = true;
                                break label2;
                            }
                        }
                        if(j2 != ad1.size())
                            flag = true;
                    }
                    catch(Throwable _ex)
                    {
                        flag = true;
                    }
                }
                if(flag)
                {
                    ad1.removeAllElements();
                    if(be1 != null)
                    {
                        int l1;
                        if((l1 = be1.Y()) >= 0)
                            ad1.addElement(z.i(l1));
                        ad1.addElement(be1.a());
                    }
                    if(e1 != null)
                        ad1.addElement(s1);
                    int i2;
                    if((i2 = ((ba) (obj)).k_()) >= 0)
                        ad1.addElement(z.i(i2));
                    bf.c = true;
                    return;
                }
                break label0;
            }
            if(ad1 != null && ad1.size() > 0)
            {
                ad1.removeAllElements();
                bf.c = true;
            }
        }
    }

    public static final int a(ad ad1, Object obj)
    {
        if(t.n(1253) != null)
            return 122;
        if(!t.g(1441))
        {
            t.c(1441, 1);
            if(System.currentTimeMillis() - t.i(219) > 0x240c8400L)
            {
                t.c(1479, 0);
                return 57;
            }
        }
        c();
        b(ad1, obj);
        return 0;
    }

    private static final ad f()
    {
        int i1;
        t.c(2524, (i1 = 1 + t.f(242)) != 1 ? 12 : 1);
        ad ad1;
        int j1 = (ad1 = aw.b(2522)).l - 1;
        if(t.g(99))
            b(ad1, i1, j1);
        else
            a(ad1, i1, j1);
        bg.h();
        return ad1.b();
    }

    private static final boolean a(boolean flag, be be1)
    {
        return (be1.P() || flag || be1.j) && !be1.r_() && !be1.j() && !be1.s_() && !be1.m_() && !be1.p();
    }

    private static final ad a(ad ad1, int i1, int j1)
    {
        boolean flag = !t.g(98);
        Vector vector;
        int k1 = v.a(vector = bb.b(bg.g));
        for(int l1 = 0; l1 < k1; l1++)
        {
            be be1;
            boolean flag1;
            if(!(be1 = (be)vector.elementAt(l1)).r_() && (be1.P() || be1.s_() || !be1.r_() && (flag || (flag1 = be1.i.S()) && be1.j || !flag1 && be1.m_())))
                ad1.a(be1.o_().b(i1, j1 / i1));
        }

        bh.a(vector);
        return ad1;
    }

    private static final ad b(ad ad1, int i1, int j1)
    {
        if(t.g(100))
            return c(ad1, i1, j1);
        else
            return d(ad1, i1, j1);
    }

    private static final ad c(ad ad1, int i1, int j1)
    {
        int k1 = j1 / i1;
        boolean flag = t.g(101);
        boolean flag1 = !t.g(98);
        Object obj = bh.q();
        Object obj1;
        for(int j2 = ((Vector) (obj1 = bb.c(bg.g))).size(); --j2 >= 0;)
            a(((Vector) (obj)), (e)((Vector) (obj1)).elementAt(j2));

        bh.a(((Vector) (obj1)));
        int i2 = v.a(((Vector) (obj)));
        for(int k2 = 0; k2 < i2; k2++)
        {
            e e1 = (e)((Vector) (obj)).elementAt(k2);
            boolean flag2 = false;
            if(flag || !e1.d())
            {
                ad1.a(e1.b(-1).b(i1, j1));
                flag2 = true;
            }
            if(e1.d())
            {
                Vector vector;
                int i3 = v.a(vector = e1.b);
                for(int j4 = 0; j4 < i3; j4++)
                {
                    be be1;
                    if(a(flag1, be1 = (be)vector.elementAt(j4)))
                    {
                        if(!flag2)
                        {
                            ad1.a(e1.b(-1).b(i1, j1));
                            flag2 = true;
                        }
                        ad1.a(be1.o_().b(i1, k1));
                    }
                }

            }
        }

        bh.a(((Vector) (obj)));
        obj = null;
        i2 = null;
        z z1 = null;
        z z2 = null;
        for(int l2 = x.c(t.n(1203)); --l2 >= 0;)
        {
            int l1 = l2;
            ba ba1 = ba.a(t.n(1203), l1);
            ba ba2;
            if((ba2 = bg.g) == null || ba2 == ba1)
            {
                int k4;
                Vector vector5;
                if((k4 = (vector5 = ba1.al()).size()) > 0)
                {
                    if(z2 == null)
                        z2 = new z(ba1.E, -4);
                    while(--k4 >= 0) 
                        z2.b(vector5.elementAt(k4));
                }
                bh.a(vector5);
                if((k4 = (vector5 = ba1.ak()).size()) > 0)
                {
                    if(obj == null)
                        obj = new z(ba1.C, -1);
                    while(--k4 >= 0) 
                        ((e) (obj)).b(vector5.elementAt(k4));
                }
                bh.a(vector5);
                if((k4 = (vector5 = ba1.an()).size()) > 0)
                {
                    if(i2 == null)
                        i2 = new z(ba1.A, -2);
                    while(--k4 >= 0) 
                        i2.b(vector5.elementAt(k4));
                }
                bh.a(vector5);
                if((k4 = (vector5 = ba1.aj()).size()) > 0)
                {
                    if(z1 == null)
                        z1 = new z(ba1.B, -3);
                    while(--k4 >= 0) 
                        z1.b(vector5.elementAt(k4));
                }
                bh.a(vector5);
            }
        }

        if(z2 != null)
        {
            Vector vector1;
            int j3 = v.a(vector1 = ((e) (z2)).b);
            ad1.a(z2.b(j3).b(i1, j1));
            if(z2.d())
            {
                for(int l4 = 0; l4 < j3; l4++)
                    ad1.a(((be)vector1.elementAt(l4)).o_().b(i1, k1));

                bh.a(vector1);
            }
        }
        if(obj != null)
        {
            Vector vector2;
            int k3 = v.a(vector2 = ((e) (obj)).b);
            ad1.a(((e) (obj)).b(k3).b(i1, j1));
            if(((e) (obj)).d())
            {
                for(int i5 = 0; i5 < k3; i5++)
                    ad1.a(((be)vector2.elementAt(i5)).o_().b(i1, k1));

                bh.a(vector2);
            }
        }
        if(z1 != null)
        {
            Vector vector3;
            int l3 = v.a(vector3 = ((e) (z1)).b);
            ad1.a(z1.b(l3).b(i1, j1));
            if(z1.d())
            {
                for(int j5 = 0; j5 < l3; j5++)
                    ad1.a(((be)vector3.elementAt(j5)).o_().b(i1, k1));

                bh.a(vector3);
            }
        }
        if(i2 != null)
        {
            Vector vector4;
            int i4 = v.a(vector4 = ((e) (i2)).b);
            ad1.a(i2.b(i4).b(i1, j1));
            if(i2.d())
            {
                for(int k5 = 0; k5 < i4; k5++)
                    ad1.a(((be)vector4.elementAt(k5)).o_().b(i1, k1));

                bh.a(vector4);
            }
        }
        return ad1;
    }

    private static final ad d(ad ad1, int i1, int j1)
    {
        int k1 = j1 / i1;
        Vector vector;
        int j3 = v.a(vector = bb.c(bg.g));
        boolean flag = t.g(101);
        boolean flag1 = !t.g(98);
        for(int l4 = 0; l4 < j3; l4++)
        {
            e e3 = (e)vector.elementAt(l4);
            boolean flag2 = false;
            if(flag || !e3.d())
            {
                ad1.a(e3.b(-1).b(i1, j1));
                flag2 = true;
            }
            if(e3.d())
            {
                Vector vector5;
                int l5 = v.a(vector5 = e3.b);
                for(int j6 = 0; j6 < l5; j6++)
                {
                    be be1;
                    if(a(flag1, be1 = (be)vector5.elementAt(j6)))
                    {
                        if(!flag2)
                        {
                            ad1.a(e3.b(-1).b(i1, j1));
                            flag2 = true;
                        }
                        ad1.a(be1.o_().b(i1, k1));
                    }
                }

            }
        }

        bh.a(vector);
        int i5;
        for(int j5 = i5 = x.c(t.n(1203)); --j5 >= 0;)
        {
            int l1 = j5;
            ba ba2 = ba.a(t.n(1203), l1);
            ba ba3;
            if((ba3 = bg.g) == null || ba3 == ba2)
            {
                e e4 = ba2.E;
                Vector vector1;
                int l6;
                if((l6 = (vector1 = ba2.al()).size()) > 0)
                {
                    ad1.a(e4.b(l6).b(i1, j1));
                    if(e4.d())
                    {
                        v.a(vector1);
                        for(int k3 = 0; k3 < l6; k3++)
                            ad1.a(((be)vector1.elementAt(k3)).o_().b(i1, k1));

                    }
                }
                bh.a(vector1);
            }
        }

        for(int k5 = i5; --k5 >= 0;)
        {
            int i2 = k5;
            ba ba4 = ba.a(t.n(1203), i2);
            ba ba5;
            if((ba5 = bg.g) == null || ba5 == ba4)
            {
                e e5 = ba4.C;
                int j2;
                Vector vector3;
                if((j2 = (vector3 = ba4.ak()).size()) > 0)
                {
                    ad1.a(e5.b(j2).b(i1, j1));
                    if(e5.d())
                    {
                        v.a(vector3);
                        for(int j4 = 0; j4 < j2; j4++)
                            ad1.a(((be)vector3.elementAt(j4)).o_().b(i1, k1));

                    }
                }
                bh.a(vector3);
            }
        }

        for(int i6 = i5; --i6 >= 0;)
        {
            int k2 = i6;
            ba ba6 = ba.a(t.n(1203), k2);
            ba ba7;
            if((ba7 = bg.g) == null || ba7 == ba6)
            {
                e e1 = ba6.A;
                int l3;
                Vector vector4;
                if((l3 = (vector4 = ba6.an()).size()) > 0)
                {
                    ad1.a(e1.b(l3).b(i1, j1));
                    if(e1.d())
                    {
                        v.a(vector4);
                        for(int l2 = 0; l2 < l3; l2++)
                            ad1.a(((be)vector4.elementAt(l2)).o_().b(i1, k1));

                    }
                }
                bh.a(vector4);
            }
        }

        for(int k6 = i5; --k6 >= 0;)
        {
            int i3 = k6;
            ba ba8 = ba.a(t.n(1203), i3);
            ba ba1;
            if((ba1 = bg.g) == null || ba1 == ba8)
            {
                e e2 = ba8.B;
                Vector vector2;
                int k4;
                if((k4 = (vector2 = ba8.aj()).size()) > 0)
                {
                    ad1.a(e2.b(k4).b(i1, j1));
                    if(e2.d())
                    {
                        v.a(vector2);
                        for(int i4 = 0; i4 < k4; i4++)
                            ad1.a(((be)vector2.elementAt(i4)).o_().b(i1, k1));

                    }
                }
                bh.a(vector2);
            }
        }

        return ad1;
    }

    private static final z a(Vector vector, String s1)
    {
        z z1;
        for(int i1 = vector.size(); --i1 >= 0;)
            if(((e) (z1 = (z)vector.elementAt(i1))).c.equals(s1))
                return z1;

        return null;
    }

    private static final void a(Vector vector, e e1)
    {
        z z1;
        if((z1 = a(vector, e1.c)) == null)
            vector.addElement(z1 = new z(e1, vector.size()));
        for(e1 = (vector = e1.b).size(); --e1 >= 0;)
            z1.b(vector.elementAt(e1));

    }

    public static void a(Graphics g1, int i1, int j1, boolean flag)
    {
        if(!flag && !t.g(1450))
        {
            return;
        } else
        {
            flag = g1.getColor();
            g1.setColor(0);
            g1.fillRect(i1 - 1, j1 - 7, 2, 5);
            g1.fillRect(i1 - 1, j1 + 2, 2, 5);
            g1.fillRect(i1 - 7, j1 - 1, 5, 2);
            g1.fillRect(i1 + 2, j1 - 1, 5, 2);
            g1.setColor(flag);
            return;
        }
    }

    public static void a(Graphics g1, int i1, int j1)
    {
        int k1 = g1.getColor();
        g1.setColor(0x646464);
        g1.setStrokeStyle(1);
        g1.drawRect((i1 - 64) + 2, (j1 - 64) + 2, 124, 124);
        g1.setStrokeStyle(0);
        g1.setColor(k1);
        if(t.g(1516) && t.g(1383))
        {
            int ai[] = new int[128];
            for(int l1 = 128; --l1 >= 0;)
                ai[l1] = 0x3c000000;

            for(int i2 = 128; --i2 >= 0;)
                g1.drawRGB(ai, 0, 128, i1 - 64, (j1 - 64) + i2, 128, 1, true);

        }
    }

    public static void a(Graphics g1, int i1, long l1)
    {
        if(i1 < 0 || i1 > 17)
            i1 = 0;
        if((long)i1 != f || x.b(l1 - e) > 10000L || !i)
        {
            i = true;
            e = l1;
            f = i1;
            int k1;
            g = a(k1 = a(i1, l1), i1, l1);
            h = b(k1);
        }
        Font font = g1.getFont();
        i1 = g1.getColor();
        g1.setFont(l1 = t.r());
        j1 = t.f(1419);
        int i2 = x.b(g, l1.stringWidth(h));
        l1 = l1.getHeight();
        j1 = t.g(230) ? -(j1 <= 16 ? 18 : j1) : 0;
        i2 = g1.getClipWidth() - i2 - 5;
        int j2 = g1.getClipHeight() - l1 - 13;
        g1.drawString(h, i2, j1 + j2, 20);
        g1.setColor(0xffffff);
        g1.fillRect(i2, j1 + j2 + l1 + 5, g / 2, 3);
        g1.fillRect(i2 + g / 2, j1 + j2 + l1 + 2, g / 2, 3);
        g1.setColor(0);
        g1.fillRect(i2, j1 + j2 + l1 + 2, g / 2, 4);
        g1.fillRect(i2 + g / 2, j1 + j2 + l1 + 5, g / 2, 3);
        g1.drawRect(i2, j1 + j2 + l1 + 2, g, 6);
        g1.setColor(i1);
        g1.setFont(font);
    }

    public static void a(Graphics g1, long l1, long l2, int k1, int i2, int j2, 
            long l3)
    {
        if(n != 0L && o != 0L)
        {
            l1 = (int)((long)(i2 / 2) + (v.c(n, k1) - l1));
            i1 = (int)((long)(j2 / 2) + (l2 - v.c(o, k1)));
            if(l1 >= 0 && i1 >= 0 && l1 < i2 && i1 < j2)
            {
                l2 = g1.getColor();
                g1.setColor(255);
                g1.fillArc(l1 - 6, i1 - 6, 12, 12, 0, 360);
                k1 = (j1 = a(p, k1, l3)) << 1;
                g1.drawArc(l1 - j1, i1 - j1, k1, k1, 0, 360);
                g1.setColor(0xdcdcdc);
                g1.drawArc(l1 - 7, i1 - 7, 14, 14, 0, 360);
                g1.setColor(l2);
            }
        }
    }

    public static void a(long l1, long l2, int i1)
    {
        n = l1;
        o = l2;
        p = i1;
    }

    public static void a(Graphics g1, m m1, long l1, long l2, int i1, int j1, 
            int k1)
    {
        o.v();
        if(m1 == null)
            return;
        if(!m1.d)
            return;
        if(m1.k() == null)
            return;
        if(x.b(l1 - m1.c(i1)) > (long)(j1 / 2) || x.b(l2 - m1.d(i1)) > (long)(k1 / 2))
            return;
        j1 = (int)((long)(j1 / 2) + (m1.c(i1) - l1));
        k1 = (int)((long)(k1 / 2) + (l2 - m1.d(i1)));
        Image image;
        byte byte0;
        if(m1.e == 2)
        {
            image = a.f(25);
            byte0 = 1;
        } else
        {
            image = a.f(24);
            byte0 = 4;
        }
        g1.drawImage(image, j1, k1, 0x20 | byte0);
        if(x.b(l1 - m1.c(i1)) < 20L && x.b(l2 - m1.d(i1)) < 20L)
        {
            o.a(m1);
            return;
        } else
        {
            o.v();
            return;
        }
    }

    private static int a(Vector vector, Font font)
    {
        int i1 = 20;
        for(int j1 = vector.size(); --j1 >= 0;)
            i1 = x.b(i1, font.stringWidth((String)vector.elementAt(j1)));

        return i1;
    }

    private static void a(Graphics g1, String s1, Font font, int i1, int j1, int k1)
    {
        i1 = (s1 = x.a(s1, font, i1)).size();
        int l1 = a(((Vector) (s1)), font) + 10;
        int i2;
        int j2 = (i2 = font.getHeight()) * i1 + 6;
        Font font1 = g1.getFont();
        int k2 = g1.getColor();
        int l2 = t.f(72);
        g1.setColor(t.f(l2 + 5057));
        int i3;
        int j3 = (i3 = x.c(l1 / 25, 3)) << 1;
        int k3 = j1 - l1 / 2;
        j3 = k1 - j3 - j2;
        g1.fillRoundRect(k3, j3, l1, j2, 10, 10);
        g1.setColor(0);
        g1.drawRoundRect(k3, j3, l1, j2, 10, 10);
        g1.setFont(font);
        g1.setColor(t.f(l2 + 4841));
        for(font = i1; --font >= 0;)
            g1.drawString((String)s1.elementAt(font), k3 + 5, j3 + 3 + font * i2, 20);

        g1.setColor(t.f(l2 + 5057));
        g1.fillTriangle(j1 + i3, k1 - (i3 << 1), j1 + (i3 << 2), k1 - (i3 << 1), j1, k1);
        g1.setColor(0);
        g1.drawLine(j1 + i3, k1 - (i3 << 1), j1, k1);
        g1.drawLine(j1 + (i3 << 2), k1 - (i3 << 1), j1, k1);
        g1.setFont(font1);
        g1.setColor(k2);
    }

    private static void a(Graphics g1, String s1, int i1, Font font, int j1, int k1, int l1, boolean flag)
    {
        j1 = (s1 = x.a(s1, font, j1)).size();
        int i2 = a(((Vector) (s1)), font);
        int j2 = font.stringWidth(t.c(944)) + 6 + 24;
        int k2 = font.getHeight();
        Font font1 = g1.getFont();
        int l2 = g1.getColor();
        int i3 = k2 <= 16 ? 16 : k2;
        int j3 = 1;
        if(flag)
            j3 = 2;
        j3 = 6 + j3 * i3 + (j1 - 1) * k2;
        if((i2 = i2 + (i1 == 0 ? 0 : 16) + 6) < j2)
            i2 = j2;
        int k3 = t.f(72);
        g1.setColor(t.f(k3 + 5057));
        int l3;
        if((l3 = i2 / 25) < 3)
            l3 = 3;
        int i4;
        if((i4 = l1 - j3 - l3) < 10 && !o.t())
            o.b(x.d(i4) + 20);
        i4 = l3 << 1;
        g1.fillRoundRect(k1 - i2 / 2, l1 - i4 - j3, i2, j3, 10, 10);
        g1.setColor(0);
        g1.drawRoundRect(k1 - i2 / 2, l1 - i4 - j3, i2, j3, 10, 10);
        ar ar1 = new ar(g1);
        if(i1 != 0)
            ar1.a(i1, (k1 - i2 / 2) + 2, (l1 - i4 - j3) + 2);
        g1.setFont(font);
        g1.setColor(t.f(k3 + 4841));
        for(font = 0; font < j1; font++)
            g1.drawString((String)s1.elementAt(font), (k1 - i2 / 2) + 2 + (i1 == 0 ? 0 : 16), (l1 - i4 - j3) + i3 + 2 + (font - 1) * k2, 20);

        s1 = a.f(19);
        if(a == null)
        {
            (a = new int[4])[2] = s1.getWidth();
            a[3] = s1.getHeight();
        }
        if(flag)
        {
            g1.drawImage(s1, a[0] = (k1 - i2 / 2) + 2 + (i2 - j2) / 2, a[1] = (l1 - i4 - j3) + 4 + i3 + k2 * (j1 - 1) + i3 / 2, 6);
            g1.drawString(t.c(944), (k1 - i2 / 2) + 2 + (i2 - j2) / 2 + 24 + 2, (l1 - i4 - j3) + 4 + i3 + k2 * (j1 - 1), 20);
        }
        g1.setColor(t.f(k3 + 5057));
        g1.fillTriangle(k1 + l3, l1 - i4, k1 + (l3 << 2), l1 - i4, k1, l1);
        g1.setColor(0);
        g1.drawLine(k1 + l3, l1 - i4, k1, l1);
        g1.drawLine(k1 + (l3 << 2), l1 - i4, k1, l1);
        g1.setFont(font1);
        g1.setColor(l2);
    }

    public static void a(Graphics g1, int i1, int j1, int k1, long l1, long l2, 
            al al1)
    {
        if(al1 == null || !al1.u_())
            return;
        int j2;
        j2 = (j2 = t.f(73)) != 0 ? ((int) (j2 != 1 ? 16 : 0)) : 8;
        Font font = Font.getFont(64, 0, j2);
        l1 = (int)((long)(i1 / 2) + ((long)al1.a(k1) - l1));
        j1 = (int)((long)(j1 / 2) + (l2 - (long)al1.b(k1)));
        k1 = 360;
        l2 = 8;
        byte0 = 22;
        boolean flag = al1.x_();
        if((i2 = al1.t_()) == 1)
            k1 = 303;
        if(i2 == 2)
        {
            k1 = 308;
            l2 = 0;
        }
        if(i2 == 3 || i2 == 9 || i2 == 6)
        {
            k1 = 0;
            l2 = 0;
            byte0 = 4;
        }
        if(i2 == 8)
        {
            if((k1 = ((af)al1).d) == 1)
                k1 = 377;
            else
            if(k1 == 2)
                k1 = 378;
            else
                k1 = 379;
            l2 = 0;
            byte0 = 4;
        }
        if(i2 == 7 || i2 == 5)
        {
            l2 = 0;
            byte0 = 4;
            k1 = 380;
        }
        a(g1, x.h(al1.v_()), k1, font, i1 - 40, l1 + l2, j1 - byte0, flag);
    }

    public static void a(Graphics g1, k k1)
    {
        if(!t.g(277))
            return;
        boolean flag;
        int i1 = (flag = t.g(230)) ? g1.getClipWidth() - 4 : 18;
        int j1 = -1;
        int l1 = 0;
        boolean flag1 = false;
        int i2 = 0;
        if(k1 != null)
        {
            j1 = k1.d;
            l1 = k1.e;
            if(j1 >= 0)
            {
                flag1 = true;
                if(j1 <= 45)
                    i2 = 65280;
                else
                if(j1 > 45 && j1 < 75)
                    i2 = 0xf9aa01;
                else
                    i2 = 0xff0000;
            }
        }
        int j2;
        int k2;
        if(k1 != null)
        {
            j2 = k1.d;
            k2 = k1.e;
        } else
        {
            j2 = -1;
            k2 = -1;
        }
        if(c != j2 || d != k2)
        {
            t.a(1344, a(j1, k1));
            c = j2;
            d = k2;
        }
        k1 = t.c(1344);
        Font font = g1.getFont();
        j2 = g1.getColor();
        Font font1;
        g1.setFont(font1 = t.r());
        int l2 = t.f(1419);
        int i3;
        int j3 = t.f((i3 = t.f(72)) + 4841);
        int k3 = l2 <= 18 ? 18 : l2;
        int l3 = g1.getClipHeight() - k3 - 1;
        if(flag)
        {
            g1.setColor(t.f(i3 + 5057));
            g1.fillRoundRect(2, l3, i1, k3, 10, 10);
        }
        g1.setColor(j3);
        if(flag)
            g1.drawRoundRect(2, l3, i1, k3, 10, 10);
        i1 = 0;
        if(flag1)
        {
            g1.setColor(i2);
            g1.fillRoundRect(6, l3 + (k3 - 10) / 2, 10, 10, 5, 5);
            i1 = 10;
            g1.setColor(j3);
            g1.drawRoundRect(6, l3 + (k3 - 10) / 2, 10, 10, 5, 5);
            if(l1 > 0 && flag)
            {
                l1 = l1 != 1 ? 211 : 212;
                (new ar(g1)).a(l1, 20 + font1.stringWidth(k1) + 4, l3 + (k3 - 16) / 2);
            }
            g1.setColor(j3);
        }
        if(flag)
            g1.drawString(k1, i1 + 10, l3 + (k3 - l2) / 2, 20);
        g1.setColor(j2);
        g1.setFont(font);
    }

    private static String a(int i1, k k1)
    {
        Object obj;
label0:
        {
            obj = t.c(936);
            obj = bh.r().append(((String) (obj)));
            if(i1 < 0 || k1 == null)
            {
                i1 = 937;
                break label0;
            }
            ((StringBuffer) (obj)).append(i1);
            if(i1 <= 4 || i1 >= 21)
            {
                if(i1 % 10 == 1)
                {
                    i1 = 939;
                    break label0;
                }
                if(i1 % 10 > 1 && i1 % 10 < 5)
                {
                    i1 = 940;
                    break label0;
                }
            }
            i1 = 938;
        }
        return bh.b(((StringBuffer) (obj)).append(t.c(i1)));
    }

    public static boolean a(int i1, int j1, int k1, int l1)
    {
        if((k1 = x.b(i1 = x.d(j1 - i1), j1 = x.d(l1 - k1))) >= 5)
            return true;
        if(k1 == 4)
            return x.c(i1, j1) >= 3;
        else
            return false;
    }

    private static int b(int i1, int j1, int k1, int l1)
    {
        int i2 = 0;
        if(j1 > l1)
            i2++;
        else
        if(j1 < 0)
            i2 += 2;
        if(i1 > k1)
            i2 += 4;
        else
        if(i1 < 0)
            i2 += 8;
        return i2;
    }

    private static boolean a(int i1, int j1)
    {
        return (i1 & j1) != 0;
    }

    private static boolean b(int i1, int j1)
    {
        return (i1 | j1) == 0;
    }

    private static boolean a(int i1, int j1, int k1, int l1, int i2, int j2)
    {
        do
        {
            int k2 = b(i1, j1, i2, j2);
            int l2 = b(k1, l1, i2, j2);
            if(a(k2, l2))
                return false;
            if(b(k2, l2))
                return true;
            if(k2 == 0)
            {
                k2 = i1;
                i1 = k1;
                k1 = k2;
                k2 = j1;
                j1 = l1;
                l1 = k2;
                k2 = l2;
            }
            if((k2 & 1) != 0)
            {
                i1 += ((k1 - i1) * (j2 - j1)) / (l1 - j1);
                j1 = j2;
            } else
            if((k2 & 2) != 0)
            {
                i1 += ((i1 - k1) * j1) / (l1 - j1);
                j1 = 0;
            } else
            if((k2 & 4) != 0)
            {
                j1 += ((l1 - j1) * (i2 - i1)) / (k1 - i1);
                i1 = i2;
            } else
            if((k2 & 8) != 0)
            {
                j1 += ((j1 - l1) * i1) / (k1 - i1);
                i1 = 0;
            }
        } while(true);
    }

    private static int a(int i1, long l1)
    {
        return a((int)q.e(q.c(q.l(q.f(q.a(r.b(l1)))), q.c((50L * v.x(i1)) / v.y(i1)))));
    }

    private static int a(int i1)
    {
        int j1 = i1 >= 100 ? i1 >= 1000 ? i1 >= 10000 ? i1 >= 0x186a0 ? 0x186a0 : 10000 : 1000 : 100 : 25;
        return (i1 / j1) * j1;
    }

    private static int a(int i1, int j1, long l1)
    {
        long l2 = q.l(q.f(q.a(r.b(l1))));
        return (int)q.e(q.d(q.c(v.c(i1, j1)), l2));
    }

    private static String b(int i1)
    {
        StringBuffer stringbuffer = bh.r();
        if(i1 < 1000)
            stringbuffer.append(i1).append(t.c(949));
        else
            stringbuffer.append(i1 / 1000).append(t.c(950));
        return bh.b(stringbuffer);
    }

    private static void a(Graphics g1, int i1, int j1, int k1, int l1)
    {
        int i2 = x.d(k1 - i1);
        int j2 = x.d(l1 - j1);
        int k2;
        k2 = (k2 = t.f(39)) != 15 && k2 != 16 ? ((int) (k2 != 14 ? 6 : 9)) : 11;
        boolean flag;
        j2 = (flag = j2 > i2) ? i1 - 3 : i1;
        int l2 = flag ? j1 : j1 - 3;
        int i3 = flag ? i1 + 3 : i1;
        int j3 = flag ? j1 : j1 + 3;
        int k3 = flag ? k1 + 3 : k1;
        int l3 = flag ? l1 : l1 + 3;
        int i4 = flag ? k1 - 3 : k1;
        flag = flag ? ((boolean) (l1)) : ((boolean) (l1 - 3));
        g1.fillTriangle(j2, l2, i3, j3, k3, l3);
        g1.fillTriangle(k3, l3, i4, flag, j2, l2);
        g1.fillArc(i1 - k2 / 2, j1 - k2 / 2, k2, k2, 0, 360);
        g1.fillArc(k1 - k2 / 2, l1 - k2 / 2, k2, k2, 0, 360);
    }

    public static void a(Graphics g1, long l1, long l2, int i1, int j1, int k1)
    {
        boolean flag = false;
        Object obj = null;
        long l3;
        long l4;
        m m1;
        for(Enumeration enumeration = m.y(); enumeration.hasMoreElements();)
            if(x.b(l3 = (m1 = (m)enumeration.nextElement()).c(i1) - l1) < (long)(j1 / 2) && x.b(l4 = l2 - m1.d(i1)) < (long)(k1 / 2) && m1.d)
            {
                g1.drawImage(a.f(29), (int)l3 + j1 / 2, (int)l4 + k1 / 2, 36);
                if(x.b(l1 - m1.c(i1)) < 20L && (l3 = (int)(l2 - m1.d(i1))) < 20 && l3 > -10 && !flag)
                {
                    obj = m1;
                    flag = true;
                }
            }

        if(!o.u())
        {
            if(flag)
            {
                o.a(((al) (obj)));
                return;
            }
            o.v();
        }
    }

    public static void b(Graphics g1, long l1, long l2, int i1, int j1, int k1)
    {
        if(!t.g(276))
            return;
        if(!t.g(279))
            return;
        if(ay.x())
            return;
        Vector vector;
        int i2;
        if((i2 = (vector = bb.l()).size()) > 0)
        {
            long l3 = (l1 - (long)(j1 / 2)) / 32L;
            long l4 = (l2 - (long)(j1 / 2)) / 32L;
            long l5 = (l1 + (long)(j1 / 2)) / 32L;
            long l6 = (l2 + (long)(j1 / 2)) / 32L;
            al al4 = ay.f;
            if(b == null || l3 < j || l4 < k || l5 > l || l6 > m)
            {
                j = l3 - 10L;
                k = l4 - 10L;
                l = l5 + 10L;
                m = l6 + 10L;
                l3 = (int)(l - j) + 1;
                int j2 = (int)(m - k) + 1;
                al aal1[] = b = new al[l3 * j2];
                for(int j3 = 0; j3 < i2; j3++)
                {
                    al al5;
                    if((al5 = (al)vector.elementAt(j3)).u_() && al4 != al5)
                    {
                        long l8 = al5.a(i1);
                        long l10 = al5.b(i1);
                        int k3 = (int)(l8 / 32L);
                        int j4 = (int)(l10 / 32L);
                        if((long)k3 >= j && (long)k3 <= l && (long)j4 >= k && (long)j4 <= m)
                        {
                            int i5 = (int)((long)k3 - j);
                            int k2 = (int)((long)j4 - k);
                            al al3;
                            if((al3 = aal1[k2 * l3 + i5]) == null)
                                aal1[k2 * l3 + i5] = al5;
                            else
                            if(al3.t_() == 5)
                                ((ac)al3).a(al5);
                            else
                            if(al3.t_() == 3)
                            {
                                ac ac1;
                                (ac1 = new ac((byte)0)).a(al5);
                                ac1.a(al3);
                                aal1[k2 * l3 + i5] = ac1;
                            }
                        }
                    }
                }

            }
            al aal[] = b;
            al al1 = null;
            al al2;
            for(int i3 = aal.length; --i3 >= 0;)
                if((al2 = aal[i3]) != null)
                {
                    long l7 = al2.a(i1);
                    long l9 = al2.b(i1);
                    int j5 = (int)((long)(j1 / 2) + (l7 - l1));
                    int i4 = (int)((long)(k1 / 2) + (l2 - l9));
                    int k4;
                    Image image;
                    if((image = (k4 = al2.t_()) != 3 ? k4 != 5 ? null : a.f(23) : a.f(26)) != null)
                        g1.drawImage(image, j5, i4, 3);
                    if(x.b(l1 - l7) < 20L && x.b(l2 - l9) < 20L && al1 == null)
                        al1 = al2;
                }

            if(!o.u())
                if(al1 != null)
                    o.a(al1);
                else
                    o.v();
        }
        bh.a(vector);
    }

    public static void c(Graphics g1, long l1, long l2, int i1, int j1, int k1)
    {
        if(!t.g(276))
            return;
        if(ay.x())
            return;
        al al1;
        if((al1 = ay.f) != null)
        {
            long l3 = al1.a(i1);
            long l4 = al1.b(i1);
            i1 = (int)((long)(j1 / 2) + (l3 - l1));
            j1 = (int)((long)(k1 / 2) + (l2 - l4));
            g1.drawImage(a.f(26), i1, j1, 3);
            if(x.b(l1 - l3) < 20L && x.b(l2 - l4) < 20L)
                o.a(al1);
        }
    }

    public static void d(Graphics g1, long l1, long l2, int i1, int j1, int k1)
    {
        if(!t.g(276))
            return;
        if(!t.g(278))
            return;
        if(ay.x())
            return;
        t.c(1527, 0);
        Vector vector;
        int i2;
        if((i2 = (vector = bb.m()).size()) == 0)
            return;
        Object obj = null;
        for(int j2 = 0; j2 < i2; j2++)
        {
            bi bi1;
            if((bi1 = (bi)vector.elementAt(j2)).u_())
            {
                long l3 = bi1.a(i1);
                long l4 = bi1.b(i1);
                int k2 = (int)((long)(j1 / 2) + (l3 - l1));
                int i3 = (int)((long)(k1 / 2) + (l2 - l4));
                if(k2 > 0 && k2 < j1 && i3 > 0 && i3 < k1)
                    g1.drawImage(a.f(22), k2, i3, 3);
                if(x.b(l1 - l3) < 20L && x.b(l2 - l4) < 20L && obj == null)
                    obj = bi1;
            }
        }

        if(!o.u())
            if(obj != null)
            {
                o.a(((al) (obj)));
                if(((bi) (obj)).d.e)
                    t.c(1527, 1);
                t.d(obj);
            } else
            {
                o.v();
            }
        ay.l();
    }

    public static void e(Graphics g1, long l1, long l2, int i1, int j1, int k1)
    {
        if(!t.g(276))
            return;
        if(!t.g(280))
            return;
        if(ay.x())
            return;
        int i2;
        Vector vector;
        if((vector = t.n(1364)) == null || (i2 = vector.size()) == 0)
            return;
        al al1 = null;
        int j2 = t.f(39);
        for(int k2 = 0; k2 < i2; k2++)
        {
            al al2;
            if((al2 = (al)vector.elementAt(k2)).u_() && j2 == al2.h())
            {
                long l3 = al2.a(i1);
                long l4 = al2.b(i1);
                int i3 = (int)((long)(j1 / 2) + (l3 - l1));
                int j3 = (int)((long)(k1 / 2) + (l2 - l4));
                if(i3 > 0 && i3 < j1 && j3 > 0 && j3 < k1)
                {
                    int k3;
                    Image image;
                    if(al2.t_() == 8)
                        image = (k3 = ((af)al2).d) != 1 && k3 != 0 ? a.f(28) : a.f(27);
                    else
                        image = a.f(23);
                    g1.drawImage(image, i3, j3, 3);
                }
                if(x.b(l1 - l3) < 20L && x.b(l2 - l4) < 20L && al1 == null)
                    al1 = al2;
            }
        }

        if(!o.u())
        {
            if(al1 != null)
            {
                o.a(al1);
                return;
            }
            o.v();
        }
    }

    public static void f(Graphics g1, long l1, long l2, int i1, int j1, int k1)
    {
        if(!t.g(277))
            return;
        if(ay.x())
            return;
        Vector vector;
        int i2;
        if(i1 < 9 || (vector = ay.g) == null || (i2 = vector.size()) == 0)
            return;
        long l3 = l1 - (long)(j1 / 2);
        long l4 = l2 - (long)(j1 / 2);
        long l5 = l1 + (long)(j1 / 2);
        long l6 = l2 + (long)(j1 / 2);
        long l7 = l3 / 32L;
        long l8 = l4 / 32L;
        long l9 = l5 / 32L;
        long l10 = l6 / 32L;
        l3 = (int)(l9 - l7) + 1;
        int j2 = (int)(l10 - l8) + 1;
        int ai[] = new int[l3 * j2];
        String s1 = null;
        int k2 = 0;
        l5 = 0;
        for(int i3 = 0; i3 < i2; i3++)
        {
            Object aobj[];
            if(!m.b((String)(aobj = (Object[])vector.elementAt(i3))[0]))
            {
                long l11 = ay.a(aobj);
                long l12 = ay.b(aobj);
                long l13 = v.c(l11, i1);
                long l14 = v.c(l12, i1);
                int j3 = (int)(l13 / 32L);
                int k3 = (int)(l14 / 32L);
                Image image;
                if((long)j3 >= l7 && (long)j3 <= l9 && (long)k3 >= l8 && (long)k3 <= l10 && (image = m.d((String)aobj[0])) != null)
                {
                    j3 = (int)((long)j3 - l7);
                    k3 = (int)((long)k3 - l8);
                    if(ai[k3 * l3 + j3] == 0)
                    {
                        int i4 = (int)((long)(j1 / 2) + (l13 - l1));
                        int j4 = (int)((long)(k1 / 2) + (l2 - l14));
                        g1.drawImage(image, i4, j4, 3);
                        ai[k3 * l3 + j3] = 1;
                        String s2;
                        if(s1 == null && x.b(l1 - l13) < 20L && x.b(l2 - l14) < 20L && x.n(s2 = (String)aobj[2]))
                        {
                            s1 = s2;
                            k2 = i4;
                            l5 = (j4 - image.getHeight() / 2) + 2;
                        }
                    }
                }
            }
        }

        if(s1 != null)
            a(g1, s1, t.r(), j1 - 40, k2, l5);
    }

    private static void a(Graphics g1, int i1, int j1, Font font, int k1)
    {
        Font font1 = g1.getFont();
        g1.setFont(font);
        int ai[];
        int i2 = (int)v.c((ai = p.a(0))[0], k1);
        k1 = (int)v.c(ai[1], k1);
        if(x.d(i1 - i2) < 7 && x.d(j1 - k1) < 7)
        {
            i1 = font.getHeight();
            j1 = g1.getClipHeight() - i1 - 1;
            k1 = 22;
            if(t.g(230))
            {
                int l1 = i1 <= 18 ? 18 : i1;
                j1 -= l1 + 2;
                k1 -= 20;
            }
            String s1 = t.c(943);
            font = font.stringWidth(s1) + 6;
            int j2 = t.f(72);
            g1.setColor(t.f(j2 + 5057));
            g1.fillRoundRect(k1, j1, font, i1, 10, 10);
            g1.setColor(t.f(j2 + 4841));
            g1.drawRoundRect(k1, j1, font, i1, 10, 10);
            g1.drawString(s1, k1 + 3, j1, 20);
            g1.setFont(font1);
        }
    }

    private static boolean a(Graphics g1, int i1, int j1, int k1, int l1, Font font, int i2)
    {
        int j2;
        if((j2 = p.l()) < 2)
            return false;
        boolean flag = false;
        String s1 = null;
        int k2 = 0;
        int l2 = 0;
        int ai[];
        int j3 = (int)v.c((ai = p.a(0))[0], i2);
        int i3 = (int)v.c(ai[1], i2);
        int k3 = j3 - (k1 - i1 / 2);
        int l3 = (l1 + j1 / 2) - i3;
        String as[] = p.b(0);
        if(x.d(k1 - j3) < 7 && x.d(l1 - i3) < 7 && as != null)
        {
            if(as[0] != null)
            {
                s1 = as[0];
                k2 = k3;
                l2 = l3;
                flag = true;
            }
        } else
        {
            g1.drawImage(a.f(20), k3, l3, 36);
        }
        j3 = (int)v.c((i3 = p.a(j2 - 1))[0], i2);
        i3 = (int)v.c(i3[1], i2);
        k3 = j3 - (k1 - i1 / 2);
        l3 = (l1 + j1 / 2) - i3;
        as = p.b(j2 - 1);
        if(x.d(k1 - j3) < 7 && x.d(l1 - i3) < 7 && as != null && !flag)
        {
            if(as[0] != null)
            {
                s1 = as[0];
                k2 = k3;
                l2 = l3;
                flag = true;
            }
        } else
        {
            g1.drawImage(a.f(21), k3, l3, 36);
        }
        if(flag)
            a(g1, s1, font, i1 - 40, k2, l2);
        return flag;
    }

    public static void a(Graphics g1, long l1, long l2, long l3, long l4, int j1, int k1, int i2)
    {
        if(!p.e && !p.e() && !p.f())
        {
            t.c(1526, 0);
            return;
        }
        int j2 = g1.getColor();
        int k2;
        k2 = (k2 = t.f(73)) != 0 ? ((int) (k2 != 1 ? 16 : 0)) : 8;
        Font font = Font.getFont(64, 0, k2);
        int i3 = (k1 / 2) * v.z(j1);
        int j3 = (int)(l3 - (long)i3);
        l3 = (int)(l3 + (long)i3);
        i1 = (int)(l4 + (long)i3);
        l4 = (int)(l4 - (long)i3);
        i1 = (l3 = p.a(j3, i1, l3, l4)).size();
        l4 = p.l();
        t.a(1526, i1 > 0);
        obj = null;
        i3 = 0;
        j3 = 0;
        if(l4 > 1)
        {
            g1.setColor(13311);
            for(int k3 = 0; k3 < i1; k3++)
            {
                Object aobj[];
                int j5;
                for(int k5 = (j5 = (aobj = (Object[])((Object[])l3.elementAt(k3))[1]).length) - 1; k5 > 0; k5--)
                    if(aobj[k5] != null)
                    {
                        int l5 = (int)(v.c(((int[])((Object[])aobj[k5])[0])[0], j1) - (l1 - (long)(k1 / 2)));
                        int i6 = (int)((l2 + (long)(i2 / 2)) - v.c(((int[])((Object[])aobj[k5])[0])[1], j1));
                        do
                        {
                            Object aobj1[] = (Object[])aobj[j5 - k5];
                            String as[] = null;
                            if(aobj1 != null && aobj1.length == 3)
                            {
                                (as = new String[2])[0] = (String)aobj1[1];
                                as[1] = (String)aobj1[2];
                            }
                            if(as != null)
                            {
                                int k6 = (int)v.c(((int[])aobj1[0])[0], j1);
                                int i7 = (int)v.c(((int[])aobj1[0])[1], j1);
                                int k7 = (int)(v.c(((int[])aobj1[0])[0], j1) - (l1 - (long)(k1 / 2)));
                                int j6 = (int)((l2 + (long)(i2 / 2)) - v.c(((int[])aobj1[0])[1], j1));
                                if(x.b(l1 - (long)k6) < 7L && x.b(l2 - (long)i7) < 7L && obj == null)
                                {
                                    obj = as[0];
                                    i3 = k7;
                                    j3 = j6;
                                }
                            }
                            if(aobj[k5 - 1] == null)
                                break;
                            int l6 = (int)(v.c(((int[])((Object[])aobj[k5 - 1])[0])[0], j1) - (l1 - (long)(k1 / 2)));
                            int j7 = (int)((l2 + (long)(i2 / 2)) - v.c(((int[])((Object[])aobj[k5 - 1])[0])[1], j1));
                            if(a(l5, l6, i6, j7) || k5 - 1 == 0)
                            {
                                if(a(l5, i6, l6, j7, k1, i2))
                                    a(g1, l5, i6, l6, j7);
                                break;
                            }
                            if(k5 <= 0)
                                break;
                            k5--;
                        } while(true);
                    }

            }

        } else
        {
            if(p.e())
            {
                int i4 = (int)(v.c(p.a[0], j1) - (l1 - (long)(k1 / 2)));
                int k4 = (int)((l2 + (long)(i2 / 2)) - v.c(p.a[1], j1));
                if(i4 > 0 && i4 < k1 && k4 > 0 && k4 < i2)
                    g1.drawImage(a.f(20), i4, k4, 36);
            }
            if(p.f())
            {
                int j4 = (int)(v.c(p.b[0], j1) - (l1 - (long)(k1 / 2)));
                int i5 = (int)((l2 + (long)(i2 / 2)) - v.c(p.b[1], j1));
                if(j4 > 0 && j4 < k1 && i5 > 0 && i5 < i2)
                    g1.drawImage(a.f(21), j4, i5, 36);
            }
        }
        g(g1, l1, l2, j1, k1, i2);
        l3 = a(g1, k1, i2, (int)l1, (int)l2, font, j1);
        if(obj != null && l3 == 0)
            a(g1, obj, font, k1 - 40, i3, j3);
        if(l4 > 1)
            a(g1, (int)l1, (int)l2, font, j1);
        g1.setColor(j2);
    }

    private static void g(Graphics g1, long l1, long l2, int i1, int j1, int k1)
    {
        Vector vector;
        int i2 = (vector = p.c).size();
        int j2 = g1.getColor();
        boolean flag = false;
        for(int i3 = 0; i3 < i2; i3++)
        {
            Object aobj[] = (Object[])vector.elementAt(i3);
            int ai[] = null;
            if(aobj[0] != null)
                ai = p.a(((Integer)aobj[0]).intValue());
            if(ai == null)
                ai = (int[])aobj[1];
            if(ai != null)
            {
                int j3 = (int)v.c(ai[0], i1);
                int k2 = (int)v.c(ai[1], i1);
                int k3 = j3 - ((int)l1 - j1 / 2);
                int l3 = ((int)l2 + k1 / 2) - k2;
                if(k3 > 0 && k3 < j1 && l3 > 0 && l3 < k1)
                {
                    if(x.b(l1 - (long)j3) < 20L && x.b(l2 - (long)k2) < 20L && !flag)
                    {
                        t.a(1555, t.g(1553));
                        t.a(1554, t.g(1553) && !t.g(1555));
                        k2 = 11;
                        g1.setColor(45, 253, 24);
                        p.d = aobj;
                        flag = true;
                    } else
                    {
                        if(!flag)
                        {
                            boolean flag1 = false;
                            t.c(1555, 0);
                            t.a(1554, t.g(1553) && !t.g(1555));
                            Object obj = null;
                            p.d = null;
                        }
                        k2 = 9;
                        g1.setColor(40, 221, 22);
                    }
                    g1.fillArc(k3 - k2 / 2, l3 - k2 / 2, k2, k2, 0, 360);
                    g1.setColor(13311);
                    g1.drawArc(k3 - k2 / 2, l3 - k2 / 2, k2, k2, 0, 360);
                }
            }
        }

        g1.setColor(j2);
    }

    public static void a(Graphics g1, int i1, int j1, long l1)
    {
        if(l1 == 0L)
            return;
        if((l1 = (int)(System.currentTimeMillis() - l1)) < 200)
        {
            return;
        } else
        {
            l1 = l1 >= 300 ? ((long) (l1 >= 400 ? ((long) (l1 >= 500 ? 140 : 120)) : 80)) : 40;
            k1 = g1.getColor();
            g1.setColor(t.f(5057 + t.f(72)));
            g1.fillArc(i1 - l1 / 2, j1 - l1 / 2, l1, l1, 0, 360);
            g1.setColor(k1);
            return;
        }
    }

    public static String a(String s1)
    {
        return a(s1, 1015, 0x31255);
    }

    public static Vector b(String s1)
    {
        v.b();
        Vector vector = bh.q();
        if(!g(s1))
            vector.addElement(s1);
        else
            try
            {
                int i1 = 0;
                int j1 = 0;
                int k1;
                for(; (k1 = s1.indexOf(t.c(0x130276), i1)) >= 0; vector.addElement(ab.a(s1, k1, i1)))
                {
                    j1 = k1;
                    if(i1 != k1)
                        vector.addElement(ab.a(s1, i1, k1));
                    if((i1 = s1.indexOf(' ', k1)) >= 0)
                        continue;
                    vector.addElement(ab.c(s1, k1));
                    break;
                }

                if((i1 = s1.indexOf(' ', j1)) >= 0)
                    vector.addElement(ab.c(s1, i1));
            }
            catch(Throwable _ex) { }
        v.j();
        return vector;
    }

    private static int c(String s1, int i1)
    {
        v.b();
        return t.a(s1, i1);
    }

    private static int d(String s1, int i1)
    {
        v.b();
        return s1.indexOf(bh.a(0x3d786d26L), i1);
    }

    public static int a(String s1, int i1)
    {
        v.b();
        return t.b(s1, i1);
    }

    public static String c(String s1)
    {
        v.b();
        try
        {
            if(n(s1))
            {
                int i1 = c(s1, 0x3d746d26);
                int j1;
                return p((j1 = d(s1, c(s1, 0x3d786d26) + 4)) >= 0 ? ab.a(s1, i1 + 4, j1) : ab.c(s1, i1 + 4));
            }
            if(o(s1))
                return t.c(959);
        }
        catch(Throwable _ex) { }
        return null;
    }

    public static String d(String s1)
    {
        v.b();
        try
        {
            if(n(s1))
                return ab.a(s1, c(s1, 0x3d786d26) + 4, c(s1, 0x3d796d26));
            if(o(s1))
                return ab.a(s1, c(s1, 0x3d7823) + 3, c(s1, 0x3d7926));
        }
        catch(Throwable _ex) { }
        return null;
    }

    public static String e(String s1)
    {
        v.b();
        try
        {
            if(n(s1))
                return ab.a(s1, c(s1, 0x3d796d26) + 4, c(s1, 0x3d746d26));
            if(o(s1))
                return ab.a(s1, c(s1, 0x3d7926) + 3, c(s1, 0x3d7a26));
        }
        catch(Throwable _ex) { }
        return null;
    }

    public static String f(String s1)
    {
        v.b();
        try
        {
            return ab.a(s1, c(s1, 0x3d7a26) + 3, a(s1, 0x60c4b));
        }
        catch(Throwable _ex)
        {
            return null;
        }
    }

    private static boolean m(String s1)
    {
        return a(s1, 0x130276) >= 0;
    }

    public static boolean b(String s1, int i1)
    {
        return t.b(s1, i1) >= 0;
    }

    private static boolean e(String s1, int i1)
    {
        return c(s1, i1) >= 0;
    }

    public static boolean g(String s1)
    {
        return m(s1) && (e(s1, 0x3d7823) && e(s1, 0x3d7926) && e(s1, 0x3d7a26) || e(s1, 0x3d786d26) && e(s1, 0x3d796d26) && e(s1, 0x3d746d26));
    }

    private static boolean n(String s1)
    {
        v.b();
        return m(s1) && e(s1, 0x3d7823) && e(s1, 0x3d7926) && e(s1, 0x3d7a26) && e(s1, 0x3d786d26) && e(s1, 0x3d796d26) && e(s1, 0x3d746d26);
    }

    private static boolean o(String s1)
    {
        v.b();
        return m(s1) && e(s1, 0x3d7823) && e(s1, 0x3d7926) && e(s1, 0x3d7a26) && !e(s1, 0x3d786d26) && !e(s1, 0x3d796d26) && !e(s1, 0x3d746d26);
    }

    public static String h(String s1)
    {
        v.b();
        if(ab.a(s1))
            return bh.a(0x41414141L);
        else
            return a(a(j(s1).e(), 0x1000b, 0x314cd), 0x10010, 0x314d0);
    }

    private static String a(String s1, int i1, int j1)
    {
        v.b();
        if(s1.indexOf(i1 = t.c(i1)) < 0)
            return s1;
        j1 = t.c(j1);
        StringBuffer stringbuffer = bh.r();
        int k1;
        int l1;
        for(l1 = 0; (k1 = s1.indexOf(i1, l1)) >= 0; l1 = k1 + i1.length())
            stringbuffer.append(ab.a(s1, l1, k1)).append(j1);

        return bh.b(stringbuffer.append(ab.c(s1, l1)));
    }

    public static s i(String s1)
    {
        return (new s()).e(j(s1));
    }

    public static s j(String s1)
    {
        v.b();
        s s2 = new s();
        int i1 = s1.length();
        for(int j1 = 0; j1 < i1; j1++)
        {
            int k1;
            if((k1 = s1.charAt(j1) & 0xffff) < 128)
                s2.f(k1);
            else
            if(k1 < 2048)
                s2.f(192 + (k1 >> 6)).f(128 + (k1 & 0x3f));
            else
                s2.f(224 + (k1 >> 12)).f(128 + (k1 >> 6 & 0x3f)).f(128 + (k1 & 0x3f));
        }

        return s2;
    }

    private static String p(String s1)
    {
        v.b();
        if(ab.a(s1, 0x41414141L))
            return t.i();
        else
            return b(z.i(a(a(a(s1, 0x314ca, 0x100d8), 0x314cd, 0x1000b), 0x314d0, 0x10010)));
    }

    private static String b(s s1)
    {
        StringBuffer stringbuffer = bh.r();
        while(s1.b > 0) 
        {
            int i1;
            int j1 = (i1 = s1.t()) <= 127 ? 0 : s1.t();
            int k1 = i1 <= 223 ? 0 : s1.t();
            int l1 = i1 <= 239 ? 0 : s1.t();
            stringbuffer.append(i1 >= 128 ? i1 >= 224 ? i1 >= 240 ? (char)((i1 - 240 << 18) + (j1 - 128 << 12) + (k1 - 128 << 6) + (l1 - 128)) : (char)((i1 - 224 << 12) + (j1 - 128 << 6) + (k1 - 128)) : (char)((i1 - 192 << 6) + (j1 - 128)) : (char)i1);
        }
        return bh.b(stringbuffer);
    }

    private static int a(s s1, int i1)
    {
        if((0xf0 & i1) == 240)
            i1 = 3;
        else
        if((0xe0 & i1) == 224)
            i1 = 2;
        else
        if((0xc0 & i1) == 192)
            i1 = 1;
        else
            return i1 >= 127 ? -1 : 0;
        if(s1.b < i1)
            return -1;
        for(int j1 = 0; j1 < i1; j1++)
            if((s1.i(j1) & 0xc0) != 128)
                return -1;

        return i1 + 1;
    }

    public static char a(s s1)
    {
        int i1 = s1.t();
        int k1;
        if((k1 = a(s1, i1)) == -1)
            return x.b(i1);
        if(k1 == 0)
            return (char)i1;
        if(k1 == 2)
            return (char)((i1 - 192 << 6) + (s1.t() - 128));
        for(int j1 = 0; j1 < k1 - 1; j1++)
            s1.t();

        return '?';
    }

    public static String k(String s1)
    {
        StringBuffer stringbuffer = bh.r();
        if(s1 == null || s1.length() == 0)
            return t.i();
        int i1 = 0;
        for(int j1 = 1; j1 < s1.length(); j1++)
            if((s1.charAt(j1 - 1) == '%' || s1.charAt(j1 - 1) == '\\') && s1.charAt(j1) == 'u')
            {
                i1 = Math.min(j1 + 5, s1.length());
                char c1 = (char)Integer.parseInt(s1.substring(j1 + 1, i1), 16);
                j1 = i1;
                stringbuffer.append(c1);
                i1 = 1;
            } else
            if(s1.charAt(j1 - 1) == '%' && s1.charAt(j1) == '%')
            {
                j1++;
                stringbuffer.append(s1.charAt(j1 - 1));
            } else
            {
                stringbuffer.append(s1.charAt(j1 - 1));
                i1 = 0;
            }

        if(i1 == 0)
            stringbuffer.append(s1.charAt(s1.length() - 1));
        return bh.b(stringbuffer);
    }

    public static String l(String s1)
    {
        if(!x.n(s1))
            return s1;
        String s2 = t.c(0x161d7b);
        StringBuffer stringbuffer = bh.r();
        s s3 = new s();
        for(int i1 = 0; i1 < s1.length(); i1++)
        {
            char c1;
            if((c1 = s1.charAt(i1)) == '%')
            {
                int j1 = i1 + 1;
                int k1 = 2;
                boolean flag = true;
                StringBuffer stringbuffer1 = bh.r();
                for(; j1 < s1.length(); j1++)
                {
                    char c2;
                    if((c2 = s1.charAt(j1)) == 'u')
                    {
                        flag = false;
                        break;
                    }
                    if(s2.indexOf(c2) != -1)
                    {
                        stringbuffer1.append(c2);
                        k1--;
                    } else
                    {
                        flag = false;
                        break;
                    }
                    if(k1 == 0)
                        break;
                }

                if(flag)
                {
                    i1 = Integer.parseInt(stringbuffer1.toString(), 16);
                    s3.f(i1);
                    i1 = j1;
                } else
                {
                    stringbuffer.append(c1);
                }
            } else
            {
                if(s3.b > 0)
                    stringbuffer.append(c(s3));
                stringbuffer.append(c1);
            }
        }

        if(s3.b > 0)
            stringbuffer.append(c(s3));
        return bh.b(stringbuffer);
    }

    private static String c(s s1)
    {
        String s2 = t.i();
        try
        {
            s2 = new String(s1.a, 0, s1.b, "UTF-8");
            s1.c();
        }
        catch(UnsupportedEncodingException _ex) { }
        return s2;
    }

    private static int c;
    private static int d;
    private static long e;
    private static long f;
    private static int g;
    private static String h;
    private static boolean i;
    public static int a[];
    private static long j;
    private static long k;
    private static long l;
    private static long m;
    public static al b[];
    private static long n;
    private static long o;
    private static int p;
}