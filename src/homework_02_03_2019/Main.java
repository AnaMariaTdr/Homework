package homework_02_03_2019;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Exercises ex = new Exercises();

// 1. Write a program to get a list of all file/directory names from the given. 

		ex.nameAllfilesMethod();

//2. Write a program to get specific files by extensions from a specified folder. 

		ex.getSpecificFilesByExtension();
//
//3. Write a program to check if a file or directory specified by pathname exists or not. 

		ex.checkIfAFileExists();
//
//4. Write a program to check if a file or directory has read and write permission. 

		ex.checkIfPermissionToRead$Write();
//
//5. Write a program to check if given pathname is a directory or a file. 

		ex.checkIfDirectory();
//
//6. Write a program to compare two files lexicographically. 

		ex.compareTwoFiles();

//
//7. Write a program to get last modified time of a file. 

		ex.lastModifiedDate();
//
//8. Write program to read input from java console. 

		ex.readImputFromJavaConsole();
//
//9. Write a program to get file size in bytes, kb, mb. 

		ex.displayFileSize();
//
//10. Write a program to read contents from a file into byte array. 

		ex.readAFile();
//
//11. Write a program to read a file content line by line. 

		ex.readContentByLine();
//
//12. Write a program to read a plain text file. 

		ex.readAPlainText();
//
//13. Write a program to read a file line by line and store it into a variable. 

		ex.readLineByLine();
//
//14. Write a program to store text file content line by line into an array. 
		ex.storeIntoArray();

//
//15. Write a program to write and read a plain text file. 

		ex.readAndWriteAPlainText();
//
//16. Write a program to append text to an existing file. 

		ex.appendTextToExistingFile();
//
//17. Write a program to read first 3 lines from a file. 

		ex.readFirst3Lines();
//
//18. Write a program to find the longest word in a text file. 
//
		ex.findTheLongestWord();

//19. Write a program to extract all the words (only) from a text file and sort them by number of occurrences in the file.
		ex.extractAllWordsAndCountOccurences();

	}

}
