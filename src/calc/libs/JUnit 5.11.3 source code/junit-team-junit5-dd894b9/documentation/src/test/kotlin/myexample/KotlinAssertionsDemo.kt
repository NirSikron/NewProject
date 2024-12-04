package myexample

import calc.Calculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class KotlinAssertionsDemo {

    // בדיקה לוודא שלא נזרקת חריגה
    @Test
    fun `exception absence testing`() {
        val calculator = Calculator()
        val result = assertDoesNotThrow {
            calculator.divide(6, 3) // בדיקה לחילוק תקין
        }
        assertEquals(2, result) // תוצאה מצופה: 2
    }

    // בדיקה לוודא שנזרקת חריגה
    @Test
    fun `expected exception testing`() {
        val calculator = Calculator()
        val exception = assertThrows<ArithmeticException> {
            calculator.divide(1, 0) // ניסיון לחלק באפס
        }
        assertEquals("/ by zero", exception.message) // בדיקה להודעת השגיאה
    }
}
