(defproject grafterdatacube "0.1.0-SNAPSHOT"
  :description "Grafter Data Cube experiments"
  :url "http://mikeleganaaranguren.com"
  :license {:name "GNU General Public License, version 2"
            :url "https://www.gnu.org/licenses/old-licenses/gpl-2.0.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [grafter "0.7.2"]
                 [grafter/vocabularies "0.1.5"]
                 [org.slf4j/slf4j-jdk14 "1.7.5"]]

  :repl-options {:init-ns grafterdatacube.core }

  :jvm-opts ^:replace ["-server"
                       ;;"-XX:+AggressiveOpts"
                       ;;"-XX:+UseFastAccessorMethods"
                       ;;"-XX:+UseCompressedOops"
                       ;;"-Xmx4g"
                       ]

  :plugins [[lein-grafter "0.7.0"]]
  :min-lein-version "2.5.1"

  )

