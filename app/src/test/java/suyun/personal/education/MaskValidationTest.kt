package suyun.personal.education

import org.junit.Test

class MaskValidationTest {
    val PHONE_PATTERN =
        "[+]{1}[7]{1}[ ]{1}[(]{1}[0-9]{3}[)]{1}[ ]{1}[0-9]{3}[-]{1}[0-9]{2}[-]{1}[0-9]{2}"
    // +X (XXX) XXX-XX-XX

    @Test
    fun initiateTests(){
        assert(!initiateValidateValue("123"))
        assert(!initiateValidateValue("+7 (708) 117-08-3")) 
        assert(!initiateValidateValue("+7 (708) 117-08-3-")) 
        assert(!initiateValidateValue("+7 (708) 117-08-3yh"))
        assert(!initiateValidateValue("+7 (708) 117-08-3#"))
        assert(!initiateValidateValue("+7 (708) 117-08-3222"))
        assert(!initiateValidateValue("7 (708) 117-08-3222"))
        assert(!initiateValidateValue("7 (770) 811-70-832"))
        assert(!initiateValidateValue("7 (708) 117-08-32"))
        assert(initiateValidateValue("+7 (708) 117-08-32"))
    }


    fun initiateValidateValue(phone: String) : Boolean{
        return phone.matches(Regex(PHONE_PATTERN))
    }
}