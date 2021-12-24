import sbt.{File, IO}

final case class CdkFile(file: File, content: String) {
  lazy val path: String = file.getPath

  def write(): File = {
    IO.write(file, content)
    file
  }
}
