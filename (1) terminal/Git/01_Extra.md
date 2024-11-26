
[Youtube Video](https://youtu.be/e2IbNHi4uCI)
[Directory](C:\Program Files\Git\mingw64\share\doc\git-doc)


# Branch
```bash
# check
git status # check current branch
git branch # print all branches available
git branch -a # check branches list

# change branch
git switch <nameExistingBranch>
	# switching branches [NEW version]
git checkout <nameExistingBranch>
	# switching branches [OLD version]

# rename
git branch -m <newName> # rename CURRENT branch
git branch -m <existingBranch> <newName> # rename SELECTED branch



#examples
git branch <name_of_a_new_branch>
git checkout iss53

# shorter version
git checkout -b <nameBranch_added> --track prof/master


# Merge Brench
git remote add <nameBranch_added> <destinationHTML/SSH>
git fetch <nameBranch_added>
git merge <nameBranch_added>/<nameBranch_main>
```

```bash
# ADD
git add .       # . you will add all the content
git add .txt    # *.txt to add all the txt files

git restore --staged <file> # reverse add

# COMMIT
git commit --help 
git commit -m “myCommit” # “-m” add comment
git commit # with the default file editor

# PUSH
git push -u origin master/main 
```



# Configuring Remotes: `origin`
```bash
git remote -v
	# You can view the URL for `origin` with

git remote set-url origin <new-url>
	# To change the URL of `origin`, use
```

