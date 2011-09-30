// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:42
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 


public final class q
{

    private static boolean m(long l1)
    {
        return l1 < 0L;
    }

    private static int n(long l1)
    {
        return ((int)(l1 >> 52) & 0x7ff) - 1075;
    }

    private static long o(long l1)
    {
        if((l1 & 0x7ff0000000000000L) == 0L)
            return (l1 & 0xfffffffffffffL) << 1;
        else
            return l1 & 0xfffffffffffffL | 0x10000000000000L;
    }

    private static long a(boolean flag, int i1, long l1)
    {
        if(l1 != 0L)
        {
            int j1 = v.a(l1);
            l1 <<= j1;
            if((i1 -= j1) < -1085)
            {
                l1 = v.b(l1, -1074 - i1);
            } else
            {
                if((l1 = v.b(l1, 11)) == 0x20000000000000L)
                {
                    l1 = 0x10000000000000L;
                    i1++;
                }
                if(i1 > 960)
                    l1 = 0x7ff0000000000000L;
                else
                    l1 = l1 ^ 0x10000000000000L | (long)(i1 + 1086) << 52;
            }
        }
        if(flag)
            l1 |= 0x8000000000000000L;
        return l1;
    }

    private static boolean p(long l1)
    {
        return (l1 & 0x7fffffffffffffffL) > 0x7ff0000000000000L;
    }

    private static boolean q(long l1)
    {
        return (l1 & 0x7fffffffffffffffL) == 0x7ff0000000000000L;
    }

    private static boolean r(long l1)
    {
        return (l1 & 0x7fffffffffffffffL) == 0L;
    }

    public static long a(long l1)
    {
        if(p(l1))
            return 0x7ff8000000000000L;
        else
            return l1 ^ 0x8000000000000000L;
    }

    private static boolean f(long l1, long l2)
    {
        return !p(l1) && !p(l2) && i(l1, l2 != 0x8000000000000000L ? l2 : 0L) <= 0;
    }

    private static boolean g(long l1, long l2)
    {
        return !p(l1) && !p(l2) && i(l1 != 0L ? l1 : 0x8000000000000000L, l2) > 0;
    }

    private static boolean h(long l1, long l2)
    {
        return !p(l1) && !p(l2) && i(l1 != 0x8000000000000000L ? l1 : 0L, l2) >= 0;
    }

    public static final int b(long l1)
    {
        boolean flag = p(l1);
        boolean flag1 = p(0x3e7ad7f29abcaf48L);
        if(flag || flag1)
        {
            if(flag && flag1)
                return 0;
            return !flag ? -1 : 1;
        } else
        {
            return i(l1, 0x3e7ad7f29abcaf48L);
        }
    }

    private static final int i(long l1, long l2)
    {
        if(l1 == l2)
            return 0;
        if(l1 < 0L)
            return l2 >= 0L || l1 >= l2 ? -1 : 1;
        if(l2 < 0L)
            return 1;
        return l1 >= l2 ? 1 : -1;
    }

    public static final long c(long l1)
    {
        if(l1 < 0L)
            return a(true, 0, -l1);
        else
            return a(false, 0, l1);
    }

    public static final int d(long l1)
    {
        long l2;
        if((l2 = e(l1)) >= 0x7fffffffL)
            return 0x7fffffff;
        if(l2 <= 0xffffffff80000000L)
            return 0x80000000;
        else
            return (int)l2;
    }

    public static final long e(long l1)
    {
        if(p(l1))
            return 0L;
        boolean flag = m(l1);
        int i1 = n(l1);
        long l2 = o(l1);
        if(i1 > 0)
        {
            if(i1 >= 63 || l2 >> 63 - i1 != 0L)
                return !flag ? 0x7fffffffffffffffL : 0x8000000000000000L;
            l2 <<= i1;
        } else
        {
            if(i1 <= -53)
                return 0L;
            l2 >>>= -i1;
        }
        if(flag)
            return -l2;
        else
            return l2;
    }

    public static final long a(long l1, long l2)
    {
        if(p(l1) || p(l2))
            return 0x7ff8000000000000L;
        boolean flag = m(l1);
        boolean flag1 = m(l2);
        boolean flag2 = q(l1);
        boolean flag3 = q(l2);
        if(flag2 || flag3)
        {
            if(flag2 && flag3)
                if(flag != flag1)
                    return 0x7ff8000000000000L;
                else
                    return l1;
            if(flag2)
                return l1;
            else
                return l2;
        }
        flag2 = r(l1);
        flag3 = r(l2);
        if(flag2 || flag3)
        {
            if(flag2 && flag3)
                if(flag != flag1)
                    return 0L;
                else
                    return l1;
            if(flag2)
                return l2;
            else
                return l1;
        }
        long l3 = o(l1) << 3;
        l1 = n(l1) - 3;
        long l4 = o(l2) << 3;
        i1 = n(l2) - 3;
        if((l2 = l1 - i1) > 0)
            l4 = v.a(l4, l2);
        else
        if(l2 < 0)
        {
            l3 = v.a(l3, -l2);
            l1 = i1;
        }
        if(flag ^ flag1)
            if(l3 > l4)
            {
                l4 = -l4;
            } else
            {
                l3 = -l3;
                flag = flag1;
            }
        l3 += l4;
        long l5;
        if((l5 = a(flag, l1, l3)) == 0x8000000000000000L)
            return 0L;
        else
            return l5;
    }

    public static final long b(long l1, long l2)
    {
        return a(l1, a(l2));
    }

    public static final long c(long l1, long l2)
    {
        if(p(l1) || p(l2))
            return 0x7ff8000000000000L;
        boolean flag = m(l1) ^ m(l2);
        if(q(l1) || q(l2))
        {
            if(r(l1) || r(l2))
                return 0x7ff8000000000000L;
            return !flag ? 0x7ff0000000000000L : 0xfff0000000000000L;
        }
        long l3 = o(l1);
        l1 = n(l1);
        long l4 = o(l2);
        i1 = n(l2);
        l1 += i1;
        long l5 = l3 & 0xfffffffL;
        long l6 = l3 >> 28;
        long l7 = l4 & 0xfffffffL;
        long l8 = l4 >> 28;
        long l9 = l5 * l7;
        long l10 = l5 * l8 + l6 * l7;
        long l11 = l6 * l8;
        l9 += (l10 & 0xfffffffL) << 28;
        l11 = l11 + (l10 >>> 28) + (l9 >>> 56);
        l9 <<= 8;
        if(l11 == 0L)
            return a(flag, l1, l9);
        i1 = v.a(l11);
        l1 += 56 - i1;
        l11 = l11 << i1 | l9 >>> 64 - i1;
        if(l9 << i1 != 0L)
            l11 |= 1L;
        return a(flag, l1, l11);
    }

    public static final long d(long l1, long l2)
    {
        if(p(l1) || p(l2))
            return 0x7ff8000000000000L;
        boolean flag = m(l1) ^ m(l2);
        boolean flag1 = q(l1);
        boolean flag2 = q(l2);
        if(flag1 || flag2)
        {
            if(flag1 && flag2)
                return 0x7ff8000000000000L;
            if(flag1)
                return !flag ? 0x7ff0000000000000L : 0xfff0000000000000L;
            return !flag ? 0L : 0x8000000000000000L;
        }
        flag1 = r(l1);
        flag2 = r(l2);
        if(flag1 || flag2)
        {
            if(flag1 && flag2)
                return 0x7ff8000000000000L;
            if(flag1)
                return !flag ? 0L : 0x8000000000000000L;
            return !flag ? 0x7ff0000000000000L : 0xfff0000000000000L;
        }
        long l3 = o(l1);
        l1 = n(l1);
        long l4 = o(l2);
        i1 = n(l2);
        long l5 = 0L;
        l1 -= i1;
        do
        {
            if((i1 = x.c(v.a(l3) - 1, v.a(l5))) <= 8)
            {
                if(l3 != 0L)
                    l5 |= 1L;
                break;
            }
            l3 <<= i1;
            l5 <<= i1;
            l1 -= i1;
            l5 |= l3 / l4;
            l3 %= l4;
        } while(true);
        return a(flag, l1, l5);
    }

    private static long a(long l1, boolean flag)
    {
        if(p(l1))
            return 0x7ff8000000000000L;
        if(r(l1) || q(l1))
            return l1;
        int i1;
        if((i1 = n(l1)) >= 0)
            return l1;
        boolean flag1 = m(l1);
        long l2 = o(l1);
        if(flag)
        {
            l2 = v.b(l2, -i1);
        } else
        {
            long l3;
            if(i1 <= -64)
            {
                l3 = l2;
                l2 = 0L;
            } else
            {
                l3 = l2 << i1 + 64;
                l2 >>>= -i1;
            }
            if(flag1 && l3 != 0L)
                l2++;
        }
        return a(flag1, 0, l2);
    }

    private static final long b(boolean flag, int i1, long l1)
    {
        if(l1 == 0L)
            return !flag ? 0L : 0x8000000000000000L;
        while(l1 > 0L && l1 <= 0x1999999999999999L) 
        {
            l1 = (l1 << 3) + (l1 << 1);
            i1--;
        }
        int j1 = (i1 += 345) % 3;
        if((i1 /= 3) < 0)
            return !flag ? 0L : 0x8000000000000000L;
        if(i1 > 218)
            return !flag ? 0x7ff0000000000000L : 0xfff0000000000000L;
        int k1 = r.n(i1);
        int i2 = v.a(l1);
        l1 <<= i2;
        k1 -= i2;
        long l2 = j(l1, r.j(i1));
        for(; j1 > 0; j1--)
        {
            if(l2 < 0L)
            {
                l2 >>>= 1;
                k1++;
            }
            l2 += l2 >>> 2;
            k1 += 3;
        }

        return a(flag, k1, l2);
    }

    private static final long j(long l1, long l2)
    {
        long l3 = (l1 >>> 32) * (l2 >>> 32);
        long l4 = (l1 & 0xffffffffL) * (l2 >>> 32);
        long l5 = (l1 >>> 32) * (l2 & 0xffffffffL);
        l3 = l3 + (l4 >>> 32) + (l5 >>> 32);
        if(l4 + l5 << 32 < 0L)
            return l3 + 1L;
        else
            return l3;
    }

    public static final long a(String s1)
    {
        v.b();
        s1 = ab.e(s1.trim().toUpperCase());
        v.b();
        int i1;
        if((i1 = s1.length()) == 0)
            throw new NumberFormatException(s1);
        if(bh.a(0x4e614eL).equals(s1))
            return 0x7ff8000000000000L;
        int j1 = 0;
        boolean flag;
        char c1;
        if((flag = (c1 = s1.charAt(0)) == '-') || c1 == '+')
            j1 = 1;
        if(j1 < i1 && ((c1 = s1.charAt(j1)) == 'I' || c1 == 'i') && ab.a(t.c(0x814c2), ab.e(ab.c(s1, j1).toUpperCase())))
            return !flag ? 0x7ff0000000000000L : 0xfff0000000000000L;
        long l1 = 0L;
        int k1 = 0;
        int i2 = 0;
        boolean flag1 = false;
        for(; j1 < i1; j1++)
        {
            char c2;
            if((c2 = s1.charAt(j1)) == '.')
            {
                if(flag1)
                    throw new NumberFormatException(s1);
                flag1 = true;
                continue;
            }
            if(c2 < '0' || c2 > '9')
                break;
            i2++;
            if(l1 <= 0x1999999999999998L)
            {
                l1 = (l1 << 3) + (l1 << 1) + (long)(c2 - 48);
                if(flag1)
                    k1--;
            } else
            if(!flag1)
                k1++;
        }

        if(i2 == 0)
            throw new NumberFormatException(s1);
        if(j1 + 1 < i1 && (s1.charAt(j1) == 'E' || s1.charAt(j1) == 'e'))
            k1 += Integer.parseInt(ab.c(s1, j1 + 1));
        else
        if(j1 != i1)
            throw new NumberFormatException(s1);
        return b(flag, k1, l1);
    }

    public static final String a(long l1, int i1)
    {
        if(p(l1))
            return bh.a(0x4e614eL);
        boolean flag = m(l1);
        if(r(l1))
            return r.b(flag);
        if(q(l1))
            return r.a(flag);
        if(i1 < 9)
            i1 = 9;
        int j1 = n(l1);
        long l2 = o(l1);
        int j2 = (j1 += 1075) % 11;
        l2 <<= j2;
        for(j2 = r.m(j1 /= 11); l2 <= 0xcccccccccccccccL; j2--)
            l2 = (l2 << 3) + (l2 << 1);

        long l3 = j(l2, r.i(j1));
        boolean flag1 = false;
        do
        {
            int k1 = (int)(l3 % 10L);
            long l4 = l3 / 10L;
            int i2 = j2 + 1;
            if(k1 != 0)
            {
                boolean flag2;
                if(k1 > 5 || k1 == 5 && !flag1)
                {
                    flag2 = true;
                    l4++;
                } else
                {
                    flag2 = false;
                }
                if(b(flag, i2, l4) != l1)
                {
                    if(flag2)
                        l4--;
                    else
                        l4++;
                    flag2 ^= true;
                    if(b(flag, i2, l4) != l1)
                        break;
                }
                flag1 = flag2;
            }
            l3 = l4;
            j2 = i2;
        } while(true);
        do
        {
            String s1;
            if((s1 = c(flag, j2, l3)).length() <= i1)
                return s1;
            int k2 = (int)(l3 % 10L);
            l3 /= 10L;
            j2++;
            if(k2 > 5 || k2 == 5 && !flag1)
            {
                flag1 = true;
                l3++;
            } else
            {
                flag1 = false;
            }
            while(l3 % 10L == 0L) 
            {
                l3 /= 10L;
                j2++;
            }
        } while(true);
    }

    private static final String c(boolean flag, int i1, long l1)
    {
        StringBuffer stringbuffer;
        stringbuffer = bh.r();
        if(flag)
            stringbuffer.append('-');
        flag = Long.toString(l1);
        if((l1 = (i1 += flag.length() - 1) >= -3 && i1 < 7 ? 0 : 1) != 0)
        {
            flag1 = true;
            break MISSING_BLOCK_LABEL_74;
        }
        flag1 = i1 + 1;
        JVM INSTR ifgt 74;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_66;
_L2:
        break MISSING_BLOCK_LABEL_74;
        stringbuffer.append('0');
        for(int j1 = 0; j1 < flag1; j1++)
            stringbuffer.append(j1 >= flag.length() ? '0' : flag.charAt(j1));

        stringbuffer.append('.');
        if(flag1 < flag.length()) goto _L4; else goto _L3
_L3:
        stringbuffer.append('0');
          goto _L5
_L9:
        stringbuffer;
        flag1;
        JVM INSTR ifge 156;
           goto _L6 _L7
_L6:
        '0';
          goto _L8
_L7:
        flag.charAt(flag1);
_L8:
        append();
        JVM INSTR pop ;
        flag1++;
_L4:
        if(flag1 < flag.length()) goto _L9; else goto _L5
_L5:
        if(l1 != 0)
            stringbuffer.append('E').append(i1);
        return bh.b(stringbuffer);
    }

    public static final long f(long l1)
    {
        return c(d(l1, 0x4069000000000000L), 0x400921fb54442d18L);
    }

    private static final long b(long l1, int i1)
    {
        return l1 & 0xffffffffL | (long)i1 << 32;
    }

    private static long k(long l1, long l2)
    {
        return l1 & 0x7fffffffffffffffL | l2 & 0x8000000000000000L;
    }

    private static long c(long l1, int i1)
    {
        if(p(l1))
            return 0x7ff8000000000000L;
        if(i1 == 0 || q(l1) || r(l1))
            return l1;
        if(i1 >= 2098)
            return k(0x7ff0000000000000L, l1);
        if(i1 <= -2099)
            return k(0L, l1);
        int j1;
        i1 = (j1 = (int)(l1 >> 52) & 0x7ff) + i1;
        if(j1 == 0 || i1 <= 0)
            return a(m(l1), i1 - 1075, o(l1));
        if(i1 >= 2047)
            return k(0x7ff0000000000000L, l1);
        else
            return l1 & 0x800fffffffffffffL | (long)i1 << 52;
    }

    private static long s(long l1)
    {
        if(r(l1))
            return l1;
        if(m(l1) || p(l1))
            return 0x7ff8000000000000L;
        if(l1 == 0x7ff0000000000000L)
            return l1;
        int i1 = n(l1);
        long l2;
        for(l2 = o(l1); l2 < 0x10000000000000L;)
        {
            l2 <<= 1;
            i1--;
        }

        if((i1 & 1) != 0)
            l2 <<= 1;
        i1 = (i1 >> 1) - 26;
        l2 <<= 1;
        long l3 = 0L;
        long l4 = 0L;
        for(long l5 = 0x20000000000000L; l5 != 0L; l5 >>= 1)
        {
            long l6;
            if((l6 = l4 + l5) < l2)
            {
                l4 = l6 + l5;
                l2 -= l6;
                l3 |= l5;
            }
            l2 <<= 1;
        }

        if(l2 != 0L)
            l3 += l3 & 1L;
        l3 >>= 1;
        return (long)i1 + 1075L << 52 | l3 & 0xfffffffffffffL;
    }

    public static final long g(long l1)
    {
        long l2 = l1;
        if(p(l1))
            return 0x7ff8000000000000L;
        if(r(l1))
            return 0x3ff0000000000000L;
        if(f(l1, 0xc0874910d52d3051L))
            return 0L;
        if(h(l1, 0x40862e42fefa39efL))
            return 0x7ff0000000000000L;
        long l3 = 0L;
        long l4 = 0L;
        int i1;
        if((i1 = (int)(l1 >> 32) & 0x7fffffff) > 0x3fd62e42)
        {
            if(i1 < 0x3ff0a2b2)
            {
                if(m(l1))
                {
                    l3 = a(l1, 0x3fe62e42fee00000L);
                    l4 = 0xbdea39ef35793c76L;
                    i1 = -1;
                } else
                {
                    l3 = b(l1, 0x3fe62e42fee00000L);
                    l4 = 0x3dea39ef35793c76L;
                    i1 = 1;
                }
            } else
            {
                long l5;
                i1 = d(l5 = a(c(0x3ff71547652b82feL, l1), true));
                l3 = b(l1, c(l5, 0x3fe62e42fee00000L));
                l4 = c(l5, 0x3dea39ef35793c76L);
            }
            l2 = b(l3, l4);
        } else
        {
            if(i1 < 0x3e300000)
                return a(l1, 0x3ff0000000000000L);
            i1 = 0;
        }
        long l6 = c(l2, l2);
        long l7 = b(l2, c(l6, a(0x3fc555555555553eL, c(l6, a(0xbf66c16c16bebd93L, c(l6, a(0x3f11566aaf25de2cL, c(l6, a(0xbebbbd41c5d26bf1L, c(l6, 0x3e66376972bea4d0L))))))))));
        if(i1 == 0)
            return b(0x3ff0000000000000L, b(d(c(l2, l7), b(l7, 0x4000000000000000L)), l2));
        else
            return c(b(0x3ff0000000000000L, b(b(l4, d(c(l2, l7), b(0x4000000000000000L, l7))), l3)), i1);
    }

    public static long e(long l1, long l2)
    {
        if(r(l2))
            return 0x3ff0000000000000L;
        if(p(l1) || p(l2))
            return 0x7ff8000000000000L;
        long al[] = {
            0x3ff0000000000000L, 0x3ff8000000000000L
        };
        long al1[] = {
            0L, 0x3fe2b80340000000L
        };
        long al2[] = {
            0L, 0x3e4cfdeb43cfd006L
        };
        int i1 = (int)(l1 >> 32);
        int j1 = (int)l1;
        int k1 = (int)(l2 >> 32);
        int i2 = (int)l2;
        int j2 = i1 & 0x7fffffff;
        int k2 = k1 & 0x7fffffff;
        int i3 = 0;
        long l3;
        int j3;
        if(i1 < 0)
            if(k2 >= 0x43400000)
                i3 = 2;
            else
            if(k2 >= 0x3ff00000)
                if((l3 = (k2 >> 20) - 1023) > 20)
                {
                    if((j3 = i2 >>> 52 - l3) << 52 - l3 == i2)
                        i3 = 2 - (j3 & 1);
                } else
                if(i2 == 0 && (j3 = k2 >> 20 - l3) << 20 - l3 == k2)
                    i3 = 2 - (j3 & 1);
        if(i2 == 0)
        {
            if(k2 == 0x7ff00000)
            {
                if((j2 - 0x3ff00000 | j1) == 0)
                    return 0x7ff8000000000000L;
                if(j2 >= 0x3ff00000)
                    return k1 < 0 ? 0L : 0x7ff0000000000000L;
                return k1 >= 0 ? 0L : 0x7ff0000000000000L;
            }
            if(k2 == 0x3ff00000)
                if(k1 < 0)
                    return d(0x3ff0000000000000L, l1);
                else
                    return l1;
            if(k1 == 0x40000000)
                return c(l1, l1);
            if(k1 == 0x3fe00000 && i1 >= 0)
                return s(l1);
        }
        l3 = l1 & 0x7fffffffffffffffL;
        if(j1 == 0 && (j2 == 0x7ff00000 || j2 == 0 || j2 == 0x3ff00000))
        {
            long l4 = l3;
            if(k1 < 0)
                l4 = d(0x3ff0000000000000L, l3);
            if(i1 < 0)
                if((j2 - 0x3ff00000 | i3) == 0)
                    l4 = 0x7ff8000000000000L;
                else
                if(i3 == 1)
                    l4 = a(l4);
            return l4;
        }
        int k3;
        if(((k3 = (i1 >> 31) + 1) | i3) == 0)
            return 0x7ff8000000000000L;
        boolean flag = (k3 | i3 - 1) == 0;
        long l5;
        long l6;
        long l35;
        long l36;
        if(k2 > 0x41e00000)
        {
            if(k2 > 0x43f00000)
            {
                if(j2 <= 0x3fefffff)
                    return k1 >= 0 ? 0L : 0x7ff0000000000000L;
                return k1 <= 0 ? 0L : 0x7ff0000000000000L;
            }
            if(j2 < 0x3fefffff)
            {
                if(flag)
                    return k1 >= 0 ? 0x8000000000000000L : 0xfff0000000000000L;
                return k1 >= 0 ? 0L : 0x7ff0000000000000L;
            }
            if(j2 > 0x3ff00000)
            {
                if(flag)
                    return k1 <= 0 ? 0x8000000000000000L : 0xfff0000000000000L;
                return k1 <= 0 ? 0L : 0x7ff0000000000000L;
            }
            long l7;
            l35 = b(l3, 0x3ff0000000000000L);
            l7 = l35;
            long l9 = c(c(l35, l35), b(0x3fe0000000000000L, c(l7, b(0x3fd5555555555555L, c(l7, 0x3fd0000000000000L)))));
            long l12 = c(0x3ff7154760000000L, l7);
            long l15 = b(c(l7, 0x3e54ae0bf85ddf44L), c(l9, 0x3ff71547652b82feL));
            l5 = a(l12, l15) & 0xffffffff00000000L;
            l6 = b(l15, b(l5, l12));
        } else
        {
            k3 = 0;
            if(j2 < 0x100000)
            {
                l3 = c(l3, 53);
                k3 -= 53;
                j2 = (int)(l3 >> 32);
            }
            k3 += (j2 >> 20) - 1023;
            int i4;
            j2 = (i4 = j2 & 0xfffff) | 0x3ff00000;
            int j4;
            if(i4 <= 0x3988e)
                j4 = 0;
            else
            if(i4 < 0xbb67a)
            {
                j4 = 1;
            } else
            {
                j4 = 0;
                k3++;
                j2 -= 0x100000;
            }
            long l10 = b(l3 = b(l3, j2), al[j4]);
            long l13 = d(0x3ff0000000000000L, a(l3, al[j4]));
            long l16;
            long l18 = (l16 = c(l10, l13)) & 0xffffffff00000000L;
            long l19 = b(0L, (j2 >> 1 | 0x20000000) + 0x80000 + (j4 << 18));
            long l22 = b(l3, b(l19, al[j4]));
            long l24 = c(l13, b(b(l10, c(l18, l19)), c(l18, l22)));
            long l26;
            l36 = c(l16, l16);
            l26 = l36;
            long l28 = a(c(c(l36, l36), a(0x3fe3333333333303L, c(l26, a(0x3fdb6db6db6fabffL, c(l26, a(0x3fd55555518f264dL, c(l26, a(0x3fd17460a91d4101L, c(l26, a(0x3fcd864a93c9db65L, c(l26, 0x3fca7e284a454eefL))))))))))), c(l24, a(l18, l16)));
            l26 = c(l18, l18);
            l19 = a(a(0x4008000000000000L, l26), l28) & 0xffffffff00000000L;
            l22 = b(l28, b(b(l19, 0x4008000000000000L), l26));
            l10 = c(l18, l19);
            l13 = a(c(l24, l19), c(l22, l16));
            long l30 = a(l10, l13) & 0xffffffff00000000L;
            long l31 = b(l13, b(l30, l10));
            long l32 = c(0x3feec709e0000000L, l30);
            long l33 = a(a(c(0xbe3e2fe0145b01f5L, l30), c(l31, 0x3feec709dc3a03fdL)), al2[j4]);
            long l34 = c(k3);
            l5 = a(a(a(l32, l33), al1[j4]), l34) & 0xffffffff00000000L;
            l6 = b(l33, b(b(b(l5, l34), al1[j4]), l32));
        }
        long l8 = l2 & 0xffffffff00000000L;
        long l11 = a(c(b(l2, l8), l5), c(l2, l6));
        long l14 = c(l8, l5);
        long l17;
        int k4 = (int)((l17 = a(l11, l14)) >> 32);
        int i5 = (int)l17;
        if(k4 >= 0x40900000)
        {
            if((k4 - 0x40900000 | i5) != 0 || g(a(l11, 0x3c971547652b82feL), b(l17, l14)))
                return !flag ? 0x7ff0000000000000L : 0xfff0000000000000L;
        } else
        if((k4 & 0x7fffffff) >= 0x4090cc00 && ((k4 - 0xc090cc00 | i5) != 0 || f(l11, b(l17, l14))))
            return !flag ? 0L : 0x8000000000000000L;
        int k5 = ((i5 = k4 & 0x7fffffff) >> 20) - 1023;
        k3 = 0;
        if(i5 > 0x3fe00000)
        {
            k5 = (((k3 = k4 + (0x100000 >> k5 + 1)) & 0x7fffffff) >> 20) - 1023;
            long l20 = b(0L, k3 & ~(0xfffff >> k5));
            k3 = (k3 & 0xfffff | 0x100000) >> 20 - k5;
            if(k4 < 0)
                k3 = -k3;
            l14 = b(l14, l20);
        }
        long l21;
        long l23 = c(l21 = a(l11, l14) & 0xffffffff00000000L, 0x3fe62e4300000000L);
        long l25 = a(c(b(l11, b(l21, l14)), 0x3fe62e42fefa39efL), c(l21, 0xbe205c610ca86c39L));
        l17 = a(l23, l25);
        long l27 = b(l25, b(l17, l23));
        l21 = c(l17, l17);
        l5 = b(l17, c(l21, a(0x3fc555555555553eL, c(l21, a(0xbf66c16c16bebd93L, c(l21, a(0x3f11566aaf25de2cL, c(l21, a(0xbebbbd41c5d26bf1L, c(l21, 0x3e66376972bea4d0L))))))))));
        long l29 = b(d(c(l17, l5), b(l5, 0x4000000000000000L)), a(l27, c(l17, l27)));
        if((int)((l17 = b(0x3ff0000000000000L, b(l29, l17))) >> 32) + (k3 << 20) >> 20 <= 0)
        {
            l17 = c(l17, k3);
        } else
        {
            int j5 = (int)(l17 >> 32) + (k3 << 20);
            l17 = b(l17, j5);
        }
        if(flag)
            l17 = a(l17);
        return l17;
    }

    public static long h(long l1)
    {
        if(r(l1))
            return 0xfff0000000000000L;
        if(p(l1) || m(l1))
            return 0x7ff8000000000000L;
        if(l1 == 0x7ff0000000000000L)
            return l1;
        int i1 = (int)(l1 >> 32);
        int j1 = 0;
        if(i1 < 0x100000)
        {
            j1 -= 54;
            i1 = (int)((l1 = c(l1, 54)) >> 32);
        }
        j1 += (i1 >> 20) - 1023;
        int k1 = (i1 &= 0xfffff) + 0x95f64 & 0x100000;
        l1 = b(l1, i1 | k1 ^ 0x3ff00000);
        j1 += k1 >> 20;
        long l2 = b(l1, 0x3ff0000000000000L);
        if((0xfffff & i1 + 2) < 3)
        {
            long l3;
            if(r(l2))
                if(j1 == 0)
                    return 0L;
                else
                    return a(c(l3 = c(j1), 0x3fe62e42fee00000L), c(l3, 0x3dea39ef35793c76L));
            l3 = c(c(l2, l2), b(0x3fe0000000000000L, c(0x3fd5555555555555L, l2)));
            long l5;
            if(j1 == 0)
                return b(l2, l3);
            else
                return b(c(l5 = c(j1), 0x3fe62e42fee00000L), b(b(l3, c(l5, 0x3dea39ef35793c76L)), l2));
        }
        long l4 = c(j1);
        long l6;
        long l11 = d(l2, a(0x4000000000000000L, l2));
        l6 = l11;
        long l7;
        long l12 = c(l11, l11);
        l7 = l12;
        long l8;
        long l13 = c(l12, l12);
        long l9 = a(c(l13, a(0x3fd999999997fa04L, c(l8 = l13, a(0x3fcc71c51d8e78afL, c(l8, 0x3fc39a09d078c69fL))))), c(l7, a(0x3fe5555555555593L, c(l8, a(0x3fd2492494229359L, c(l8, a(0x3fc7466496cb03deL, c(l8, 0x3fc2f112df3e5244L))))))));
        if((i1 - 0x6147a | 0x6b851 - i1) > 0)
        {
            long l10 = c(c(l2, -1), l2);
            if(j1 == 0)
                return b(l2, b(l10, c(l6, a(l10, l9))));
            else
                return b(c(l4, 0x3fe62e42fee00000L), b(b(l10, a(c(l6, a(l10, l9)), c(l4, 0x3dea39ef35793c76L))), l2));
        }
        if(j1 == 0)
            return b(l2, c(l6, b(l2, l9)));
        else
            return b(c(l4, 0x3fe62e42fee00000L), b(b(c(l6, b(l2, l9)), c(l4, 0x3dea39ef35793c76L)), l2));
    }

    public static long i(long l1)
    {
        int i1;
        if((i1 = (int)(l1 >> 32) & 0x7fffffff) <= 0x3fe921fb)
            return b(l1, 0L, 0);
        if(i1 >= 0x7ff00000)
            return 0x7ff8000000000000L;
        long al[] = new long[2];
        switch(a(l1, al) & 3)
        {
        case 0: // '\0'
            return b(al[0], al[1], 1);

        case 1: // '\001'
            return l(al[0], al[1]);

        case 2: // '\002'
            return a(b(al[0], al[1], 1));
        }
        return a(l(al[0], al[1]));
    }

    public static long j(long l1)
    {
        int i1;
        if((i1 = (int)(l1 >> 32) & 0x7fffffff) <= 0x3fe921fb)
            return a(l1, 0L, 1);
        if(i1 >= 0x7ff00000)
        {
            return 0x7ff8000000000000L;
        } else
        {
            long al[] = new long[2];
            l1 = a(l1, al);
            return a(al[0], al[1], 1 - ((l1 & 1) << 1));
        }
    }

    private static long a(long l1, long l2, int i1)
    {
        int j1;
        int k1;
        if((k1 = (j1 = (int)(l1 >> 32)) & 0x7fffffff) < 0x3e300000 && d(l1) == 0)
        {
            if((k1 | (int)l1 | i1 + 1) == 0)
                return 0x7ff0000000000000L;
            if(i1 == 1)
            {
                return l1;
            } else
            {
                long l3;
                long l6 = (l3 = a(l1, l2)) & 0xffffffff00000000L;
                long l8 = b(l2, b(l6, l1));
                long l10;
                long l14 = (l10 = d(0xbff0000000000000L, l3)) & 0xffffffff00000000L;
                long l17 = a(0x3ff0000000000000L, c(l14, l6));
                return a(l14, c(l10, a(l17, c(l14, l8))));
            }
        }
        if(k1 >= 0x3fe59428)
        {
            if(j1 < 0)
            {
                l1 = a(l1);
                l2 = a(l2);
            }
            l1 = a(b(0x3fe921fb54442d18L, l1), b(0x3c81a62633145c07L, l2));
            l2 = 0L;
        }
        long l4;
        long l20 = c(l1, l1);
        l4 = l20;
        long l7 = c(l20, l20);
        long l9 = a(0x3fc111111110fe7aL, c(l7, a(0x3f9664f48406d637L, c(l7, a(0x3f6d6d22c9560328L, c(l7, a(0x3f4344d8f2f26501L, c(l7, a(0x3f147e88a03792a6L, c(l7, 0xbef375cbdb605373L))))))))));
        long l11 = c(l4, a(0x3faba1ba1bb341feL, c(l7, a(0x3f8226e3e96e8493L, c(l7, a(0x3f57dbc8fee08315L, c(l7, a(0x3f3026f71a8d1068L, c(l7, a(0x3f12b80f32f0a7e9L, c(l7, 0x3efb2a7074bf7ad4L)))))))))));
        long l15 = c(l4, l1);
        l9 = a(a(l2, c(l4, a(c(l15, a(l9, l11)), l2))), c(0x3fd5555555555563L, l15));
        l7 = a(l1, l9);
        if(k1 >= 0x3fe59428)
        {
            long l12 = c(i1);
            return c(c(1 - (j1 >> 30 & 2)), b(l12, c(0x4000000000000000L, b(l1, b(d(c(l7, l7), a(l7, l12)), l9)))));
        }
        if(i1 == 1)
        {
            return l7;
        } else
        {
            long l5 = l7 & 0xffffffff00000000L;
            long l13 = b(l9, b(l5, l1));
            long l18;
            long l19 = (l18 = d(0xbff0000000000000L, l7)) & 0xffffffff00000000L;
            long l16 = a(0x3ff0000000000000L, c(l19, l5));
            return a(l19, c(l18, a(l16, c(l19, l13))));
        }
    }

    private static long b(long l1, long l2, int i1)
    {
        if(((int)(l1 >> 32) & 0x7fffffff) < 0x3e400000)
            return l1;
        long l3;
        long l4 = c(l3 = c(l1, l1), l1);
        long l5 = a(0x3f8111111110f8a6L, c(l3, a(0xbf2a01a019c161d5L, c(l3, a(0x3ec71de357b1fe7dL, c(l3, a(0xbe5ae5e68a2b9cebL, c(l3, 0x3de5d93a5acfd57cL))))))));
        if(i1 == 0)
            return a(l1, c(l4, a(0xbfc5555555555549L, c(l3, l5))));
        else
            return b(l1, b(b(c(l3, b(c(0x3fe0000000000000L, l2), c(l4, l5))), l2), c(l4, 0xbfc5555555555549L)));
    }

    private static long l(long l1, long l2)
    {
        int i1;
        if((i1 = (int)(l1 >> 32) & 0x7fffffff) < 0x3e400000)
            return 0x3ff0000000000000L;
        long l3;
        long l4 = c(l3 = c(l1, l1), a(0x3fa555555555554cL, c(l3, a(0xbf56c16c16c15177L, c(l3, a(0x3efa01a019cb1590L, c(l3, a(0xbe927e4f809c52adL, c(l3, a(0x3e21ee9ebdb4b1c4L, c(l3, 0xbda8fae9be8838d4L)))))))))));
        if(i1 < 0x3fd33333)
            return b(0x3ff0000000000000L, b(c(0x3fe0000000000000L, l3), b(c(l3, l4), c(l1, l2))));
        long l5;
        if(i1 > 0x3fe90000)
            l5 = 0x3fd2000000000000L;
        else
            l5 = (long)(i1 - 0x200000) << 32;
        long l6 = b(c(0x3fe0000000000000L, l3), l5);
        return b(b(0x3ff0000000000000L, l5), b(l6, b(c(l3, l4), c(l1, l2))));
    }

    private static int a(long l1, long al[])
    {
        int i1;
        int j1;
        if((j1 = (i1 = (int)(l1 >> 32)) & 0x7fffffff) <= 0x3fe921fb)
        {
            al[0] = l1;
            al[1] = 0L;
            return 0;
        }
        if(j1 < 0x4002d97c)
        {
            long l2 = 0x3ff921fb54400000L;
            long l7 = j1 != 0x3ff921fb ? 0x3dd0b4611a626331L : 0x3ba3198a2e037073L;
            if(i1 > 0)
            {
                l2 = a(0x3ff921fb54400000L);
                l7 = a(l7);
            }
            long l9 = a(l1, l2);
            al[0] = a(l9, l7);
            al[1] = a(b(l9, al[0]), l7);
            return i1 <= 0 ? -1 : 1;
        }
        if(j1 <= 0x413921fb)
        {
            long l3;
            long l8;
            int i2 = d(l8 = a(c(l3 = l1 & 0x7fffffffffffffffL, 0x3fe45f306dc9c883L), true));
            long l10 = b(l3, c(l8, 0x3ff921fb54400000L));
            long l11 = c(l8, 0x3dd0b4611a626331L);
            if(i2 < 32 && j1 != r.p(i2 - 1))
            {
                al[0] = b(l10, l11);
            } else
            {
                l1 = j1 >> 20;
                al[0] = b(l10, l11);
                if(l1 - ((int)(al[0] >> 32) >> 20 & 0x7ff) > 16)
                {
                    long l4 = l10;
                    l11 = c(l8, 0x3dd0b4611a600000L);
                    l10 = b(l4, l11);
                    l11 = b(c(l8, 0x3ba3198a2e037073L), b(b(l4, l10), l11));
                    al[0] = b(l10, l11);
                    if(l1 - ((int)(al[0] >> 32) >> 20 & 0x7ff) > 49)
                    {
                        long l5 = l10;
                        l11 = c(l8, 0x3ba3198a2e000000L);
                        l10 = b(l5, l11);
                        l11 = b(c(l8, 0x397b839a252049c1L), b(b(l5, l10), l11));
                        al[0] = b(l10, l11);
                    }
                }
            }
            al[1] = b(b(l10, al[0]), l11);
            if(i1 < 0)
            {
                al[0] = a(al[0]);
                al[1] = a(al[1]);
                return -i2;
            } else
            {
                return i2;
            }
        }
        if(j1 >= 0x7ff00000)
        {
            al[0] = al[1] = 0x7ff8000000000000L;
            return 0;
        }
        long l6 = (int)l1;
        int k1 = (j1 >> 20) - 1046;
        l6 = b(l6, j1 - (k1 << 20));
        long al1[] = new long[3];
        for(int j2 = 0; j2 < 2; j2++)
        {
            al1[j2] = c(d(l6));
            l6 = c(b(l6, al1[j2]), 24);
        }

        al1[2] = l6;
        int k2;
        for(k2 = 3; r(al1[k2 - 1]); k2--);
        int i3 = a(al1, al, k1, k2);
        if(i1 < 0)
        {
            al[0] = a(al[0]);
            al[1] = a(al[1]);
            return -i3;
        } else
        {
            return i3;
        }
    }

    private static int a(long al[], long al1[], int i1, int j1)
    {
        j1--;
        int k1;
        if((k1 = (i1 - 3) / 24) < 0)
            k1 = 0;
        i1 -= 24 * (k1 + 1);
        int l1 = k1 - j1;
        int j3 = j1 + 4;
        long al3[] = new long[20];
        for(int k3 = 0; k3 <= j3;)
        {
            al3[k3] = l1 >= 0 ? c(r.o(l1)) : 0L;
            k3++;
            l1++;
        }

        long al2[] = new long[20];
        for(int l3 = 0; l3 <= 4; l3++)
        {
            long l4 = 0L;
            for(int i2 = 0; i2 <= j1; i2++)
                l4 = a(l4, c(al[i2], al3[(j1 + l3) - i2]));

            al2[l3] = l4;
        }

        int j4 = 4;
        int ai[] = new int[20];
        int i4;
        boolean flag;
        int k4;
        long l5;
        long l10;
        long l11;
        long l12;
        do
        {
            flag = false;
            int i5 = 0;
            int j2 = j4;
            l5 = al2[j4];
            for(; j2 > 0; j2--)
            {
                long l8 = c(d(c(l5, -24)));
                ai[i5] = d(b(l5, c(l8, 24)));
                l5 = a(al2[j2 - 1], l8);
                i5++;
            }

            l10 = c(l5, i1);
            l11 = b(l10, c(a(c(l10, -3), false), 3));
            l12 = b(l11, c(0x4020000000000000L, a(c(l5 = l11, 0x3fc0000000000000L), false)));
            l5 = l12;
            k4 = d(l12);
            l5 = b(l5, c(k4));
            i4 = 0;
            if(i1 > 0)
            {
                int j5 = ai[j4 - 1] >> 24 - i1;
                k4 += j5;
                ai[j4 - 1] -= j5 << 24 - i1;
                i4 = ai[j4 - 1] >> 23 - i1;
            } else
            if(i1 == 0)
                i4 = ai[j4 - 1] >> 23;
            else
            if(h(l5, 0x3fe0000000000000L))
                i4 = 2;
            if(i4 > 0)
            {
                k4++;
                boolean flag1 = false;
                for(int k5 = 0; k5 < j4; k5++)
                {
                    int k2 = ai[k5];
                    if(!flag1)
                    {
                        if(k2 != 0)
                        {
                            flag1 = true;
                            ai[k5] = 0x1000000 - k2;
                        }
                    } else
                    {
                        ai[k5] = 0xffffff - k2;
                    }
                }

                if(i1 > 0)
                    switch(i1)
                    {
                    case 1: // '\001'
                        ai[j4 - 1] &= 0x7fffff;
                        break;

                    case 2: // '\002'
                        ai[j4 - 1] &= 0x3fffff;
                        break;
                    }
                if(i4 == 2)
                {
                    l5 = b(0x3ff0000000000000L, l5);
                    if(flag1)
                        l5 = b(l5, c(0x3ff0000000000000L, i1));
                }
            }
            if(r(l5))
            {
                int l2 = 0;
                for(int i6 = j4 - 1; i6 >= 4; i6--)
                    l2 |= ai[i6];

                if(l2 == 0)
                {
                    int k6;
                    for(k6 = 1; ai[4 - k6] == 0; k6++);
                    for(int j6 = j4 + 1; j6 <= j4 + k6; j6++)
                    {
                        al3[j1 + j6] = c(r.o(k1 + j6));
                        long l9 = 0L;
                        for(int i3 = 0; i3 <= j1; i3++)
                            l9 = a(l9, c(al[i3], al3[(j1 + j6) - i3]));

                        al2[j6] = l9;
                    }

                    j4 += k6;
                    flag = true;
                }
            }
        } while(flag);
        if(r(l5))
            do
            {
                j4--;
                i1 -= 24;
            } while(ai[j4] == 0);
        else
        if(h(l5 = c(l5, -i1), 0x4170000000000000L))
        {
            long l6 = c(d(c(l5, -24)));
            ai[j4] = d(b(l5, c(l6, 24)));
            j4++;
            i1 += 24;
            ai[j4] = d(l6);
        } else
        {
            ai[j4] = d(l5);
        }
        long l7 = c(0x3ff0000000000000L, i1);
        for(int i7 = j4; i7 >= 0; i7--)
        {
            al2[i7] = c(l7, c(ai[i7]));
            l7 = c(l7, -24);
        }

        long al4[] = new long[20];
        for(al = j4; al >= 0; al--)
        {
            l7 = 0L;
            for(i1 = 0; i1 <= 4 && i1 <= j4 - al; i1++)
                l7 = a(l7, c(r.k(i1), al2[al + i1]));

            al4[j4 - al] = l7;
        }

        l7 = 0L;
        for(i1 = j4; i1 >= 0; i1--)
            l7 = a(l7, al4[i1]);

        al1[0] = i4 != 0 ? a(l7) : l7;
        l7 = b(al4[0], l7);
        for(al = 1; al <= j4; al++)
            l7 = a(l7, al4[al]);

        al1[1] = i4 != 0 ? a(l7) : l7;
        return k4 & 7;
    }

    public static long k(long l1)
    {
        int i1;
        int j1;
        if((j1 = (i1 = (int)(l1 >> 32)) & 0x7fffffff) >= 0x44100000)
        {
            if(j1 > 0x7ff00000 || j1 == 0x7ff00000 && (int)l1 != 0)
                return 0x7ff8000000000000L;
            if(i1 > 0)
                return r.l(3);
            else
                return a(r.l(3));
        }
        if(j1 < 0x3fdc0000)
        {
            if(j1 < 0x3e200000)
                return l1;
            j1 = -1;
        } else
        {
            l1 &= 0x7fffffffffffffffL;
            if(j1 < 0x3ff30000)
            {
                if(j1 < 0x3fe60000)
                {
                    j1 = 0;
                    l1 = d(b(c(l1, 1), 0x3ff0000000000000L), a(0x4000000000000000L, l1));
                } else
                {
                    j1 = 1;
                    l1 = d(b(l1, 0x3ff0000000000000L), a(l1, 0x3ff0000000000000L));
                }
            } else
            if(j1 < 0x40038000)
            {
                j1 = 2;
                l1 = d(b(l1, 0x3ff8000000000000L), a(0x3ff0000000000000L, c(0x3ff8000000000000L, l1)));
            } else
            {
                j1 = 3;
                l1 = d(0xbff0000000000000L, l1);
            }
        }
        long l2;
        long l6 = c(l1, l1);
        l2 = l6;
        long l3 = c(l6, l6);
        long l4 = c(l2, a(0x3fd555555555550dL, c(l3, a(0x3fc24924920083ffL, c(l3, a(0x3fb745cdc54c206eL, c(l3, a(0x3fb10d66a0d03d51L, c(l3, a(0x3fa97b4b24760debL, c(l3, 0x3f90ad3ae322da11L)))))))))));
        long l5 = c(l3, a(0xbfc999999998ebc4L, c(l3, a(0xbfbc71c6fe231671L, c(l3, a(0xbfb3b0f2af749a6dL, c(l3, a(0xbfadde2d52defd9aL, c(l3, 0xbfa2b4442c6a6c2fL)))))))));
        if(j1 < 0)
            return b(l1, c(l1, a(l4, l5)));
        l2 = b(r.l(j1), b(b(c(l1, a(l4, l5)), r.l(j1 + 4)), l1));
        if(i1 < 0)
            return a(l2);
        else
            return l2;
    }

    public final String toString()
    {
        return a(0L, 100);
    }

    public final int hashCode()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof q) && 0L == 0L;
    }

    public static final long l(long l1)
    {
        int i1;
        if((i1 = (int)(l1 >> 32) & 0x7fffffff) <= 0x3fe921fb)
            return l(l1, 0L);
        if(i1 >= 0x7ff00000)
            return 0x7ff8000000000000L;
        switch(a(l1, l1 = new long[2]) & 3)
        {
        case 0: // '\0'
            return l(l1[0], l1[1]);

        case 1: // '\001'
            return a(b(l1[0], l1[1], 1));

        case 2: // '\002'
            return a(l(l1[0], l1[1]));
        }
        return b(l1[0], l1[1], 1);
    }
}