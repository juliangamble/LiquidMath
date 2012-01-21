(defproject LiquidMath "1.1.0-SNAPSHOT"
  :description "LiquidMath 3D Graphing library in Clojure"

  :dependencies [
                 [org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]
                 
                 [penumbra "0.6.0-SNAPSHOT"]]
  :native-dependencies [[penumbra/lwjgl "2.4.2"]]
  :dev-dependencies [[native-deps "1.0.4"]
                 
                 
                 ]
 	:source-path "src"
	:main main
)
