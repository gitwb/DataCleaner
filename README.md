# DataCleaner

[![Build Status: Linux](https://travis-ci.org/datacleaner/DataCleaner.svg?branch=master)](https://travis-ci.org/datacleaner/DataCleaner) [![Gitter chat](https://badges.gitter.im/datacleaner/community.png)](https://gitter.im/datacleaner/community)

<div>
<img src="https://datacleaner.github.io/assets/dc-logo-100.png" alt="DataCleaner logo" />
</div>

The premier Open Source Data Quality solution.

DataCleaner is a Data Quality toolkit that allows you to profile, correct and enrich your data. People use it for ad-hoc analysis, recurring cleansing as well as a swiss-army knife in matching and Master Data Management solutions.

## Where to go for end-user information?

Please visit the DataCleaner community website https://datacleaner.github.io for downloads, news, documentation etc.

Visit our Gitter chat channel https://gitter.im/datacleaner/community for asking questions or discussions.

GitHub markdown pages and issues are used for developers and technical aspects only.

## Module structure

The main application modules are:

* api - The public API of DataCleaner. Mostly interfaces and annotations that you should use to build your own extensions.
* resources - Static resources in DataCleaner
* oss-branding - Icons and colors
* testware - Useful classes for unit testing of DataCleaner and extension code.
* engine
  * core - The core engine piece which allows execution of jobs and components as per the API.
  * xml-config - Contains utilities for reading and writing job files and configuration files of DataCleaner.
  * env - Different/alternative environments that DataCleaner can run in, for instance Apache Spark or webapp-cluster
* components
  * ... - many sub modules containing built-in as well as additional components/extensions to use with DataCleaner.
  * standard-components - a container-project that dependends on all components that are normally bundled in DataCleaner community edition.
* desktop
  * api - The public API for the DataCleaner desktop application.
  * ui - The Swing-based user interface for desktop users
* monitor
  * api - the API classes and interfaces of DataCleaner monitor

## Code style and formatting

In the root of the project you can find 'Formatter-[IDE].xml' files which enable you to import the code formatting rules of the project into your IDE.

## Continuous Integration

There's a public build of DataCleaner that can be found on Travis CI:

https://travis-ci.org/datacleaner/DataCleaner

## License

Licensed under the Lesser General Public License, see http://www.gnu.org/licenses/lgpl.txt
