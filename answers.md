Q1)public static String flip(){
        Random rand = new Random();
        //two to one ratio
        String[] face = new String[] {"heads", "heads", "tails"};
        return face[rand.nextInt(face.length)];
    }

Q2)public static boolean arePermutations(int[] a, int[] b){
        for (int aValue : a)
        {
            if (! contains (b, aValue))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean contains (int[] b, int key)
    {
        for (int bValue :b)
        {
            if (bValue == key)
            {
                return true:
            }
        }
        return false;
    }

Q3)Index 3 swaps with index 0 (4, 2, 3, 1) Index 2 swaps with index 1 (4, 3, 2, 1) Index 1 swaps with itself and Index 0 swaps with itself.