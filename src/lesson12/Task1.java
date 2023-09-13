package lesson12;
/*В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
Проанализировать и записать в другой файл самое длинное слово.*/

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Task1 {
    public static void main(String[] args) {
        File inputFile = new File("D:/Курсы/TeachMeSkills/FilesForTasks/Romeo and Juliet.txt");
        File outputFile = new File("newFile.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
            String content = new String(fileInputStream.readAllBytes(), StandardCharsets.UTF_8);
            String longestWord = getLongestWord(content);
            fileOutputStream.write(longestWord.getBytes(StandardCharsets.UTF_8));
            fileInputStream.close();
            fileOutputStream.close();
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("File not found, " + exception.getMessage());
        }
        catch (IOException exception)
        {
            System.out.println("Error when closing file, " + exception.getMessage());
        }

    }

    private static String getLongestWord(String content) {
        content.replace(",", " ");
        content.replace(".", " ");
        content.replace("?", " ");
        content.replace(":"," ");
        content.replace("[", " ");
        content.replace("]"," ");
        content.replace("{", " ");
        content.replace("}", " ");
        String[] array = content.split(" ");
        String longestWord = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > longestWord.length()) {
                longestWord = array[i];
            }
        }
        return longestWord;
    }
}
