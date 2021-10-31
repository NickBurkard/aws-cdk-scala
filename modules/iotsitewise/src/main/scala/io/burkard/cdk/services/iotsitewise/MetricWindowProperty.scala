package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricWindowProperty {

  def apply(
    tumbling: Option[software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty.Builder)
      .tumbling(tumbling.orNull)
      .build()
}
