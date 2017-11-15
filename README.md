ODict Java API
==============

Hi there! This library provides a native Java implementation of an [ODict](https://github.com/odict) reader, 
capable of reading files produced by the Open Dictionary Project [compiler](https://github.com/odict/odict).
 
Using the API
-------------
The API is fairly straightforward, though may change significantly in the future. Basically, there's only one command 
you really gotta worry about:

```java
import org.odict.java.ODReader;

ODictionary dict = ODReader.read("path/to/odict/file");
```

Just pass in the compiled .odict file location as a parameter and BAM! You get back an `ODictionary` object, with which 
you can do nifty stuff like this:

```java
// Look up an entry in the dictionary and return it as JSON
String entry = dict.getEntryAsJSON("some entry");

// Check if the dictionary contains an entry
boolean hasEntry = dict.hasEntry("some entry");

// Check the ODict version that produced the file
short version = dict.getVersion();
```

Setting It Up Locally
---------------------
After cloning the repo, make sure you have `flatc` installed and run:

```bash
$ ./init schema
```

Also make sure you have a recent version of Java (8+ preferably). Everything else should run just peachy. It helps if 
you're on a UNIX system, though.