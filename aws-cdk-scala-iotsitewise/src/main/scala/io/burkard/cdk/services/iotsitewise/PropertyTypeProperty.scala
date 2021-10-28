package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PropertyTypeProperty {

  def apply(
    typeName: Option[String] = None,
    metric: Option[software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty] = None,
    attribute: Option[software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty] = None,
    transform: Option[software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty.Builder)
      .typeName(typeName.orNull)
      .metric(metric.orNull)
      .attribute(attribute.orNull)
      .transform(transform.orNull)
      .build()
}
