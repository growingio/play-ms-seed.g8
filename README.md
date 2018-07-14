# play-ms-seed.g8

Giter8 template for generating a Play project seed in Scala.  

This project is intended for people who know how to use Play and want to get started right away.

You should only need to clone this project if you are modifying the giter8 template.  For information on giter8 templates, please see http://www.foundweekends.org/giter8/

## Running

创建项目:

```
sbt new growingio/play-ms-seed.g8
```

## Scaffolding 

输入 `g8Scaffold init` 来初始化子项目:

```
cd play-ms-seed
sbt "g8Scaffold init"
```

## Running locally

If you are testing this giter8 template locally, you should [install g8](http://www.foundweekends.org/giter8/setup.html) and then run the [local test](http://www.foundweekends.org/giter8/testing.html) feature:

```
g8 file://play-ms-seed.g8/ --name=growing-test --force
```

Will create an example template called `growing-test`, for example.