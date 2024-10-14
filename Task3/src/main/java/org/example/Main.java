package org.example;

    public class Main {
        static String[][] array = {
                {"2456789", "35", "2178", "12"},
                {"52678", "1988", "12", "88889"},
                // {"46889", "69", "47", "23456"},
                {"46889", "69", "47","65"},
                {"678", "117", "985678", "12"}
        };

        public static void main(String[] args) {

           check_Massive(array);
          
        }

        public static void check_Massive(String[][] input_array) throws MyArraySizeException, MyArrayDataException {
            boolean f=true;
            if (input_array.length != 4 )
                f=false;

            for (String[] strings : input_array) {
                if (strings.length != 4)
                    f=false;
            }
            if (!f){
                throw new MyArraySizeException("Матрица не 4 * 4");
            }
            int sum = 0, s;
            for (int i = 0; i < input_array.length; i++) {
                for (int j = 0; j < input_array[i].length; j++) {
                    try {
                        s = Integer.valueOf(input_array[i][j]);
                        sum += s;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Ячейка в  " + (i + 1) + " строчке и " + (j + 1) + " столбце содержится неверный тип данных");
                    }
                }
            }

            for (int i = 0; i < input_array.length; i++) {
                for (int j = 0; j < input_array[i].length; j++) {
                    s = Integer.valueOf(input_array[i][j]);
                    try {
                        if (s < 1000 && isHamming(s)) {
                            throw new MyHammingException("Ячейка в  " + (i + 1) + " строчке и " + (j + 1) + " столбце содержится число Хемминга до 1000");
                        }
                    } catch (MyHammingException x) {
                        x.printStackTrace();
                    }
                }
            }
            System.out.printf("Сумма элементов матрицы: "+ sum);
        }

        public static boolean isHamming(int n) {
            if (n <= 0) {
                return false;
            }

            // Разделяем число на множители 2, 3 и 5
            while (n % 2 == 0) {
                n /= 2;
            }
            while (n % 3 == 0) {
                n /= 3;
            }
            while (n % 5 == 0) {
                n /= 5;
            }

            // Если в конце осталась 1, то это число принадлежит последовательности Хемминга
            return n == 1;
        }
    }
