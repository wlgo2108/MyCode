/*************************************************************************
	> File Name: DailyAdviceServer.java
	> Author: 
	> Mail: 
	> Created Time: 四 11/10 23:38:21 2016
 ************************************************************************/
import java.io.* ;
import java.net.* ;

public class DailyAdviceServer
{
    String[] adviceList = {
        "Take smaller bites","Go","You"
    } ;

    public  void go() 
    {
        try 
        {
            ServerSocket serverSocket = new ServerSocket(4242) ;

            while(true)
            {
                Socket socket = serverSocket.accept() ;

                PrintWriter writer = new PrintWriter(socket.getOutputStream()) ;
                String advice = getAdvice() ;
                writer.println(advice) ;
                writer.close() ;
                System.out.println(advice) ;

            }

        }catch(IOException e)
        {
            e.printStackTrace() ;
        }
    }

    private String getAdvice() 
    {
        int random = (int)(Math.random() * adviceList.length );
        return adviceList[random] ;
    }

    public static void main(String[] args) 
    {
        DailyAdviceServer server = new DailyAdviceServer() ;
        server.go() ;
    }


}