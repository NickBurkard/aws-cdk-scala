package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFunctionDefinitionVersionProps {

  def apply(
    functionDefinitionId: Option[String] = None,
    defaultConfig: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty] = None,
    functions: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps.Builder)
      .functionDefinitionId(functionDefinitionId.orNull)
      .defaultConfig(defaultConfig.orNull)
      .functions(functions.map(_.asJava).orNull)
      .build()
}
