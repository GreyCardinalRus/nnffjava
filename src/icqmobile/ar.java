// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:31
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import javax.microedition.lcdui.*;

public final class ar
{

    public ar()
    {
    }

    public ar(Graphics g)
    {
        b = g;
    }

    public ar(Image image)
    {
        a = image;
    }

    public ar(int i, int j)
    {
        c = Font.getFont(64, i, j);
    }

    public final ar a(int i)
    {
        b.setColor(i);
        return this;
    }

    public static final int a()
    {
        int i = b(25);
        int j = b(26);
        return (((i & 0xff0000) + (j & 0xff0000)) / 2 & 0xff0000) + (((i & 0xff00) + (j & 0xff00)) / 2 & 0xff00) + (((i & 0xff) + (j & 0xff)) / 2 & 0xff);
    }

    public static final int b()
    {
        int i = b(25);
        int j = b(27);
        return (((i & 0xff0000) + (j & 0xff0000)) / 2 & 0xff0000) + (((i & 0xff00) + (j & 0xff00)) / 2 & 0xff00) + (((i & 0xff) + (j & 0xff)) / 2 & 0xff);
    }

    public static final int b(int i)
    {
        return t.f(4841 + (i << 3) + t.f(72));
    }

    public final ar c(int i)
    {
        b.setColor(b(i));
        return this;
    }

    public final boolean a(int i, int j, int k, int l)
    {
        Graphics g;
        int i1;
        int j1;
        int k1;
        int j2;
        if(i + k >= (i1 = (g = b).getClipX()) && j + l >= (j1 = g.getClipY()) && i <= i1 + (k1 = g.getClipWidth()) && j <= j1 + (j2 = g.getClipHeight()))
        {
            if(i1 + k1 < i + k)
                k = (i1 + k1) - i;
            if(j1 + j2 < j + l)
                l = (j1 + j2) - j;
            if(i1 > i)
            {
                int l1 = i1 - i;
                i = i1;
                k -= l1;
            }
            if(k <= 0)
                return false;
            if(j1 > j)
            {
                int i2 = j1 - j;
                j = j1;
                l -= i2;
            }
            if(l <= 0)
            {
                return false;
            } else
            {
                g.setClip(i, j, k, l);
                return true;
            }
        } else
        {
            return false;
        }
    }

    public final ar b(int i, int j, int k, int l)
    {
        b.setClip(i, j, k, l);
        return this;
    }

    public final ar c(int i, int j, int k, int l)
    {
        b.drawLine(i, j, k, l);
        return this;
    }

    public final ar d(int i, int j, int k, int l)
    {
        b.fillRect(i, j, k, l);
        return this;
    }

    public final ar e(int i, int j, int k, int l)
    {
        b.drawRect(i, j, k, l);
        return this;
    }

    public final ar a(ar ar1)
    {
        b.setFont(ar1.c);
        return this;
    }

    public final ar a(String s, int i, int j, int k)
    {
        v.b();
        if(j > 0 && j < t.f(1510))
            b.drawString(s, i, j, k);
        return this;
    }

    public final ar a(String s, int i, int j, int k, int l)
    {
        v.b();
        if(l > 0 && l < t.f(1510))
            b.drawSubstring(s, i, j, k, l, 20);
        return this;
    }

    public final int a(String s)
    {
        if(s != null)
            return c.stringWidth(s);
        else
            return 0;
    }

    public final int a(String s, int i, int j)
    {
        v.b();
        if(j > 0)
            return c.substringWidth(s, i, j);
        else
            return 0;
    }

    public final void a(ar ar1, int i, int j)
    {
        b.drawImage(ar1.a, i, j, 20);
    }

    public final ar a(int i, int j, int k)
    {
        int l;
        while((l = i >>> 16) != 0) 
        {
            i = l;
            this = a(i & 0xffff, j, k);
        }
        if((i & 0x4000) != 0 && t.g(1515))
        {
            return this;
        } else
        {
            a.a(b, i & 0xffffbfff, j, k);
            return this;
        }
    }

    public static final int d(int i)
    {
        return i != 247 ? 16 : 6;
    }

    public final void a(int i, int j, int k, int l, int i1, int j1, boolean flag)
    {
        if(flag)
        {
            b.setColor(i1);
            b.fillRect(i, j, k, l);
            return;
        }
        for(flag = false; flag < l; flag++)
        {
            int k1 = (flag << 8) / l;
            int l1 = 256 - k1;
            b.setColor(((i1 >> 16 & 0xff) * l1 + (j1 >> 16 & 0xff) * k1 << 8 & 0xff0000) + ((i1 >> 8 & 0xff) * l1 + (j1 >> 8 & 0xff) * k1 & 0xff00) + ((i1 & 0xff) * l1 + (j1 & 0xff) * k1 >> 8 & 0xff));
            b.drawRect(i, j + flag, k, 0);
        }

    }

    public final void f(int i, int j, int k, int l)
    {
        c(49);
        d(i - 4, j - 4, k + 8, l + 8);
        c(43);
        d(i - 3, j - 3, k + 6, l + 6);
    }

    public final void a(int i, int j, int k, int l, int i1, boolean flag)
    {
        Graphics g = b;
        c(i1);
        g.fillRect(i, j, k, l);
        if(flag)
        {
            c(13);
            g.drawRect(i, j, k - 1, l - 1);
        }
    }

    public Image a;
    public Graphics b;
    public Font c;
}