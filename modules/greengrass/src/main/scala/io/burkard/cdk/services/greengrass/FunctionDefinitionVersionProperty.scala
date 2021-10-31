package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FunctionDefinitionVersionProperty {

  def apply(
    defaultConfig: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty] = None,
    functions: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty.Builder)
      .defaultConfig(defaultConfig.orNull)
      .functions(functions.map(_.asJava).orNull)
      .build()
}
