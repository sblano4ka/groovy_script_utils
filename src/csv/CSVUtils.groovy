package csv

class CSVUtils {

    static void writeToFile(String res, String path) {
        File file = new File(path)
        file.write res
    }

    static String readFileString(String filePath) {
        File file = new File(filePath)
        String fileContent = file.text
        return fileContent
    }
}


