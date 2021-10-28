package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ExecuteFileOptions {

  def apply(
    filePath: Option[String] = None,
    arguments: Option[String] = None
  ): software.amazon.awscdk.services.ec2.ExecuteFileOptions =
    (new software.amazon.awscdk.services.ec2.ExecuteFileOptions.Builder)
      .filePath(filePath.orNull)
      .arguments(arguments.orNull)
      .build()
}
