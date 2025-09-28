# Braille Converter

A Java utility that converts text to Braille and vice versa.

## Features
- Text to Braille conversion
- Braille to Text conversion
- Validation to check if conversion is possible

## Usage

```java
String text = "Hello World";
String braille = "⠓⠑⠇⠇⠕ ⠺⠕⠗⠇⠙";

// Convert text to Braille
String convertedBraille = BrailleConverter.normalToBraille(text);
System.out.println(convertedBraille);

// Convert Braille to text
String convertedText = BrailleConverter.brailleToNormal(braille);
System.out.println(convertedText);

// Check if conversion is possible
if (BrailleConverter.canConvertToBraille(text)) 
    System.out.println(BrailleConverter.normalToBraille(text));
```

## Supported Characters
### Text to Braille Conversion
- Lowercase letters: a-z
- Space character:
- Total supported characters: 27 (26 letters + space)

### Braille to Text Conversion
- Braille patterns: ⠁⠃⠉⠙⠑⠋⠛⠓⠊⠚⠅⠇⠍⠝⠕⠏⠟⠗⠎⠞⠥⠧⠺⠭⠽⠵
- Braille space: ⠀ (same as normal space)
- Complete 1:1 mapping between the 26 English letters and their Braille equivalents

### Character Mapping Table
| Letter | Braille | Letter | Braille | Letter | Braille |
|--------|---------|--------|---------|--------|---------|
| a      | ⠁      | j      | ⠚      | s      | ⠎      |
| b      | ⠃      | k      | ⠅      | t      | ⠞      |
| c      | ⠉      | l      | ⠇      | u      | ⠥      |
| d      | ⠙      | m      | ⠍      | v      | ⠧      |
| e      | ⠑      | n      | ⠝      | w      | ⠺      |
| f      | ⠋      | o      | ⠕      | x      | ⠭      |
| g      | ⠛      | p      | ⠏      | y      | ⠽      |
| h      | ⠓      | q      | ⠟      | z      | ⠵      |
| i      | ⠊      | r      | ⠗      | space  | ⠀      |

### Current Limitations
❌ Uppercase letters (A-Z)

❌ Numbers (0-9)

❌ Punctuation (. , ! ? etc.)

❌ Special characters (@, #, $, etc.)

❌ Accented characters (é, ñ, ü, etc.)

### Installation
1. Clone this repository
2. Include BrailleConverter.java in your Java project
3. Compile and run
