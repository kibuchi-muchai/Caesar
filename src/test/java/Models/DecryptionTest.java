package Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptionTest {
    Decryption testDecrypt = new Decryption(2,"");
    @Test
    public void checkIfSavesInputText(){
        assertEquals("",testDecrypt.getmInputText());

    }
    @Test
    public void checkKeyIsSaved(){
        assertEquals(2,testDecrypt.getmKey());

    }
    @Test
    public void isValidInputText(){
        assertTrue(testDecrypt.isValidInputText());
    }
    @Test
    public void isValidKey(){
        assertTrue(testDecrypt.isValidKey());
    }
    @Test
    public void validDecryption(){
        assertEquals("decrypt",testDecrypt.decrypt());
    }


}