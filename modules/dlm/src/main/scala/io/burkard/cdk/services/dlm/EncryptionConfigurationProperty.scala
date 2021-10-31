package io.burkard.cdk.services.dlm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionConfigurationProperty {

  def apply(
    cmkArn: Option[String] = None,
    encrypted: Option[Boolean] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty.Builder)
      .cmkArn(cmkArn.orNull)
      .encrypted(encrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
