package io.burkard.cdk.services.ssmincidents

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RegionConfigurationProperty {

  def apply(
    sseKmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty =
    (new software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty.Builder)
      .sseKmsKeyId(sseKmsKeyId.orNull)
      .build()
}
