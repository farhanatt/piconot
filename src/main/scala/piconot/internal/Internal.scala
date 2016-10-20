package piconot.internal 


Object Internal extends App {
	def Something(list: List[Int]): List[Int] = {
		 // 0 = Anything
		 // 1 = Open
		 // 2 = Blocked
		 var dirList = [0, 0, 0, 0]
		 if (list.contains("N")) {
		 	dirList[0] = 2
		 }
		 if (list.contains("E")) {
		 	dirList[1] = 2
		 } 
		 if (list.contains("W")) {
		 	dirList[2] = 2
		 }
		 if (list.contains("S")) {
		 	dirList[3] = 2
		 }
    	),
	}
	def Nothing(list: List[Int]): List[Int] = {
		 // 0 = Anything
		 // 1 = Open
		 // 2 = Blocked
		 var dirList = [0, 0, 0, 0]
		 if (list.contains("N")) {
		 	dirList[0] = 1
		 }
		 if (list.contains("E")) {
		 	dirList[1] = 1
		 } 
		 if (list.contains("W")) {
		 	dirList[2] = 1
		 }
		 if (list.contains("S")) {
		 	dirList[3] = 1
		 }
    	),
	}
}
  