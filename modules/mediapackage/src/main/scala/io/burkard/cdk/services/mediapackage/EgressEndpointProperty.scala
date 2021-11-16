package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EgressEndpointProperty {

  def apply(
    url: String,
    packagingConfigurationId: String
  ): software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty.Builder)
      .url(url)
      .packagingConfigurationId(packagingConfigurationId)
      .build()
}
