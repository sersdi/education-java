// Исключения времени выполнения(Runtime Exceptions) или Непроверяемые исключения(Unchecked Exceptions)
// К ним относят(деление на 0, выход за пределы массива, nullPointerException и тд)
// В try catch оборачивать необязательно

//Проверяемые исключения(Checked Exceptions)

//Иерархия исключений:
//                                                             Throwable
//                                    Exception                                                                    Error
//            RuntimeException                             FileNotFoundException   IOException                 OutOfMemoryError
//          (UnCheckedExceptions)                  (checkedExceptions обязательно оборачивать в try-catch)
// NullPointerException  IndexOutOfBoundsException
//
//
//
//
//
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ProgramMain_Виды_Исключений {
    public static void main() throws FileNotFoundException {
        for (int i = 0; i < 1000000; i++) {
            new Cat("Name", "bred", 1f);
        }
    }

    private static void method() throws FileNotFoundException {
        File file = new File("1.txt");
        InputStream inputStream = new FileInputStream(file);
    }
}
