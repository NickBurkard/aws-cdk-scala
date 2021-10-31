package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutputLocationRefProperty {

  def apply(
    destinationRefId: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty.Builder)
      .destinationRefId(destinationRefId.orNull)
      .build()
}
