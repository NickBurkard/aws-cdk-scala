package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FeatureActivationsProperty {

  def apply(
    inputPrepareScheduleActions: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty.Builder)
      .inputPrepareScheduleActions(inputPrepareScheduleActions.orNull)
      .build()
}
