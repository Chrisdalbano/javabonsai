public class Bonsai {

    int heightOfLeaves;
    int trunkWidth;
    int rootLength;

    public void printTrunk() {
        for(int i = 0; i < heightOfLeaves / 2; i++) {
            for(int j = 0; j < trunkWidth; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printLeaves() {
        int maxWidth = heightOfLeaves * 2 - 1;

        for(int i = 0; i < heightOfLeaves; i++) {
            int currentWidth = 2 * i + 1;
            int spaces = (maxWidth - currentWidth) / 2;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < trunkWidth; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void printRoots(){
        for(int i=0; i<rootLength; i++){
            for(int j=0;j<trunkWidth;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public void  displayBonsai() {
        printTrunk();
        printLeaves();
        printRoots();
    }

    public Bonsai(int heightOfLeaves, int trunkWidth, int rootLength ) {
        this.heightOfLeaves = heightOfLeaves;
        this.trunkWidth = trunkWidth;
        this.rootLength = rootLength;

        System.out.println("This Tree properties: ");
        System.out.println("Height of leaves: " + heightOfLeaves);
        System.out.println("Trunk width: " + trunkWidth);
        System.out.println("Root length: " + rootLength);


    }
}
