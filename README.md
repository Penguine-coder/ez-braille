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
