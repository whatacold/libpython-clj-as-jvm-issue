# libpython-clj-as-jvm-issue

A demo repository to show an issue about returning a list from Python to Clojure.

Steps:
1. Create this repo: `lein new app libpython-clj-as-jvm-issue`
2. Run it: `lein run`, it would show something like below:

   ```
   Feb 18, 2025 9:08:56 PM clojure.tools.logging$eval682$fn__685 invoke
   INFO: Detecting startup info
   Feb 18, 2025 9:08:56 PM clojure.tools.logging$eval682$fn__685 invoke
   INFO: Startup info {:lib-version "3.13", :java-library-path-addendum "/usr/lib", :exec-prefix "/usr", :executable "/usr/bin/python3", :libnames ("python3.13m" "python3.13"), :prefix "/usr", :base-prefix "/usr", :libname "python3.13m", :base-exec-prefix "/usr", :python-home "/usr", :version [3 13 2], :platform "linux"}
   Feb 18, 2025 9:08:56 PM clojure.tools.logging$eval682$fn__685 invoke
   INFO: Prefixing java library path: /usr/lib
   Feb 18, 2025 9:08:56 PM clojure.tools.logging$eval682$fn__685 invoke
   INFO: Loading python library: python3.13
   Feb 18, 2025 9:08:57 PM clojure.tools.logging$eval682$fn__685 invoke
   INFO: Reference thread starting
   Just something interesting from Python: {"java":4,"python":6,"clojure":7}
   Execution error (ClassCastException) at cheshire.generate/generate$fn (generate.clj:135).
   class java.lang.String cannot be cast to class java.util.Map$Entry (java.lang.String and java.util.Map$Entry are in module java.base of loader 'bootstrap')
   
   Full report at:
   /tmp/clojure-15760796521499120122.edn
   ```
