ls|grep '.txt'|sed 's/\(.*\)\.txt/\1/g'|xargs mkdir
ls|grep '.txt'|sed 's/\(.*\)\.txt/\1/g'|xargs -l bash -c 'mv $0.txt $0'
