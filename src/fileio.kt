import java.io.File

fun main()
{
    print("Enter C to create a file or R to read a file: ")
    var fileoptions: String? = readLine()

    if (!fileoptions.isNullOrEmpty() && (fileoptions[0] == 'C' || fileoptions[0] == 'R'))
    {
        print("Enter the filename and extension of the file: ")
        var filename: String? = readLine()

        if (!filename.isNullOrEmpty())
        {
            if (fileoptions[0] == 'C')
            {
                print("Enter text (optional) to append it to the file: ")
                var text: String? = readLine()
                create(filename, text)
            }

            else // fileoptions == 'R'
            {
                read(filename)
            }
        }

        else
        {
            print("Invalid file name inserted.")
        }
    }

    else
    {
        println("Invalid file option inserted.")
    }
}

fun create(filename: String, text: String?)
{
    var file = File(filename)
    if (file.exists())
    {
        println("The file already exists.")
    }

    else
    {
        file.createNewFile()
        if (!text.isNullOrEmpty())
        {
            file.writeText(text)
        }

        println("File created successfully.")
    }
}

fun read(filename: String)
{
    var file = File(filename)
    if (file.exists())
    {
        var buffer: List<String> = file.readLines()
        for (line: String in buffer)
        {
            println("${line}")
        }
    }

    else
    {
        print("The specified file does not exist.")
    }
}