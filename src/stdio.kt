fun main()
{
    print("Hello, what's your name?: ")

    // Standard input
    var name: String = readLine()!!
    if (name.isNullOrEmpty())
    {
        println("You don't have a name...")

        // Standard error via exceptions
        throw Exception("Exception: Invalid input as name.")
    }

    else
    {
        // Standard output
        println("Hello, ${name}!")

        // Standard error via Java's 'System.err'
        System.err.println("Error: The program has ended.")
    }
}