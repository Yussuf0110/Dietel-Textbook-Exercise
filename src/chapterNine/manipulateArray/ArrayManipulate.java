package chapterNine.manipulateArray;


    public class ArrayManipulate {

        private String array[];
        private int count;
        private int sizeOfArray;

        public ArrayManipulate()
        {
            array = new String[3];
            count = 0;
            sizeOfArray = 3;
        }

        public void addInput(String input)
        {
            if (count == sizeOfArray){
                increaseSize();
            }
            array[count] = input;
            count++;
        }

        public void increaseSize(){
            String[] newList = null;
            if (count == sizeOfArray){
                newList = new String[sizeOfArray * 2];
                {
                    for (int i = 0; i < sizeOfArray; i++)
                    {
                        newList[i] = array[i];
                    }
                }
            }
            array = newList;
            sizeOfArray = sizeOfArray * 2;
        }

        public void addInputAtIndex(int index, String input){
            if (count == sizeOfArray)
            {
                increaseSize();
            }
            for (int i = count - 1; i >= index; i--)
            {
                array[i + 1] = array[i];
            }
            array[index] = input;
            count++;
        }

        public void shrinkSize() {
            String[] newList = null;

            if (count > 0) {
                newList = new String[count];
                for (int i = 0; i < count; i++) {
                    newList[i] = array[i];
                }
                sizeOfArray = count;
                array = newList;
            }
        }

        public void deleteInput() {
            if (count > 0) {
                array[count - 1] = String.valueOf(0);
                count--;
            }
        }

        public void deleteInputAtIndex(int index) {
            if (count > 0) {
                for (int i = index; i < count - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[count - 1] = String.valueOf(0);
                count--;
            }
        }


        public static void main(String[] args) {
            ArrayManipulate newArray = new ArrayManipulate();

            newArray.addInput("mango");
            newArray.addInput("mango");
            newArray.addInput("mango");
            newArray.addInput("mangoes");
            newArray.addInput("mango");
            newArray.addInput("mango");
            newArray.addInput("mango");

            for (int i = 0; i < newArray.sizeOfArray;i++){
                System.out.println(newArray.array[i]);
            }

            newArray.deleteInputAtIndex(3);
            for (int i = 0; i < newArray.sizeOfArray;i++){
                System.out.println(newArray.array[i]);
            }

        }
    }