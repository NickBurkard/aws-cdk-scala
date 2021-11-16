package io.burkard.cdk.services.ssmincidents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RegionConfigurationProperty {

  def apply(
    sseKmsKeyId: String
  ): software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty =
    (new software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty.Builder)
      .sseKmsKeyId(sseKmsKeyId)
      .build()
}
