package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicaRegionProperty {

  def apply(
    region: String,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty =
    (new software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty.Builder)
      .region(region)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
