package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicationTimeValueProperty {

  def apply(
    minutes: Option[Number] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty.Builder)
      .minutes(minutes.orNull)
      .build()
}
