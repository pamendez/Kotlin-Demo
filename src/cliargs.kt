fun main(args: Array<String>)
{
    if (args.isEmpty())
    {
        println("No command line arguments were inserted.")
    }

    else
    {
        var index: Int = 1
        for (arg: String in args)
        {
            println("Argument ${index}: ${arg}")
            index += 1
        }
    }
}