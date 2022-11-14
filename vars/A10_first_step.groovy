@Grab('org.apache.poi:poi:5.2.3')
import org.apache.poi

def call() {
    script {
        def workbook = new XFFSWorkbook()
    }
}