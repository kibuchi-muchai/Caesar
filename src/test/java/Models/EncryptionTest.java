package Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptionTest {
    Encryption testEncrypt = new Encryption(2,"");
    @Test
    public void checkIfItCreatesInstance(){
        assertNotNull(testEncrypt);
    }
    @Test
    public void checkIfSavesInputText(){
        assertEquals("",testEncrypt.getmInputText());

    }
    @Test
    public void checkKeyIsSaved(){
        assertEquals(2,testEncrypt.getMkey());
    }
    @Test
    public void isNotEmpty
            (){
        assertTrue(testEncrypt.isNotEmpty());
    }
    @Test
    public void isValidInputText(){
        assertEquals(false, !testEncrypt.isValidInputText());
    }
    @Test
    public void isValidKey() {
        assertTrue(testEncrypt.isValidKey());
    }
    @Test
    public void validEncrypt(){
        assertEquals("",testEncrypt.encrypt());
    }





}