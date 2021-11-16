package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionDefinitionVersionProperty {

  def apply(
    functions: List[_],
    defaultConfig: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty.Builder)
      .functions(functions.asJava)
      .defaultConfig(defaultConfig.orNull)
      .build()
}
