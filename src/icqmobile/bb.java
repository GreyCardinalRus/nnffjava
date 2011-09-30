// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:40
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Vector;

public abstract class bb
{

    public static final void a()
    {
        Vector vector = bh.q();
        s s1 = ay.j(bh.a(0x636361L));
        try
        {
            while(s1.b > 0) 
            {
                Object obj = null;
                byte byte0;
                switch((byte0 = s1.q()) & 7)
                {
                case 0: // '\0'
                    vector.addElement(obj = new bi(s1));
                    break;

                case 1: // '\001'
                    vector.addElement(obj = new ax(s1));
                    break;

                case 2: // '\002'
                    vector.addElement(obj = new az(s1));
                    break;

                case 3: // '\003'
                    vector.addElement(obj = new ah(s1));
                    break;

                case 4: // '\004'
                    vector.addElement(obj = new a(s1));
                    break;
                }
                if((byte0 & 8) != 0)
                    ((ba) (obj)).a(s1);
            }
        }
        catch(Throwable _ex) { }
        t.a(1203, vector);
    }

    public static final int b()
    {
        int i1 = 0;
        for(int j1 = x.c(t.n(1203)); --j1 >= 0;)
        {
            int k1 = j1;
            if(ba.a(t.n(1203), k1) instanceof bi)
                i1++;
        }

        return i1;
    }

    public static final int c()
    {
        return x.c(t.n(1203));
    }

    public static final ba a(int i1)
    {
        return ba.a(t.n(1203), i1);
    }

    private static final void o()
    {
        a(false, false);
        t.a(true);
    }

    public static final void a(boolean flag, boolean flag1)
    {
        try
        {
            s s1 = new s();
            Vector vector = t.n(1203);
            s1.a(flag1 ? 20480 : 3072);
            for(int i1 = 0; i1 < x.c(vector);)
            {
                ba.a(vector, i1).a(s1, flag, flag1).b(s1);
                if(flag1)
                    x.a(vector);
                else
                    i1++;
            }

            ay.a(bh.a(0x636361L), s1, flag);
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    private static ba b(int i1, String s1)
    {
        Vector vector;
        ba ba1;
        for(int j1 = x.c(vector = t.n(1203)); --j1 >= 0;)
            if(i1 == (ba1 = ba.a(vector, j1)).a() && s1.equals(ba1.i))
                return ba1;

        return null;
    }

    private static final int p()
    {
        int i1 = 0;
        do
        {
            boolean flag = false;
            Vector vector;
            for(int j1 = x.c(vector = t.n(1203)); --j1 >= 0;)
                if(ba.a(vector, j1).h == i1)
                {
                    flag = true;
                    break;
                }

            if(!flag)
                return i1;
            i1++;
        } while(true);
    }

    private static final void a(int i1, String s1, String s2)
    {
        Vector vector = t.n(1203);
        int j1 = p();
        if(i1 == 0)
            vector.addElement(new bi(j1, s1, s2));
        else
        if(i1 == 1)
            vector.addElement(new ax(j1, s1, s2));
        else
        if(i1 == 2)
            vector.addElement(new az(j1, s1, s2));
        else
        if(i1 == 3)
            vector.addElement(new ah(j1, s1, s2));
        else
        if(i1 == 4)
            vector.addElement(new a(j1, s1, s2));
        bg.a();
    }

    public static final void a(ba ba1)
    {
        x.a(t.n(1203), ba1);
        bg.a();
        o();
    }

    public static final int a(int i1, ba ba1, String s1, String s2)
    {
        v.e();
        v.b();
        v.b();
        if(ab.a(s1))
            return 305;
        if(ab.a(s2))
            return 310;
        ba ba2 = b(i1, s1);
        if(ba1 != null)
            if(ba2 != null && ba2 != ba1)
                return 311;
            else
                return ba1.a(s1, s2);
        if(ba2 != null)
        {
            return 311;
        } else
        {
            a(i1, s1, s2);
            o();
            return 0;
        }
    }

    public static final void d()
    {
        Vector vector;
        for(int i1 = x.c(vector = t.n(1203)); --i1 >= 0;)
            ba.a(vector, i1).W();

    }

    public static final void a(String s1)
    {
        v.b();
        Vector vector;
        for(int i1 = x.c(vector = t.n(1203)); --i1 >= 0;)
            ba.a(vector, i1).j(s1);

    }

    public static final void b(String s1)
    {
        v.b();
        Vector vector;
        for(int i1 = x.c(vector = t.n(1203)); --i1 >= 0;)
            ba.a(vector, i1).i(s1);

    }

    public static final ba a(int i1, String s1)
    {
        v.b();
        Vector vector;
        ba ba1;
        for(int j1 = x.c(vector = t.n(1203)); --j1 >= 0;)
            if(s1.equals((ba1 = ba.a(vector, j1)).i) && ba1.a() == i1)
                return ba1;

        return null;
    }

    public static final Vector e()
    {
        Vector vector = bh.q();
        Vector vector1;
        Object obj;
        for(int i1 = x.c(vector1 = t.n(1203)); --i1 >= 0;)
            if((obj = vector1.elementAt(i1)) instanceof bi)
                vector.insertElementAt(obj, 0);

        return vector;
    }

    public static final Vector f()
    {
        Vector vector;
        for(int i1 = x.c(vector = e()); --i1 >= 0;)
            if(!bi.b(vector, i1).S())
                vector.removeElementAt(i1);

        return vector;
    }

    public static final Vector g()
    {
        Vector vector;
        for(int i1 = x.c(vector = e()); --i1 >= 0;)
            if(((ba) (bi.b(vector, i1))).s == 0)
                vector.removeElementAt(i1);

        return vector;
    }

    public static final int h()
    {
        int i1 = 0;
        Vector vector;
        for(int j1 = x.c(vector = e()); --j1 >= 0;)
            i1 += ((ba) (bi.b(vector, j1))).s;

        bh.a(vector);
        return i1;
    }

    public static final Vector i()
    {
        Vector vector = bh.q();
        Vector vector1;
        for(int i1 = x.c(vector1 = t.n(1203)); --i1 >= 0;)
            vector.insertElementAt(vector1.elementAt(i1), 0);

        return vector;
    }

    public static final void j()
    {
        boolean flag = true;
        for(int i1 = x.c(t.n(1203)); --i1 >= 0;)
            if(a(i1).R())
                flag = false;

        ba ba1;
        for(int j1 = x.c(t.n(1203)); --j1 >= 0;)
            if((ba1 = a(j1)).R())
            {
                if(!flag)
                    ba1.p();
            } else
            if(flag)
                ba1.b_(0);

    }

    public static final Vector b(ba ba1)
    {
        if(ba1 == null)
            return k();
        else
            return ba1.am();
    }

    public static final Vector k()
    {
        Vector vector = bh.q();
        Vector vector1;
        for(int i1 = x.c(vector1 = t.n(1203)); --i1 >= 0;)
        {
            Vector vector2;
            for(int j1 = x.c(vector2 = ba.a(vector1, i1).am()); --j1 >= 0;)
                vector.addElement(vector2.elementAt(j1));

            bh.a(vector2);
        }

        return vector;
    }

    public static final void b(int i1)
    {
        for(int j1 = c(); --j1 >= 0;)
            a(j1).d(i1);

    }

    public static final Vector c(ba ba1)
    {
        if(ba1 == null)
            return q();
        Vector vector = bh.q();
        ba ba2;
        for(int i1 = c(); --i1 >= 0;)
            if((ba2 = a(i1)) == ba1)
            {
                e e1;
                for(int j1 = ba2.g.size(); --j1 >= 0;)
                    if((e1 = ba2.o(j1)) != ba2.A && e1 != ba2.B && e1 != ba2.C && e1 != ba2.D)
                        vector.addElement(e1);

            }

        return vector;
    }

    private static Vector q()
    {
        Vector vector = bh.q();
        for(int i1 = c(); --i1 >= 0;)
        {
            ba ba1;
            for(int j1 = (ba1 = a(i1)).g.size(); --j1 >= 0;)
                vector.addElement(ba1.o(j1));

        }

        return vector;
    }

    private static void r()
    {
        Vector vector;
        for(int i1 = x.c(vector = e()); --i1 >= 0;)
            bi.b(vector, i1).r();

        bh.a(vector);
    }

    private static void s()
    {
        Vector vector;
        for(int i1 = x.c(vector = e()); --i1 >= 0;)
            bi.b(vector, i1).v();

        bh.a(vector);
    }

    private static void t()
    {
        Vector vector;
        for(int i1 = x.c(vector = e()); --i1 >= 0;)
            bi.b(vector, i1).w();

        bh.a(vector);
    }

    private static void u()
    {
        Vector vector;
        for(int i1 = x.c(vector = e()); --i1 >= 0;)
            bi.b(vector, i1).x();

        bh.a(vector);
    }

    public static final void a(bi bi1)
    {
        if(bi1 == null)
        {
            r();
            return;
        } else
        {
            bi1.r();
            return;
        }
    }

    public static final void b(bi bi1)
    {
        if(bi1 == null)
        {
            s();
            return;
        } else
        {
            bi1.v();
            return;
        }
    }

    public static final void c(bi bi1)
    {
        if(bi1 == null)
        {
            t();
            return;
        } else
        {
            bi1.w();
            return;
        }
    }

    public static final void d(bi bi1)
    {
        if(bi1 == null)
        {
            u();
            return;
        } else
        {
            bi1.x();
            return;
        }
    }

    public static final Vector l()
    {
        Vector vector1 = bh.q();
        Vector vector;
        for(int i1 = x.c(vector = e()); --i1 >= 0;)
        {
            Vector vector2;
            n n1;
            for(int j1 = (vector2 = bi.b(vector, i1).am()).size(); --j1 >= 0;)
                if((n1 = (n)vector2.elementAt(j1)).t())
                    vector1.addElement(n1);

            bh.a(vector2);
        }

        return vector1;
    }

    public static final Vector m()
    {
        Vector vector1 = bh.q();
        Vector vector;
        bi bi1;
        for(int i1 = x.c(vector = e()); --i1 >= 0;)
            if((bi1 = bi.b(vector, i1)).d.e())
                vector1.addElement(bi1);

        return vector1;
    }

    public static final bi e(bi bi1)
    {
        Vector vector = e();
        if(bi1 != null)
        {
            vector.addElement(bi1);
            bi1 = null;
        }
        bi bi2;
        for(int i1 = x.c(vector); --i1 >= 0;)
            if((bi2 = bi.b(vector, i1)).S())
            {
                bi1 = bi2;
                break;
            }

        bh.a(vector);
        return bi1;
    }

    public static final void a(String s1, String s2, String s3, String s4, String s5)
    {
        v.b();
        v.b();
        v.b();
        v.b();
        v.b();
        t.a(1202, s5);
        t.a(1201, x.a(x.a(x.a(x.a(x.a(bh.r(), 0x401b9, s1), 0x401bd, s2), 0x801c1, s3), 0x901c9, s4), 0x801d2, s5));
        v.a(13, v());
    }

    private static final int v()
    {
        return !v.bx() ? 0x493e0 : 60000;
    }

    public static final String[] n()
    {
        String s1;
        if(!t.g(1438))
            a(null, null, null, null, null);
        else
        if(v.b(13, v()))
            t.h(1201);
        if((s1 = t.c(1201)) == null)
            return null;
        s1;
        String s2;
        String s3 = t.c(1202);
        s3;
        s2 = t.c(312);
        s1 = s3;
        JVM INSTR ifnull 74;
           goto _L1 _L2
_L1:
        s1;
          goto _L3
_L2:
        s2;
_L3:
        x.a();
        return;
    }
}