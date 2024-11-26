
# To create a repository (on PC)
```bash
# create a new .git file
git init

# upload content
git add README.md
git commit -m "first commit"

# push the repository
git branch -M main
git remote add origin <HTML/SSH-Link>
git push -u origin main
```



# Switch to a Commit Version
```bash
git checkout <commitHashCode>
git checkout <branchName> # Switch back to the branches
```

If changes were made, you will have to reset the commit with:
`git reset --hard <commitHashCode>`



# Create Branch on PC
```bash
git switch <name of the branch to clone>
	# git switch <name of the branch to clone>

git branch <name of the new branch>
	# create a new branch
git branch <name of the new branch> <hash code of the commit>
	# create a new branch till a specific commit

git switch <name of the new branch>

# add new changed if needed
git add .
git commit -m "new branch created"

git push --set-upstream origin <name of the new branch>
```



# Smash Merge
- **Fast-forward merge**: If `main` has no changes since the branch was created, Git may perform a fast-forward merge automatically, where no additional commit is created.
	```bash
	git merge feature-branch  # v1
	git merge --ff-only feature-branch  # forced version
	```

- **Squash merge**: If you want to combine all commits from the branch into a single commit, you can use:
	```bash
	git merge --squash feature-branch
	git commit -m "Merge feature-branch into main"
	```



# Delete Branch (on PC)
```bash
# delete CLOUD branch
git push origin --delete <branch name>

# devete LOCAL branch
git branch -d <branch name>
git branch -D <branch name>
	# if yet not merged
```



# Commit an issue
```bash
If u commit something with “fixes #n” u close automatically an Issue
```



# Recover Code
```bash
# to recover the code of the previous commit use:
git reser <commitId>
git reset 9905bc7 #example
```
