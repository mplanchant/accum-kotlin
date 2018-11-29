package uk.co.logiccache.accum

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

internal class AccumTest : StringSpec({

    "empty string" {
        accum("") shouldBe ""
    }

    "blank string" {
        accum("        ") shouldBe ""
    }

    "string of 'a'" {
        accum("a") shouldBe "A"
    }

    "string of 'ab'" {
        accum("ab") shouldBe "A-Bb"
    }

    "string of 'abcd'" {
        accum("abcd") shouldBe "A-Bb-Ccc-Dddd"
    }

    "string of 'RqaEzty'" {
        accum("RqaEzty") shouldBe "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    }

    "string of 'cwAt'" {
        accum("cwAt") shouldBe "C-Ww-Aaa-Tttt"
    }
})