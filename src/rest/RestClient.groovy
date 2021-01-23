package rest

import groovy.json.JsonOutput
@Grab('com.github.groovy-wslite:groovy-wslite:1.1.3')
import wslite.rest.*

class RestClient {


    static String HOST = ""
    static String PATH = ""
    static String AUTH_HEADER = ""

    static void doGetWithAuth(String pathVariable) {
        RESTClient client = new RESTClient(HOST)

        try {
            println "Do call with path variable ${pathVariable}"
            Response response = client
                    .get(path: PATH + pathVariable, headers: ["Authorization": AUTH_HEADER])
            println "StatusCode:  ${response.statusCode}"
            println "Response:  ${JsonOutput.prettyPrint(JsonOutput.toJson(response.json))}"
        } catch (RESTClientException e) {
            println "Error: ${e.getMessage()}"
            assert e?.response?.statusCode != 200
        }
    }
}
