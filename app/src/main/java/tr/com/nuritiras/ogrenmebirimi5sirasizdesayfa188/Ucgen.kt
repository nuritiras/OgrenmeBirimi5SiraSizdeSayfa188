package tr.com.nuritiras.ogrenmebirimi5sirasizdesayfa188

class Ucgen {
    var kenar1: Int = 0
    var kenar2: Int = 0
    var kenar3: Int = 0

    constructor(kenar1: Int, kenar2: Int, kenar3: Int) {
        this.kenar1 = kenar1
        this.kenar2 = kenar2
        this.kenar3 = kenar3
    }

    constructor(kenar1: Int, kenar2: Int) {
        this.kenar1 = kenar1
        this.kenar2 = kenar2
        this.kenar3 = kenar2
    }

    constructor(kenar1: Int) {
        this.kenar1 = kenar1
        this.kenar2 = kenar1
        this.kenar3 = kenar1
    }

    fun cevreBul(): Int {
        return kenar1 + kenar2 + kenar3
    }


}