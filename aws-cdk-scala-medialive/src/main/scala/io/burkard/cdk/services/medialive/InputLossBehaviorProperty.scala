package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputLossBehaviorProperty {

  def apply(
    inputLossImageSlate: Option[software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty] = None,
    inputLossImageType: Option[String] = None,
    repeatFrameMsec: Option[Number] = None,
    blackFrameMsec: Option[Number] = None,
    inputLossImageColor: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty.Builder)
      .inputLossImageSlate(inputLossImageSlate.orNull)
      .inputLossImageType(inputLossImageType.orNull)
      .repeatFrameMsec(repeatFrameMsec.orNull)
      .blackFrameMsec(blackFrameMsec.orNull)
      .inputLossImageColor(inputLossImageColor.orNull)
      .build()
}
