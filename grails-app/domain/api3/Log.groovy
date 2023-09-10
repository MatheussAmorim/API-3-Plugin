package api3

import java.time.LocalDate

class Log {

    LocalDate data
    String descricao

    static mapping = {
        id generator: "increment"
        version false
    }

    static constraints = {
        data nullable: false
        descricao nullable: false, maxSize: 1000
    }
}
