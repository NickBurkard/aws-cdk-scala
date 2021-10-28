package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OutputLocationRefProperty {

  def apply(
    destinationRefId: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty.Builder)
      .destinationRefId(destinationRefId.orNull)
      .build()
}
