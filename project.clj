(defproject LiquidMath "1.1.0-SNAPSHOT"
  :description "LiquidMath 3D Graphing library in Clojure"

  :dependencies [
                 [org.clojure/clojure "1.1.0"]
                 ;[org.clojure/clojure-contrib "1.1.0"]
                 [jsr-231/jogl "1.1.1a"]
                 [gluegen/gluegen-rt "1.0b06"]]

                                  ;[org.eclipse.swt.wpf.win32/x86 "3.3.0-v3346"]

                 ;[penumbra "0.6.0-SNAPSHOT"]]
  :native-dependencies [;[penumbra/lwjgl "2.4.2"]]
                  [jsr-231/jogl-natives-windows-amd64 "1.1.1a"]
                  [jsr-231/jogl-natives-windows-i586 "1.1.1a"]
                  [jsr-231/jogl-natives-linux-amd64 "1.1.1a"]
                  [jsr-231/jogl-natives-linux-i586 "1.1.1a"]
                  [jsr-231/jogl-natives-macosx-universal "1.1.1a"]]
                  
                 ;[gluegen/gluegen-rt-natives-windows-i586 "1.0b06"]]

  :dev-dependencies [[native-deps "1.0.4"]]
  :repositories {"local" ~(str (.toURI (java.io.File. "maven_repository")))}
 	:source-path "src"
	:main main
	;:manifest {"Trusted-Library" "true"}
)
