package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApiDefinitionConfig {

  def apply(
    s3Location: Option[software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location] = None,
    inlineDefinition: Option[AnyRef] = None
  ): software.amazon.awscdk.services.apigateway.ApiDefinitionConfig =
    (new software.amazon.awscdk.services.apigateway.ApiDefinitionConfig.Builder)
      .s3Location(s3Location.orNull)
      .inlineDefinition(inlineDefinition.orNull)
      .build()
}
