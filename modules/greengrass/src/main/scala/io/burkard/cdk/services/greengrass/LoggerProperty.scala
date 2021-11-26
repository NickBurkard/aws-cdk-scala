package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggerProperty {

  def apply(
    id: String,
    `type`: String,
    component: String,
    level: String,
    space: Option[Number] = None
  ): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty =
    (new software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty.Builder)
      .id(id)
      .`type`(`type`)
      .component(component)
      .level(level)
      .space(space.orNull)
      .build()
}
