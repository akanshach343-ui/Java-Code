// tasking runs on single cpu ( concurrently)
//   multiprocessinf runs on multiple cpu (parallely)
//multithreading is a process of executing multiple threads simultaneously, enables simultaneous execution of multiple parts of a program improving cpu utilization and responsiveness
//thread is the smallest unit of execution and shares  the same memory space but run independently, life cycle of thread is new, runnable, running, blocked, terminated, from running it can either get blocked(acquiring lock), waiting, or time waiting state
//there are 2 ways to create thread- extending thread class and implementing runnable interface. runnable interface is preferred as it allows multiple inheritance. in both cases run() method is overridden to define the task to be executed by the thread.
