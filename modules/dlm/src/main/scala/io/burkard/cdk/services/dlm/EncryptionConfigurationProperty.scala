package io.burkard.cdk.services.dlm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionConfigurationProperty {

  def apply(
    encrypted: Boolean,
    cmkArn: Option[String] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty.Builder)
      .encrypted(encrypted)
      .cmkArn(cmkArn.orNull)
      .build()
}
