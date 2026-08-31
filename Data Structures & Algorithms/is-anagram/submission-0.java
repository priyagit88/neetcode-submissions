class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1= s.toCharArray();
        System.out.print(c1 + " ");

        char[] c2= t.toCharArray();
        System.out.print(c2 + " ");

        Arrays.sort(c1);
        System.out.print(c1 + " ");
        Arrays.sort(c2);
        System.out.print(c2 + " ");

        if(Arrays.equals(c1,c2)){
            return true;
        }
        return false;

    }
}
