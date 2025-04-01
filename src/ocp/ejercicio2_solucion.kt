package ocp
/*
abstract class MetodoEnvio {
    abstract fun enviar(archivo: String)
}
class EnvioFTP : MetodoEnvio() {
    override fun enviar(archivo: String) {
        println("Enviando archivo por FTP: $archivo")
    }
}
class EnvioHTTP : MetodoEnvio() {
    override fun enviar(archivo: String) {
        println("Enviando archivo por HTTP: $archivo")
    }
}
class EnvioArchivos {
    fun enviar(archivo: String, metodoEnvio: MetodoEnvio) {
        metodoEnvio.enviar(archivo)
    }
}
fun main() {
    val envio = EnvioArchivos()
    val envioFTP = EnvioFTP()
    envio.enviar("documento.txt", envioFTP)
    val envioHTTP = EnvioHTTP()
    envio.enviar("imagen.jpg", envioHTTP)
}
*/