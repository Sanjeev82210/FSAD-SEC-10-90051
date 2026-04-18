# Exercise 02 – Branching, Pull, and Merge Workflow

## Objective
To understand Git branching, merging, and resolving merge conflicts using Git and GitHub.

## Steps Performed

### 1. Repository Cloning
- Cloned an existing GitHub repository to the local machine using:
  git clone <repository-url>

### 2. Feature Branch Creation
- Created a new branch named `feature-update`
- Switched to the branch and made changes to README file

### 3. Commit in Feature Branch
- Added changes and committed them:
  git add .
  git commit -m "Updated README in feature branch"

### 4. Conflicting Change in Main Branch
- Switched to `main` branch
- Made a conflicting change to the same README file
- Committed the change

### 5. Merge and Conflict Resolution
- Merged feature branch into main:
  git merge feature-update
- Encountered merge conflict
- Resolved conflict manually in README file

### 6. Final Commit and Push
- Added resolved file and committed:
  git add README.md
  git commit -m "Resolved merge conflict between main and feature branch"
- Pushed final merged code to GitHub:
  git push

## Result
Successfully created branches, handled merge conflicts, and pushed the resolved version to GitHub.
