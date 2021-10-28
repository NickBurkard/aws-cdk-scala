package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
