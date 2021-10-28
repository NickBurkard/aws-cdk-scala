package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TumblingWindowProperty {

  def apply(
    interval: Option[String] = None,
    offset: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty.Builder)
      .interval(interval.orNull)
      .offset(offset.orNull)
      .build()
}
