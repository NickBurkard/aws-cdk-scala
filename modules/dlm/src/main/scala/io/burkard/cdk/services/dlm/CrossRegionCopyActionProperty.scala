package io.burkard.cdk.services.dlm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CrossRegionCopyActionProperty {

  def apply(
    encryptionConfiguration: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty,
    target: String,
    retainRule: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty.Builder)
      .encryptionConfiguration(encryptionConfiguration)
      .target(target)
      .retainRule(retainRule.orNull)
      .build()
}
