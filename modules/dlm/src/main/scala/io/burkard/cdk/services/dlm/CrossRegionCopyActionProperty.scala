package io.burkard.cdk.services.dlm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CrossRegionCopyActionProperty {

  def apply(
    encryptionConfiguration: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty] = None,
    retainRule: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty] = None,
    target: Option[String] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty.Builder)
      .encryptionConfiguration(encryptionConfiguration.orNull)
      .retainRule(retainRule.orNull)
      .target(target.orNull)
      .build()
}
