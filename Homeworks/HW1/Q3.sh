#Write a script that reads a text file and print the number of unique
#words in it. 
read -p "Enter file name: " filename
echo "The number of unique words in the file $filename is :"
printf "\n"
cat $filename | tr " " "\n" | sort -u -f | wc -l