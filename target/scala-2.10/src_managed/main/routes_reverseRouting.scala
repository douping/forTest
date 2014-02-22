// @SOURCE:E:/PD/playtest/forTest/conf/routes
// @HASH:7b219d1a6d517ea4d12dd4c4512abc26c0cf0433
// @DATE:Fri Feb 21 18:40:55 CST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
class ReverseUser {
    

// @LINE:13
def tologin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tologin")
}
                                                

// @LINE:19
def toregister(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "toregister")
}
                                                

// @LINE:15
def loginSuccess(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loginSuccess")
}
                                                

// @LINE:17
def register(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:21
def checkNameisexit(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "checkNameisexit/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                                                

// @LINE:11
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  

// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
package controllers.designer {

// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
class ReverseDesigner {
    

// @LINE:28
def designerview(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "designerview")
}
                                                

// @LINE:24
def designermain(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "designermain")
}
                                                

// @LINE:30
def designerTask(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "designerTask")
}
                                                

// @LINE:26
def designersearch(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "designersearch")
}
                                                
    
}
                          
}
                  

// @LINE:43
// @LINE:41
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:33
package controllers.record {

// @LINE:43
// @LINE:41
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:33
class ReverseRecords {
    

// @LINE:39
def toCreateRecords(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "toCreateRecords")
}
                                                

// @LINE:35
def recordview(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "recordview")
}
                                                

// @LINE:41
def addRecord(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "addRecord")
}
                                                

// @LINE:33
def recordmain(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "recordmain")
}
                                                

// @LINE:43
def selectDesignerRecord(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "selectDesignerRecord")
}
                                                

// @LINE:37
def createrecord(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "createrecord")
}
                                                
    
}
                          
}
                  


// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
class ReverseUser {
    

// @LINE:13
def tologin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.User.tologin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tologin"})
      }
   """
)
                        

// @LINE:19
def toregister : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.User.toregister",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "toregister"})
      }
   """
)
                        

// @LINE:15
def loginSuccess : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.User.loginSuccess",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSuccess"})
      }
   """
)
                        

// @LINE:17
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.User.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:21
def checkNameisexit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.User.checkNameisexit",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkNameisexit/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:11
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.User.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        

// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
package controllers.designer.javascript {

// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
class ReverseDesigner {
    

// @LINE:28
def designerview : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.designer.Designer.designerview",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "designerview"})
      }
   """
)
                        

// @LINE:24
def designermain : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.designer.Designer.designermain",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "designermain"})
      }
   """
)
                        

// @LINE:30
def designerTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.designer.Designer.designerTask",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "designerTask"})
      }
   """
)
                        

// @LINE:26
def designersearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.designer.Designer.designersearch",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "designersearch"})
      }
   """
)
                        
    
}
              
}
        

// @LINE:43
// @LINE:41
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:33
package controllers.record.javascript {

// @LINE:43
// @LINE:41
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:33
class ReverseRecords {
    

// @LINE:39
def toCreateRecords : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.record.Records.toCreateRecords",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "toCreateRecords"})
      }
   """
)
                        

// @LINE:35
def recordview : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.record.Records.recordview",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recordview"})
      }
   """
)
                        

// @LINE:41
def addRecord : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.record.Records.addRecord",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addRecord"})
      }
   """
)
                        

// @LINE:33
def recordmain : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.record.Records.recordmain",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recordmain"})
      }
   """
)
                        

// @LINE:43
def selectDesignerRecord : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.record.Records.selectDesignerRecord",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "selectDesignerRecord"})
      }
   """
)
                        

// @LINE:37
def createrecord : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.record.Records.createrecord",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createrecord"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
class ReverseUser {
    

// @LINE:13
def tologin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.User.tologin(), HandlerDef(this, "controllers.User", "tologin", Seq(), "POST", """""", _prefix + """tologin""")
)
                      

// @LINE:19
def toregister(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.User.toregister(), HandlerDef(this, "controllers.User", "toregister", Seq(), "GET", """""", _prefix + """toregister""")
)
                      

// @LINE:15
def loginSuccess(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.User.loginSuccess(), HandlerDef(this, "controllers.User", "loginSuccess", Seq(), "GET", """""", _prefix + """loginSuccess""")
)
                      

// @LINE:17
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.User.register(), HandlerDef(this, "controllers.User", "register", Seq(), "GET", """""", _prefix + """register""")
)
                      

// @LINE:21
def checkNameisexit(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.User.checkNameisexit(name), HandlerDef(this, "controllers.User", "checkNameisexit", Seq(classOf[String]), "GET", """""", _prefix + """checkNameisexit/$name<[^/]+>""")
)
                      

// @LINE:11
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.User.login(), HandlerDef(this, "controllers.User", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        

// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
package controllers.designer.ref {


// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
class ReverseDesigner {
    

// @LINE:28
def designerview(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.designer.Designer.designerview(), HandlerDef(this, "controllers.designer.Designer", "designerview", Seq(), "GET", """""", _prefix + """designerview""")
)
                      

// @LINE:24
def designermain(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.designer.Designer.designermain(), HandlerDef(this, "controllers.designer.Designer", "designermain", Seq(), "GET", """""", _prefix + """designermain""")
)
                      

// @LINE:30
def designerTask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.designer.Designer.designerTask(), HandlerDef(this, "controllers.designer.Designer", "designerTask", Seq(), "GET", """""", _prefix + """designerTask""")
)
                      

// @LINE:26
def designersearch(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.designer.Designer.designersearch(), HandlerDef(this, "controllers.designer.Designer", "designersearch", Seq(), "GET", """""", _prefix + """designersearch""")
)
                      
    
}
                          
}
        

// @LINE:43
// @LINE:41
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:33
package controllers.record.ref {


// @LINE:43
// @LINE:41
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:33
class ReverseRecords {
    

// @LINE:39
def toCreateRecords(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.record.Records.toCreateRecords(), HandlerDef(this, "controllers.record.Records", "toCreateRecords", Seq(), "POST", """""", _prefix + """toCreateRecords""")
)
                      

// @LINE:35
def recordview(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.record.Records.recordview(), HandlerDef(this, "controllers.record.Records", "recordview", Seq(), "GET", """""", _prefix + """recordview""")
)
                      

// @LINE:41
def addRecord(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.record.Records.addRecord(), HandlerDef(this, "controllers.record.Records", "addRecord", Seq(), "GET", """""", _prefix + """addRecord""")
)
                      

// @LINE:33
def recordmain(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.record.Records.recordmain(), HandlerDef(this, "controllers.record.Records", "recordmain", Seq(), "GET", """record managment""", _prefix + """recordmain""")
)
                      

// @LINE:43
def selectDesignerRecord(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.record.Records.selectDesignerRecord(), HandlerDef(this, "controllers.record.Records", "selectDesignerRecord", Seq(), "GET", """""", _prefix + """selectDesignerRecord""")
)
                      

// @LINE:37
def createrecord(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.record.Records.createrecord(), HandlerDef(this, "controllers.record.Records", "createrecord", Seq(), "GET", """""", _prefix + """createrecord""")
)
                      
    
}
                          
}
        
    