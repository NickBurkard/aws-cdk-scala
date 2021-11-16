package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExecuteFileOptions {

  def apply(
    filePath: String,
    arguments: Option[String] = None
  ): software.amazon.awscdk.services.ec2.ExecuteFileOptions =
    (new software.amazon.awscdk.services.ec2.ExecuteFileOptions.Builder)
      .filePath(filePath)
      .arguments(arguments.orNull)
      .build()
}
