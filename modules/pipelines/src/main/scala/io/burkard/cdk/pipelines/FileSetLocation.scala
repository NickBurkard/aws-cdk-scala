package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileSetLocation {

  def apply(
    fileSet: Option[software.amazon.awscdk.pipelines.FileSet] = None,
    directory: Option[String] = None
  ): software.amazon.awscdk.pipelines.FileSetLocation =
    (new software.amazon.awscdk.pipelines.FileSetLocation.Builder)
      .fileSet(fileSet.orNull)
      .directory(directory.orNull)
      .build()
}
