[![Build Status](https://travis-ci.com/mplanchant/accum-kotlin.svg?branch=master)](https://travis-ci.com/mplanchant/accum-kotlin)

The examples below show you how to write function `accum`:

Examples:

```
accum("abcd");    // "A-Bb-Ccc-Dddd"
accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt");    // "C-Ww-Aaa-Tttt"
```

The parameter of accum is a string which includes only letters from `a..z` and `A..Z`.

https://www.codewars.com/kata/mumbling