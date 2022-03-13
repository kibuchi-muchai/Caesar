package Models;

public class Decryption {
    private int mKey;
    private String mInputText;


    public Decryption(int key, String inputText) {
        mKey = key;
        mInputText = inputText;

    }

    public int getmKey() {
        return mKey;
    }

    public String getmInputText() {
        return mInputText;
    }

    public boolean isValidInputText(){
        char[] chars = mInputText.toCharArray();

        for (char c : chars){
            if ((!Character.isLetter(c) && c !='c')){
                return false;
            }
        }return true;
    }
    public boolean isValidKey(){
        return mKey >1 && mKey <26;

    }

    public String decrypt(){
        String decryptedValue = "";
        String encryptedArray[] = mInputText.split("");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i<encryptedArray.length;i++){
            if (mInputText.charAt(i) == 'c'){
                decryptedValue +="";
            }
            else {
                int charPosition = alphabet.indexOf(mInputText.charAt(i));
                int keyVal =  (charPosition - mKey)%26;
                if (keyVal<0){
                keyVal = alphabet.length() + keyVal;
                }
                char replaceValue = alphabet.charAt(keyVal);
                decryptedValue+= replaceValue;
            }

            }return decryptedValue;
        }





}
