package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class input {
	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		Path inputPath = fs.getPath("src/resources/input.txt");
		Path outputPath = fs.getPath("src/resources/output.txt");

		try (BufferedReader reader = Files.newBufferedReader(inputPath);
				BufferedWriter writer = Files.newBufferedWriter(outputPath);) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				if (line.length() != 5) {
					continue;
				} else {
					writer.write(line);
					writer.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("出力終了");
		}
	}
}
