fun main(args: Array<String>) // Command line arguments that represent system environment variables.
{
    if (args.isEmpty())
    {
        println("No system environment variables were inserted.")
    }

    else
    {
       for (arg: String in args)
       {
           var sysvar: String? = System.getenv(arg)
           if (sysvar.isNullOrEmpty())
           {
               println("No system environment variable named ${arg} was found.")
           }

           else
           {
               println("System environment variable found: ${arg}=${sysvar}")
           }
       }
    }
}