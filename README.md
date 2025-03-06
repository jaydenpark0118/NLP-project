# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one word, otherwise it might not properly get display on this README.

![UML Diagram](<Copy of Unit 6 - UML Diagram.png>)
## Video

Record a short video of your project to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown code:

![Thumbnail](mq2.webp)
https://youtu.be/Ur7MEbt1FU0

## Project Description

My project was aimed to translate any inputted text into pig latin. It uses a scanner to get the user to type anything to be translated. The letters are then translated based on the rules of pig latin. The demo uses the same rules but with a text file that is already provided.

## NLP Techniques

My code looks at the first letter and size of a word that is typed. If it starts with a vowel, then it will simply add "yay" to the end of the word. If it does not, then it will put the first letter at the end of the word and add "ay". Additionally, it checks for punctuation and places the symbol at the end of the word. Lastly, it removes any extra spaces in case of a typo as per English standard.