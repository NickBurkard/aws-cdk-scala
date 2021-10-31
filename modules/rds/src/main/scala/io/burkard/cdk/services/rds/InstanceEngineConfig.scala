package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceEngineConfig {

  def apply(
    features: Option[software.amazon.awscdk.services.rds.InstanceEngineFeatures] = None,
    optionGroup: Option[software.amazon.awscdk.services.rds.IOptionGroup] = None
  ): software.amazon.awscdk.services.rds.InstanceEngineConfig =
    (new software.amazon.awscdk.services.rds.InstanceEngineConfig.Builder)
      .features(features.orNull)
      .optionGroup(optionGroup.orNull)
      .build()
}
