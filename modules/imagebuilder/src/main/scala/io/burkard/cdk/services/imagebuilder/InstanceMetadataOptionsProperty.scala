package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceMetadataOptionsProperty {

  def apply(
    httpTokens: Option[String] = None,
    httpPutResponseHopLimit: Option[Number] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.Builder)
      .httpTokens(httpTokens.orNull)
      .httpPutResponseHopLimit(httpPutResponseHopLimit.orNull)
      .build()
}
