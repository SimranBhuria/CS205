Homework Questions

Q1 Write a script to concatenate all text files present in the current directory.
The output file should be named as ‘allmixed’.
One possible solution:
find . -name ‘*.txt’ | xargs -I{} cat {} >> allmixed

Q2 Write a script to concatenate last 5 lines of all text files present in the
current directory. The output file should be named as ‘allmixedLast5’.

Q3 Write a script that reads a text file and print the number of unique
words in it. The file name should be supplied to the script using input
redirection operator ‘<’.

Q4 Write a script that calculates the number of lines containing ‘the’ in all
the text files present in the current directory.

Q5 Write a script to rename all the files present in the current directory to
corresponding upper case letters. For example a file named ‘cs205.txt’
should be converted to ‘CS205.TXT’. [Note: Look at the sed command]

Q6 You are given a directory containing different types of files (only files
no directories). These files have an extension in their name. For example,
‘cs205.txt’ is of ‘.txt’ extension. Write a script that creates one
directory for each file. This directory should be of the same name as
of the file but without the extension. After creating this directory the
script should also move (not copy) the file in the corresonding directory.
[Note: Look at the sed and awk commands]
