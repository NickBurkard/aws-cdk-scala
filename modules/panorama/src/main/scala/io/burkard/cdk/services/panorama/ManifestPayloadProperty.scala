package io.burkard.cdk.services.panorama

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ManifestPayloadProperty {

  def apply(
    payloadData: Option[String] = None
  ): software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty =
    (new software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty.Builder)
      .payloadData(payloadData.orNull)
      .build()
}
