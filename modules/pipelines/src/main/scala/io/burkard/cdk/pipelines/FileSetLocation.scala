package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileSetLocation {

  def apply(
    fileSet: software.amazon.awscdk.pipelines.FileSet,
    directory: String
  ): software.amazon.awscdk.pipelines.FileSetLocation =
    (new software.amazon.awscdk.pipelines.FileSetLocation.Builder)
      .fileSet(fileSet)
      .directory(directory)
      .build()
}
