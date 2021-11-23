public class MainClass2 {

    final static int[][] Input_Mat = {
        {1, 1, 5, 6, 8},
        {2, 3, 5, 7, 1},
        {4, 5, 7, 1, 2},
        {8, 5, 1, 2, 5}
    };

    public static int getMaxValue(int[][] array) {
        int maxValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
        }
        return maxValue;
    }

    static int maxValue = getMaxValue(Input_Mat);

    public static void main(String[] args) {

        System.out.println("Input_Mat");
        for (int row = 0; row < Input_Mat.length; row++) {
            for (int col = 0; col < Input_Mat[row].length; col++) {
                System.out.print(Input_Mat[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("maxValue = " + maxValue);

        int[][] GLCM1_0 = new int[maxValue + 1][maxValue + 1];
	int[][] GLCM1_45 = new int[maxValue + 1][maxValue + 1];
	int[][] GLCM1_90 = new int[maxValue + 1][maxValue + 1];
	int[][] GLCM1_135 = new int[maxValue + 1][maxValue + 1];
        int[][] GLCM2_90 = new int[maxValue + 1][maxValue + 1];
	int[][] GLCM2_0 = new int[maxValue + 1][maxValue + 1];
	int[][] GLCM2_45 = new int[maxValue + 1][maxValue + 1];
        int[][] GLCM2_135 = new int[maxValue + 1][maxValue + 1];
	int[][] GLCM3_0 = new int[maxValue + 1][maxValue + 1];

       

       
        for (int row = 0; row < Input_Mat.length; row++) {
            for (int col = 0; col <  Input_Mat[row].length-2; col++) {
                int x = Input_Mat[row][col];
                int y = Input_Mat[row][col+2];
                GLCM2_0[x][y]++;
            }
        }

        for (int row = 2; row < Input_Mat.length; row++) {
            for (int col = 0; col <  Input_Mat[row].length; col++) {
                int x = Input_Mat[row][col];
                int y = Input_Mat[row-2][col];
                GLCM2_90[x][y]++;
            }
	}
        

        for (int row = 0; row < Input_Mat.length; row++) {
            for (int col = 0; col < Input_Mat[row].length - 1; col++) {
                int x = Input_Mat[row][col];
                int y = Input_Mat[row][col + 1];
                GLCM1_0[x][y]++;
            }
        }

	for (int row = 1; row < Input_Mat.length; row++) {
    	    for (int col = 0; col < Input_Mat[row].length; col++) {
            	int x = Input_Mat[row][col];
        	int y = Input_Mat[row - 1][col];
        	GLCM1_90[x][y]++;
	     }
	}

	for (int row = 1; row < Input_Mat.length; row++) {
	    for (int col = 1; col < Input_Mat[row].length; col++) {
		int x = Input_Mat[row][col];
		int y = Input_Mat[row - 1][col-1];
		GLCM1_135[x][y]++;
	    }
	}

	for (int row = 1; row < Input_Mat.length; row++) {
            for (int col = 0; col < Input_Mat[row].length-1; col++) {
                int x = Input_Mat[row][col];
                int y = Input_Mat[row-1][col+1];
                GLCM1_45[x][y]++;
            }
	}

	 for (int row = 2; row < Input_Mat.length; row++) {
            for (int col = 0; col <  Input_Mat[row].length-2; col++) {
                int x = Input_Mat[row][col];
                int y = Input_Mat[row-2][col+2];
                GLCM2_45[x][y]++;
            }
        }

	for (int row = 2; row < Input_Mat.length; row++) {
            for (int col = 2; col <  Input_Mat[row].length; col++) {
                int x = Input_Mat[row][col];
                int y = Input_Mat[row-2][col-2];
                GLCM2_135[x][y]++;
            }
        }


	 for (int row = 0; row < Input_Mat.length; row++) {
            for (int col = 0; col <  Input_Mat[row].length-3; col++) {
                int x = Input_Mat[row][col];
                int y = Input_Mat[row][col+3];
                GLCM3_0[x][y]++;
            }
        }
        
		
	        

        System.out.println("GLCM D=1,0");
        for (int x = 1; x <= maxValue; x++) {
            for (int y = 1; y <= maxValue; y++) {
                System.out.print(GLCM1_0[x][y] + " ");
            }
            System.out.println();
        }


	System.out.println("GLCM D=1,45");
	for (int x = 1; x <= maxValue; x++) {
	    for (int y = 1; y <= maxValue; y++) {
		System.out.print(GLCM1_45[x][y] + " ");
	    }
	    System.out.println();
	}
		    
		
	    
	System.out.println("GLCM D=1, 90");
	for (int x = 1; x <= maxValue; x++) {
	    for (int y = 1; y <= maxValue; y++) {
	    	System.out.print(GLCM1_90[x][y] + " ");
		}
		System.out.println();
	}

	System.out.println("GLCM D=1, 135");
        for (int x = 1; x <= maxValue; x++) {
	    for (int y = 1; y <= maxValue; y++) {
		System.out.print(GLCM1_135[x][y] + " ");
            }
            System.out.println();
        }

	System.out.println("Print GLCM with D=2,0");
	for (int x = 1; x <= maxValue; x++) {
	    for (int y = 1; y <= maxValue; y++) {
		System.out.print(GLCM2_0[x][y] + " ");
            }
            System.out.println();
        }

	System.out.println("Print GLCM with D=2,90");
	for (int x = 1; x <= maxValue; x++) {
	    for (int y = 1; y <= maxValue; y++) {
		System.out.print(GLCM2_90[x][y] + " ");
            }
            System.out.println();
        }

	System.out.println("Print GLCM with D=2,45");
	for (int x = 1; x <= maxValue; x++) {
	    for (int y = 1; y <= maxValue; y++) {
		System.out.print(GLCM2_45[x][y] + " ");
            }
            System.out.println();
        }

       	System.out.println("Print GLCM with D=2,135");
	for (int x = 1; x <= maxValue; x++) {
	    for (int y = 1; y <= maxValue; y++) {
		System.out.print(GLCM2_135[x][y] + " ");
            }
            System.out.println();
        }

	System.out.println("Print GLCM with D=3,0");
	for (int x = 1; x <= maxValue; x++) {
	    for (int y = 1; y <= maxValue; y++) {
		System.out.print(GLCM3_0[x][y] + " ");
            }
            System.out.println();
        }
     
     }
}



