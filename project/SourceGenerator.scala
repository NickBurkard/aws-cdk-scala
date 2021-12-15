import sbt.{File, IO}

// Code generator via some source.
trait SourceGenerator[A] {
  def baseFile(root: File, source: A): File

  def content(source: A): String

  // Creates & writes content to a file.
  final def writeFile(root: File, source: A): File = {
    val file = baseFile(root, source)
    IO.write(file, content(source))
    file
  }
}

object SourceGenerator {
  def apply[A: SourceGenerator]: SourceGenerator[A] = implicitly[SourceGenerator[A]]
}
