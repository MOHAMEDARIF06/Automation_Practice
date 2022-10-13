package singleton_Design;

import java.io.IOException;

public class File_Reader_Manager {
	private File_Reader_Manager() {

	}

	public static File_Reader_Manager get_Instance_FRM() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;

	}

	public Test_Data_Reader get_instance_reader() throws IOException {
		Test_Data_Reader reader = new Test_Data_Reader();
		return reader;
	}

}
