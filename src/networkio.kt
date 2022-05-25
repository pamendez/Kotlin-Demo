import java.net.HttpURLConnection
import java.net.URL
import java.net.MalformedURLException

fun main()
{
    print("Enter the URL to connect to and read its content: ")
    var url: String? = readLine()
    if (url.isNullOrEmpty())
    {
        println("No URL was inserted.")
    }

    else
    {
        var page_url = URL(url)
        var page_connection = page_url.openConnection() as HttpURLConnection

        try
        {
            var page_text: String = page_connection.inputStream.bufferedReader().readText()
            println(page_text)
        }

        catch (ex: Exception)
        {
            println("The URL is invalid or can't be accessed.")
        }

        catch (murle: MalformedURLException)
        {
            println("The URL has an invalid protocol. Use HTTP or HTTPS.")
        }

        finally
        {
            page_connection.disconnect()
        }
    }
}