package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicationTimeValueProperty {

  def apply(
    minutes: Number
  ): software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty.Builder)
      .minutes(minutes)
      .build()
}
