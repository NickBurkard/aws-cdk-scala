package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggerProperty {

  def apply(
    id: Option[String] = None,
    space: Option[Number] = None,
    `type`: Option[String] = None,
    component: Option[String] = None,
    level: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty =
    (new software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty.Builder)
      .id(id.orNull)
      .space(space.orNull)
      .`type`(`type`.orNull)
      .component(component.orNull)
      .level(level.orNull)
      .build()
}
