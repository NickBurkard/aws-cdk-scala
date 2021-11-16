package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFunctionDefinitionVersion {

  def apply(
    internalResourceId: String,
    functionDefinitionId: String,
    functions: List[_],
    defaultConfig: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .functionDefinitionId(functionDefinitionId)
      .functions(functions.asJava)
      .defaultConfig(defaultConfig.orNull)
      .build()
}
