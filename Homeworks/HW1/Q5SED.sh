
#Write a script to rename all the files present in the current directory to
#corresponding upper case letters. For example a file named ‘cs205.txt’
#should be converted to ‘CS205.TXT’. [Note: Look at the sed command]

for i in *; do

   mv "$i" $(echo "$i" | sed -r -e 's/.*/\U&/' -e 's/\.TXT$/\u.txt/');
done
