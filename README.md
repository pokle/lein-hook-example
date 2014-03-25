lein-hook-example
=================

An example showing you how to write a leiningen hook in a project that hooks into a plugin

Structure
---------

- a-plugin: A little sample plugin that does some work in leiningen.a-plugin/dist
- a-project: A little project with a hook that overrides leiningen.a-plugin/dist

First install the plugin (or include it in a-project/.lein-classpath)

  $ cd a-plugin
  $ lein install
  $ cd -
  
Next invoke the plugin, showing that the hook works:

  $ cd a-project
  $ lein a-plugin
  Just before dist
  Created ...
  Created ...
  Just after dist

  
