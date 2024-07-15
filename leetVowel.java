public class leetVowel{
    public static void main(String[] args) {

        String s = "leetcode";
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        while( start < end )
        {
            while (start < end && !isVowel(arr[start]))
            {
                start++;
            }
            while (start < end && !isVowel(arr[end]))
            {
                end--;
            }
            if (start < end)
            {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end --;
            }
        }
        
        String res = new String(arr);
        System.out.println(res);

    }
    static boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}