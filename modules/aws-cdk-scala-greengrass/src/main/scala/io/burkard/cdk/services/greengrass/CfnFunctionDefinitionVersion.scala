package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFunctionDefinitionVersion {

  def apply(
    internalResourceId: String,
    functionDefinitionId: Option[String] = None,
    defaultConfig: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty] = None,
    functions: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .functionDefinitionId(functionDefinitionId.orNull)
      .defaultConfig(defaultConfig.orNull)
      .functions(functions.map(_.asJava).orNull)
      .build()
}
