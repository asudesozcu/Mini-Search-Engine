# Mini-Search-Engine
Data Structure Project 2

To tackle this project, we'll develop a Java program that implements a mini desktop search engine. The main objective is to search through a collection of HTML documents for specified keywords and return a list of documents where those keywords are found. Here's a  overview of how we approached this task:

Parsing HTML Documents: We'll need to parse the HTML documents to extract the content. 

Tokenization: Once we have the text content, we'll tokenize it into individual words. This involves splitting the text into words while ignoring common short words, HTML tags, and punctuation.

Binary Search Tree (BST) Implementation: We'll implement a binary search tree data structure to store the words from the documents. Each node in the tree will represent a unique word, and the frequency of that word in each document will be stored alongside it.The tree structure is given below. 

Ignoring Common Words: As mentioned, we'll maintain a list of words that should be ignored during the analysis. We'll skip adding these words to the binary search tree.

Calculating Word Frequencies: As we tokenize the documents and add words to the binary search tree, we'll keep track of the frequency of each word in each document.

Searching for Keywords: Finally, given a set of keywords, we'll search through the binary search tree to find documents containing those keywords and return a list of matching documents.
![image](https://github.com/asudesozcu/Mini-Search-Engine/assets/119735252/6f1f9dd9-99a2-4f89-9431-6c4c029d6c48)
