class BinaryPalindrom9 {
    public boolean isPalindrome(int x) {
        int check=0;
        int a=x;
        while(a>0){
            int lastdigit=a%10;
            check=check*10+lastdigit;
            a=a/10;
        }
        if(check==x){
            return true;
        }

        return false;

    }
}