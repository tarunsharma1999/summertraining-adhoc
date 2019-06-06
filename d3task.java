import java.io.IOException;
class d3task
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            // Command to create an external process 
            String command = "C:\\Program Files (x86)"+ 
                 "\\Google\\Chrome\\Application\\chrome.exe"; 
  
            // Running the above command 
            Runtime run  = Runtime.getRuntime(); 
            Process proc = run.exec(command); 
        } 
  
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 