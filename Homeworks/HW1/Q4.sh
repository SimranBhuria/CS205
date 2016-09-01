#Write a script that calculates the number of lines containing ‘the’ in all
#the text files present in the current directory

echo "The number of occurences of 'the'in all the files in the current directory is:"
printf "\n"
grep -i -o "the" *.txt| wc -l