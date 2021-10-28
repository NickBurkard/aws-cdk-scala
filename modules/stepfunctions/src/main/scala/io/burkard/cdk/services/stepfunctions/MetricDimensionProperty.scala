package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricDimensionProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
