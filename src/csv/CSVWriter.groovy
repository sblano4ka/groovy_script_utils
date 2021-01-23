package csv

class CSVWriter {

    static void writeData(def data, def path) {
        CSVUtils.writeToFile(data, path)
    }
}
