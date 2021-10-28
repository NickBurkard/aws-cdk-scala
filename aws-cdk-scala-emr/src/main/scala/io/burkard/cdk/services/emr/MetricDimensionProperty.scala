package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricDimensionProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
