package IO;

import java.io.PrintWriter;

public class PrintWriterEx 
{

	public static void main(String[] args) 
	{
		try
		{
			PrintWriter w = new PrintWriter(System.out);
			w.write("This is an eaxmple for PrintWriter");
			w.flush();
			w.close();
			PrintWriter pw1 = new PrintWriter("D://HELLO.txt");
			pw1.write("Example of printwriter for external file");
			pw1.flush();
			pw1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
