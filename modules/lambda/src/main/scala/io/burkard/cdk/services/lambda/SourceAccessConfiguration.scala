package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceAccessConfiguration {

  def apply(
    uri: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.lambda.SourceAccessConfigurationType] = None
  ): software.amazon.awscdk.services.lambda.SourceAccessConfiguration =
    (new software.amazon.awscdk.services.lambda.SourceAccessConfiguration.Builder)
      .uri(uri.orNull)
      .`type`(`type`.orNull)
      .build()
}
