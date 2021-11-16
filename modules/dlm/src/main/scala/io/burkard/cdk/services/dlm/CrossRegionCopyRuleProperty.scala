package io.burkard.cdk.services.dlm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CrossRegionCopyRuleProperty {

  def apply(
    encrypted: Boolean,
    copyTags: Option[Boolean] = None,
    deprecateRule: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty] = None,
    targetRegion: Option[String] = None,
    target: Option[String] = None,
    cmkArn: Option[String] = None,
    retainRule: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty.Builder)
      .encrypted(encrypted)
      .copyTags(copyTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deprecateRule(deprecateRule.orNull)
      .targetRegion(targetRegion.orNull)
      .target(target.orNull)
      .cmkArn(cmkArn.orNull)
      .retainRule(retainRule.orNull)
      .build()
}
