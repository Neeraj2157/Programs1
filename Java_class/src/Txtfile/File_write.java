package Txtfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_write
{

	public static void main(String[] args) throws IOException {
		File f = new File("G:\\Java\\Testing File.txt");
		FileWriter fr = new FileWriter(f, true);
		BufferedWriter Write = new BufferedWriter(fr);
		Write.write("Hello Java");
		Write.newLine();
		Write.write("Lorem Ipsum is simply dummy text of the printing \n "
				+ "and typesetting industry. Lorem Ipsum has been\n "
				+ "the industry's standard dummy text ever since the\n"
				+ " 1500s, when an unknown printer took a galley of\n"
				+ " type and scrambled it to make a type specimen book.\n"
				+ " It has survived not only five centuries, but also\n"
				+ " the leap into electronic typesetting, remaining \n"
				+ "essentially unchanged. It was popularised in the\n"
				+ " 1960s with the release of Letraset sheets containing\n "
				+ "Lorem Ipsum passages, and more recently with desktop \n"
				+ "publishing software like Aldus PageMaker including\n"
				+ " versions of Lorem Ipsum.");
		Write.newLine();
		Write.close();
		
		

	}
}
