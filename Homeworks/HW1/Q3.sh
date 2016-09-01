#Write a script that reads a text file and print the number of unique
#words in it. 
read -p "Enter file name: " filename
echo "The Unique words in all the files in the current directory are listed below:"
printf "\n"
cat $filename | tr " " "\n" | sort | uniq -i 
