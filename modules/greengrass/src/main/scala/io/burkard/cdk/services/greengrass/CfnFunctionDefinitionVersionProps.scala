package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFunctionDefinitionVersionProps {

  def apply(
    functionDefinitionId: String,
    functions: List[_],
    defaultConfig: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps.Builder)
      .functionDefinitionId(functionDefinitionId)
      .functions(functions.asJava)
      .defaultConfig(defaultConfig.orNull)
      .build()
}
