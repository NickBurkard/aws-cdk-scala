package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricsProperty {

  def apply(
    eventThreshold: Option[software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty] = None,
    status: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty.Builder)
      .eventThreshold(eventThreshold.orNull)
      .status(status.orNull)
      .build()
}
