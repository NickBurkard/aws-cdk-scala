package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricWindowProperty {

  def apply(
    tumbling: Option[software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty.Builder)
      .tumbling(tumbling.orNull)
      .build()
}
