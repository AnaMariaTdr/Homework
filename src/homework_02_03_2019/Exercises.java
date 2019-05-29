package homework_02_03_2019;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exercises {

	public void nameAllfilesMethod() {
		File file = new File("/ana/Othethings/");
		String[] fileList = file.list();
		for (String name : fileList) {
			System.out.println(name);

		}
	}

	public void getSpecificFilesByExtension() {
		File file = new File("/ana/Othethings/");
		String[] list = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".py")) {
					return true;
				} else {
					return false;
				}
			}
		});
		for (String f : list) {
			System.out.println(f);
		}
	}

	public void checkIfAFileExists() {
		File file = new File("p\\ana\\Othethings\\Homework\\test.txt");
		if (file.exists()) {
			System.out.println("The file you're searching exists");
		} else
			System.out.println("The file you're searching does NOT exist");

	}

	public void checkIfPermissionToRead$Write() {

		File file = new File("\\ana\\Othethings\\Homework\\test.txt");
		if (file.canWrite()) {
			System.out.println(file.getAbsolutePath() + " has permission to write");
		} else {
			System.out.println(file.getAbsolutePath() + " does not have permission to write");
		}
		if (file.canRead()) {
			System.out.println(file.getAbsolutePath() + " has permission to read");
		} else {
			System.out.println(file.getAbsolutePath() + " does not have permission to read");
		}
	}

	public void checkIfDirectory() {

		File file = new File("\\ana\\Othethings\\Homework\\test.txt");
		if (file.isDirectory()) {
			System.out.println(file.getAbsolutePath() + " is a directory");
		} else {
			System.out.println(file.getAbsolutePath() + "it is NOT a directory ");
		}
		if (file.isFile()) {
			System.out.println(file.getAbsolutePath() + " is a file");
		} else {
			System.out.println(file.getAbsolutePath() + " it is NOT a file");
		}
	}

	public void compareTwoFiles() {
		File file1 = new File("/ana/Othething/Homework/bin/homework_12_01_2019_1");
		File file2 = new File("/ana/Othething/Homework/bin/homework_19_01_2019");
		String str1 = file1.toString();
		String str2 = file2.toString();

		if (file1.exists()) {
			if (file2.exists()) {
				int var1 = str1.compareTo(str2);
				System.out.println("str1 & str2 comparison: " + var1);
			} else
				System.out.println("One of the files you are trying to compare does not exists.");
		}

	}

	public void lastModifiedDate() {
		File file = new File("test.txt");
		Date date = new Date(file.lastModified());
		System.out.println("The file was last modified on: " + date + "");
	}

	public void readImputFromJavaConsole() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		System.out.println(input);
	}

	public void displayFileSize() {
		File file = new File("\\ana\\Othethings\\Homework\\test.txt");
		if (file.exists()) {
			System.out.println(filesize_in_Bytes(file));
			System.out.println(filesize_in_kiloBytes(file));
			System.out.println(filesize_in_megaBytes(file));
		} else
			System.out.println("File doesn't exist");

	}

	private static String filesize_in_megaBytes(File file) {
		return (double) file.length() / (1024 * 1024) + " mb";
	}

	private static String filesize_in_kiloBytes(File file) {
		return (double) file.length() / 1024 + "  kb";
	}

	private static String filesize_in_Bytes(File file) {
		return file.length() + " bytes";
	}

	public void readAFile() {
		String file_name = "\\ana\\Othethings\\Homework\\test.txt";
		InputStream fins = null;
		try {
			fins = new FileInputStream(file_name);
			byte[] content = new byte[2 * 1024];
			int count = 0;
			while ((count = fins.read(content)) > 0) {
				System.out.println(new String(content, 0, count - 1));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fins != null)
					fins.close();
			} catch (Exception ex) {

			}
		}
	}

	public void readContentByLine() {
		BufferedReader br = null;
		String lines = "";
		try {
			br = new BufferedReader(new FileReader("\\ana\\Othethings\\Homework\\test.txt"));
			while ((lines = br.readLine()) != null) {
				System.out.println(lines);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Cannot find the file");
		} catch (IOException e) {
			System.err.println("Cannot read the file");
		}
	}

	public void readAPlainText() {
		StringBuilder sb = new StringBuilder();
		String line = "";
		try {
			String filename = "\\ana\\Othethings\\Homework\\test.txt";
			FileWriter fw = new FileWriter(filename, false);
			fw.write("Scrieeeeeeeemmmmm");
			fw.close();
			BufferedReader br = new BufferedReader(new FileReader("\\ana\\Othethings\\Homework\\test1.txt"));
			// read the file content
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
				System.out.println(line);
			}
			br.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}

	public void readLineByLine() {

		String line1 = "";
		String line2 = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("\\ana\\Othethings\\Homework\\test1.txt"));
			while (line1 != null) {
				line2 += line1;
				line1 = br.readLine();

			}
			System.out.println(line2);
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Cannot find the file");
		} catch (IOException e) {
			System.err.println("Cannot read the file.");
		}
	}

	public void storeIntoArray() {
		StringBuilder sb = new StringBuilder();
		String line = "";
		List<String> list = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("\\ana\\Othethings\\Homework\\test1.txt"));
			while (line != null) {
				line = br.readLine();
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
				if (line == null)
					break;
				list.add(line);
			}
			System.out.println(Arrays.toString(list.toArray()));
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Cannot find the file");
		} catch (IOException e) {
			System.err.println("Cannot read the file.");
		}
	}

	public void readAndWriteAPlainText() {
		StringBuilder sb = new StringBuilder();
		String line = "";
		try {
			String filename = "\\ana\\Othethings\\Homework\\test1.txt";
			FileWriter fw = new FileWriter(filename, false);
			fw.write("Scrieeeeemmmm");
			fw.close();
			BufferedReader br = new BufferedReader(new FileReader("\\ana\\Othethings\\Homework\\test.txt"));

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
				System.out.println(line);
			}
			br.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}

	public void appendTextToExistingFile() {
		StringBuilder sb = new StringBuilder();
		String line = "";
		try {
			String filename = "/home/students/myfile.txt";
			FileWriter fw = new FileWriter(filename, true);

			fw.write("Scriem runda 2 ");
			fw.close();
			BufferedReader br = new BufferedReader(new FileReader("\\ana\\Othethings\\Homework\\test.txt"));

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
				System.out.println(line);
			}
			br.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}

	public void readFirst3Lines() {

		String line = "";
		try {
			LineNumberReader reader = new LineNumberReader(
					new InputStreamReader(new FileInputStream("\\ana\\Othethings\\Homework\\test.txt"), "UTF-8"));
			while (((line = reader.readLine()) != null) && reader.getLineNumber() <= 3) {
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Unable to read the file.");
		}
	}

	public void findTheLongestWord() throws FileNotFoundException {

		String longestWord = "";
		String current;
		Scanner sc = new Scanner(new File("\\ana\\Othethings\\Homework\\test.txt"));

		while (sc.hasNext()) {
			current = sc.next();
			if (current.length() > longestWord.length()) {
				longestWord = current;
			}
			sc.close();

		}
		System.out.println("The longest word is :" + longestWord + "\n");
	}

	public void extractAllWordsAndCountOccurences() throws FileNotFoundException {
		File file = new File("words.txt");
		Scanner input = new Scanner(file);
		List<String> word_list = new ArrayList<>();

		while (input.hasNext()) {
			word_list.add(input.next());

		}

		String[] uniqueWords = word_list.stream().distinct().toArray(size -> new String[size]);
		Map<String, Integer> wordsMap = new HashMap<>();
		int frequency = 0;

		for (String uniqueWord : uniqueWords) {
			frequency = Collections.frequency(word_list, uniqueWord);
			System.out.println(uniqueWord + " occured " + frequency + " times");
			wordsMap.put(uniqueWord, frequency);
		}

		Stream<Entry<String, Integer>> topWords = wordsMap.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(5);

		topWords.forEach(System.out::println);
		input.close();
	}

}
