/*************************************************************************
	> File Name: ServerTest.java
	> Author: 
	> Mail: 
	> Created Time: 日 11/13 23:48:46 2016
 ************************************************************************/

import java.io.* ;
import java.net.* ;
import java.util.* ;
public class ServerTest
{
    public void go() throws IOException 
    {
        try (ServerSocket s = new ServerSocket(8189))
        {
            try (Socket sock = s.accept())
            {
                InputStream inStream = sock.getInputStream() ;
                OutputStream outStream = sock.getOutputStream() ;

                try (Scanner in = new Scanner(inStream))
                {
                    PrintWriter out = new PrintWriter(outStream,true /* autoFlush */) ;
                    out.println("Hello ! Enter BYE to exit") ;
                    boolean done  = false ;
                    while(!done && in.hasNextLine())
                    {
                        String line = in.nextLine() ;
                        System.out.println("Client : " + line) ;
                        out.println("Echo: "+line) ;
                        if(line.trim().equals("BYE")) done = true ;

                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        new ServerTest().go() ;
    }
}
