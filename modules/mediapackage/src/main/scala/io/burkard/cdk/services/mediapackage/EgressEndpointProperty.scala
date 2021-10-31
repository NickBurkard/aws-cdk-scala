package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EgressEndpointProperty {

  def apply(
    url: Option[String] = None,
    packagingConfigurationId: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty.Builder)
      .url(url.orNull)
      .packagingConfigurationId(packagingConfigurationId.orNull)
      .build()
}
