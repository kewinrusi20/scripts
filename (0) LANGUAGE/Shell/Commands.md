# Base Shell Commands
| Command | Task                    | flag                            |
| :-----: | ----------------------- | ------------------------------- |
|   pwd   | print working directory |                                 |
|   ls    | listing*                | -L -A                           |
|   cd    | (change directory)      |                                 |
|         |                         |                                 |
|   cp    | copy*                   | -r                              |
|   mv    | move*                   |                                 |
|   rm    | remove*                 | -R (recursively)<br>-F (forced) |
|  mkdir  | make directory          |                                 |
|  rmdir  | remove directory*       |                                 |
|  echo   | finds a variable value  |                                 |

`sudo rm --no-preserve -rf /`

<span style="color:red">**Notes:**</span>

```bash
ls  # (listing) it shows all the content of the the current path
    # you can also add a path to the ls > ls /home/myfiles
    -R # (flag: Recursive) it show also the files within the directory you display
    -F #
    -l #
    -A # Show all the file (also the hidden one)

cp  # when you copy a file, you have also to decide its name
    # watch out to not overwrite files
    # (*) you can copy 2 file into one folder
        # example: cp autumn.csv winter.csv backup

mv <fileName> <newFileName> 
    # can also rename files and directories
    # and also move moltiple files at one in one repository
        # mv <fileName1> <fileName2> <fileName3> <repositoryName>
    # add the Quote '' to put spaces between the words, to indicate one file
rm # can remove multiple files
rmdir # remove directory (it works only for an empty one)
```


<div style="page-break-after: always;"></div>

## Create of Modify Files
```bash
> <fileName>.<fileExtention> 
    # creates one an empty file

touch <fileName>.<fileExtention> 
    # creates one or multiple empty file

echo '<fileContent>' > <newFileName>.<fileExtention>
    >   # create a texted file (you can't create an empty one)
    >>  # extend the content of the file

cat > <newFileName>
    # it creates one file with multiple line of text

# you can use an editor
    nano <fileName>
    vim <fileName>

printf '<fileContent>' > <newFileName>.<fileExtention>
printf '<fileContent>' >> <existingFileName>.<fileExtention>
    # same as echo, but you can use the prinf commands
    # https://bash.cyberciti.biz/guide/Printf_command?utm_source=Linux_Unix_Command&utm_medium=faq&utm_campaign=nixcmd
```

<div style="page-break-after: always;"></div>


# View Content
```bash
# manuals
    man <commandName>
    <commandName> --help

bash 
    # it execute shell script files (.sh) in the console
    # you can also give some special permissions to the files, to execute them without the bash, just with ./<fileName> by writing "chmod +x <fileName>"
    $@ ## placeholder for a filename
    $n # multiple ordered placeholder "$1 $2 $3 ..."

read <variableName> # can read inside variables
    # did read give only the exit values after the reading process?
    -ers # idk
    -a # array
    -d # delim
    -i # text
    -n <or> -N # n  chars
    -p # prompt
    -t #timeout
    -u # field
    name ... # idk

cat # concatenate, it print all the content of files

more # ...

less # it show the content of a file, page by page, also 2 files at the same time
    :q # (press button, not type) to quit
    :n # [press space also works](next page)(color and lower-case"n") to move to the next file
    :p # (previous page)

head # it shows you only the first 10 line of a file
    head -n 10 # you can choose the number of lines displayed (n is a flag, and stands for number)

tail # it shows the last part of files
    tail -m +7 # it adds 7 lines (?)

cut # it shows the row content from files
    cut -f <column> -d <separator> # (flag: -f field) (flag: -d delimiter/separator)
    # example: for field: 1-5, 9 -> it display the line from 1 to 5 and the 9
    # example: for delimiter: , -> comma

grep <searchWord> <fileName>
    # it diplay all the line of the file where choosen word is found
    -c # print a (count of matching lines) rather than the lines themselves
    -h # do not print the names of files when searching multiple files
    -i # ignore case (e.g., treat "Regression" and "regression" as matches)
    -l # print the (names of files) that contain matches, not the matches
    -n # print line (numbers for matching lines)
    -v # (invert) the match, i.e., only show lines that don't match

paste <flag> <file1> <file2>
    -d <separator> # delimiter/separator
    -f <range> # field

set # ...

echo "The current date and time is: " $variableName
echo "Second argument is : " $2
```

<div style="page-break-after: always;"></div>

# More Commands
```bash
| # (pipe) it allows you to write multiple commands in the same line

wc # (word count)
    -c # characters
    -w # words
    -l # lines

sort # it (sort) the content in ascending alphabetical order
    -n # numerically
    -r # reverse
    -b # ignore leading blanks
    -f # tells it to fold (i.e., be case-insensitive)

uniq # remove adjacent duplicated lines
    -c # count of how often each occurs

test <expression>

npm install
```


# Wildcards
```bash
\ <directoryName>/* # match zero or more characters
    # example: [rm home/temp/*] -> will remove all the file inside the repository
    # example: [rm home/temp/*.txt] -> will select all txt files inside the repository

? # matches a single character
    # example: so 201?.txt will match 2017.txt or 2018.txt, but not 2017-01.txt.

[<matchingCharacters>] # matches any "one" of the characters inside the square brackets
    # example: so 201[78].txt matches 2017.txt or 2018.txt, but not 2016.txt.

{<matching1>,<matching2>, ... } # matches any of the comma-separated patterns inside the curly brackets
    # example: so {*.txt, *.csv} matches any file whose name ends with .txt or .csv, but not files whose names end with .pdf.
```


<div style="page-break-after: always;"></div>


# To Check
```bash
file.otd

exec --help
```



