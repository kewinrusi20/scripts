```c#
using System;
using System.Diagnostics;

class Program
{
    static void Main()
    {
        // Example of using StartStopwatch function
        var stopwatch = StartStopwatch();

        // Your code to measure the time goes here

        // Example: Delay for 2 seconds
        System.Threading.Thread.Sleep(2000);

        // Stop the stopwatch and print the elapsed time
        StopStopwatch(stopwatch);
    }

    static Stopwatch StartStopwatch()
    {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.Start();
        return stopwatch;
    }

    static void StopStopwatch(Stopwatch stopwatch)
    {
        stopwatch.Stop();
        Console.WriteLine("Elapsed time: " + stopwatch.Elapsed);
    }
}
```
From ChatGPT

