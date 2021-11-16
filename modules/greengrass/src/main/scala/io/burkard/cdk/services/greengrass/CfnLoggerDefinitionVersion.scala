package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLoggerDefinitionVersion {

  def apply(
    internalResourceId: String,
    loggers: List[_],
    loggerDefinitionId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .loggers(loggers.asJava)
      .loggerDefinitionId(loggerDefinitionId)
      .build()
}
