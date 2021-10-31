package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLoggerDefinitionVersion {

  def apply(
    internalResourceId: String,
    loggers: Option[List[_]] = None,
    loggerDefinitionId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .loggers(loggers.map(_.asJava).orNull)
      .loggerDefinitionId(loggerDefinitionId.orNull)
      .build()
}
