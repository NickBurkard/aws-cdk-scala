package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LocationConfig {

  def apply(
    uri: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig =
    (new software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig.Builder)
      .uri(uri.orNull)
      .build()
}
