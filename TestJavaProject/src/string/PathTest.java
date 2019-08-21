package string;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Path path= Paths.get("c:" , "windows");
		
		
		//try(Stream<Path> stream= Files.list(path))
		try(Stream<Path> stream= Files.walk(path, 1))
		{
			stream.filter(path2-> path2.toFile().isDirectory()).forEach(System.out::println);
			
		} catch(IOException ex ) {
			ex.printStackTrace();
		}
	}

}
