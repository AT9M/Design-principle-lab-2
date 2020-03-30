package ie.gmit.exercise;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file
	public void writeMessage(Message msg, String fileName,Formatter format,Object output) throws IOException
	{
		try(PrintWriter writer = new PrintWriter((OutputStream) output))
		{ //creates print writer
			writer.println(format.format(msg)); //formats and writes message
			writer.flush();
			writer.close();
		}
	}
}
