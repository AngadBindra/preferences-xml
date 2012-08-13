
Preferences - XML
=================

An implementation of the Java Preferences API (java.util.prefs) to store
preferences in an XML file, in a subdirectory of a Java program's working
directory.  Written because of my frustration that the Windows implementation of
the Java Preferences API that comes with the JRE uses the registry.


Requirements
------------

 - Java 6
 - JAXB 2.2 (2.2.6 and its dependencies included)
 - [JAXB2 Basics XJC Ant task](http://confluence.highsource.org/display/J2B/JAXB2+Basics+XJC+Ant+Task) (for generating the class files from the XML schema, 0.6.3 included)
 - [XmlElementWrapper](http://www.conspicio.dk/blog/bjarne/jaxb-xmlelementwrapper-plugin) (for generating the class files from the XML schema, included and recompiled for JAXB 2.2)


Installation
------------

### Standalone distribution
Download a copy of of the pre-compiled JAR from [the Downloads section](preferences-xml/downloads)
or build the project from the source code here on GitHub.

### For Maven and Maven-compatible dependency managers
Add a dependency to your project with the following co-ordinates:

 - GroupId: `nz.net.ultraq.preferences`
 - ArtifactId: `preferences-xml`
 - Version: `1.2.1`


Usage
-----

Once the JAR is in your project classpath it should be picked-up and used by
Java when you access the Java Preferences API.  Preferences will be written to
files inside a `.preferences` sub-directory of your project: 1 for the system
preferences, and 1 for every user account that uses the program.
