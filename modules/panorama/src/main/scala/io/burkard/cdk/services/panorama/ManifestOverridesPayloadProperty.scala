package io.burkard.cdk.services.panorama

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ManifestOverridesPayloadProperty {

  def apply(
    payloadData: Option[String] = None
  ): software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty =
    (new software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty.Builder)
      .payloadData(payloadData.orNull)
      .build()
}
