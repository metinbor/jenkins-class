// // properties(
// // 	[parameters(
// // 		[choice(choices: 
// // 			[
// //                 'dev', 
// //                 'qa', 
// //                 'stage', 
// //                 'prod'
// //             ], 
// // 		description: 'Which Environment should we deploy?', 
// // 		name: 'ENVIRONMENT')])]
// // )
node {
	stage("Stage1"){
		git "https://github.com/farrukh90/infrastructure.git"
}
	stage("Stage2"){
        ws("infrastructure/vpc/"){
            // sh "terraform plan"
            echo "ehll"
        }
		
}
	stage("Stage3"){
		echo "hello"
}
	stage("Stage4"){
		echo "hello"
}
	stage("Stage5"){
		echo "hello"
	}
}
