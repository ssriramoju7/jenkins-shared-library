def call(a, b){

node{
    
    stage("test") {
        
        def abc = commonUtils.deployApplication()
        println('Sucess')
    }

    stage('test1') {

    	def a = 1
    	def b = 2
    	def abc =commonUtils.testApp(a, b)
    }
}
}