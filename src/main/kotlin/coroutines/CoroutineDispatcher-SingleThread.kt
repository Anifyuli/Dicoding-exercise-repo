package coroutines
import kotlinx.coroutines.*
@DelicateCoroutinesApi

fun main(): Unit = runBlocking {
    val dispatcher = newSingleThreadContext("myThread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}