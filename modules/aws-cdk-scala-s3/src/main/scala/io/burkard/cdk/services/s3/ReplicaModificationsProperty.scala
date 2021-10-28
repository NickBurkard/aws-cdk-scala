package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReplicaModificationsProperty {

  def apply(
    status: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty.Builder)
      .status(status.orNull)
      .build()
}
