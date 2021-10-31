package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeleteMarkerReplicationProperty {

  def apply(
    status: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.DeleteMarkerReplicationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.DeleteMarkerReplicationProperty.Builder)
      .status(status.orNull)
      .build()
}
