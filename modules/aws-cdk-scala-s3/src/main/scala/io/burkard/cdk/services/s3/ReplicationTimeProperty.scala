package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReplicationTimeProperty {

  def apply(
    status: Option[String] = None,
    time: Option[software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty.Builder)
      .status(status.orNull)
      .time(time.orNull)
      .build()
}
