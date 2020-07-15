def call(){

node{
    
    stage("dev") {
        
        def abc = commonUtils.deployApplication()
        println('Sucess')
        println("Business Group name is :${params.businessGroupName}")
        println("Test")
        println(businessGroupName)
    }

    stage('test1') {

    	def a = 1
    	def b = 2
    	def abc =commonUtils.testApp(a, b)
    	println("Business Group name is second time: ${params.businessGroupName}")
    }
}
}
