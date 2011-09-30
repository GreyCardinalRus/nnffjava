// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:31
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import main.Midlet;

public final class as extends Canvas
    implements Runnable, CommandListener
{

    public as(Midlet midlet, boolean flag)
    {
        if((a = midlet) != null)
        {
            b = flag;
            (new Thread(this)).start();
            return;
        }
        try
        {
            new f(null, 0, 0);
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    public final void run()
    {
        try
        {
            boolean _tmp = b;
            setFullScreenMode(true);
            Display.getDisplay(a).setCurrent(this);
            long l = System.currentTimeMillis();
            int i = 0;
            do
            {
                if(i == 0)
                {
                    repaint();
                    serviceRepaints();
                } else
                if(i >= 3 && System.currentTimeMillis() - l >= 200L)
                    break;
                System.gc();
                Thread.sleep(80L);
                i++;
            } while(true);
            new f(a, getWidth(), getHeight());
            return;
        }
        catch(Throwable throwable)
        {
            new as(a, throwable);
        }
    }

    private final void a(Graphics g)
    {
        try
        {
            g.setColor(0x5ecd52);
            int i;
            int j;
            g.fillRect(0, 0, i = getWidth(), j = getHeight());
            if(c == null)
                c = Image.createImage("/icq.png");
            g.drawImage(c, i >>= 1, j >> 1, 3);
            g.setColor(0xd7f2d4);
            g.drawString("\u0412\u0435\u0440\u0441\u0438\u044F: 3.5", i - 1, j - 3, 33);
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    public final void paint(Graphics g)
    {
        a(g);
    }

    private as(Midlet midlet, Throwable throwable)
    {
        a = midlet;
        try
        {
            Form form;
            (form = new Form("\u041E\u0448\u0438\u0431\u043A\u0430")).append("\u041F\u0440\u0438 \u0437\u0430\u043F\u0443\u0441\u043A\u0435 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u044B \u043F\u0440\u043E\u0438\u0437\u043E\u0448\u043B\u0430 \u043E\u0448\u0438\u0431\u043A\u0430.\n\u041F\u0435\u0440\u0435\u0443\u0441\u0442\u0430\u043D\u043E\u0432\u0438\u0442\u0435 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u0443 \u0441 \u0441\u0430\u0439\u0442\u0430 http://mim.icq.com \u0438\u043B\u0438 \u043E\u0431\u0440\u0430\u0442\u0438\u0442\u0435\u0441\u044C \u043A \u0440\u0430\u0437\u0440\u0430\u0431\u043E\u0442\u0447\u0438\u043A\u0443.\n\u0414\u0435\u0442\u0430\u043B\u0438 \u043E\u0448\u0438\u0431\u043A\u0438:\n" + throwable + "\n\u0412\u0435\u0440\u0441\u0438\u044F: " + midlet.getAppProperty("MIDlet-Version") + "\n\u0412\u0435\u0440\u0441\u0438\u044F: " + Runtime.getRuntime().freeMemory() + " / " + Runtime.getRuntime().totalMemory() + "\n\u041C\u043E\u0434\u0443\u043B\u0438: " + midlet.getAppProperty("Agent-Modules") + "\n");
            form.addCommand(new Command("OK", 4, 0));
            form.setCommandListener(this);
            Display.getDisplay(midlet).setCurrent(form);
            a();
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    public final void commandAction(Command command, Displayable displayable)
    {
        try
        {
            switch(command.getPriority())
            {
            case 0: // '\0'
                a.destroyApp(true);
                return;

            case 1: // '\001'
                a.platformRequest("http://mim.icq.com");
                a.destroyApp(true);
                return;

            case 2: // '\002'
                new as(a, false);
                break;
            }
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    private static void a()
    {
        try
        {
            String as1[];
            for(int i = (as1 = RecordStore.listRecordStores()).length; --i >= 0;)
                try
                {
                    RecordStore.deleteRecordStore(as1[i]);
                }
                catch(Throwable _ex) { }

            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    private Midlet a;
    private boolean b;
    private Image c;
}