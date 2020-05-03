Q1)public static String flip(){
        Random rand = new Random();
        //two to one ratio
        String[] face = new String[] {"heads", "heads", "tails"};
        return face[rand.nextInt(face.length)];
    }
Q2)public static boolean arePermutations(int[] a, int[] b){
        List<String> listA = Arrays.asList(a);
        List<String> listB = Arrays.asList(b);
    }