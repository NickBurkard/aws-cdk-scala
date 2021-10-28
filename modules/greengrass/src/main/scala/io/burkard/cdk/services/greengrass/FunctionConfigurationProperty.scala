package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FunctionConfigurationProperty {

  def apply(
    execArgs: Option[String] = None,
    memorySize: Option[Number] = None,
    environment: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty] = None,
    pinned: Option[Boolean] = None,
    encodingType: Option[String] = None,
    timeout: Option[Number] = None,
    executable: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty.Builder)
      .execArgs(execArgs.orNull)
      .memorySize(memorySize.orNull)
      .environment(environment.orNull)
      .pinned(pinned.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .encodingType(encodingType.orNull)
      .timeout(timeout.orNull)
      .executable(executable.orNull)
      .build()
}
