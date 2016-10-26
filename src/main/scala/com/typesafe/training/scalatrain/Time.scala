class Time (val hours: Int = 0, val minutes: Int = 0) {
	//TODO verify that hours is within 0 and 23
	//TODO verify that minutes si within 0 and 59
	val asMinutes = (hours * 60) + minutes

	def minus (that: Time) : Int = {
		this.asMinutes - that.asMinutes
	}

	def - (that: Time) : Int = {
		this.asMinutes - that.asMinutes
	}
}