import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest

fun main() {
    val client: HttpClient = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=146"))
        .build()
    val response = client.send(request, HttpResponse.BodyHandlers.ofString())
    println(response.body())
}