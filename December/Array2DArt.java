public class Array2DArt {
    public static void main(String[]args){
        String[][] asciiart={
                {" "," ","_","_","_"," "," "},
                {" ","(","o"," ","o",")"," "},
                {"("," "," ","V"," "," ",")"},
                {" ","-","m","-","m","-"," "},
        };
        //Part 1: Add 2 assignment statements to change "o" to "@"
        for (int i = 0; i < asciiart.length; i++) {
            for (int j = 0; j < asciiart[i].length; j++) {
                if (asciiart[i][j].equals("o")) {
                    asciiart[i][j] = "@";
                }
            }
        }

        System.out.println("ASCII Art:");
        for(String[]row: asciiart){
            for(String column: row)
                System.out.print(column);
            System.out.println();
        }
    }
}