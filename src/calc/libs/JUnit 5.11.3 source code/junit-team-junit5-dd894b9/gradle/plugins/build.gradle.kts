plugins {
	kotlin("jvm") version "1.8.10"
	id("application")
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(kotlin("stdlib"))
	testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

application {
	mainClass.set("CalculatorTest") // שנה בהתאם למחלקת ה-Main שלך
}
