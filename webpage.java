import java.net.URI;
import java.awt.*;
import java.io.*;
import java.util.Scanner;


class webpage
{
    public static void main(String[] args)
    {
        try {
            Desktop d=java.awt.Desktop.getDesktop();
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the website name");
            String s1=s.nextLine();
            String a="https://"+s1;
            URI oo=new URI(a);
            System.out.println("Opening webpage");
            d.browse(oo);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
