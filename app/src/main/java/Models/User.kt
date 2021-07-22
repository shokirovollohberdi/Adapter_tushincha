package Models

class User {
    var name:String? = null
    var password:String? = null

    constructor(name: String?, password: String?) {
        this.name = name
        this.password = password
    }
}