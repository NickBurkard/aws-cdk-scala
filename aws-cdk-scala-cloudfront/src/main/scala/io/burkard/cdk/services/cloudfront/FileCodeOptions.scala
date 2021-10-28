package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FileCodeOptions {

  def apply(
    filePath: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.FileCodeOptions =
    (new software.amazon.awscdk.services.cloudfront.FileCodeOptions.Builder)
      .filePath(filePath.orNull)
      .build()
}
