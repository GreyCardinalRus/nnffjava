// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:41
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 


public final class j extends be
{

    public j(ax ax, int i, int i1, String s1, String s2, boolean flag)
    {
        super(ax);
        a = i;
        b = i1;
        c = s1;
        super.o = s2;
        super.p = ab.e(s2.toLowerCase());
        s = flag;
        super.l = n();
        super.q = ax.O().f(s1).l();
        ax.j(this);
        F();
        super.r = s1;
    }

    public final String a()
    {
        if(l())
            return t.i();
        else
            return super.a();
    }

    private int n()
    {
        return !l() ? 255 : 233;
    }

    public final void b()
    {
        super.l = n();
        g = false;
        h = false;
        super.b();
    }

    public final boolean a(int i)
    {
        return a == i || d == i || e == i || f == i;
    }

    public final String n_()
    {
        return c;
    }

    public j(ba ba1, s s1)
    {
        super(ba1);
        a = s1.g();
        b = s1.g();
        c = s1.j();
        g(s1.g(null));
        s = s1.n();
        s1.n();
        d = s1.x();
        e = s1.x();
        f = s1.x();
        if((super.m = s1.q()) != 0)
            r.c(this);
        super.l = n();
        super.q = ba1.O().f(c).l();
        ba1.j(this);
        F();
        super.r = c;
    }

    public final void a(s s1)
    {
        s1.r(a).r(b).a(c).b(super.o).a(s).a(false).o(d).o(e).o(f).f(super.m);
    }

    public final av o_()
    {
        return av.a(super.q).a(p_()).a(X(), g() ? 3 : ((int) (q_() ? 2 : 0)), q()).a(this);
    }

    private final int q()
    {
        if(super.l == 255 || super.l == 233)
            return 0;
        if(q_())
            return 4;
        return !g() ? 3 : 5;
    }

    public final void a(s s1, boolean flag)
    {
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag1 = super.j;
        super.l = n();
        super.j = false;
        g = false;
        h = false;
        flag2 = false;
        flag3 = false;
        flag4 = false;
        super.n = true;
        int i;
        int i1;
        s1.g(2);
        i = s1.x();
        i1 = 0;
          goto _L1
_L38:
        int j1;
        int k1;
        j1 = s1.x();
        k1 = s1.x();
        if(j1 != 3 && j1 != 55) goto _L3; else goto _L2
_L2:
        flag3 = true;
          goto _L4
_L3:
        if(j1 != 4) goto _L6; else goto _L5
_L5:
        flag4 = true;
          goto _L4
_L6:
        if(j1 != 6) goto _L8; else goto _L7
_L7:
        this;
        if((j1 = s1.z() & 0xffff) == 0) goto _L10; else goto _L9
_L9:
        if(j1 != 19) goto _L12; else goto _L11
_L11:
        0xfb0100;
          goto _L13
_L12:
        if(j1 != 17) goto _L15; else goto _L14
_L14:
        0xfe0100;
          goto _L13
_L15:
        if((j1 & 0x6000) != 24576) goto _L17; else goto _L16
_L16:
        0x1040100;
          goto _L13
_L17:
        if((j1 & 0x5000) != 20480) goto _L19; else goto _L18
_L18:
        0x1030100;
          goto _L13
_L19:
        if((j1 & 0x4000) != 16384) goto _L21; else goto _L20
_L20:
        0x1020100;
          goto _L13
_L21:
        if((j1 & 0x3000) != 12288) goto _L23; else goto _L22
_L22:
        0x1010100;
          goto _L13
_L23:
        if((j1 & 0x2000) != 8192) goto _L25; else goto _L24
_L24:
        0x1050100;
          goto _L13
_L25:
        if((j1 & 0x100) != 256) goto _L27; else goto _L26
_L26:
        0xfc0100;
          goto _L13
_L27:
        if((j1 & 0x20) != 32) goto _L29; else goto _L28
_L28:
        0xfa0100;
          goto _L13
_L29:
        if((j1 & 0x10) != 16) goto _L31; else goto _L30
_L30:
        0xfe0100;
          goto _L13
_L31:
        if((j1 & 4) != 4) goto _L33; else goto _L32
_L32:
        0xfd0100;
          goto _L13
_L33:
        if((j1 & 2) != 2) goto _L35; else goto _L34
_L34:
        0xfb0100;
          goto _L13
_L35:
        if((j1 & 1) != 1) goto _L10; else goto _L36
_L36:
        0xf90100;
          goto _L13
_L10:
        '\u0100';
_L13:
        l;
        k1 -= 4;
        super.j = true;
        flag2 = true;
          goto _L4
_L8:
        if(j1 == 13)
        {
            j1 = t.a(879);
            byte abyte0[] = t.a(880);
            byte abyte1[] = t.a(882);
            byte abyte2[] = s1.a;
            int j2 = s1.c;
            for(int k2 = 0; k2 < k1; k2 += 16)
            {
                int i3 = j2 + k2;
                for(int j3 = 0; j3 < 576; j3 += 16)
                    if(x.a(abyte1, j3, abyte2, i3, 16))
                    {
                        super.l &= 0xffff0000;
                        super.l |= (j3 >> 4) + 269;
                    }

                if(x.a(j1, 0, abyte2, i3, 16))
                    g = true;
                else
                if(x.a(abyte0, 0, abyte2, i3, 16))
                    h = true;
            }

        } else
        if(j1 == 29)
            while(0 < k1 - 4) 
            {
                int l1 = s1.x();
                k1 -= 2;
                int i2 = s1.x() & 0xff;
                k1 -= 2;
                if((i2 & 0x80) == 0 && k1 >= (i2 & 0x80))
                {
                    if(l1 == 14)
                    {
                        byte abyte3[];
                        s1.c(abyte3 = new byte[i2]);
                        String s2;
                        int l2;
                        if((s2 = ab.e(new String(abyte3))).startsWith(bh.a(0x646f6f6d716369L)) && (l2 = x.a(ab.c(s2, 7), 0, 23, -1)) >= 0)
                        {
                            super.l &= 0xffff0000;
                            super.l |= l2 + 269;
                        }
                        bh.a(abyte3);
                        k1 -= i2;
                    } else
                    {
                        s1.g(i2);
                        k1 -= i2;
                    }
                } else
                {
                    s1.g(i2);
                    k1 -= i2;
                }
            }
_L4:
        s1.g(k1);
        i1++;
_L1:
        if(i1 < i) goto _L38; else goto _L37
_L37:
        break MISSING_BLOCK_LABEL_731;
        JVM INSTR pop ;
        if(flag && !flag2 && flag3)
        {
            super.l = l() ? flag4 ? 388 : 241 : 256;
            super.j = true;
        } else
        if(l() && super.l == 256)
            super.l = 241;
        F();
        if(!flag1 && super.j)
            v.o(1);
        return;
    }

    public final int p_()
    {
        int i;
        if((i = super.p_()) == 16384 || i == 26)
            return i;
        if(j() || s_())
            return 263;
        else
            return i;
    }

    public final s a(int i, String s1, int i1)
    {
        s s2 = new s();
        if(i != 2)
            s2.o(305).m(s1);
        if(i == 5)
            s2.o(102).o(0);
        return (new s()).m(c).o(i1).o(a).o(0).e(s2);
    }

    public final boolean q_()
    {
        return d != 0;
    }

    public final boolean g()
    {
        return e != 0;
    }

    public final boolean r_()
    {
        return f != 0;
    }

    public final boolean s_()
    {
        return a == -1;
    }

    public final boolean j()
    {
        return s && a != -1;
    }

    public final void k()
    {
        if(!s_())
        {
            s = false;
            F();
        }
    }

    public final void a(int i, int i1)
    {
        if(i == 2)
        {
            d = i1;
            return;
        }
        if(i == 3)
        {
            e = i1;
            return;
        } else
        {
            f = i1;
            return;
        }
    }

    public final boolean l()
    {
        return c.endsWith(t.c(1014));
    }

    public final int a;
    public int b;
    public String c;
    private boolean s;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
}