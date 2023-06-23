/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
*/
package HW1;
import java.util.Random;
import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {
        double[] firstArray = getFilledArray(10);
        double[] secondArray = getFilledArray(9);
        double[] divArray = divArrays(firstArray, secondArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(divArray));
    }
    public static double[] getFilledArray(int length){
        double[] array = new double[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(1,20);
        }
        return array;
    }
    public static double[] divArrays(double[] firstArray, double[] secondArray) {
        if(firstArray.length != secondArray.length) throw new RuntimeException("Длины массивов не равны");
        double[] resultArr = new double[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArray[i] / secondArray[i];
        }
        return resultArr;
    }
}
