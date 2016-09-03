#You are given a directory containing different types of files (only files
#no directories). These files have an extension in their name. For example,
#‘cs205.txt’ is of ‘.txt’ extension. Write a script that creates one
#directory for each file. This directory should be of the same name as
#of the file but without the extension. After creating this directory the
#script should also move (not copy) the file in the corresonding directory.


ls | while read fname ; do mkdir ${fname%%.*}; mv $fname ${fname%%.*}; done