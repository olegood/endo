# Endomondo Historical Data Transformer

## Overview

[Endomondo](https://en.wikipedia.org/wiki/Endomondo) was a social fitness network allowed users to track their fitness
and health statistics with a mobile application and website.

Service stopped on 31 December 2020, giving customers until 15 February 2021
to [download](https://support.endomondo.com/hc/en-us/articles/360016251359-Endomondo-Is-Retired) an archive of their
historic data.

## Application

Here is a simple command-line interface application for extracting/transforming historical data into a structure of your
preference.
It helps in organizing workoutData data (e.g. _name_, _type_, _duration_, _notes_, _pictures_) in manageable units.

## Usage

### Requirements

Being a [Java](https://www.java.com/en/) application it
requires [Java Runtime Environment](https://www.oracle.com/java/technologies/downloads/) installed on your OS.

### Options available

For options available just run:

`
$ java -jar endo.jar -info
`

## Tools

- [Java 17 (_Amazon Corretto_)](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/what-is-corretto-17.html)
- [Apache Maven](https://maven.apache.org/)
- [Apache Commons CLI](https://commons.apache.org/proper/commons-cli/)
- [Apache Velocity](https://velocity.apache.org/)
- [Project Lombok](https://projectlombok.org/)
- [Jolt](https://github.com/bazaarvoice/jolt)
- [Jackson](https://github.com/FasterXML/jackson)

## How to Contribute

If you are interested and want to contribute please drop me an [email](mailto:oleg.anastassov@gmail.com). Any ideas are
welcome.
