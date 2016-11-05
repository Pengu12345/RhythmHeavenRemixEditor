package chrislo27.rhre.registry

data class Pattern(val id: String, val name: String, val isStretchable: Boolean = false, val cues: List<PatternCue>) {

	data class PatternCue(val id: String, val beat: Float, val duration: Float, val semitone: Int) {

	}

}