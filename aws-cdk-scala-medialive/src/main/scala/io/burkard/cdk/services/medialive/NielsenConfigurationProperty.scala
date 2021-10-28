package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NielsenConfigurationProperty {

  def apply(
    nielsenPcmToId3Tagging: Option[String] = None,
    distributorId: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty.Builder)
      .nielsenPcmToId3Tagging(nielsenPcmToId3Tagging.orNull)
      .distributorId(distributorId.orNull)
      .build()
}
