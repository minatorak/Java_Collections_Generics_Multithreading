public class ForEachLoop {
    public static void main(String[] args){
        String[] strArray = {"Chaand","John","Pooja","Mia"};

        for (int i=0 ;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }
        System.out.println("-----");
        for (String name:strArray){
            System.out.println(name);
        }

    }
}
