package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicationTimeProperty {

  def apply(
    status: String,
    time: software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty
  ): software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty.Builder)
      .status(status)
      .time(time)
      .build()
}
