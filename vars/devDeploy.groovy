def call(businessGroupName){

node{
    
    stage("test") {
        
        def abc = commonUtils.deployApplication()
        println('Sucess')
        println("Business Group name is : " + businessGroupName)
    }

    stage('test1') {

    	def a = 1
    	def b = 2
    	def abc =commonUtils.testApp(a, b)
    	println("Business Group name is second time : " + businessGroupName)
    }
}
}