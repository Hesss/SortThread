import Threads.BubbleSortThread;
import Threads.SelectionSortThread;
import Threads.ShellSortThread;

public class Main {
    public static void main(String[] args) {

        String[] array = {"Съешь", "же", "еще", "этих", "французских", "булок", "да", "выпей", "чаю"};

        BubbleSortThread bubbleSortThread = new BubbleSortThread(array);
        SelectionSortThread selectionSortThread = new SelectionSortThread(array);
        ShellSortThread shellSortThread = new ShellSortThread(array);

        Thread firstThread = new Thread(bubbleSortThread);
        firstThread.start();
        Thread secondThread = new Thread(selectionSortThread);
        secondThread.start();
        Thread thirdThread = new Thread(shellSortThread);
        thirdThread.start();
    }
}