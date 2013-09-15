package Controller;

import java.io.File;
import java.io.IOException;

public class Database {

	public Database() {
		File directory = new File("C:\\Guessing_Game");
		File database_file = new File(directory, "dataBase.txt");
		if(verify_file(database_file)){
		}else{
			creates_database(directory, database_file);
		}
	}
	
	public boolean verify_file(File database_file){
		boolean result = false;
		if(database_file.exists()){
			result = true;
		}else{
			result = false;
		}
		return result;
	}
	
	public boolean creates_database(File directory, File database_file){
		boolean result = false;
		if(verify_directory(directory)){
			try{
				result = database_file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}else{
			result = false;
		}
		return result;
	}
	
	public boolean verify_directory(File directory){
		boolean result = directory.mkdir();
		System.out.println(result);
		return result;
	}

	
}
