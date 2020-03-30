# Elevens

## Getting started

Fork and clone the [Elevens repo](http://github.com/mvhs-apcs/Elevens).

Within the new folder, first setup the `upstream` repo so you can get new activity branches:
```
$ git remote add upstream https://github.com/mvhs-apcs/Elevens.git
```

Then create a branch that tracks with the original repo's activity 1 branch:
```
$ git fetch upstream a1
$ git checkout -b a1 upstream/a1
```

This should give you all of the code necessary for activity 1.

Read the instructions in `Elevens Lab Student Guide.pdf`.

`answers.md` has been provided for you to write the answers to any questions asked in the Student Guide.

Make commits to this branch as you complete the steps outlined in the activity.

## Submitting

Commit all local changes, then (replace # with the current activity number):
```
$ git push origin a#
```

## Switching to the next activity

Change the # to the number of the activity you want to grab.

```
$ git fetch upstream a#
$ git checkout -b a# upstream/a#
```
