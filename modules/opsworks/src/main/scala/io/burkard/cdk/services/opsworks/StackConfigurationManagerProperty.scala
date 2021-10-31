package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StackConfigurationManagerProperty {

  def apply(
    name: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty =
    (new software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty.Builder)
      .name(name.orNull)
      .version(version.orNull)
      .build()
}
