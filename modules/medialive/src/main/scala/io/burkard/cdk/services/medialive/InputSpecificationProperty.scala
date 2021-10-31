package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputSpecificationProperty {

  def apply(
    resolution: Option[String] = None,
    codec: Option[String] = None,
    maximumBitrate: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty.Builder)
      .resolution(resolution.orNull)
      .codec(codec.orNull)
      .maximumBitrate(maximumBitrate.orNull)
      .build()
}
