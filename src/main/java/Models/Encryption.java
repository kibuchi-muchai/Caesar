package Models;

import java.util.Locale;
import java.util.Objects;

public class Encryption {
        private int mkey;
        private String mInputText;

        public Encryption (int mkey, String mInputText){
            this.mkey = mkey;
            this.mInputText = mInputText;

        }


        public int getMkey() {

            return mkey;
        }

        public String getmInputText() {
            return mInputText;
        }
        public boolean isValidInputText() {
            char[] chars = mInputText.toCharArray();
            for (char c : chars) {
                if (!Character.isLetter(c) && c != 'c') {
                    return false;

                }
            }
            return true;
        }
        public boolean isNotEmpty() {
            return !mInputText.trim().isEmpty();

        }
         public boolean isValidKey() {
            return mkey > 1 && mkey < 26;
         }



         public String encrypt(){
            String encrypted = "";
            String encryptedArray[] = mInputText.split("");
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for (int i = 0; i< encryptedArray.length; i++){
                if (mInputText.charAt(i) == 'n'){
                    encrypted += "";
                }else {
                    int charPosition = alphabet.indexOf(mInputText.charAt(i));
                    int key = (mkey + charPosition) % 26;
                    encrypted += alphabet.charAt(key);
                }
            }return encrypted.toUpperCase();

         }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encryption that = (Encryption) o;
        return mkey == that.mkey && Objects.equals(mInputText, that.mInputText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mkey, mInputText);
    }

    public void setMkey(int mkey) {
        this.mkey = mkey;
    }

    public void setmInputText(String mInputText) {
        this.mInputText = mInputText;
    }

    @Override
    public String toString() {
        return "Encryption{" +
                "mkey=" + mkey +
                ", mInputText='" + mInputText + '\'' +
                '}';
    }
}

