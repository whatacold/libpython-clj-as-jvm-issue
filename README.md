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

   And here is `/tmp/clojure-15760796521499120122.edn`:

   ```
   {:clojure.main/message
    "Execution error (ClassCastException) at cheshire.generate/generate$fn (generate.clj:135).\nclass java.lang.String cannot be cast to class java.util.Map$Entry (java.lang.String and java.util.Map$Entry are in module java.base of loader 'bootstrap')\n",
    :clojure.main/triage
    {:clojure.error/class java.lang.ClassCastException,
     :clojure.error/line 135,
     :clojure.error/cause
     "class java.lang.String cannot be cast to class java.util.Map$Entry (java.lang.String and java.util.Map$Entry are in module java.base of loader 'bootstrap')",
     :clojure.error/symbol cheshire.generate/generate$fn,
     :clojure.error/source "generate.clj",
     :clojure.error/phase :execution},
    :clojure.main/trace
    {:via
     [{:type clojure.lang.Compiler$CompilerException,
       :message
       "Syntax error macroexpanding at (/tmp/form-init18403622086010538165.clj:1:74).",
       :data
       {:clojure.error/phase :execution,
        :clojure.error/line 1,
        :clojure.error/column 74,
        :clojure.error/source "/tmp/form-init18403622086010538165.clj"},
       :at [clojure.lang.Compiler load "Compiler.java" 7665]}
      {:type java.lang.ClassCastException,
       :message
       "class java.lang.String cannot be cast to class java.util.Map$Entry (java.lang.String and java.util.Map$Entry are in module java.base of loader 'bootstrap')",
       :at [clojure.core$key invokeStatic "core.clj" 1582]}],
     :trace
     [[clojure.core$key invokeStatic "core.clj" 1582]
      [clojure.core$key invoke "core.clj" 1582]
      [cheshire.generate$generate$fn__12472 invoke "generate.clj" 135]
   {:clojure.main/message
    "Execution error (ClassCastException) at cheshire.generate/generate$fn (generate.clj:135).\nclass java.lang.String cannot be cast to class java.u
   til.Map$Entry (java.lang.String and java.util.Map$Entry are in module java.base of loader 'bootstrap')\n",
    :clojure.main/triage
    {:clojure.error/class java.lang.ClassCastException,
     :clojure.error/line 135,
     :clojure.error/cause
     "class java.lang.String cannot be cast to class java.util.Map$Entry (java.lang.String and java.util.Map$Entry are in module java.base of loader 
   'bootstrap')",
     :clojure.error/symbol cheshire.generate/generate$fn,
     :clojure.error/source "generate.clj",
     :clojure.error/phase :execution},
    :clojure.main/trace
    {:via
     [{:type clojure.lang.Compiler$CompilerException,
       :message
       "Syntax error macroexpanding at (/tmp/form-init18403622086010538165.clj:1:74).",
       :data
       {:clojure.error/phase :execution,
        :clojure.error/line 1,
        :clojure.error/column 74,
        :clojure.error/source "/tmp/form-init18403622086010538165.clj"},
       :at [clojure.lang.Compiler load "Compiler.java" 7665]}
      {:type java.lang.ClassCastException,
       :message
       "class java.lang.String cannot be cast to class java.util.Map$Entry (java.lang.String and java.util.Map$Entry are in module java.base of loade
   r 'bootstrap')",
       :at [clojure.core$key invokeStatic "core.clj" 1582]}],
     :trace
     [[clojure.core$key invokeStatic "core.clj" 1582]
      [clojure.core$key invoke "core.clj" 1582]
      [cheshire.generate$generate$fn__12472 invoke "generate.clj" 135]
      [tech.v3.datatype.Buffer reduce "Buffer.java" 172]
      [clojure.core$reduce invokeStatic "core.clj" 6885]
      [clojure.core$reduce invoke "core.clj" 6868]
      [cheshire.generate$generate invokeStatic "generate.clj" 135]
      [cheshire.generate$generate invoke "generate.clj" 119]
      [cheshire.core$generate_string invokeStatic "core.clj" 74]
      [cheshire.core$generate_string invoke "core.clj" 49]
      [cheshire.core$generate_string invokeStatic "core.clj" 55]
      [cheshire.core$generate_string invoke "core.clj" 49]
      [libpython_clj_as_jvm_issue.core$_main invokeStatic "core.clj" 16]
      [libpython_clj_as_jvm_issue.core$_main doInvoke "core.clj" 6]
      [clojure.lang.RestFn invoke "RestFn.java" 397]
      [clojure.lang.Var invoke "Var.java" 380]
      [user$eval140 invokeStatic "form-init18403622086010538165.clj" 1]
      [user$eval140 invoke "form-init18403622086010538165.clj" 1]
      [clojure.lang.Compiler eval "Compiler.java" 7194]
      [clojure.lang.Compiler eval "Compiler.java" 7184]
      [clojure.lang.Compiler load "Compiler.java" 7653]
      [clojure.lang.Compiler loadFile "Compiler.java" 7591]
      [clojure.main$load_script invokeStatic "main.clj" 475]
      [clojure.main$init_opt invokeStatic "main.clj" 477]
      [clojure.main$init_opt invoke "main.clj" 477]
      [clojure.main$initialize invokeStatic "main.clj" 508]
      [clojure.main$null_opt invokeStatic "main.clj" 542]
      [clojure.main$null_opt invoke "main.clj" 539]
      [clojure.main$main invokeStatic "main.clj" 664]
      [clojure.main$main doInvoke "main.clj" 616]
      [clojure.lang.RestFn applyTo "RestFn.java" 137]
      [clojure.lang.Var applyTo "Var.java" 705]
      [clojure.main main "main.java" 40]],
     :cause
     "class java.lang.String cannot be cast to class java.util.Map$Entry (java.lang.String and java.util.Map$Entry are in module java.base of loader 'bootstrap')",
     :phase :execution}}
   ```

   And file `/tmp/form-init18403622086010538165.clj` doesn't exist.
