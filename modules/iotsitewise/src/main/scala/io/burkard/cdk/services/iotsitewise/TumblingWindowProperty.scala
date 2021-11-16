package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TumblingWindowProperty {

  def apply(
    interval: String,
    offset: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty.Builder)
      .interval(interval)
      .offset(offset.orNull)
      .build()
}
