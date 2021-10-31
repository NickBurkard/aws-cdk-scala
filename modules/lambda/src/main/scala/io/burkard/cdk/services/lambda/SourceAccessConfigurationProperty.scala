package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceAccessConfigurationProperty {

  def apply(
    uri: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty =
    (new software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty.Builder)
      .uri(uri.orNull)
      .`type`(`type`.orNull)
      .build()
}
