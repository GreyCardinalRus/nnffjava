// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:31
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Hashtable;

public final class aq
{

    public aq(Object obj)
    {
        c = obj;
    }

    private final int b()
    {
        Object obj;
        if(c instanceof String)
            if(d >= ((String) (obj = (String)c)).length())
                return -1;
            else
                return ((String) (obj)).charAt(d++);
        if(c instanceof s)
        {
            if(((s) (obj = (s)c)).b == 0)
                return -1;
            else
                return x.b(((s) (obj)).t());
        } else
        {
            return z.d((Object[])c);
        }
    }

    private final String a(int i)
    {
        StringBuffer stringbuffer = bh.r();
        boolean flag = false;
        int j;
        if((j = b()) == -1)
            throw new RuntimeException();
        int k = 0;
        for(; j != -1 && (flag || !a(i, j)); j = b())
            if((j == 34 || j == 39) && (k == 0 || k == j))
            {
                flag ^= true;
                k = j;
            } else
            {
                stringbuffer.append((char)j);
            }

        if(j != 60 && j != 62)
            stringbuffer.append((char)j);
        return bh.b(stringbuffer);
    }

    private final void c()
    {
        boolean flag = true;
        boolean flag1 = false;
        boolean flag2 = false;
        String s1 = null;
        Hashtable hashtable = null;
        do
        {
            String s2 = a(2);
            int i = 0;
            int j = s2.length();
            if(ab.a(1015, s2))
            {
                flag2 = true;
                continue;
            }
            if(j > 0)
            {
                if(s2.charAt(0) == '/')
                {
                    if(j == 1)
                    {
                        flag1 = true;
                        break;
                    }
                    flag = false;
                    i++;
                }
                if(s2.charAt(j - 1) == '/')
                {
                    flag1 = true;
                    j--;
                }
            }
            if(flag2 = s2.endsWith(t.c(1015)))
                j--;
            s2 = ab.a(s2, i, j);
            if(s1 == null)
            {
                s1 = ab.e(s2.toLowerCase());
                continue;
            }
            if(hashtable == null)
                hashtable = new Hashtable();
            j = s2.length();
            if((i = s2.indexOf('=')) < 0)
            {
                if(!flag2)
                    break;
            } else
            {
                String s3 = ab.b(s2, i);
                if(++i >= s2.length())
                {
                    hashtable.put(s3, t.i());
                } else
                {
                    char c1;
                    if((c1 = s2.charAt(i)) == '"' || c1 == '\'')
                        i++;
                    c1 = s2.charAt(j - 1);
                    if(j > i && c1 == '"' || c1 == '\'')
                        j--;
                    hashtable.put(s3, ab.a(s2, i, j));
                }
            }
        } while(flag2);
        if(s1.charAt(0) == '?')
            return;
        s1 = ab.e(s1.toLowerCase());
        if(flag)
        {
            if(a == null)
                a = s1;
            a(s1, hashtable);
            if(ab.a(0xd1932, s1))
                throw new RuntimeException();
        }
        if(flag1 || !flag)
        {
            e();
            if(ab.a(s1, a))
                throw new RuntimeException();
        }
    }

    private final void d()
    {
        a(a(1));
    }

    public final ao a()
    {
        a = null;
        b = null;
        do
            try
            {
                d();
                c();
            }
            catch(Throwable _ex)
            {
                return b;
            }
        while(true);
    }

    private final void a(String s1, Hashtable hashtable)
    {
        v.b();
        v.i();
        b = new ao(s1, b, hashtable);
    }

    private final void a(String s1)
    {
        v.b();
        if(b != null)
            b.a(b(s1));
    }

    private final void e()
    {
        v.b();
        ao ao1;
        if(b != null && (ao1 = b.d) != null)
        {
            ao1.a(b);
            b = ao1;
        }
    }

    private static boolean a(int i, int j)
    {
        if(i == 1)
            return j == 60;
        if(i == 2)
            return j == 62 || j == 32;
        else
            throw new RuntimeException();
    }

    private static String b(String s1)
    {
        v.b();
        if(s1.indexOf('&') < 0)
            return s1;
        StringBuffer stringbuffer = bh.r();
        int i = s1.length();
        for(int j = 0; j < i; j++)
        {
            char c1;
            if((c1 = s1.charAt(j)) == '&')
            {
                char c2 = j + 1 >= i ? '\0' : s1.charAt(j + 1);
                char c3 = j + 2 >= i ? '\0' : s1.charAt(j + 2);
                char c4 = j + 3 >= i ? '\0' : s1.charAt(j + 3);
                if(c3 == 't' && c4 == ';')
                {
                    if(c2 == 'l')
                    {
                        stringbuffer.append('<');
                        j += 3;
                        continue;
                    }
                    if(c2 == 'g')
                    {
                        stringbuffer.append('>');
                        j += 3;
                        continue;
                    }
                }
                char c5 = j + 4 >= i ? '\0' : s1.charAt(j + 4);
                if(c2 == 'a' && c3 == 'm' && c4 == 'p' && c5 == ';')
                {
                    stringbuffer.append('&');
                    j += 4;
                    continue;
                }
                if((j + 5 >= i ? '\0' : s1.charAt(j + 5)) == ';')
                {
                    if(c4 == 'o')
                    {
                        if(c2 == 'q' && c3 == 'u' && c5 == 't')
                        {
                            stringbuffer.append('"');
                            j += 5;
                            continue;
                        }
                        if(c2 == 'a' && c3 == 'p' && c5 == 's')
                        {
                            stringbuffer.append('\'');
                            j += 5;
                            continue;
                        }
                    }
                    if(c2 == '#' && c3 >= '0' && c3 <= '9' && c4 >= 0 && c4 <= '9' && c5 >= '0' && c5 <= '9')
                    {
                        stringbuffer.append((char)((c5 - 48) + (c4 - 48) * 10 + (c3 - 48) * 100));
                        j += 5;
                        continue;
                    }
                }
            }
            stringbuffer.append(c1);
        }

        return bh.b(stringbuffer);
    }

    private String a;
    private ao b;
    private Object c;
    private int d;
}