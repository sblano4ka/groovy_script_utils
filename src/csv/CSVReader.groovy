package csv

@Grab('com.xlson.groovycsv:groovycsv:1.2')
import com.xlson.groovycsv.CsvParser

class CSVReader {

    static Iterator readData(def path, def separator) {
        String input = CSVUtils.readFileString(path)

        Iterator data = new CsvParser().parse(input, separator: separator)
        data
    }
}
