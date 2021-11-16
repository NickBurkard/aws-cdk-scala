package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicaModificationsProperty {

  def apply(
    status: String
  ): software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty.Builder)
      .status(status)
      .build()
}
